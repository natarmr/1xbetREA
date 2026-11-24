package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iw70 implements mw70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f15475a;
    public final boolean b;

    public iw70(zpv zpvVar, boolean z) {
        this.f15475a = zpvVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw70)) {
            return false;
        }
        iw70 iw70Var = (iw70) obj;
        return this.f15475a.equals(iw70Var.f15475a) && this.b == iw70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f15475a.hashCode() * 31);
    }

    public final String toString() {
        return "Other(headerActionsState=" + this.f15475a + ", canScrollUp=" + this.b + Separators.RPAREN;
    }
}
