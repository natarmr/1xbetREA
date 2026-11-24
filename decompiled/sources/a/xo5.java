package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class xo5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41199a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public xo5(int i, String str, String str2, ArrayList arrayList) {
        this.f41199a = i;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo5)) {
            return false;
        }
        xo5 xo5Var = (xo5) obj;
        return this.f41199a == xo5Var.f41199a && this.b.equals(xo5Var.b) && this.c.equals(xo5Var.c) && this.d.equals(xo5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(Integer.hashCode(this.f41199a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f41199a, "BannerCategoryUiModel(categoryId=", ", categoryTitle=", this.b, ", categoryButton=");
        sbR.append(this.c);
        sbR.append(", cards=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
