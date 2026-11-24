package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kw70 implements mw70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f18988a;
    public final boolean b;

    public kw70(zpv zpvVar, boolean z) {
        this.f18988a = zpvVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw70)) {
            return false;
        }
        kw70 kw70Var = (kw70) obj;
        return this.f18988a.equals(kw70Var.f18988a) && this.b == kw70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f18988a.hashCode() * 31);
    }

    public final String toString() {
        return "SportTracked(headerActionsState=" + this.f18988a + ", canScrollUp=" + this.b + Separators.RPAREN;
    }
}
