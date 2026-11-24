package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class yo5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42967a;
    public final String b;
    public final ArrayList c;

    public yo5(int i, String str, ArrayList arrayList) {
        this.f42967a = i;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo5)) {
            return false;
        }
        yo5 yo5Var = (yo5) obj;
        return this.f42967a == yo5Var.f42967a && this.b.equals(yo5Var.b) && this.c.equals(yo5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f42967a) * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.n(vqd.r(this.f42967a, "BannerCategoryUiModel(categoryId=", ", categoryTitle=", this.b, ", cards="), this.c, Separators.RPAREN);
    }
}
