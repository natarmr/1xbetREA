package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ywf implements zwf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43368a;

    public ywf(float f) {
        this.f43368a = f;
    }

    @Override // a.zwf
    public final float a() {
        return this.f43368a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ywf) && ycl.b(this.f43368a, ((ywf) obj).f43368a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f43368a);
    }

    public final String toString() {
        return kng0.l("List(badgeSize=", ycl.c(this.f43368a), Separators.RPAREN);
    }
}
