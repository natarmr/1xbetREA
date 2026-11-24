package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20779a;
    public final d280 b;

    public lws0(String str, d280 d280Var) {
        this.f20779a = str;
        this.b = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lws0)) {
            return false;
        }
        lws0 lws0Var = (lws0) obj;
        return this.f20779a.equals(lws0Var.f20779a) && this.b.equals(lws0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20779a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoOpponentsColumnsCompactOpponentModel(teamName=" + this.f20779a + ", teamLogo=" + this.b + Separators.RPAREN;
    }
}
