package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class cx4 {
    public static final bx4 Companion = new bx4();
    public static final a8z[] h = {null, null, null, maz.a(wez.f39042a, new a04(18)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5107a;
    public final int b;
    public final long c;
    public final List d;
    public final long e;
    public final long f;
    public final int g;

    public /* synthetic */ cx4(int i, String str, int i2, long j, List list, long j2, long j3, int i3) {
        if (127 != (i & 127)) {
            m2x.I(i, 127, ax4.f1606a.getDescriptor());
            throw null;
        }
        this.f5107a = str;
        this.b = i2;
        this.c = j;
        this.d = list;
        this.e = j2;
        this.f = j3;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx4)) {
            return false;
        }
        cx4 cx4Var = (cx4) obj;
        return Intrinsics.d(this.f5107a, cx4Var.f5107a) && this.b == cx4Var.b && this.c == cx4Var.c && Intrinsics.d(this.d, cx4Var.d) && this.e == cx4Var.e && this.f == cx4Var.f && this.g == cx4Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + rw2.b(rw2.b(dw9.a(rw2.b(twn.a(this.b, this.f5107a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "AutoBetInfoByDateRequest(language=", this.f5107a, ", cfView=", ", userBonusId=");
        hne.x(sbP, this.c, ", statusList=", this.d);
        kng0.A(sbP, ", dateFrom=", this.e, ", dateTo=");
        ua80.v(sbP, this.f, ", sortVers=", this.g);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }

    public cx4(String str, int i, long j, ArrayList arrayList, long j2, long j3) {
        this.f5107a = str;
        this.b = i;
        this.c = j;
        this.d = arrayList;
        this.e = j2;
        this.f = j3;
        this.g = 2;
    }
}
