package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class wo5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39476a;
    public final mxl b;
    public final ArrayList c;

    public wo5(int i, mxl mxlVar, ArrayList arrayList) {
        this.f39476a = i;
        this.b = mxlVar;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo5)) {
            return false;
        }
        wo5 wo5Var = (wo5) obj;
        return this.f39476a == wo5Var.f39476a && this.b.equals(wo5Var.b) && this.c.equals(wo5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f39476a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerCategoryUiModel(categoryId=");
        sb.append(this.f39476a);
        sb.append(", chipModel=");
        sb.append(this.b);
        sb.append(", cards=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
