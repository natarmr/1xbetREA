package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class c7w {
    public static final b7w Companion = new b7w();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3883a;
    public final String b;
    public final Long c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Double h;
    public final List i;
    public final List j;

    static {
        wez wezVar = wez.f39042a;
        k = new a8z[]{null, null, null, null, null, null, null, null, maz.a(wezVar, new ldv((byte) 25)), maz.a(wezVar, new ldv((byte) 26))};
    }

    public /* synthetic */ c7w(int i, String str, String str2, Long l, String str3, Integer num, Integer num2, Integer num3, Double d, List list, List list2) {
        if ((i & 1) == 0) {
            this.f3883a = null;
        } else {
            this.f3883a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7w)) {
            return false;
        }
        c7w c7wVar = (c7w) obj;
        return Intrinsics.d(this.f3883a, c7wVar.f3883a) && Intrinsics.d(this.b, c7wVar.b) && Intrinsics.d(this.c, c7wVar.c) && Intrinsics.d(this.d, c7wVar.d) && Intrinsics.d(this.e, c7wVar.e) && Intrinsics.d(this.f, c7wVar.f) && Intrinsics.d(this.g, c7wVar.g) && Intrinsics.d(this.h, c7wVar.h) && Intrinsics.d(this.i, c7wVar.i) && Intrinsics.d(this.j, c7wVar.j);
    }

    public final int hashCode() {
        String str = this.f3883a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d = this.h;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        List list = this.i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.j;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HistoryTaskResponse(dtPlayerStart=", this.f3883a, ", dtPlayerCompleted=", this.b, ", id=");
        rz4.v(this.c, ", name=", this.d, ", status=", sbN);
        rz4.y(sbN, this.e, ", kind=", this.f, ", type=");
        hne.z(sbN, this.g, ", percentCompleted=", this.h, ", conditions=");
        return kng0.n(", prizes=", Separators.RPAREN, sbN, this.i, this.j);
    }
}
