package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljg f22778a;
    public final ueh b;
    public final y3h c;
    public final q310 d;
    public final ic6 e;
    public final ypl0 f;

    public n210(ljg ljgVar, ueh uehVar, y3h y3hVar, q310 q310Var, ic6 ic6Var, ypl0 ypl0Var) {
        ljgVar.getClass();
        uehVar.getClass();
        q310Var.getClass();
        ypl0Var.getClass();
        this.f22778a = ljgVar;
        this.b = uehVar;
        this.c = y3hVar;
        this.d = q310Var;
        this.e = ic6Var;
        this.f = ypl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n210)) {
            return false;
        }
        n210 n210Var = (n210) obj;
        return Intrinsics.d(this.f22778a, n210Var.f22778a) && Intrinsics.d(this.b, n210Var.b) && this.c.equals(n210Var.c) && Intrinsics.d(this.d, n210Var.d) && this.e.equals(n210Var.e) && Intrinsics.d(this.f, n210Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f22778a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LolPostGameStatModel(lastMatchesInfoModel=" + this.f22778a + ", stageTableModel=" + this.b + ", playersComposition=" + this.c + ", statisticMatch=" + this.d + ", bestHeroes=" + this.e + ", sportSimpleModel=" + this.f + Separators.RPAREN;
    }
}
