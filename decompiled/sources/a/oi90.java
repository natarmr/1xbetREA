package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oi90 implements pi90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25299a;
    public final String b;
    public final d4d c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public oi90(int i, String str, d4d d4dVar, boolean z, String str2, boolean z2) {
        this.f25299a = i;
        this.b = str;
        this.c = d4dVar;
        this.d = z;
        this.e = str2;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi90)) {
            return false;
        }
        oi90 oi90Var = (oi90) obj;
        return this.f25299a == oi90Var.f25299a && this.b.equals(oi90Var.b) && this.c == oi90Var.c && this.d == oi90Var.d && this.e.equals(oi90Var.e) && this.f == oi90Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(brm0.e(dw9.b(this.c, ua80.b(Integer.hashCode(this.f25299a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f25299a, "Item(id=", ", name=", this.b, ", nameTextColor=");
        sbR.append(this.c);
        sbR.append(", selected=");
        sbR.append(this.d);
        sbR.append(", flagUrl=");
        return defpackage.c.c(this.e, ", noDivider=", Separators.RPAREN, sbR, this.f);
    }
}
