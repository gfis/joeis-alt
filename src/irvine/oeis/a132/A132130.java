package irvine.oeis.a132;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A132130 McKay-Thompson series of class 10D for the Monster group with a(0) = 6.
 * @author Georg Fischer
 */
public class A132130 extends EulerTransform {

  /** Construct the sequence. */
  public A132130() {
    super(new PeriodicSequence(6, 0, 6, 0, 0, 0, 6, 0, 6, 0), 1);
  }
}