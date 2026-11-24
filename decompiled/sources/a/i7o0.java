package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i7o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14302a;
    public final Integer b;
    public final String c;
    public final List d;
    public final List e;
    public final boolean f;
    public final sff0 g;
    public final boolean h;

    public i7o0(boolean z, Integer num, String str, List list, List list2, boolean z2, sff0 sff0Var, boolean z3) {
        list2.getClass();
        this.f14302a = z;
        this.b = num;
        this.c = str;
        this.d = list;
        this.e = list2;
        this.f = z2;
        this.g = sff0Var;
        this.h = z3;
    }

    public static i7o0 a(i7o0 i7o0Var, boolean z, Integer num, List list, List list2, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = i7o0Var.f14302a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            num = i7o0Var.b;
        }
        Integer num2 = num;
        String str = i7o0Var.c;
        if ((i & 8) != 0) {
            list = i7o0Var.d;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = i7o0Var.e;
        }
        List list4 = list2;
        if ((i & 32) != 0) {
            z2 = i7o0Var.f;
        }
        sff0 sff0Var = i7o0Var.g;
        boolean z4 = i7o0Var.h;
        i7o0Var.getClass();
        list4.getClass();
        return new i7o0(z3, num2, str, list3, list4, z2, sff0Var, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7o0)) {
            return false;
        }
        i7o0 i7o0Var = (i7o0) obj;
        return this.f14302a == i7o0Var.f14302a && Intrinsics.d(this.b, i7o0Var.b) && this.c.equals(i7o0Var.c) && Intrinsics.d(this.d, i7o0Var.d) && Intrinsics.d(this.e, i7o0Var.e) && this.f == i7o0Var.f && this.g.equals(i7o0Var.g) && this.h == i7o0Var.h;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f14302a) * 31;
        Integer num = this.b;
        int iB = ua80.b((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        List list = this.d;
        return Boolean.hashCode(this.h) + cs0.c(this.g, brm0.e(dw9.a((iB + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyntheticResultsStateModel(connected=");
        sb.append(this.f14302a);
        sb.append(", selectedDateIndex=");
        sb.append(this.b);
        sb.append(", currentLanguage=");
        cs0.y(this.c, ", champResults=", ", availableDates=", sb, this.d);
        rz4.z(sb, ", isLoading=", this.e, ", remoteConfigModel=", this.f);
        sb.append(this.g);
        sb.append(", supportRtl=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
