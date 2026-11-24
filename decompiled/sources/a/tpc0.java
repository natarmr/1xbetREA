package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class tpc0 implements vpc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34326a;
    public final String b;

    public tpc0(String str, boolean z) {
        this.f34326a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpc0)) {
            return false;
        }
        tpc0 tpc0Var = (tpc0) obj;
        return this.f34326a == tpc0Var.f34326a && this.b.equals(tpc0Var.b);
    }

    @Override // a.vpc0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f34326a) * 31);
    }

    public final String toString() {
        return ua80.k("Error(hasTimer=", this.f34326a, ", title=", this.b, Separators.RPAREN);
    }
}
