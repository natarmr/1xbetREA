package android.javax.sip.address;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public interface Address extends Cloneable, Serializable {
    Object clone();

    boolean equals(Object obj);

    String getDisplayName();

    URI getURI();

    int hashCode();

    boolean isWildcard();

    void setDisplayName(String str);

    void setURI(URI uri);

    String toString();
}
