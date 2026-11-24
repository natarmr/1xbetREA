package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ytp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43232a;
    public final long b;
    public final String c;

    public ytp0(String str, int i, long j) {
        this.f43232a = i;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytp0)) {
            return false;
        }
        ytp0 ytp0Var = (ytp0) obj;
        return this.f43232a == ytp0Var.f43232a && znq0.e(this.b, ytp0Var.b) && this.c.equals(ytp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Integer.hashCode(this.f43232a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f43232a, "TekkenRoundModel(round=", ", time=", znq0.h(this.b), ", winnerName="), this.c, Separators.RPAREN);
    }
}
