/**
 *
 */
package me.jbuelow.rov.common;

/**
 * @author Jacob Buelow
 * @author Brian Wachsmuth
 */
public class Pong implements Response {

  private static final long serialVersionUID = -2290713647984123482L;
  public String message;

  public Pong(String message) {
    this.message = message;
  }

}
