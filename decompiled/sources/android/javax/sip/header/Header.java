package android.javax.sip.header;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public interface Header extends Cloneable, Serializable {
    Object clone();

    boolean equals(Object obj);

    String getName();

    int hashCode();

    String toString();
}
