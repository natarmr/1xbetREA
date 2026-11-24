package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lij0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20110a;
    public final String b;

    public lij0(int i, String str) {
        this.f20110a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lij0)) {
            return false;
        }
        lij0 lij0Var = (lij0) obj;
        return this.f20110a == lij0Var.f20110a && this.b.equals(lij0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f20110a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f20110a, "SettoeMezzoCostRulesUiModel(cardImage=", ", ruleValue=", this.b, Separators.RPAREN);
    }
}
