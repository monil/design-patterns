package patterns.functional.monoids

/**
 *
 *
 * @author monilshah
 */
trait Monoid[T] {

  def op(l: T, r: T): T

  def zero: T

}
