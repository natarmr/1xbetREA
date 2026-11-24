package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h5n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5n f12488a;
    public final CharSequence b;
    public final o0x c;
    public final o0x d;
    public final boolean e;
    public final boolean f;
    public final xe9 g;

    public h5n(i5n i5nVar, CharSequence charSequence, n0x n0xVar, m0x m0xVar, ue9 ue9Var, int i) {
        k5n j5nVar = (i & 1) != 0 ? new j5n() : i5nVar;
        n0xVar = (i & 8) != 0 ? null : n0xVar;
        m0xVar = (i & 16) != 0 ? null : m0xVar;
        boolean z = (i & 32) != 0;
        ue9Var = (i & 128) != 0 ? null : ue9Var;
        this.f12488a = j5nVar;
        this.b = charSequence;
        this.c = n0xVar;
        this.d = m0xVar;
        this.e = z;
        this.f = true;
        this.g = ue9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5n)) {
            return false;
        }
        h5n h5nVar = (h5n) obj;
        return this.f12488a.equals(h5nVar.f12488a) && this.b.equals(h5nVar.b) && Intrinsics.d(this.c, h5nVar.c) && Intrinsics.d(this.d, h5nVar.d) && this.e == h5nVar.e && this.f == h5nVar.f && Intrinsics.d(this.g, h5nVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f12488a.hashCode() * 31)) * 961;
        o0x o0xVar = this.c;
        int iHashCode2 = (iHashCode + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31;
        o0x o0xVar2 = this.d;
        int iE = brm0.e(brm0.e((iHashCode2 + (o0xVar2 == null ? 0 : o0xVar2.hashCode())) * 31, 31, this.e), 31, this.f);
        xe9 xe9Var = this.g;
        return iE + (xe9Var != null ? xe9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(style=");
        sb.append(this.f12488a);
        sb.append(", label=");
        sb.append((Object) this.b);
        sb.append(", labelColor=null, icon=");
        sb.append(this.c);
        sb.append(", placeHolder=");
        sb.append(this.d);
        sb.append(", shouldTintIcon=");
        ua80.u(", shouldTintPlaceHolder=", ", buttonStyle=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
