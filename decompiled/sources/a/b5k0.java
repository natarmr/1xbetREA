package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final llm0 f2007a;
    public final String b;
    public final nc5 c;
    public final esp0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public b5k0(llm0 llm0Var, String str, nc5 nc5Var, esp0 esp0Var, boolean z, boolean z2, boolean z3) {
        this.f2007a = llm0Var;
        this.b = str;
        this.c = nc5Var;
        this.d = esp0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static b5k0 a(b5k0 b5k0Var, String str, nc5 nc5Var, esp0 esp0Var, boolean z, boolean z2, boolean z3, int i) {
        String str2 = str;
        llm0 llm0Var = b5k0Var.f2007a;
        if ((i & 2) != 0) {
            str2 = b5k0Var.b;
        }
        if ((i & 4) != 0) {
            nc5Var = b5k0Var.c;
        }
        if ((i & 8) != 0) {
            esp0Var = b5k0Var.d;
        }
        if ((i & 16) != 0) {
            z = b5k0Var.e;
        }
        if ((i & 32) != 0) {
            z2 = b5k0Var.f;
        }
        if ((i & 64) != 0) {
            z3 = b5k0Var.g;
        }
        boolean z4 = z3;
        b5k0Var.getClass();
        str2.getClass();
        boolean z5 = z2;
        boolean z6 = z;
        esp0 esp0Var2 = esp0Var;
        return new b5k0(llm0Var, str2, nc5Var, esp0Var2, z6, z5, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5k0)) {
            return false;
        }
        b5k0 b5k0Var = (b5k0) obj;
        return this.f2007a == b5k0Var.f2007a && this.b.equals(b5k0Var.b) && this.c.equals(b5k0Var.c) && Intrinsics.d(this.d, b5k0Var.d) && this.e == b5k0Var.e && this.f == b5k0Var.f && this.g == b5k0Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ua80.b(this.f2007a.hashCode() * 31, 31, this.b)) * 31;
        esp0 esp0Var = this.d;
        return Boolean.hashCode(this.g) + brm0.e(brm0.e((iHashCode + (esp0Var == null ? 0 : esp0Var.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleTeamStatisticMenuState(headerStyle=");
        sb.append(this.f2007a);
        sb.append(", sportName=");
        sb.append(this.b);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.c);
        sb.append(", menuModel=");
        sb.append(this.d);
        sb.append(", isLoading=");
        ua80.u(", isError=", ", isEmpty=", sb, this.e, this.f);
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
