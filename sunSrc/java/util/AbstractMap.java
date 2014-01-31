package java.util;
import java.util.Map.Entry;

public abstract class AbstractMap implements Map {
  /**
   * Sole constructor.  (For invocation by subclass constructors, typically
   * implicit.)
   */
  protected AbstractMap() {
  }

  // Query Operations

  /**
   * {@inheritDoc}
   *
   * <p>This implementation returns <tt>entrySet().size()</tt>.
   */
  public int size() {
    return entrySet().size();
  }

  /**
   * {@inheritDoc}
   *
   * <p>This implementation returns <tt>size() == 0</tt>.
   */
  public boolean isEmpty() {
    return size() == 0;
  }

  /**
   * {@inheritDoc}
   *
   * <p>This implementation iterates over <tt>entrySet()</tt> searching
   * for an entry with the specified value.  If such an entry is found,
   * <tt>true</tt> is returned.  If the iteration terminates without
   * finding such an entry, <tt>false</tt> is returned.  Note that this
   * implementation requires linear time in the size of the map.
   *
   * @throws ClassCastException   {@inheritDoc}
   * @throws NullPointerException {@inheritDoc}
   */
  public boolean containsValue(Object value) {
    Iterator i = entrySet().iterator();
    if (value==null) {
      while (i.hasNext()) {
        Entry e = (Entry) i.next();
        if (e.getValue()==null)
          return true;
      }
    } else {
      while (i.hasNext()) {
        Entry e = (Entry)i.next();
        if (value.equals(e.getValue()))
          return true;
      }
    }
    return false;
  }

  /**
   * {@inheritDoc}
   *
   * <p>This implementation iterates over <tt>entrySet()</tt> searching
   * for an entry with the specified key.  If such an entry is found,
   * <tt>true</tt> is returned.  If the iteration terminates without
   * finding such an entry, <tt>false</tt> is returned.  Note that this
   * implementation requires linear time in the size of the map; many
   * implementations will override this method.
   *
   * @throws ClassCastException   {@inheritDoc}
   * @throws NullPointerException {@inheritDoc}
   */
  public boolean containsKey(Object key) {
    Iterator i = entrySet().iterator();
    if (key==null) {
      while (i.hasNext()) {
        Entry e = (Entry)i.next();
        if (e.getKey()==null)
          return true;
      }
    } else {
      while (i.hasNext()) {
        Entry e = (Entry)i.next();
        if (key.equals(e.getKey()))
          return true;
      }
    }
    return false;
  }

  /**
   * {@inheritDoc}
   *
   * <p>This implementation iterates over <tt>entrySet()</tt> searching
   * for an entry with the specified key.  If such an entry is found,
   * the entry's value is returned.  If the iteration terminates without
   * finding such an entry, <tt>null</tt> is returned.  Note that this
   * implementation requires linear time in the size of the map; many
   * implementations will override this method.
   *
   * @throws ClassCastException            {@inheritDoc}
   * @throws NullPointerException          {@inheritDoc}
   */
  public Object get(Object key) {
    Iterator i = entrySet().iterator();
    if (key==null) {
      while (i.hasNext()) {
        Entry e = (Entry)i.next();
        if (e.getKey()==null)
          return e.getValue();
      }
    } else {
      while (i.hasNext()) {
        Entry e = (Entry)i.next();
        if (key.equals(e.getKey()))
          return e.getValue();
      }
    }
    return null;
  }


  // Modification Operations

  /**
   * {@inheritDoc}
   *
   * <p>This implementation always throws an
   * <tt>UnsupportedOperationException</tt>.
   *
   * @throws UnsupportedOperationException {@inheritDoc}
   * @throws ClassCastException            {@inheritDoc}
   * @throws NullPointerException          {@inheritDoc}
   * @throws IllegalArgumentException      {@inheritDoc}
   */
  public Object put(Object key, Object value) {
    throw new UnsupportedOperationException();
  }

  /**
   * {@inheritDoc}
   *
   * <p>This implementation iterates over <tt>entrySet()</tt> searching for an
   * entry with the specified key.  If such an entry is found, its value is
   * obtained with its <tt>getValue</tt> operation, the entry is removed
   * from the collection (and the backing map) with the iterator's
   * <tt>remove</tt> operation, and the saved value is returned.  If the
   * iteration terminates without finding such an entry, <tt>null</tt> is
   * returned.  Note that this implementation requires linear time in the
   * size of the map; many implementations will override this method.
   *
   * <p>Note that this implementation throws an
   * <tt>UnsupportedOperationException</tt> if the <tt>entrySet</tt>
   * iterator does not support the <tt>remove</tt> method and this map
   * contains a mapping for the specified key.
   *
   * @throws UnsupportedOperationException {@inheritDoc}
   * @throws ClassCastException            {@inheritDoc}
   * @throws NullPointerException          {@inheritDoc}
   */
  public Object remove(Object key) {
    Iterator i = entrySet().iterator();
    Entry correctEntry = null;
    if (key==null) {
      while (correctEntry==null && i.hasNext()) {
        Entry e = (Entry) i.next();
        if (e.getKey()==null)
          correctEntry = e;
      }
    } else {
      while (correctEntry==null && i.hasNext()) {
        Entry e = (Entry)i.next();
        if (key.equals(e.getKey()))
          correctEntry = e;
      }
    }

    Object oldValue = null;
    if (correctEntry !=null) {
      oldValue = correctEntry.getValue();
      i.remove();
    }
    return oldValue;
  }


