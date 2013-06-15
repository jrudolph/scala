package q1 {
  package p1 {
    trait C[T] {}

    abstract class A1 {
     type T >: C[T] <: C[T]
    }

    abstract class A2 {
     type T >: C[T] <: C[C[T]]
    }

    abstract class A3 {
     type T >: C[C[T]] <: C[T]
    }

    abstract class A4 {
     type T >: C[C[T]] <: C[C[T]]
    }
  }

  package p2 {
    trait C[-T] {}

    abstract class A1 {
     type T >: C[T] <: C[T]
    }

    abstract class A2 {
     type T >: C[T] <: C[C[T]]
    }

    abstract class A3 {
     type T >: C[C[T]] <: C[T]
    }

    abstract class A4 {
     type T >: C[C[T]] <: C[C[T]]
    }
  }

  package p3 {
    trait C[+T] {}

    abstract class A1 {
     type T >: C[T] <: C[T]
    }

    abstract class A2 {
     type T >: C[T] <: C[C[T]]
    }

    abstract class A3 {
     type T >: C[C[T]] <: C[T]
    }

    abstract class A4 {
     type T >: C[C[T]] <: C[C[T]]
    }
  }
}
