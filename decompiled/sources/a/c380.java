package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class c380 {
    public static final r280 Companion = new r280();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new i280(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3661a;
    public final Integer b;
    public final List c;

    public /* synthetic */ c380(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f3661a = null;
        } else {
            this.f3661a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
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
        if (!(obj instanceof c380)) {
            return false;
        }
        c380 c380Var = (c380) obj;
        return Intrinsics.d(this.f3661a, c380Var.f3661a) && Intrinsics.d(this.b, c380Var.b) && Intrinsics.d(this.c, c380Var.c);
    }

    public final int hashCode() {
        String str = this.f3661a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(axq.p(this.b, "OpponentResponse(fullName=", this.f3661a, ", countryId=", ", opps="), this.c, Separators.RPAREN);
    }
}
