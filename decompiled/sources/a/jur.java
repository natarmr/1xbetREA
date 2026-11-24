package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw20 f17171a;
    public final n5n0 b;
    public final j43 c;
    public final wbs0 d;
    public final fho e;

    public jur(vw20 vw20Var, n5n0 n5n0Var, j43 j43Var, wbs0 wbs0Var, fho fhoVar) {
        wbs0Var.getClass();
        this.f17171a = vw20Var;
        this.b = n5n0Var;
        this.c = j43Var;
        this.d = wbs0Var;
        this.e = fhoVar;
    }

    public static jur a(jur jurVar, j43 j43Var, wbs0 wbs0Var, int i) {
        vw20 vw20Var = jurVar.f17171a;
        n5n0 n5n0Var = jurVar.b;
        if ((i & 4) != 0) {
            j43Var = jurVar.c;
        }
        j43 j43Var2 = j43Var;
        if ((i & 8) != 0) {
            wbs0Var = jurVar.d;
        }
        wbs0 wbs0Var2 = wbs0Var;
        fho fhoVar = jurVar.e;
        jurVar.getClass();
        wbs0Var2.getClass();
        return new jur(vw20Var, n5n0Var, j43Var2, wbs0Var2, fhoVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jur)) {
            return false;
        }
        jur jurVar = (jur) obj;
        return this.f17171a.equals(jurVar.f17171a) && this.b.equals(jurVar.b) && this.c.equals(jurVar.c) && this.d == jurVar.d && this.e == jurVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f17171a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GameCardStateModel(marketStateModel=" + this.f17171a + ", subgameStateModel=" + this.b + ", animatedCoefficientModel=" + this.c + ", trackEventState=" + this.d + ", eventSpecialBetType=" + this.e + Separators.RPAREN;
    }
}
