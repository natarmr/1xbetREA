package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jca0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16267a;
    public final ufp0 b;
    public final ufp0 c;
    public final String d;

    public jca0(String str, ufp0 ufp0Var, ufp0 ufp0Var2, String str2) {
        this.f16267a = str;
        this.b = ufp0Var;
        this.c = ufp0Var2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jca0)) {
            return false;
        }
        jca0 jca0Var = (jca0) obj;
        return this.f16267a.equals(jca0Var.f16267a) && this.b.equals(jca0Var.b) && this.c.equals(jca0Var.c) && this.d.equals(jca0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.f(this.c, twn.f(this.b, this.f16267a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PlayerTransferModel(dateString=" + this.f16267a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", transferType=" + this.d + Separators.RPAREN;
    }
}
