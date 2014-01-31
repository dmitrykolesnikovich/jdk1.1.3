package java.security;

public final class AccessController {

  /**
   * Don't allow anyone to instantiate an AccessController
   */
  private AccessController() { }
  public static native Object doPrivileged(PrivilegedAction action);

}
