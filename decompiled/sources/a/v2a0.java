package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes5.dex */
public final class v2a0 implements x2a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f36673a;
    public final a4x b;
    public final a4x c;
    public final MarketsParams.DuelSubGame d;

    public v2a0(imm immVar, a4x a4xVar, a4x a4xVar2, MarketsParams.DuelSubGame duelSubGame) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f36673a = immVar;
        this.b = a4xVar;
        this.c = a4xVar2;
        this.d = duelSubGame;
    }

    @Override // a.x2a0
    public final imm a() {
        return this.f36673a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2a0)) {
            return false;
        }
        v2a0 v2a0Var = (v2a0) obj;
        return this.f36673a.equals(v2a0Var.f36673a) && Intrinsics.d(this.b, v2a0Var.b) && Intrinsics.d(this.c, v2a0Var.c) && this.d.equals(v2a0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, this.f36673a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Content(toolBar=" + this.f36673a + ", firstTeam=" + this.b + ", secondTeam=" + this.c + ", marketsParams=" + this.d + Separators.RPAREN;
    }
}