  // Bulk Operations

  /**
   * {@inheritDoc}
   *
   * <p>This implementation iterates over the specified map's
   * <tt>entrySet()</tt> collection, and calls this map's <tt>put</tt>
   * operation once for each entry returned by the iteration.
   *
   * <p>Note that this implementation throws an
   * <tt>UnsupportedOperationException</tt> if this map does not support
   * the <tt>put</tt> operation and the specified map is nonempty.
   *
   * @throws UnsupportedOperationException {@inheritDoc}
   * @throws ClassCastException            {@inheritDoc}
   * @throws NullPointerException          {@inheritDoc}
   * @throws IllegalArgumentException      {@inheritDoc}
   */
  public void putAll(Map m) {
     Iterator iterator = m.entrySet().iterator();
    while(iterator.hasNext()){
      Map.Entry e = (Entry) iterator.next();
      put(e.getKey(), e.getValue());
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>This implementation calls <tt>entrySet().clear()</tt>.
   *
   * <p>Note that this implementation throws an
   * <tt>UnsupportedOperationException</tt> if the <tt>entrySet</tt>
   * does not support the <tt>clear</tt> operation.
   *
   * @throws UnsupportedOperationException {@inheritDoc}
   */
  public void clear() {
    entrySet().clear();
  }


  // Views

  /**
   * Each of these fields are initialized to contain an instance of the
   * appropriate view the first time this view is requested.  The views are
   * stateless, so there's no reason to create more than one of each.
   */
  transient volatile AbstractSet        keySet = null;
  transient volatile AbstractCollection values = null;

  /**
   * {@inheritDoc}
   *
   * <p>This implementation returns a set that subclasses {@link AbstractSet}.
   * The subclass's iterator method returns a "wrapper object" over this
   * map's <tt>entrySet()</tt> iterator.  The <tt>size</tt> method
   * delegates to this map's <tt>size</tt> method and the
   * <tt>contains</tt> method delegates to this map's
   * <tt>containsKey</tt> method.
   *
   * <p>The set is created the first time this method is called,
   * and returned in response to all subsequent calls.  No synchronization
   * is performed, so there is a slight chance that multiple calls to this
   * method will not all return the same set.
   */
  public Set keySet() {
    if (keySet == null) {
      keySet = new AbstractSet() {
        public Iterator iterator() {
          return new Iterator() {
            private Iterator i = entrySet().iterator();

            public boolean hasNext() {
              return i.hasNext();
            }

            public Object next() {
              return ((Entry)i.next()).getKey();
            }

            public void remove() {
              i.remove();
            }
          };
        }

        public int size() {
          return AbstractMap.this.size();
        }

        public boolean isEmpty() {
          return AbstractMap.this.isEmpty();
        }

        public void clear() {
          AbstractMap.this.clear();
        }

        public boolean contains(Object k) {
          return AbstractMap.this.containsKey(k);
        }
      };
    }
    return keySet;
  }

  /**
   * {@inheritDoc}
   *
   * <p>This implementation returns a collection that subclasses {@link
   * AbstractCollection}.  The subclass's iterator method returns a
   * "wrapper object" over this map's <tt>entrySet()</tt> iterator.
   * The <tt>size</tt> method delegates to this map's <tt>size</tt>
   * method and the <tt>contains</tt> method delegates to this map's
   * <tt>containsValue</tt> method.
   *
   * <p>The collection is created the first time this method is called, and
   * returned in response to all subsequent calls.  No synchronization is
   * performed, so there is a slight chance that multiple calls to this
   * method will not all return the same collection.
   */
  public Collection values() {
    if (values == null) {
      values = new AbstractCollection() {
        public Iterator iterator() {
          return new Iterator() {
            private Iterator i = entrySet().iterator();

            public boolean hasNext() {
              return i.hasNext();
            }

            public Object next() {
              return ((Entry)i.next()).getValue();
            }

            public void remove() {
              i.remove();
            }
          };
        }

        public int size() {
          return AbstractMap.this.size();
        }

        public boolean isEmpty() {
          return AbstractMap.this.isEmpty();
        }

        public void clear() {
          AbstractMap.this.clear();
        }

        public boolean contains(Object v) {
          return AbstractMap.this.containsValue(v);
        }
      };
    }
    return values;
  }

  public abstract Set entrySet();


  // Comparison and hashing

  /**
   * Compares the specified object with this map for equality.  Returns
   * <tt>true</tt> if the given object is also a map and the two maps
   * represent the same mappings.  More formally, two maps <tt>m1</tt> and
   * <tt>m2</tt> represent the same mappings if
   * <tt>m1.entrySet().equals(m2.entrySet())</tt>.  This ensures that the
   * <tt>equals</tt> method works properly across different implementations
   * of the <tt>Map</tt> interface.
   *
   * <p>This implementation first checks if the specified object is this map;
   * if so it returns <tt>true</tt>.  Then, it checks if the specified
   * object is a map whose size is identical to the size of this map; if
   * not, it returns <tt>false</tt>.  If so, it iterates over this map's
   * <tt>entrySet</tt> collection, and checks that the specified map
   * contains each mapping that this map contains.  If the specified map
   * fails to contain such a mapping, <tt>false</tt> is returned.  If the
   * iteration completes, <tt>true</tt> is returned.
   *
   * @param o object to be compared for equality with this map
   * @return <tt>true</tt> if the specified object is equal to this map
   */
  public boolean equals(Object o) {
    if (o == this)
      return true;

    if (!(o instanceof Map))
      return false;
    Map m = (Map) o;
    if (m.size() != size())
      return false;

    try {
      Iterator i = entrySet().iterator();
      while (i.hasNext()) {
        Entry e = (Entry) i.next();
        Object key = e.getKey();
        Object value = e.getValue();
        if (value == null) {
          if (!(m.get(key)==null && m.containsKey(key)))
            return false;
        } else {
          if (!value.equals(m.get(key)))
            return false;
        }
      }
    } catch (ClassCastException unused) {
      return false;
    } catch (NullPointerException unused) {
      return false;
    }

    return true;
  }

  /**
   * Returns the hash code value for this map.  The hash code of a map is
   * defined to be the sum of the hash codes of each entry in the map's
   * <tt>entrySet()</tt> view.  This ensures that <tt>m1.equals(m2)</tt>
   * implies that <tt>m1.hashCode()==m2.hashCode()</tt> for any two maps
   * <tt>m1</tt> and <tt>m2</tt>, as required by the general contract of
   * {@link Object#hashCode}.
   *
   * <p>This implementation iterates over <tt>entrySet()</tt>, calling
   * {@link Map.Entry#hashCode hashCode()} on each element (entry) in the
   * set, and adding up the results.
   *
   * @return the hash code value for this map
   * @see Map.Entry#hashCode()
   * @see Object#equals(Object)
   * @see Set#equals(Object)
   */
  public int hashCode() {
    int h = 0;
    Iterator i = entrySet().iterator();
    while (i.hasNext())
      h += i.next().hashCode();
    return h;
  }

  /**
   * Returns a string representation of this map.  The string representation
   * consists of a list of key-value mappings in the order returned by the
   * map's <tt>entrySet</tt> view's iterator, enclosed in braces
   * (<tt>"{}"</tt>).  Adjacent mappings are separated by the characters
   * <tt>", "</tt> (comma and space).  Each key-value mapping is rendered as
   * the key followed by an equals sign (<tt>"="</tt>) followed by the
   * associated value.  Keys and values are converted to strings as by
   * {@link String#valueOf(Object)}.
   *
   * @return a string representation of this map
   */
  public String toString() {
    Iterator i = entrySet().iterator();
    if (! i.hasNext())
      return "{}";

    StringBuilder sb = new StringBuilder();
    sb.append('{');
    for (;;) {
      Entry e = (Entry) i.next();
      Object key = e.getKey();
      Object value = e.getValue();
      sb.append(key   == this ? "(this Map)" : key);
      sb.append('=');
      sb.append(value == this ? "(this Map)" : value);
      if (! i.hasNext())
        return sb.append('}').toString();
      sb.append(", ");
    }
  }

  /**
   * Returns a shallow copy of this <tt>AbstractMap</tt> instance: the keys
   * and values themselves are not cloned.
   *
   * @return a shallow copy of this map
   */
  protected Object clone() throws CloneNotSupportedException {
    AbstractMap result = (AbstractMap)super.clone();
    result.keySet = null;
    result.values = null;
    return result;
  }

  /**
   * Utility method for SimpleEntry and SimpleImmutableEntry.
   * Test for equality, checking for nulls.
   */
  private static boolean eq(Object o1, Object o2) {
    return o1 == null ? o2 == null : o1.equals(o2);
  }






}
