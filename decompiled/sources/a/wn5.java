package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39432a;
    public final cdf b;
    public final idf c;

    public wn5(String str, cdf cdfVar, idf idfVar) {
        this.f39432a = str;
        this.b = cdfVar;
        this.c = idfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn5)) {
            return false;
        }
        wn5 wn5Var = (wn5) obj;
        return this.f39432a.equals(wn5Var.f39432a) && this.b.equals(wn5Var.b) && this.c.equals(wn5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f39432a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BallByBallUiModel(number=" + this.f39432a + ", cricketBalls=" + this.b + ", cricketPoints=" + this.c + Separators.RPAREN;
    }
}
