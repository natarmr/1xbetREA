package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qvx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29410a;
    public final float b;

    public qvx(float f, float f2) {
        this.f29410a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvx)) {
            return false;
        }
        qvx qvxVar = (qvx) obj;
        return ycl.b(this.f29410a, qvxVar.f29410a) && ycl.b(this.b, qvxVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f29410a) * 31);
    }

    public final String toString() {
        return b1j.k("ItemInfo(locationX=", ycl.c(this.f29410a), ", containerWidth=", ycl.c(this.b), Separators.RPAREN);
    }
}
