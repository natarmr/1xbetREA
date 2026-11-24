package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lvq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ar20 f20728a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public lvq0(ar20 ar20Var, int i, int i2, int i3, int i4) {
        this.f20728a = ar20Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvq0)) {
            return false;
        }
        lvq0 lvq0Var = (lvq0) obj;
        return Intrinsics.d(this.f20728a, lvq0Var.f20728a) && this.b == lvq0Var.b && this.c == lvq0Var.c && this.d == lvq0Var.d && this.e == lvq0Var.e;
    }

    public final int hashCode() {
        ar20 ar20Var = this.f20728a;
        return Integer.hashCode(this.e) + twn.a(this.d, twn.a(this.c, twn.a(this.b, (ar20Var == null ? 0 : ar20Var.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenInfo(type=");
        sb.append(this.f20728a);
        sb.append(", tokenStart=");
        sb.append(this.b);
        sb.append(", tokenEnd=");
        sb.append(this.c);
        sb.append(", rawIndex=");
        sb.append(this.d);
        sb.append(", normIndex=");
        return brm0.n(sb, this.e, ')');
    }
}
