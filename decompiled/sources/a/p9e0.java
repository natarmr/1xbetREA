package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class p9e0 {
    public static final n9e0 Companion = new n9e0();
    public static final a8z[] n = {null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new o6e0(2)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f26602a;
    public final qie b;
    public final jee c;
    public final Boolean d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Boolean h;
    public final List i;
    public final String j;
    public final String k;
    public final Integer l;
    public final Integer m;

    public /* synthetic */ p9e0(int i, Integer num, qie qieVar, jee jeeVar, Boolean bool, Integer num2, Integer num3, Integer num4, Boolean bool2, List list, String str, String str2, Integer num5, Integer num6) {
        if ((i & 1) == 0) {
            this.f26602a = null;
        } else {
            this.f26602a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = qieVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = jeeVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num5;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9e0)) {
            return false;
        }
        p9e0 p9e0Var = (p9e0) obj;
        return Intrinsics.d(this.f26602a, p9e0Var.f26602a) && this.b == p9e0Var.b && this.c == p9e0Var.c && Intrinsics.d(this.d, p9e0Var.d) && Intrinsics.d(this.e, p9e0Var.e) && Intrinsics.d(this.f, p9e0Var.f) && Intrinsics.d(this.g, p9e0Var.g) && Intrinsics.d(this.h, p9e0Var.h) && Intrinsics.d(this.i, p9e0Var.i) && Intrinsics.d(this.j, p9e0Var.j) && Intrinsics.d(this.k, p9e0Var.k) && Intrinsics.d(this.l, p9e0Var.l) && Intrinsics.d(this.m, p9e0Var.m);
    }

    public final int hashCode() {
        Integer num = this.f26602a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        qie qieVar = this.b;
        int iHashCode2 = (iHashCode + (qieVar == null ? 0 : qieVar.hashCode())) * 31;
        jee jeeVar = this.c;
        int iHashCode3 = (iHashCode2 + (jeeVar == null ? 0 : jeeVar.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.j;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.l;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.m;
        return iHashCode12 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingValueColResponse(id=");
        sb.append(this.f26602a);
        sb.append(", contentType=");
        sb.append(this.b);
        sb.append(", contentIconType=");
        sb.append(this.c);
        sb.append(", isExpand=");
        sb.append(this.d);
        sb.append(", expandId=");
        rz4.y(sb, this.e, ", expandRowCount=", this.f, ", group=");
        brm0.z(this.h, this.g, ", isOffset=", ", value=", sb);
        h97.y(", competitorId=", this.j, ", pairCompetitorId=", sb, this.i);
        axq.x(this.l, this.k, ", rowSpan=", ", colSpan=", sb);
        return dw9.q(sb, this.m, Separators.RPAREN);
    }
}
