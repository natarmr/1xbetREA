package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mi10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg10 f21824a;
    public final String b;

    public mi10(pg10 pg10Var, String str) {
        this.f21824a = pg10Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi10)) {
            return false;
        }
        mi10 mi10Var = (mi10) obj;
        return this.f21824a == mi10Var.f21824a && this.b.equals(mi10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21824a.hashCode() * 961);
    }

    public final String toString() {
        return "LoyaltyProgramLevelStepModel(type=" + this.f21824a + ", description=, image=" + this.b + Separators.RPAREN;
    }
}
