package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x7q0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vqp f40425a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public x7q0(vqp vqpVar, String str, String str2, boolean z, String str3) {
        str2.getClass();
        this.f40425a = vqpVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public static x7q0 c(x7q0 x7q0Var, String str, String str2, int i) {
        vqp vqpVar = x7q0Var.f40425a;
        if ((i & 2) != 0) {
            str = x7q0Var.b;
        }
        String str3 = x7q0Var.c;
        boolean z = x7q0Var.d;
        str3.getClass();
        return new x7q0(vqpVar, str, str3, z, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7q0)) {
            return false;
        }
        x7q0 x7q0Var = (x7q0) obj;
        return this.f40425a == x7q0Var.f40425a && this.b.equals(x7q0Var.b) && Intrinsics.d(this.c, x7q0Var.c) && this.d == x7q0Var.d && this.e.equals(x7q0Var.e);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof x7q0) && (p6t0Var2 instanceof x7q0) && ((x7q0) p6t0Var).f40425a == ((x7q0) p6t0Var2).f40425a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(ua80.b(ua80.b(this.f40425a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof x7q0) || !(p6t0Var2 instanceof x7q0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        x7q0 x7q0Var = (x7q0) p6t0Var;
        x7q0 x7q0Var2 = (x7q0) p6t0Var2;
        k9x.G(linkedHashSet, new v7q0(x7q0Var.b), new v7q0(x7q0Var2.b));
        k9x.G(linkedHashSet, new u7q0(x7q0Var.e), new u7q0(x7q0Var2.e));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Text(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("Error(value=", this.e, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("TextFieldUiModel(fieldName=");
        sb.append(this.f40425a);
        sb.append(", text=");
        sb.append(strL);
        sb.append(", hint=");
        brm0.C(this.c, ", required=", ", error=", sb, this.d);
        return axq.n(sb, strL2, Separators.RPAREN);
    }
}
