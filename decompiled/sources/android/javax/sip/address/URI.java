package android.javax.sip.address;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public interface URI extends Cloneable, Serializable {
    Object clone();

    String getScheme();

    boolean isSipURI();

    String toString();
}
