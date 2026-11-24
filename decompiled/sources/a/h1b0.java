package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h1b0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12275a;
    public final zrm b;

    public h1b0(long j, zrm zrmVar) {
        this.f12275a = j;
        this.b = zrmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1b0)) {
            return false;
        }
        h1b0 h1b0Var = (h1b0) obj;
        return this.f12275a == h1b0Var.f12275a && this.b.equals(h1b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f12275a) * 31);
    }

    public final String toString() {
        return "PopularChampUiItem(id=" + this.f12275a + ", style=" + this.b + Separators.RPAREN;
    }
}
