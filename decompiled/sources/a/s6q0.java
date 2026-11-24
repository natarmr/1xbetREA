package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31716a;
    public final f6q0 b;
    public final p6q0 c;
    public final t7q0 d;
    public final boolean e;
    public final boolean f;
    public final b6q0 g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final a7n l;

    public s6q0(String str, f6q0 f6q0Var, p6q0 p6q0Var, t7q0 t7q0Var, boolean z, boolean z2, b6q0 b6q0Var, String str2, String str3, int i) {
        b6q0Var = (i & 128) != 0 ? null : b6q0Var;
        str2 = (i & 512) != 0 ? "" : str2;
        str3 = (i & 1024) != 0 ? "" : str3;
        boolean z3 = (i & 2048) == 0;
        boolean z4 = (i & 4096) == 0;
        a7n a7nVar = a7n.f379a;
        str.getClass();
        f6q0Var.getClass();
        p6q0Var.getClass();
        t7q0Var.getClass();
        str2.getClass();
        str3.getClass();
        this.f31716a = str;
        this.b = f6q0Var;
        this.c = p6q0Var;
        this.d = t7q0Var;
        this.e = z;
        this.f = z2;
        this.g = b6q0Var;
        this.h = str2;
        this.i = str3;
        this.j = z3;
        this.k = z4;
        this.l = a7nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6q0)) {
            return false;
        }
        s6q0 s6q0Var = (s6q0) obj;
        return Intrinsics.d(this.f31716a, s6q0Var.f31716a) && Intrinsics.d(this.b, s6q0Var.b) && Intrinsics.d(this.c, s6q0Var.c) && Intrinsics.d(this.d, s6q0Var.d) && this.e == s6q0Var.e && this.f == s6q0Var.f && Intrinsics.d(this.g, s6q0Var.g) && this.h.equals(s6q0Var.h) && this.i.equals(s6q0Var.i) && this.j == s6q0Var.j && this.k == s6q0Var.k && this.l == s6q0Var.l;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f31716a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, false);
        b6q0 b6q0Var = this.g;
        return this.l.hashCode() + twn.a(-1, brm0.e(brm0.e(ua80.b(ua80.b(brm0.e((iE + (b6q0Var == null ? 0 : b6q0Var.hashCode())) * 31, 31, false), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldFilledUiModel(value=");
        sb.append(this.f31716a);
        sb.append(", textFieldCellLeftStyle=");
        sb.append(this.b);
        sb.append(", textFieldCellRightStyle=");
        sb.append(this.c);
        sb.append(", supportingTextStyle=");
        sb.append(this.d);
        sb.append(", enabled=");
        ua80.u(", error=", ", loading=false, textAppearance=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", autoTextSize=false, labelText=");
        sb.append(this.h);
        sb.append(", placeholderText=");
        brm0.C(this.i, ", useArtificialRtl=", ", disableTopLabel=", sb, this.j);
        sb.append(this.k);
        sb.append(", capitalization=Unspecified, textDirection=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
