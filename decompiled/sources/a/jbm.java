package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16244a;
    public final a4x b;
    public final a4x c;

    public jbm(String str, i4 i4Var, i4 i4Var2) {
        i4Var.getClass();
        i4Var2.getClass();
        this.f16244a = str;
        this.b = i4Var;
        this.c = i4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbm)) {
            return false;
        }
        jbm jbmVar = (jbm) obj;
        return this.f16244a.equals(jbmVar.f16244a) && Intrinsics.d(this.b, jbmVar.b) && Intrinsics.d(this.c, jbmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f16244a.hashCode() * 31, 31);
    }

    public final String toString() {
        return cs0.n(kng0.u("DsCyberTeamLineupUiModel(id=", this.f16244a, ", badges=", this.b, ", players="), this.c, Separators.RPAREN);
    }
}
