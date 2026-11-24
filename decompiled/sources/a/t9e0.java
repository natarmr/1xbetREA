package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class t9e0 {
    public static final s9e0 Companion = new s9e0();
    public static final a8z[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o6i0 f33558a;
    public final Integer b;
    public final String c;
    public final Integer d;
    public final List e;
    public final List f;

    static {
        byte b = o6i0.j;
        wez wezVar = wez.f39042a;
        g = new a8z[]{null, null, null, null, maz.a(wezVar, new o6e0((byte) 4)), maz.a(wezVar, new o6e0((byte) 5))};
    }

    public /* synthetic */ t9e0(int i, o6i0 o6i0Var, Integer num, String str, Integer num2, List list, List list2) {
        if ((i & 1) == 0) {
            this.f33558a = null;
        } else {
            this.f33558a = o6i0Var;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9e0)) {
            return false;
        }
        t9e0 t9e0Var = (t9e0) obj;
        return Intrinsics.d(this.f33558a, t9e0Var.f33558a) && Intrinsics.d(this.b, t9e0Var.b) && Intrinsics.d(this.c, t9e0Var.c) && Intrinsics.d(this.d, t9e0Var.d) && Intrinsics.d(this.e, t9e0Var.e) && Intrinsics.d(this.f, t9e0Var.f);
    }

    public final int hashCode() {
        o6i0 o6i0Var = this.f33558a;
        int iHashCode = (o6i0Var == null ? 0 : o6i0Var.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingValueResponse(selectors=");
        sb.append(this.f33558a);
        sb.append(", totalRowCount=");
        sb.append(this.b);
        sb.append(", title=");
        axq.x(this.d, this.c, ", competitorType=", ", tableTitles=", sb);
        return kng0.n(", ratingRows=", Separators.RPAREN, sb, this.e, this.f);
    }
}
