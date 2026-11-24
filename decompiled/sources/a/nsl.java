package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nsl implements osl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24055a;
    public final float b;

    public nsl(float f, float f2) {
        this.f24055a = f;
        this.b = f2;
    }

    @Override // a.osl
    public final float a() {
        return this.f24055a;
    }

    @Override // a.osl
    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsl)) {
            return false;
        }
        nsl nslVar = (nsl) obj;
        return ycl.b(this.f24055a, nslVar.f24055a) && ycl.b(this.b, nslVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f24055a) * 31);
    }

    public final String toString() {
        return b1j.k("List(badgeContainerSize=", ycl.c(this.f24055a), ", iconContainerSize=", ycl.c(this.b), Separators.RPAREN);
    }
}
