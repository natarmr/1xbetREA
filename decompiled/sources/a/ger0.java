package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ger0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11169a;
    public final zrm b;
    public final l1b0 c;

    public ger0(long j, zrm zrmVar, l1b0 l1b0Var) {
        this.f11169a = j;
        this.b = zrmVar;
        this.c = l1b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ger0)) {
            return false;
        }
        ger0 ger0Var = (ger0) obj;
        return this.f11169a == ger0Var.f11169a && this.b.equals(ger0Var.b) && this.c.equals(ger0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f11169a) * 31)) * 31);
    }

    public final String toString() {
        return "TopSportChampUiModel(id=" + this.f11169a + ", style=" + this.b + ", champ=" + this.c + Separators.RPAREN;
    }
}
