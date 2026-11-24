package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ml4 implements xl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu4 f21969a;
    public final String b;

    public ml4(uu4 uu4Var, String str) {
        this.f21969a = uu4Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml4)) {
            return false;
        }
        ml4 ml4Var = (ml4) obj;
        return this.f21969a.equals(ml4Var.f21969a) && this.b.equals(ml4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21969a.hashCode() * 31);
    }

    public final String toString() {
        return "Perform(authorizationData=" + this.f21969a + ", deviceId=" + this.b + Separators.RPAREN;
    }
}
