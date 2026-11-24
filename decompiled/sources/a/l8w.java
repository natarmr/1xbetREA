package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l8w implements n8w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19623a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final int g;
    public final boolean h;

    public l8w(int i, int i2, int i3, int i4, int i5, long j, String str, boolean z) {
        this.f19623a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
        this.g = i5;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8w)) {
            return false;
        }
        l8w l8wVar = (l8w) obj;
        return this.f19623a == l8wVar.f19623a && this.b == l8wVar.b && this.c == l8wVar.c && this.d == l8wVar.d && this.e == l8wVar.e && this.f.equals(l8wVar.f) && this.g == l8wVar.g && this.h == l8wVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + twn.a(this.g, ua80.b(twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Long.hashCode(this.f19623a) * 31, 31), 31), 31), 31), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f19623a, "Extended(itemId=", ", iconRes=");
        rw2.s(this.c, this.d, ", iconTint=", ", iconBackgroundTint=", sbQ);
        w6x.w(this.e, ", title=", ", subtitle=", this.f, sbQ);
        dw9.v(this.g, ", caption=", ", isCancelVisible=", sbQ, this.h);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
