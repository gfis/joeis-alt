package irvine.oeis.a193;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A193261 McKay-Thompson series of class 18D for the Monster group with a(0) = -2.
 * @author Georg Fischer
 */
public class A193261 extends EulerTransform {

  /** Construct the sequence. */
  public A193261() {
    super(new PeriodicSequence(-2, -1, -1, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -1, -1, -2, 0), 1);
  }
}