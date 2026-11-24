package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nnm0 f11638a;
    public final String b;

    public gom0(nnm0 nnm0Var, String str) {
        this.f11638a = nnm0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gom0)) {
            return false;
        }
        gom0 gom0Var = (gom0) obj;
        return this.f11638a == gom0Var.f11638a && this.b.equals(gom0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11638a.hashCode() * 31);
    }

    public final String toString() {
        return "StatusResult(id=" + this.f11638a + ", description=" + this.b + Separators.RPAREN;
    }
}
