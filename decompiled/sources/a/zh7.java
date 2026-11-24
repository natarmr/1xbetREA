package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zh7 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f44378a;
    public final String b;
    public final double c;
    public final String d;
    public final double e;
    public final q4f f;
    public final String g;

    public zh7(double d, String str, double d2, String str2, double d3, q4f q4fVar, String str3) {
        hg7 hg7Var = hg7.f13004a;
        str.getClass();
        this.f44378a = d;
        this.b = str;
        this.c = d2;
        this.d = str2;
        this.e = d3;
        this.f = q4fVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh7)) {
            return false;
        }
        zh7 zh7Var = (zh7) obj;
        if (Double.compare(this.f44378a, zh7Var.f44378a) != 0) {
            return false;
        }
        hg7 hg7Var = hg7.f13004a;
        return Intrinsics.d(this.b, zh7Var.b) && Double.compare(this.c, zh7Var.c) == 0 && this.d.equals(zh7Var.d) && Double.compare(this.e, zh7Var.e) == 0 && this.f == zh7Var.f && Intrinsics.d(this.g, zh7Var.g);
    }

    public final int hashCode() {
        int iB = vqd.b(this.f, brm0.d(this.e, ua80.b(brm0.d(this.c, ua80.b((hg7.f13004a.hashCode() + (Double.hashCode(this.f44378a) * 31)) * 31, 31, this.b), 31), 31, this.d), 31), 31);
        String str = this.g;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        hg7 hg7Var = hg7.f13004a;
        StringBuilder sb = new StringBuilder("BetResultModel(balance=");
        sb.append(this.f44378a);
        sb.append(", betMode=");
        sb.append(hg7Var);
        hne.B(sb, ", betId=", this.b, ", coef=");
        hne.w(sb, this.c, ", coefView=", this.d);
        ohs0.A(sb, this.e, ", summ=", ", couponTypeModel=");
        sb.append(this.f);
        sb.append(", optiCoefView=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
