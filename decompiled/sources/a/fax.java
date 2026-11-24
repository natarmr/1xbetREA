package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fax implements jax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch00 f9230a;
    public final String b;
    public final a4x c;
    public final lmo d;

    public fax(ch00 ch00Var, String str, a4x a4xVar, lmo lmoVar) {
        dja djaVar = dja.PENALTY;
        str.getClass();
        a4xVar.getClass();
        this.f9230a = ch00Var;
        this.b = str;
        this.c = a4xVar;
        this.d = lmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fax)) {
            return false;
        }
        fax faxVar = (fax) obj;
        dja djaVar = dja.PENALTY;
        return this.f9230a == faxVar.f9230a && Intrinsics.d(this.b, faxVar.b) && Intrinsics.d(this.c, faxVar.c) && Intrinsics.d(this.d, faxVar.d);
    }

    @Override // a.jax
    public final dja getType() {
        return dja.LAST_GAMES;
    }

    public final int hashCode() {
        int iB = cs0.b(this.c, ua80.b((this.f9230a.hashCode() + (dja.LAST_GAMES.hashCode() * 31)) * 31, 31, this.b), 31);
        lmo lmoVar = this.d;
        return iB + (lmoVar == null ? 0 : lmoVar.hashCode());
    }

    public final String toString() {
        dja djaVar = dja.LAST_GAMES;
        StringBuilder sb = new StringBuilder("LastGames(type=");
        sb.append(djaVar);
        sb.append(", expandSection=");
        sb.append(this.f9230a);
        sb.append(", header=");
        cs0.B(sb, this.b, ", infoList=", this.c, ", btnUiModel=");
        sb.append(this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
