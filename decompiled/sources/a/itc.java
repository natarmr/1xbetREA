package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class itc implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15347a;
    public final boolean b;
    public final vqp c;
    public final String d;
    public final String e;
    public final boolean f;

    public itc(int i, boolean z, vqp vqpVar, String str, String str2, boolean z2) {
        str2.getClass();
        this.f15347a = i;
        this.b = z;
        this.c = vqpVar;
        this.d = str;
        this.e = str2;
        this.f = z2;
    }

    public static itc c(itc itcVar, int i, String str, int i2) {
        if ((i2 & 1) != 0) {
            i = itcVar.f15347a;
        }
        int i3 = i;
        boolean z = (i2 & 2) != 0 ? itcVar.b : true;
        vqp vqpVar = itcVar.c;
        String str2 = itcVar.e;
        boolean z2 = itcVar.f;
        str.getClass();
        str2.getClass();
        return new itc(i3, z, vqpVar, str, str2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itc)) {
            return false;
        }
        itc itcVar = (itc) obj;
        return this.f15347a == itcVar.f15347a && this.b == itcVar.b && this.c == itcVar.c && this.d.equals(itcVar.d) && Intrinsics.d(this.e, itcVar.e) && this.f == itcVar.f;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof itc) && (p6t0Var2 instanceof itc) && ((itc) p6t0Var).f15347a == ((itc) p6t0Var2).f15347a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b((this.c.hashCode() + brm0.e(Integer.hashCode(this.f15347a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return null;
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f15347a, "ClickableTextFieldUiModel(id=", ", enabled=", ", fieldName=", this.b);
        sbL.append(this.c);
        sbL.append(", text=");
        sbL.append(this.d);
        sbL.append(", hint=");
        return defpackage.c.c(this.e, ", required=", Separators.RPAREN, sbL, this.f);
    }
}
