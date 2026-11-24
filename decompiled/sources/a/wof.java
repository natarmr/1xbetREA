package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wof {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39493a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public wof(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f39493a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wof)) {
            return false;
        }
        wof wofVar = (wof) obj;
        return this.f39493a.equals(wofVar.f39493a) && this.b == wofVar.b && this.c == wofVar.c && this.d == wofVar.d && this.e == wofVar.e && this.f == wofVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + brm0.e(twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f39493a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "Cs2MapMovementPlayerUiModel(name=", this.f39493a, ", xPosition=", ", yPosition=");
        axq.r(this.c, this.d, ", zPosition=", ", alive=", sbP);
        sbP.append(this.e);
        sbP.append(", icon=");
        sbP.append(this.f);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
