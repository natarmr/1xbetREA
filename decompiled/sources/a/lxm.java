package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20821a;
    public final c280 b;
    public final String c;
    public final a4x d;

    public lxm(String str, c280 c280Var, String str2, a4x a4xVar) {
        w6x.x(a4xVar, str, str2);
        this.f20821a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxm)) {
            return false;
        }
        lxm lxmVar = (lxm) obj;
        return Intrinsics.d(this.f20821a, lxmVar.f20821a) && this.b.equals(lxmVar.b) && Intrinsics.d(this.c, lxmVar.c) && Intrinsics.d(this.d, lxmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(hne.g(this.b, this.f20821a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "V3(opponentLabel=", this.f20821a, ", opponentIcon=", ", seed=");
        sbP.append(this.c);
        sbP.append(", scores=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
