package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class r85 {
    public static final q85 Companion = new q85();
    public static final a8z[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f30009a;
    public final Long b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Double j;
    public final List k;
    public final List l;

    static {
        wez wezVar = wez.f39042a;
        m = new a8z[]{null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new a04((byte) 29)), maz.a(wezVar, new o85((byte) 0))};
    }

    public /* synthetic */ r85(int i, Long l, Long l2, String str, String str2, Long l3, String str3, Integer num, Integer num2, Integer num3, Double d, List list, List list2) {
        if ((i & 1) == 0) {
            this.f30009a = null;
        } else {
            this.f30009a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = d;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r85)) {
            return false;
        }
        r85 r85Var = (r85) obj;
        return Intrinsics.d(this.f30009a, r85Var.f30009a) && Intrinsics.d(this.b, r85Var.b) && Intrinsics.d(this.c, r85Var.c) && Intrinsics.d(this.d, r85Var.d) && Intrinsics.d(this.e, r85Var.e) && Intrinsics.d(this.f, r85Var.f) && Intrinsics.d(this.g, r85Var.g) && Intrinsics.d(this.h, r85Var.h) && Intrinsics.d(this.i, r85Var.i) && Intrinsics.d(this.j, r85Var.j) && Intrinsics.d(this.k, r85Var.k) && Intrinsics.d(this.l, r85Var.l);
    }

    public final int hashCode() {
        Long l = this.f30009a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d = this.j;
        int iHashCode10 = (iHashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        List list = this.k;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.l;
        return iHashCode11 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f30009a, this.b, "AvailableTaskResponse(secondsToStart=", ", secondsToEnd=", ", dtStart=");
        f140.v(sbO, this.c, ", dtEnd=", this.d, ", id=");
        rz4.v(this.e, ", name=", this.f, ", status=", sbO);
        rz4.y(sbO, this.g, ", kind=", this.h, ", type=");
        hne.z(sbO, this.i, ", percentCompleted=", this.j, ", conditions=");
        return kng0.n(", prizes=", Separators.RPAREN, sbO, this.k, this.l);
    }
}
