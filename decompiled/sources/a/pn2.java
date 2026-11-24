package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f27263a;
    public final boolean b;
    public final fie c;
    public final zpv d;
    public final boolean e;

    public pn2(imm immVar, boolean z, fie fieVar, zpv zpvVar, boolean z2) {
        this.f27263a = immVar;
        this.b = z;
        this.c = fieVar;
        this.d = zpvVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn2)) {
            return false;
        }
        pn2 pn2Var = (pn2) obj;
        return this.f27263a.equals(pn2Var.f27263a) && this.b == pn2Var.b && this.c.equals(pn2Var.c) && this.d.equals(pn2Var.d) && this.e == pn2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + brm0.e(this.f27263a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltViewedUiState(header=");
        sb.append(this.f27263a);
        sb.append(", scrollToTop=");
        sb.append(this.b);
        sb.append(", contentState=");
        sb.append(this.c);
        sb.append(", headerActionsState=");
        sb.append(this.d);
        sb.append(", canScrollUp=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
