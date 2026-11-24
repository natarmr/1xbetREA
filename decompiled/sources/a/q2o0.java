package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q2o0 implements s2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28011a;
    public final String b;
    public final c280 c;
    public final c280 d;
    public final a4x e;
    public final y1m f;
    public final String g;
    public final String h;

    public q2o0(String str, String str2, c280 c280Var, c280 c280Var2, a4x a4xVar, y1m y1mVar, String str3, String str4) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        str3.getClass();
        str4.getClass();
        this.f28011a = str;
        this.b = str2;
        this.c = c280Var;
        this.d = c280Var2;
        this.e = a4xVar;
        this.f = y1mVar;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2o0)) {
            return false;
        }
        q2o0 q2o0Var = (q2o0) obj;
        return Intrinsics.d(this.f28011a, q2o0Var.f28011a) && Intrinsics.d(this.b, q2o0Var.b) && this.c.equals(q2o0Var.c) && this.d.equals(q2o0Var.d) && Intrinsics.d(this.e, q2o0Var.e) && this.f.equals(q2o0Var.f) && Intrinsics.d(this.g, q2o0Var.g) && Intrinsics.d(this.h, q2o0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b((this.f.hashCode() + cs0.b(this.e, hne.g(this.d, hne.g(this.c, ua80.b(this.f28011a.hashCode() * 31, 31, this.b), 31), 31), 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Roulette(firstOpponentLabel=", this.f28011a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
        f140.u(sbN, this.c, ", secondOpponentIcon=", this.d, ", rouletteList=");
        sbN.append(this.e);
        sbN.append(", scoreModel=");
        sbN.append(this.f);
        sbN.append(", infoLabel=");
        return ua80.m(sbN, this.g, ", tagLiveText=", this.h, Separators.RPAREN);
    }
}
