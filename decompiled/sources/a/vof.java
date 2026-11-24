package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vof {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37763a;
    public final int b;
    public final int c;
    public final int d;
    public final wpf e;
    public final boolean f;
    public final boolean g;

    public vof(String str, int i, int i2, int i3, wpf wpfVar, boolean z, boolean z2) {
        this.f37763a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = wpfVar;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vof)) {
            return false;
        }
        vof vofVar = (vof) obj;
        return this.f37763a.equals(vofVar.f37763a) && this.b == vofVar.b && this.c == vofVar.c && this.d == vofVar.d && this.e == vofVar.e && this.f == vofVar.f && this.g == vofVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e((this.e.hashCode() + twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f37763a.hashCode() * 31, 31), 31), 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "Cs2MapMovementPlayerModel(name=", this.f37763a, ", positionX=", ", positionY=");
        axq.r(this.c, this.d, ", positionZ=", ", side=", sbP);
        sbP.append(this.e);
        sbP.append(", alive=");
        sbP.append(this.f);
        sbP.append(", hasBomb=");
        return rw2.p(sbP, this.g, Separators.RPAREN);
    }
}
