package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class fsv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxv0 f10084a;
    public final int b;

    public fsv0(lxv0 lxv0Var, int i) {
        this.f10084a = lxv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsv0)) {
            return false;
        }
        fsv0 fsv0Var = (fsv0) obj;
        return this.f10084a.equals(fsv0Var.f10084a) && this.b == fsv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f10084a.hashCode() * 31);
    }

    public final String toString() {
        return "AnchorEntry(value=" + this.f10084a + ", anchorPx=" + this.b + Separators.RPAREN;
    }
}
