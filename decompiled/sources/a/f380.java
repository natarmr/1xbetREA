package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class f380 {
    public static final u280 Companion = new u280();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new i280(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8848a;
    public final String b;
    public final List c;

    public /* synthetic */ f380(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f8848a = null;
        } else {
            this.f8848a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
        if (!(obj instanceof f380)) {
            return false;
        }
        f380 f380Var = (f380) obj;
        return Intrinsics.d(this.f8848a, f380Var.f8848a) && Intrinsics.d(this.b, f380Var.b) && Intrinsics.d(this.c, f380Var.c);
    }

    public final int hashCode() {
        Integer num = this.f8848a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(h97.n(this.f8848a, "OpponentResponse(countryId=", ", fullName=", this.b, ", opps="), this.c, Separators.RPAREN);
    }
}
