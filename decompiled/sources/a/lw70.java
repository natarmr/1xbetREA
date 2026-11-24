package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lw70 implements mw70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f20751a;
    public final boolean b;

    public lw70(zpv zpvVar, boolean z) {
        this.f20751a = zpvVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw70)) {
            return false;
        }
        lw70 lw70Var = (lw70) obj;
        return this.f20751a.equals(lw70Var.f20751a) && this.b == lw70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f20751a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewed(headerActionsState=" + this.f20751a + ", canScrollUp=" + this.b + Separators.RPAREN;
    }
}
