package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qw40 {
    public static final pw40 Companion = new pw40();
    public static final a8z[] j = {null, null, null, null, null, null, maz.a(wez.f39042a, new ec40(19)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29418a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final int i;

    public /* synthetic */ qw40(int i, long j2, long j3, String str, String str2, String str3, String str4, List list, String str5, int i2) {
        if (255 != (i & 255)) {
            m2x.I(i, 255, ow40.f25952a.getDescriptor());
            throw null;
        }
        this.f29418a = j2;
        this.b = j3;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = str5;
        if ((i & 256) == 0) {
            this.i = 2;
        } else {
            this.i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw40)) {
            return false;
        }
        qw40 qw40Var = (qw40) obj;
        return this.f29418a == qw40Var.f29418a && this.b == qw40Var.b && Intrinsics.d(this.c, qw40Var.c) && Intrinsics.d(this.d, qw40Var.d) && Intrinsics.d(this.e, qw40Var.e) && Intrinsics.d(this.f, qw40Var.f) && Intrinsics.d(this.g, qw40Var.g) && Intrinsics.d(this.h, qw40Var.h) && this.i == qw40Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ua80.b(dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f29418a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f29418a, "MultiSingleBetDataRequest(userId=", ", userBonusId=");
        kng0.z(sbQ, this.b, ", appGUID=", this.c);
        f140.v(sbQ, ", date=", this.d, ", sign=", this.e);
        ua80.t(", lng=", this.f, ", coupons=", sbQ, this.g);
        axq.s(this.i, ", couponCode=", this.h, ", oneClickBet=", sbQ);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public qw40(long j2, long j3, String str, String str2, String str3, String str4, ArrayList arrayList, String str5) {
        str2.getClass();
        str5.getClass();
        this.f29418a = j2;
        this.b = j3;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = arrayList;
        this.h = str5;
        this.i = 2;
    }
}
