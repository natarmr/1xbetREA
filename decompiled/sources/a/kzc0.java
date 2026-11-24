package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kzc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19148a;
    public final String b;
    public final String c;
    public final n0x d;
    public final jzc0 e;

    public kzc0(int i, String str, String str2, n0x n0xVar, jzc0 jzc0Var) {
        str.getClass();
        this.f19148a = i;
        this.b = str;
        this.c = str2;
        this.d = n0xVar;
        this.e = jzc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzc0)) {
            return false;
        }
        kzc0 kzc0Var = (kzc0) obj;
        return this.f19148a == kzc0Var.f19148a && Intrinsics.d(this.b, kzc0Var.b) && Intrinsics.d(this.c, kzc0Var.c) && this.d.equals(kzc0Var.d) && Intrinsics.d(this.e, kzc0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(Integer.hashCode(this.f19148a) * 31, 31, this.b);
        String str = this.c;
        int iF = f140.f(this.d, (iB + (str == null ? 0 : str.hashCode())) * 31, 31);
        jzc0 jzc0Var = this.e;
        return iF + (jzc0Var != null ? jzc0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f19148a, "PromotionCardUiModel(promotionId=", ", title=", this.b, ", subtitle=");
        sbR.append(this.c);
        sbR.append(", imageLink=");
        sbR.append(this.d);
        sbR.append(", tag=");
        sbR.append(this.e);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
