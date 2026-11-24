package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wi40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39196a;
    public final String b;
    public final int c;

    public wi40(int i, String str, String str2) {
        this.f39196a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi40)) {
            return false;
        }
        wi40 wi40Var = (wi40) obj;
        return this.f39196a.equals(wi40Var.f39196a) && this.b.equals(wi40Var.b) && this.c == wi40Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f39196a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("MlbbHeroItemModel(itemName=", this.f39196a, ", itemImage=", this.b, ", count="));
    }
}
