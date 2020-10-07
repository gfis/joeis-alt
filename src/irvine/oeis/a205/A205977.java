package irvine.oeis.a205;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A205977 McKay-Thompson series of class 30F for the Monster group with a(0) = 1.
 * @author Georg Fischer
 */
public class A205977 extends EulerTransform {

  /** Construct the sequence. */
  public A205977() {
    super(new PeriodicSequence(1, 2, 0, 2, 0, 0, 1, 2, 0, 0, 1, 0, 1, 2, 0, 2, 1, 0, 1, 0, 0, 2, 1, 0, 0, 2, 0, 2, 1, 0), 1);
  }
}