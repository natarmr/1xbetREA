package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class b3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cc0 f1893a;
    public final akl b;

    public b3b(cc0 cc0Var, akl aklVar) {
        cc0Var.getClass();
        this.f1893a = cc0Var;
        this.b = aklVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3b)) {
            return false;
        }
        b3b b3bVar = (b3b) obj;
        return this.f1893a == b3bVar.f1893a && this.b.equals(b3bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1893a.hashCode() * 31);
    }

    public final String toString() {
        return "CategoriesPartitionsUIModel(style=" + this.f1893a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
