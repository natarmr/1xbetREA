package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class mr40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22251a;
    public final String b;
    public final int c;
    public final long d;
    public final String e;
    public final vr40 f;

    public mr40(int i, String str, int i2, long j, String str2, vr40 vr40Var) {
        this.f22251a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = str2;
        this.f = vr40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr40)) {
            return false;
        }
        mr40 mr40Var = (mr40) obj;
        return this.f22251a == mr40Var.f22251a && this.b.equals(mr40Var.b) && this.c == mr40Var.c && znq0.e(this.d, mr40Var.d) && this.e.equals(mr40Var.e) && this.f == mr40Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(rw2.b(twn.a(this.c, ua80.b(Integer.hashCode(this.f22251a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strH = znq0.h(this.d);
        StringBuilder sbR = vqd.r(this.f22251a, "MortalKombatRoundModel(round=", ", winnerName=", this.b, ", typeOfWin=");
        kng0.w(this.c, ", time=", strH, ", typeOfFinish=", sbR);
        sbR.append(this.e);
        sbR.append(", winner=");
        sbR.append(this.f);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
