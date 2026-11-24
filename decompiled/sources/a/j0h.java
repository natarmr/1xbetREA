package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j0h implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15682a;
    public final boolean b;
    public final String c;

    public j0h(String str, int i, boolean z) {
        this.f15682a = i;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0h)) {
            return false;
        }
        j0h j0hVar = (j0h) obj;
        return this.f15682a == j0hVar.f15682a && this.b == j0hVar.b && this.c.equals(j0hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Integer.hashCode(this.f15682a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(h97.l(this.f15682a, "CyberGroupTabSelectorElementUiModel(index=", ", isSelected=", ", title=", this.b), this.c, Separators.RPAREN);
    }
}
