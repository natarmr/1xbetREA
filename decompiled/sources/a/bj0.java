package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class bj0 implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2680a;
    public final ti0 b;

    public bj0(String str, ti0 ti0Var) {
        this.f2680a = str;
        this.b = ti0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj0)) {
            return false;
        }
        bj0 bj0Var = (bj0) obj;
        return this.f2680a.equals(bj0Var.f2680a) && this.b.equals(bj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2680a.hashCode() * 31);
    }

    public final String toString() {
        return "RegistrationBonusBannerModel(id=" + this.f2680a + ", headerModel=" + this.b + Separators.RPAREN;
    }
}
