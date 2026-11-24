package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fq10 implements gq10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9954a;
    public final sek0 b;

    public fq10(sek0 sek0Var, String str) {
        this.f9954a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq10)) {
            return false;
        }
        fq10 fq10Var = (fq10) obj;
        return this.f9954a.equals(fq10Var.f9954a) && this.b.equals(fq10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9954a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnack(errorMessage=" + this.f9954a + ", type=" + this.b + Separators.RPAREN;
    }
}
