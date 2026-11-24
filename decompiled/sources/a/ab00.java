package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ab00 implements db00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f556a;
    public final boolean b;

    public ab00(boolean z, boolean z2) {
        this.f556a = z;
        this.b = z2;
    }

    @Override // a.db00
    public final boolean a() {
        return this.b;
    }

    @Override // a.db00
    public final boolean b() {
        return this.f556a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab00)) {
            return false;
        }
        ab00 ab00Var = (ab00) obj;
        return this.f556a == ab00Var.f556a && this.b == ab00Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f556a) * 31);
    }

    public final String toString() {
        return hne.n("Loading(isExpanded=", ", isImplemented=", Separators.RPAREN, this.f556a, this.b);
    }
}
