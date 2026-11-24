package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32476a;
    public final ycf b;
    public final edf c;

    public sn5(String str, ycf ycfVar, edf edfVar) {
        this.f32476a = str;
        this.b = ycfVar;
        this.c = edfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn5)) {
            return false;
        }
        sn5 sn5Var = (sn5) obj;
        return this.f32476a.equals(sn5Var.f32476a) && this.b.equals(sn5Var.b) && this.c.equals(sn5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f32476a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BallByBallModel(number=" + this.f32476a + ", cricketBalls=" + this.b + ", cricketPoints=" + this.c + Separators.RPAREN;
    }
}
