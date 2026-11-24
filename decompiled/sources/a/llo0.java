package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class llo0 implements nlo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20258a;
    public final slo0 b;

    public llo0(String str, slo0 slo0Var) {
        this.f20258a = str;
        this.b = slo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llo0)) {
            return false;
        }
        llo0 llo0Var = (llo0) obj;
        return this.f20258a.equals(llo0Var.f20258a) && this.b.equals(llo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((qek0.c.hashCode() + (this.f20258a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Image(image=" + this.f20258a + ", tableItemTypeColored=" + qek0.c + ", viewType=" + this.b + Separators.RPAREN;
    }
}
