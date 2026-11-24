package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lm4 implements mm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2c0 f20278a;
    public final String b;

    public lm4(m2c0 m2c0Var, String str) {
        this.f20278a = m2c0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm4)) {
            return false;
        }
        lm4 lm4Var = (lm4) obj;
        return this.f20278a.equals(lm4Var.f20278a) && this.b.equals(lm4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20278a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(profileInfo=" + this.f20278a + ", userId=" + this.b + Separators.RPAREN;
    }
}
