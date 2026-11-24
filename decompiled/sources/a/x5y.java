package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x5y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40337a;
    public final vm5 b;
    public final zw6 c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public x5y(String str, vm5 vm5Var, zw6 zw6Var, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f40337a = str;
        this.b = vm5Var;
        this.c = zw6Var;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }

    public static x5y a(x5y x5yVar, vm5 vm5Var, zw6 zw6Var, boolean z, boolean z2, int i) {
        String str = x5yVar.f40337a;
        if ((i & 2) != 0) {
            vm5Var = x5yVar.b;
        }
        vm5 vm5Var2 = vm5Var;
        if ((i & 4) != 0) {
            zw6Var = x5yVar.c;
        }
        zw6 zw6Var2 = zw6Var;
        String str2 = x5yVar.d;
        if ((i & 16) != 0) {
            z = x5yVar.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = x5yVar.f;
        }
        x5yVar.getClass();
        str.getClass();
        str2.getClass();
        return new x5y(str, vm5Var2, zw6Var2, str2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5y)) {
            return false;
        }
        x5y x5yVar = (x5y) obj;
        return Intrinsics.d(this.f40337a, x5yVar.f40337a) && this.b.equals(x5yVar.b) && this.c.equals(x5yVar.c) && Intrinsics.d(this.d, x5yVar.d) && this.e == x5yVar.e && this.f == x5yVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f40337a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JackpotMediumNoGameInfoState(variantAmount=");
        sb.append(this.f40337a);
        sb.append(", balanceState=");
        sb.append(this.b);
        sb.append(", betFieldState=");
        sb.append(this.c);
        sb.append(", taxInfoLabel=");
        sb.append(this.d);
        sb.append(", lastConnection=");
        return ohs0.p(", isLoading=", Separators.RPAREN, sb, this.e, this.f);
    }
}
