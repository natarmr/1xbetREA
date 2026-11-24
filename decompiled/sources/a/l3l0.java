package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l3l0 implements n3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19362a;

    public l3l0(float f) {
        this.f19362a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3l0) && ycl.b(this.f19362a, ((l3l0) obj).f19362a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f19362a);
    }

    public final String toString() {
        return kng0.l("RoundedCornersShape(cornerSize=", ycl.c(this.f19362a), Separators.RPAREN);
    }
}
