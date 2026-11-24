package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14434a;
    public final int b;
    public final boolean c;

    public iad0(int i, long j, boolean z) {
        this.f14434a = j;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iad0)) {
            return false;
        }
        iad0 iad0Var = (iad0) obj;
        return this.f14434a == iad0Var.f14434a && this.b == iad0Var.b && this.c == iad0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, Long.hashCode(this.f14434a) * 31, 31);
    }

    public final String toString() {
        return f140.n(brm0.q(this.b, this.f14434a, "CyberDiscipline(sportId=", ", cyberType="), ", randomDiscipline=", this.c, Separators.RPAREN);
    }
}
