package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xl0 implements am0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zll f41050a;
    public final jjm b;
    public final j8b c;

    public xl0(zll zllVar, jjm jjmVar, j8b j8bVar) {
        this.f41050a = zllVar;
        this.b = jjmVar;
        this.c = j8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl0)) {
            return false;
        }
        xl0 xl0Var = (xl0) obj;
        return this.f41050a.equals(xl0Var.f41050a) && this.b.equals(xl0Var.b) && this.c.equals(xl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f41050a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AggregatorFavoritesCategoryUiModel(item=" + this.f41050a + ", headerModel=" + this.b + ", category=" + this.c + Separators.RPAREN;
    }
}
