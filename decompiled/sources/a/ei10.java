package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ei10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7836a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final double f;
    public final li10 g;
    public final String h;
    public final List i;
    public final List j;
    public final String k;

    public ei10(int i, String str, String str2, String str3, int i2, double d, li10 li10Var, String str4, lc00 lc00Var, List list, String str5) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        lc00Var.getClass();
        list.getClass();
        str5.getClass();
        this.f7836a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = d;
        this.g = li10Var;
        this.h = str4;
        this.i = lc00Var;
        this.j = list;
        this.k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei10)) {
            return false;
        }
        ei10 ei10Var = (ei10) obj;
        return this.f7836a == ei10Var.f7836a && this.b.equals(ei10Var.b) && Intrinsics.d(this.c, ei10Var.c) && Intrinsics.d(this.d, ei10Var.d) && this.e == ei10Var.e && Double.compare(this.f, ei10Var.f) == 0 && this.g.equals(ei10Var.g) && Intrinsics.d(this.h, ei10Var.h) && Intrinsics.d(this.i, ei10Var.i) && Intrinsics.d(this.j, ei10Var.j) && Intrinsics.d(this.k, ei10Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + dw9.a(dw9.a(ua80.b((this.g.hashCode() + brm0.d(this.f, twn.a(this.e, ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f7836a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f7836a, "LoyaltyProgramLevelInfoModel(number=", ", iconUrl=", this.b, ", name=");
        f140.v(sbR, this.c, ", paymentFrequency=", this.d, ", pointPerBet=");
        sbR.append(this.e);
        sbR.append(", betValue=");
        sbR.append(this.f);
        sbR.append(", loyaltyProgramLevelProgressTypeModel=");
        sbR.append(this.g);
        sbR.append(", levelPercent=");
        sbR.append(this.h);
        hne.v(", privilegeItems=", ", cashbackStepItems=", sbR, this.i, this.j);
        return rw2.o(sbR, ", bonusPoints=", this.k, Separators.RPAREN);
    }
}
