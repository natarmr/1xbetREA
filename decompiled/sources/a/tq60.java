package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class tq60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rq60 f34367a;
    public final d270 b;

    public tq60(rq60 rq60Var, d270 d270Var) {
        this.f34367a = rq60Var;
        this.b = d270Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq60)) {
            return false;
        }
        tq60 tq60Var = (tq60) obj;
        return this.f34367a.equals(tq60Var.f34367a) && this.b == tq60Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34367a.hashCode() * 31);
    }

    public final String toString() {
        return "OneXGamesActionWithType(result=" + this.f34367a + ", type=" + this.b + Separators.RPAREN;
    }
}
