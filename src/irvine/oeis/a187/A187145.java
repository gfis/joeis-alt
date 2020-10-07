package irvine.oeis.a187;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A187145 McKay-Thompson series of class 12I for the Monster group with a(0) = 3.
 * @author Georg Fischer
 */
public class A187145 extends EulerTransform {

  /** Construct the sequence. */
  public A187145() {
    super(new PeriodicSequence(3, -4, 2, -2, 3, -4, 3, -2, 2, -4, 3, 0), 1);
  }
}