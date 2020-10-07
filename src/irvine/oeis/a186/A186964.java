package irvine.oeis.a186;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A186964 McKay-Thompson series of class 36D for the Monster group with a(0) = 2.
 * @author Georg Fischer
 */
public class A186964 extends EulerTransform {

  /** Construct the sequence. */
  public A186964() {
    super(new PeriodicSequence(2, -1, 1, 0, 2, 0, 2, 0, 2, -1, 2, 0, 2, -1, 1, 0, 2, -2, 2, 0, 1, -1, 2, 0, 2, -1, 2, 0, 2, 0, 2, 0, 1, -1, 2, 0), 1);
  }
}