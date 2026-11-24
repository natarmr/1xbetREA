package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x3y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy6 f40242a;
    public final tm5 b;
    public final xw6 c;
    public final String d;
    public final boolean e;

    public x3y(zy6 zy6Var, tm5 tm5Var, xw6 xw6Var, String str, boolean z) {
        str.getClass();
        this.f40242a = zy6Var;
        this.b = tm5Var;
        this.c = xw6Var;
        this.d = str;
        this.e = z;
    }

    public static x3y a(x3y x3yVar, tm5 tm5Var, xw6 xw6Var, boolean z, int i) {
        zy6 zy6Var = x3yVar.f40242a;
        if ((i & 2) != 0) {
            tm5Var = x3yVar.b;
        }
        tm5 tm5Var2 = tm5Var;
        if ((i & 4) != 0) {
            xw6Var = x3yVar.c;
        }
        xw6 xw6Var2 = xw6Var;
        String str = x3yVar.d;
        if ((i & 16) != 0) {
            z = x3yVar.e;
        }
        x3yVar.getClass();
        str.getClass();
        return new x3y(zy6Var, tm5Var2, xw6Var2, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3y)) {
            return false;
        }
        x3y x3yVar = (x3y) obj;
        return this.f40242a.equals(x3yVar.f40242a) && this.b.equals(x3yVar.b) && this.c.equals(x3yVar.c) && Intrinsics.d(this.d, x3yVar.d) && this.e == x3yVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f40242a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JackpotLiteNoTabBetState(betGameInfoUiState=");
        sb.append(this.f40242a);
        sb.append(", balanceState=");
        sb.append(this.b);
        sb.append(", betFieldState=");
        sb.append(this.c);
        sb.append(", taxInfoLabel=");
        sb.append(this.d);
        sb.append(", lastConnection=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
