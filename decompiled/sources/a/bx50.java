package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class bx50 {
    public static final ax50 Companion = new ax50();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3361a;
    public final Integer b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new th50((byte) 9)), null, maz.a(wezVar, new th50((byte) 10))};
    }

    public /* synthetic */ bx50(int i, Integer num, List list, List list2) {
        if ((i & 1) == 0) {
            this.f3361a = null;
        } else {
            this.f3361a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx50)) {
            return false;
        }
        bx50 bx50Var = (bx50) obj;
        return Intrinsics.d(this.f3361a, bx50Var.f3361a) && Intrinsics.d(this.b, bx50Var.b) && Intrinsics.d(this.c, bx50Var.c);
    }

    public final int hashCode() {
        List list = this.f3361a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(cs0.r(this.b, "NewsValueResponse(teams=", ", sportId=", ", response=", this.f3361a), this.c, Separators.RPAREN);
    }
}
