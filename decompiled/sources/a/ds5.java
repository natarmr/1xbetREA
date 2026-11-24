package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ds5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6595a;

    public final boolean equals(Object obj) {
        if (obj instanceof ds5) {
            return ycl.b(this.f6595a, ((ds5) obj).f6595a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6595a);
    }

    public final String toString() {
        return kng0.l("FixedHeightDp(value=", ycl.c(this.f6595a), Separators.RPAREN);
    }
}
