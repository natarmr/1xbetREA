package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pls implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b610 f27200a;
    public final b610 b;
    public final i4 c;

    public pls(b610 b610Var, b610 b610Var2, i4 i4Var) {
        i4Var.getClass();
        this.f27200a = b610Var;
        this.b = b610Var2;
        this.c = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pls)) {
            return false;
        }
        pls plsVar = (pls) obj;
        return this.f27200a.equals(plsVar.f27200a) && this.b.equals(plsVar.b) && Intrinsics.d(this.c, plsVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "GAME_LOG";
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f27200a.hashCode() - 477898359) * 31)) * 31);
    }

    public final String toString() {
        return "GameLogUiModel(key=GAME_LOG, firstTeam=" + this.f27200a + ", secondTeam=" + this.b + ", gameLogEvents=" + this.c + Separators.RPAREN;
    }
}
