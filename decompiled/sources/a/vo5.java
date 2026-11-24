package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class vo5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37748a;
    public final String b;
    public final ArrayList c;

    public vo5(int i, String str, ArrayList arrayList) {
        this.f37748a = i;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo5)) {
            return false;
        }
        vo5 vo5Var = (vo5) obj;
        return this.f37748a == vo5Var.f37748a && this.b.equals(vo5Var.b) && this.c.equals(vo5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f37748a) * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.n(vqd.r(this.f37748a, "BannerCategoryUiModel(categoryId=", ", categoryTitle=", this.b, ", cards="), this.c, Separators.RPAREN);
    }
}
