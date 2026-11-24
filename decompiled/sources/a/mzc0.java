package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mzc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22648a;
    public final String b;
    public final String c;
    public final n0x d;
    public final String e;

    public mzc0(int i, String str, String str2, n0x n0xVar, String str3) {
        str.getClass();
        str2.getClass();
        this.f22648a = i;
        this.b = str;
        this.c = str2;
        this.d = n0xVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzc0)) {
            return false;
        }
        mzc0 mzc0Var = (mzc0) obj;
        return this.f22648a == mzc0Var.f22648a && Intrinsics.d(this.b, mzc0Var.b) && Intrinsics.d(this.c, mzc0Var.c) && this.d.equals(mzc0Var.d) && this.e.equals(mzc0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f140.f(this.d, ua80.b(ua80.b(Integer.hashCode(this.f22648a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f22648a, "PromotionItemUiModel(promotionId=", ", promotionTitle=", this.b, ", promotionSubtitle=");
        sbR.append(this.c);
        sbR.append(", promotionImage=");
        sbR.append(this.d);
        sbR.append(", tagText=");
        return axq.n(sbR, this.e, Separators.RPAREN);
    }
}
