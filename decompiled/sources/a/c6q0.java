package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3831a;
    public final f6q0 b;
    public final p6q0 c;
    public final t7q0 d;
    public final boolean e;
    public final boolean f;
    public final b6q0 g;
    public final q7q0 h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final String n;
    public final Integer o;
    public final boolean p;
    public final a7n q;

    public c6q0(String str, f6q0 f6q0Var, p6q0 p6q0Var, t7q0 t7q0Var, boolean z, boolean z2, b6q0 b6q0Var, String str2, String str3, boolean z3, int i, String str4, int i2) {
        this(str, f6q0Var, p6q0Var, t7q0Var, z, z2, (i2 & 128) != 0 ? null : b6q0Var, q7q0.f28265a, str2, (i2 & 1024) != 0 ? "" : str3, (i2 & 2048) != 0 ? false : z3, false, (i2 & 8192) != 0 ? -1 : i, (i2 & 16384) != 0 ? null : str4, (32768 & i2) != 0 ? null : 4, (i2 & 65536) == 0, a7n.f379a);
    }

    public static c6q0 a(c6q0 c6q0Var, String str, t7q0 t7q0Var, boolean z, int i) {
        String str2 = (i & 1) != 0 ? c6q0Var.f3831a : str;
        f6q0 f6q0Var = c6q0Var.b;
        p6q0 p6q0Var = c6q0Var.c;
        boolean z2 = c6q0Var.e;
        b6q0 b6q0Var = c6q0Var.g;
        q7q0 q7q0Var = c6q0Var.h;
        String str3 = c6q0Var.i;
        String str4 = c6q0Var.j;
        boolean z3 = c6q0Var.k;
        boolean z4 = c6q0Var.l;
        int i2 = c6q0Var.m;
        String str5 = c6q0Var.n;
        Integer num = c6q0Var.o;
        boolean z5 = c6q0Var.p;
        a7n a7nVar = c6q0Var.q;
        str2.getClass();
        f6q0Var.getClass();
        p6q0Var.getClass();
        q7q0Var.getClass();
        str3.getClass();
        str4.getClass();
        a7nVar.getClass();
        return new c6q0(str2, f6q0Var, p6q0Var, t7q0Var, z2, z, b6q0Var, q7q0Var, str3, str4, z3, z4, i2, str5, num, z5, a7nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6q0)) {
            return false;
        }
        c6q0 c6q0Var = (c6q0) obj;
        return Intrinsics.d(this.f3831a, c6q0Var.f3831a) && Intrinsics.d(this.b, c6q0Var.b) && Intrinsics.d(this.c, c6q0Var.c) && Intrinsics.d(this.d, c6q0Var.d) && this.e == c6q0Var.e && this.f == c6q0Var.f && Intrinsics.d(this.g, c6q0Var.g) && Intrinsics.d(this.h, c6q0Var.h) && Intrinsics.d(this.i, c6q0Var.i) && Intrinsics.d(this.j, c6q0Var.j) && this.k == c6q0Var.k && this.l == c6q0Var.l && this.m == c6q0Var.m && Intrinsics.d(this.n, c6q0Var.n) && Intrinsics.d(this.o, c6q0Var.o) && this.p == c6q0Var.p && this.q == c6q0Var.q;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f3831a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, false);
        b6q0 b6q0Var = this.g;
        int iHashCode = (iE + (b6q0Var == null ? 0 : b6q0Var.hashCode())) * 31;
        this.h.getClass();
        int iA = twn.a(this.m, brm0.e(brm0.e(ua80.b(ua80.b((iHashCode + 392915327) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31);
        String str = this.n;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.o;
        return this.q.hashCode() + brm0.e((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.p);
    }

    public final String toString() {
        String strA = ply.a(this.m);
        StringBuilder sb = new StringBuilder("TextFieldBasicUiModel(value=");
        sb.append(this.f3831a);
        sb.append(", textFieldCellLeftStyle=");
        sb.append(this.b);
        sb.append(", textFieldCellRightStyle=");
        sb.append(this.c);
        sb.append(", supportingTextStyle=");
        sb.append(this.d);
        sb.append(", enabled=");
        ua80.u(", error=", ", loading=false, textAppearance=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", textFieldStyle=");
        sb.append(this.h);
        sb.append(", labelText=");
        f140.v(sb, this.i, ", placeholderText=", this.j, ", useArtificialRtl=");
        ua80.u(", disableTopLabel=", ", capitalization=", sb, this.k, this.l);
        f140.v(sb, strA, ", allowedSymbols=", this.n, ", maxLength=");
        sb.append(this.o);
        sb.append(", fixedInputHeight=");
        sb.append(this.p);
        sb.append(", textDirection=");
        sb.append(this.q);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public c6q0(String str, f6q0 f6q0Var, p6q0 p6q0Var, t7q0 t7q0Var, boolean z, boolean z2, b6q0 b6q0Var, q7q0 q7q0Var, String str2, String str3, boolean z3, boolean z4, int i, String str4, Integer num, boolean z5, a7n a7nVar) {
        str.getClass();
        f6q0Var.getClass();
        p6q0Var.getClass();
        t7q0Var.getClass();
        q7q0Var.getClass();
        str2.getClass();
        str3.getClass();
        this.f3831a = str;
        this.b = f6q0Var;
        this.c = p6q0Var;
        this.d = t7q0Var;
        this.e = z;
        this.f = z2;
        this.g = b6q0Var;
        this.h = q7q0Var;
        this.i = str2;
        this.j = str3;
        this.k = z3;
        this.l = z4;
        this.m = i;
        this.n = str4;
        this.o = num;
        this.p = z5;
        this.q = a7nVar;
    }
}
