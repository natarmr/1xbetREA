package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ee6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7655a;
    public final boolean b;
    public final String c;

    public ee6(String str, boolean z, boolean z2) {
        this.f7655a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee6)) {
            return false;
        }
        ee6 ee6Var = (ee6) obj;
        return this.f7655a == ee6Var.f7655a && this.b == ee6Var.b && this.c.equals(ee6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f7655a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(f140.q("InputConfigUiState(hasAutoMax=", ", unlimitedBet=", ", maxBlockValue=", this.f7655a, this.b), this.c, Separators.RPAREN);
    }
}
