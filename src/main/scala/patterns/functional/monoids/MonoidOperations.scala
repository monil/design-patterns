package patterns.functional.monoids

/**
 *
 *
 * @author monilshah
 */
object MonoidOperations {

  def fold[T](list: List[T], m: Monoid[T]) = foldMap(list, m)(identity)

  def foldMap[T, Y](list: List[T], op: Monoid[Y])(m: T => Y) = {
    list.foldLeft(op.zero){
      case (t, y) => op.op(t, m(y))
    }
  }

  def balancedFold[T, Y](list: IndexedSeq[T], m: Monoid[Y])(f: T => Y): Y = {
    list.length match {
      case 0 => m.zero
      case 1 => f(list(0))
      case _ =>
        val (left, right) = list.splitAt(list.length/2)
        m.op(balancedFold(left, m)(f), balancedFold(right, m)(f))
    }
  }

  def foldPar[T](list: List[T], m: Monoid[T]) = foldMapPar(list, m)(identity)

  def foldMapPar[T, R](list: List[T], m: Monoid[R])(f: T=>R): R = {
    list.par.foldLeft(m.zero){
      case (a, b) => m.op(a, f(b))
    }
  }

  def compose[T,Y](m: Monoid[T], n: Monoid[Y]): Monoid[(T,Y)] = {
    new Monoid[(T, Y)] {
      override def op(l: (T, Y), r: (T, Y)): (T, Y) = (m.op(l._1, r._1) , n.op(l._2, r._2))
      override def zero: (T, Y) = (m.zero, n.zero)
    }
  }

}
