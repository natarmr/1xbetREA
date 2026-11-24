package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wv60 implements aw60 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv60)) {
            return false;
        }
        y1p y1pVar = y1p.MAIN;
        zn60 zn60Var = zn60.Main;
        return true;
    }

    public final int hashCode() {
        return zn60.PopularNewTop.hashCode() + (y1p.POPULAR_NEW_TOP.hashCode() * 31);
    }

    public final String toString() {
        return "Initialize(type=" + y1p.POPULAR_NEW_TOP + ", screen=" + zn60.PopularNewTop + Separators.RPAREN;
    }
}
