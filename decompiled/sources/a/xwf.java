package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xwf implements zwf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41607a;

    public xwf(float f) {
        this.f41607a = f;
    }

    @Override // a.zwf
    public final float a() {
        return this.f41607a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwf) && ycl.b(this.f41607a, ((xwf) obj).f41607a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f41607a);
    }

    public final String toString() {
        return kng0.l("Default(badgeSize=", ycl.c(this.f41607a), Separators.RPAREN);
    }
}
