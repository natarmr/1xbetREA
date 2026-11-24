package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f4067a;
    public final n0x b;
    public final a4x c;

    public cbm(n0x n0xVar, n0x n0xVar2, i4 i4Var) {
        i4Var.getClass();
        this.f4067a = n0xVar;
        this.b = n0xVar2;
        this.c = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbm)) {
            return false;
        }
        cbm cbmVar = (cbm) obj;
        return this.f4067a.equals(cbmVar.f4067a) && this.b.equals(cbmVar.b) && Intrinsics.d(this.c, cbmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f140.f(this.b, this.f4067a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCyberTeamLineupInfoUiModel(firstPlayer=");
        sb.append(this.f4067a);
        sb.append(", secondPlayer=");
        sb.append(this.b);
        sb.append(", comparableValues=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
