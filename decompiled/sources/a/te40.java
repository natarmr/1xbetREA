package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class te40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cj10 f33801a;
    public final vbj b;

    public te40(cj10 cj10Var, vbj vbjVar) {
        this.f33801a = cj10Var;
        this.b = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te40)) {
            return false;
        }
        te40 te40Var = (te40) obj;
        return this.f33801a.equals(te40Var.f33801a) && this.b.equals(te40Var.b);
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33801a.hashCode() * 31);
    }

    public final String toString() {
        return "LoyaltyProgramWidget(type=" + this.f33801a + ", state=" + this.b + Separators.RPAREN;
    }
}
