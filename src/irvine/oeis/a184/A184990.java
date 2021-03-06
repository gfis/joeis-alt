package irvine.oeis.a184;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A184990 McKay-Thompson series of class 24C for the Monster group with a(0) = 1.
 * @author Georg Fischer
 */
public class A184990 extends EulerTransform {

  /** Construct the sequence. */
  public A184990() {
    super(new PeriodicSequence(1, -1, 2, -3, 1, 0, 1, -2, 2, -1, 1, -2, 1, -1, 2, -2, 1, 0, 1, -3, 2, -1, 1, 0), 1);
  }
}
