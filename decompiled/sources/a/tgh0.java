package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class tgh0 {
    public static final sgh0 Companion = new sgh0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new igh0(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f33913a;
    public final String b;
    public final List c;

    public /* synthetic */ tgh0(int i, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f33913a = null;
        } else {
            this.f33913a = l;
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
        if (!(obj instanceof tgh0)) {
            return false;
        }
        tgh0 tgh0Var = (tgh0) obj;
        return Intrinsics.d(this.f33913a, tgh0Var.f33913a) && Intrinsics.d(this.b, tgh0Var.b) && Intrinsics.d(this.c, tgh0Var.c);
    }

    public final int hashCode() {
        Long l = this.f33913a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(cs0.s(this.f33913a, "SportSearch(id=", ", name=", this.b, ", champs="), this.c, Separators.RPAREN);
    }
}
