package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24493a;
    public final boolean b;
    public final boolean c;

    public o1q(boolean z, boolean z2, boolean z3) {
        this.f24493a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1q)) {
            return false;
        }
        o1q o1qVar = (o1q) obj;
        return this.f24493a == o1qVar.f24493a && this.b == o1qVar.b && this.c == o1qVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f24493a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("NotifyNewsCall(isRequired=", ", isNotifyNewsCall=", ", isHidden=", this.f24493a, this.b), this.c, Separators.RPAREN);
    }
}
