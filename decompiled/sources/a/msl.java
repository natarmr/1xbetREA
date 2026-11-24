package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class msl implements osl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22326a;
    public final float b;

    public msl(float f, float f2) {
        this.f22326a = f;
        this.b = f2;
    }

    @Override // a.osl
    public final float a() {
        return this.f22326a;
    }

    @Override // a.osl
    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msl)) {
            return false;
        }
        msl mslVar = (msl) obj;
        return ycl.b(this.f22326a, mslVar.f22326a) && ycl.b(this.b, mslVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f22326a) * 31);
    }

    public final String toString() {
        return b1j.k("Default(badgeContainerSize=", ycl.c(this.f22326a), ", iconContainerSize=", ycl.c(this.b), Separators.RPAREN);
    }
}
