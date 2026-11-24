package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s1y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bz6 f31477a;
    public final String b;
    public final sm5 c;
    public final ax6 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public s1y(bz6 bz6Var, String str, sm5 sm5Var, ax6 ax6Var, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f31477a = bz6Var;
        this.b = str;
        this.c = sm5Var;
        this.d = ax6Var;
        this.e = str2;
        this.f = z;
        this.g = z2;
    }

    public static s1y a(s1y s1yVar, sm5 sm5Var, ax6 ax6Var, boolean z, boolean z2, int i) {
        bz6 bz6Var = s1yVar.f31477a;
        String str = s1yVar.b;
        if ((i & 4) != 0) {
            sm5Var = s1yVar.c;
        }
        sm5 sm5Var2 = sm5Var;
        if ((i & 8) != 0) {
            ax6Var = s1yVar.d;
        }
        ax6 ax6Var2 = ax6Var;
        String str2 = s1yVar.e;
        if ((i & 32) != 0) {
            z = s1yVar.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = s1yVar.g;
        }
        s1yVar.getClass();
        str.getClass();
        str2.getClass();
        return new s1y(bz6Var, str, sm5Var2, ax6Var2, str2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1y)) {
            return false;
        }
        s1y s1yVar = (s1y) obj;
        return this.f31477a.equals(s1yVar.f31477a) && Intrinsics.d(this.b, s1yVar.b) && this.c.equals(s1yVar.c) && this.d.equals(s1yVar.d) && Intrinsics.d(this.e, s1yVar.e) && this.f == s1yVar.f && this.g == s1yVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(ua80.b((this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f31477a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JackpotFullscreenSliderState(betGameInfoUiState=");
        sb.append(this.f31477a);
        sb.append(", variantAmount=");
        sb.append(this.b);
        sb.append(", balanceState=");
        sb.append(this.c);
        sb.append(", betFieldState=");
        sb.append(this.d);
        sb.append(", taxInfoLabel=");
        brm0.C(this.e, ", lastConnection=", ", isLoading=", sb, this.f);
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
