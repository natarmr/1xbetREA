package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class sht implements muw {
    public static final rht Companion = new rht();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f32230a;
    public final Integer b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final Integer g;
    public final Double h;
    public final Integer i;
    public final Integer j;

    static {
        wez wezVar = wez.f39042a;
        k = new a8z[]{null, null, maz.a(wezVar, new tet((byte) 13)), maz.a(wezVar, new tet((byte) 14)), maz.a(wezVar, new tet((byte) 15)), null, null, null, null, null};
    }

    public /* synthetic */ sht(int i, Double d, Integer num, List list, List list2, List list3, String str, Integer num2, Double d2, Integer num3, Integer num4) {
        if ((i & 1) == 0) {
            this.f32230a = null;
        } else {
            this.f32230a = d;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sht)) {
            return false;
        }
        sht shtVar = (sht) obj;
        return Intrinsics.d(this.f32230a, shtVar.f32230a) && Intrinsics.d(this.b, shtVar.b) && Intrinsics.d(this.c, shtVar.c) && Intrinsics.d(this.d, shtVar.d) && Intrinsics.d(this.e, shtVar.e) && Intrinsics.d(this.f, shtVar.f) && Intrinsics.d(this.g, shtVar.g) && Intrinsics.d(this.h, shtVar.h) && Intrinsics.d(this.i, shtVar.i) && Intrinsics.d(this.j, shtVar.j);
    }

    public final int hashCode() {
        Double d = this.f32230a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.e;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d2 = this.h;
        int iHashCode8 = (iHashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.j;
        return iHashCode9 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenerateCouponRequestWithOutUserId(betSize=");
        sb.append(this.f32230a);
        sb.append(", cfView=");
        sb.append(this.b);
        sb.append(", couponTypes=");
        b1j.y(", eventTypes=", ", sports=", sb, this.c, this.d);
        h97.y(", lng=", this.f, ", partner=", sb, this.e);
        hne.z(sb, this.g, ", payout=", this.h, ", timeFilter=");
        return ua80.l(sb, this.i, ", countryId=", this.j, Separators.RPAREN);
    }

    public sht(Double d, Integer num, List list, ArrayList arrayList, ArrayList arrayList2, String str, Integer num2, Double d2, Integer num3, Integer num4) {
        this.f32230a = d;
        this.b = num;
        this.c = list;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = str;
        this.g = num2;
        this.h = d2;
        this.i = num3;
        this.j = num4;
    }
}
