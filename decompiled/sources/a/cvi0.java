package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cvi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zb f5030a;
    public final boolean b;

    public cvi0(zb zbVar, boolean z) {
        this.f5030a = zbVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvi0)) {
            return false;
        }
        cvi0 cvi0Var = (cvi0) obj;
        return this.f5030a.equals(cvi0Var.f5030a) && this.b == cvi0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f5030a.hashCode() * 31);
    }

    public final String toString() {
        return "Accordion(accordionStyle=" + this.f5030a + ", expanded=" + this.b + Separators.RPAREN;
    }
}
