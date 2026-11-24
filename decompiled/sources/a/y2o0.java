package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y2o0 implements a3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41915a;
    public final String b;
    public final c280 c;
    public final c280 d;
    public final a4x e;
    public final y1m f;

    public y2o0(String str, String str2, c280 c280Var, c280 c280Var2, a4x a4xVar, y1m y1mVar) {
        w6x.x(a4xVar, str, str2);
        this.f41915a = str;
        this.b = str2;
        this.c = c280Var;
        this.d = c280Var2;
        this.e = a4xVar;
        this.f = y1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2o0)) {
            return false;
        }
        y2o0 y2o0Var = (y2o0) obj;
        return Intrinsics.d(this.f41915a, y2o0Var.f41915a) && Intrinsics.d(this.b, y2o0Var.b) && this.c.equals(y2o0Var.c) && this.d.equals(y2o0Var.d) && Intrinsics.d(this.e, y2o0Var.e) && this.f.equals(y2o0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cs0.b(this.e, hne.g(this.d, hne.g(this.c, ua80.b(this.f41915a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Roulette(firstOpponentLabel=", this.f41915a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
        f140.u(sbN, this.c, ", secondOpponentIcon=", this.d, ", rouletteList=");
        sbN.append(this.e);
        sbN.append(", scoreModel=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
