/**
 * CS2030S Lab 5
 * AY22/23 Semester 2
 *
 * @author Zhiyang Lu (Lab 14H)
 */

package cs2030s.fp;

@FunctionalInterface
public interface BooleanCondition<T> {
  /**
   * Some condition for the contents inside a Box.
   *
   * @param content  The content inside the box.
   * @return  True if content passes, false otherwise.
   */
  public abstract boolean test(T content);
}
