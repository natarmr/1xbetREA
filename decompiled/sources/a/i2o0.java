package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i2o0 implements k2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14060a;
    public final String b;
    public final c280 c;
    public final c280 d;
    public final a4x e;
    public final kpm f;
    public final String g;

    public i2o0(String str, String str2, c280 c280Var, c280 c280Var2, a4x a4xVar, kpm kpmVar, String str3) {
        w6x.x(a4xVar, str, str2);
        this.f14060a = str;
        this.b = str2;
        this.c = c280Var;
        this.d = c280Var2;
        this.e = a4xVar;
        this.f = kpmVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2o0)) {
            return false;
        }
        i2o0 i2o0Var = (i2o0) obj;
        return Intrinsics.d(this.f14060a, i2o0Var.f14060a) && Intrinsics.d(this.b, i2o0Var.b) && this.c.equals(i2o0Var.c) && this.d.equals(i2o0Var.d) && Intrinsics.d(this.e, i2o0Var.e) && this.f.equals(i2o0Var.f) && this.g.equals(i2o0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.c(this.f, cs0.b(this.e, hne.g(this.d, hne.g(this.c, ua80.b(this.f14060a.hashCode() * 31, 31, this.b), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Roulette(firstOpponentLabel=", this.f14060a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
        f140.u(sbN, this.c, ", secondOpponentIcon=", this.d, ", rouletteList=");
        sbN.append(this.e);
        sbN.append(", scoreModel=");
        sbN.append(this.f);
        sbN.append(", infoLabel=");
        return axq.n(sbN, this.g, Separators.RPAREN);
    }
}
