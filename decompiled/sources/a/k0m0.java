package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class k0m0 {
    public static final j0m0 Companion = new j0m0();
    public static final a8z[] j = {null, null, null, null, maz.a(wez.f39042a, new fzk0(24)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17476a;
    public final Integer b;
    public final String c;
    public final String d;
    public final List e;
    public final k0m0 f;
    public final k0m0 g;
    public final String h;
    public final String i;

    public /* synthetic */ k0m0(int i, String str, Integer num, String str2, String str3, List list, k0m0 k0m0Var, k0m0 k0m0Var2, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f17476a = null;
        } else {
            this.f17476a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = k0m0Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = k0m0Var2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
    }

    public static k0m0 a(k0m0 k0m0Var, int i) {
        return new k0m0(k0m0Var.f17476a, k0m0Var.b, k0m0Var.c, k0m0Var.d, k0m0Var.e, (i & 32) != 0 ? k0m0Var.f : null, (i & 64) != 0 ? k0m0Var.g : null, k0m0Var.h, k0m0Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0m0)) {
            return false;
        }
        k0m0 k0m0Var = (k0m0) obj;
        return Intrinsics.d(this.f17476a, k0m0Var.f17476a) && Intrinsics.d(this.b, k0m0Var.b) && Intrinsics.d(this.c, k0m0Var.c) && Intrinsics.d(this.d, k0m0Var.d) && Intrinsics.d(this.e, k0m0Var.e) && Intrinsics.d(this.f, k0m0Var.f) && Intrinsics.d(this.g, k0m0Var.g) && Intrinsics.d(this.h, k0m0Var.h) && Intrinsics.d(this.i, k0m0Var.i);
    }

    public final int hashCode() {
        String str = this.f17476a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        k0m0 k0m0Var = this.f;
        int iHashCode6 = (iHashCode5 + (k0m0Var == null ? 0 : k0m0Var.hashCode())) * 31;
        k0m0 k0m0Var2 = this.g;
        int iHashCode7 = (iHashCode6 + (k0m0Var2 == null ? 0 : k0m0Var2.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "StageNetCellItemResponse(title=", this.f17476a, ", levelId=", ", firstTeamId=");
        f140.v(sbP, this.c, ", secondTeamId=", this.d, ", games=");
        sbP.append(this.e);
        sbP.append(", cell1=");
        sbP.append(this.f);
        sbP.append(", cell2=");
        sbP.append(this.g);
        sbP.append(", seed1=");
        sbP.append(this.h);
        sbP.append(", seed2=");
        return axq.n(sbP, this.i, Separators.RPAREN);
    }

    public k0m0(String str, Integer num, String str2, String str3, List list, k0m0 k0m0Var, k0m0 k0m0Var2, String str4, String str5) {
        this.f17476a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = k0m0Var;
        this.g = k0m0Var2;
        this.h = str4;
        this.i = str5;
    }
}
