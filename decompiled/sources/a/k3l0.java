package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k3l0 implements n3l0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3l0) && ycl.b(16.0f, 16.0f);
    }

    public final int hashCode() {
        return Float.hashCode(16.0f);
    }

    public final String toString() {
        return kng0.l("RoundedBottomCornersShape(cornerSize=", ycl.c(16.0f), Separators.RPAREN);
    }
}
