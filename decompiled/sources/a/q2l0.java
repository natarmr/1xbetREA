package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q2l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zb f28005a;
    public final boolean b;

    public q2l0(zb zbVar, boolean z) {
        this.f28005a = zbVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2l0)) {
            return false;
        }
        q2l0 q2l0Var = (q2l0) obj;
        return this.f28005a.equals(q2l0Var.f28005a) && this.b == q2l0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f28005a.hashCode() * 31);
    }

    public final String toString() {
        return "Accordion(accordionStyle=" + this.f28005a + ", expanded=" + this.b + Separators.RPAREN;
    }
}
