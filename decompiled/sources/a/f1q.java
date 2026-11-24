package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8777a;
    public final boolean b;
    public final boolean c;

    public f1q(boolean z, boolean z2, boolean z3) {
        this.f8777a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1q)) {
            return false;
        }
        f1q f1qVar = (f1q) obj;
        return this.f8777a == f1qVar.f8777a && this.b == f1qVar.b && this.c == f1qVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f8777a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("CommercialCommunication(isRequired=", ", isCommercialCommunication=", ", isHidden=", this.f8777a, this.b), this.c, Separators.RPAREN);
    }
}
