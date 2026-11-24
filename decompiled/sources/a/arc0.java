package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class arc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1339a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    public final src0 h;

    public arc0(String str, int i, int i2, int i3, String str2, int i4, int i5, src0 src0Var) {
        str.getClass();
        this.f1339a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = i4;
        this.g = i5;
        this.h = src0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arc0)) {
            return false;
        }
        arc0 arc0Var = (arc0) obj;
        return Intrinsics.d(this.f1339a, arc0Var.f1339a) && this.b == arc0Var.b && this.c == arc0Var.c && this.d == arc0Var.d && this.e.equals(arc0Var.e) && this.f == arc0Var.f && this.g == arc0Var.g && this.h == arc0Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + twn.a(this.g, twn.a(this.f, ua80.b(twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f1339a.hashCode() * 31, 31), 31), 31), 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "PromoShopDetailStateModel(description=", this.f1339a, ", promoPrice=", ", gamesCount=");
        axq.r(this.c, this.d, ", promoBalance=", ", categoryName=", sbP);
        twn.w(this.f, this.e, ", minBet=", ", numFS=", sbP);
        sbP.append(this.g);
        sbP.append(", promoCategory=");
        sbP.append(this.h);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
