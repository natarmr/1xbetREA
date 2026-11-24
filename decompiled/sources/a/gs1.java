package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gs1 implements ss1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr1 f11806a;
    public final boolean b;

    public gs1(yr1 yr1Var, boolean z) {
        this.f11806a = yr1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs1)) {
            return false;
        }
        gs1 gs1Var = (gs1) obj;
        return this.f11806a.equals(gs1Var.f11806a) && this.b == gs1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f11806a.hashCode() * 31);
    }

    public final String toString() {
        return "OnConditionClick(conditionKey=" + this.f11806a + ", expanded=" + this.b + Separators.RPAREN;
    }
}
