package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rd8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30278a;
    public final boolean b;
    public final int c;
    public final String d;
    public final String e;

    public rd8(int i, int i2, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f30278a = i;
        this.b = z;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd8)) {
            return false;
        }
        rd8 rd8Var = (rd8) obj;
        return this.f30278a == rd8Var.f30278a && this.b == rd8Var.b && this.c == rd8Var.c && Intrinsics.d(this.d, rd8Var.d) && Intrinsics.d(this.e, rd8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(twn.a(this.c, brm0.e(Integer.hashCode(this.f30278a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f30278a, "BonusCellUiModel(id=", ", selected=", ", imageResourceId=", this.b);
        kng0.w(this.c, ", title=", this.d, ", description=", sbL);
        return axq.n(sbL, this.e, Separators.RPAREN);
    }
}
