package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class u1e0 {
    public static final t1e0 Companion = new t1e0();
    public static final a8z[] g = {maz.a(wez.f39042a, new etd0(21)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34897a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ u1e0(int i, String str, String str2, String str3, String str4, String str5, List list) {
        if ((i & 1) == 0) {
            this.f34897a = null;
        } else {
            this.f34897a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1e0)) {
            return false;
        }
        u1e0 u1e0Var = (u1e0) obj;
        return Intrinsics.d(this.f34897a, u1e0Var.f34897a) && Intrinsics.d(this.b, u1e0Var.b) && Intrinsics.d(this.c, u1e0Var.c) && Intrinsics.d(this.d, u1e0Var.d) && Intrinsics.d(this.e, u1e0Var.e) && Intrinsics.d(this.f, u1e0Var.f);
    }

    public final int hashCode() {
        List list = this.f34897a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("RankingsBreakdownResponse(groupsRankingResponses=", ", points=", this.b, this.f34897a, ", prizeMoney=");
        f140.v(sbO, this.c, ", ranking=", this.d, ", titles=");
        return ua80.m(sbO, this.e, ", winlose=", this.f, Separators.RPAREN);
    }
}
