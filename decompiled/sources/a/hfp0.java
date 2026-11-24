package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hfp0 {
    public static final gfp0 Companion = new gfp0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new ccp0(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12982a;
    public final Long b;
    public final List c;

    public /* synthetic */ hfp0(int i, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f12982a = null;
        } else {
            this.f12982a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfp0)) {
            return false;
        }
        hfp0 hfp0Var = (hfp0) obj;
        return Intrinsics.d(this.f12982a, hfp0Var.f12982a) && Intrinsics.d(this.b, hfp0Var.b) && Intrinsics.d(this.c, hfp0Var.c);
    }

    public final int hashCode() {
        String str = this.f12982a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(kng0.s(this.b, "TeamMenuDataResponse(id=", this.f12982a, ", stadiumId=", ", menu="), this.c, Separators.RPAREN);
    }
}
