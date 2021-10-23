import monix.execution.Scheduler.Implicits.global
import monix.eval.Task
import monix.execution.{Callback, CancelableFuture}

import concurrent.duration._


val task = Task(1 + 1).delayExecution(1.second)
//val future : CancelableFuture[Int] = task.runToFuture


//future.cancel()


task.runAsync(result => result match {
  case Right(value) =>
    println(value)
  case Left(error) =>
    println(error)
})

// with state
task.runAsync(result => {
  new Callback[Throwable,Int]{
    def onSuccess(value: Int) : Unit =
      println(value)
    def onError(e: Throwable) : Unit =
      println(e)
  }
})

// quick side effects/ evaluation
val future = task.foreach(println)





