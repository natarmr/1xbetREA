package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class i31 {
    public static final d31 Companion = new d31();
    public static final a8z[] d = {maz.a(wez.f39042a, new mg0(27)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14074a;
    public final Integer b;
    public final String c;

    public /* synthetic */ i31(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f14074a = null;
        } else {
            this.f14074a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i31)) {
            return false;
        }
        i31 i31Var = (i31) obj;
        return Intrinsics.d(this.f14074a, i31Var.f14074a) && Intrinsics.d(this.b, i31Var.b) && Intrinsics.d(this.c, i31Var.c);
    }

    public final int hashCode() {
        List list = this.f14074a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.r(this.b, "AggregatorHistoryResponse(betInfos=", ", errorId=", ", message=", this.f14074a), this.c, Separators.RPAREN);
    }
}
