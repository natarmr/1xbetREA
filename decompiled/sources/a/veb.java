package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class veb {
    public static final qeb Companion = new qeb();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37276a;
    public final p6i0 b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final Long h;
    public final List i;
    public final List j;

    static {
        byte b = p6i0.f;
        wez wezVar = wez.f39042a;
        k = new a8z[]{null, null, null, null, null, null, null, null, maz.a(wezVar, new e0b((byte) 11)), maz.a(wezVar, new e0b((byte) 13))};
    }

    public /* synthetic */ veb(int i, String str, p6i0 p6i0Var, Long l, String str2, String str3, String str4, Long l2, Long l3, List list, List list2) {
        if ((i & 1) == 0) {
            this.f37276a = null;
        } else {
            this.f37276a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = p6i0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l3;
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
        if (!(obj instanceof veb)) {
            return false;
        }
        veb vebVar = (veb) obj;
        return Intrinsics.d(this.f37276a, vebVar.f37276a) && Intrinsics.d(this.b, vebVar.b) && Intrinsics.d(this.c, vebVar.c) && Intrinsics.d(this.d, vebVar.d) && Intrinsics.d(this.e, vebVar.e) && Intrinsics.d(this.f, vebVar.f) && Intrinsics.d(this.g, vebVar.g) && Intrinsics.d(this.h, vebVar.h) && Intrinsics.d(this.i, vebVar.i) && Intrinsics.d(this.j, vebVar.j);
    }

    public final int hashCode() {
        String str = this.f37276a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        p6i0 p6i0Var = this.b;
        int iHashCode2 = (iHashCode + (p6i0Var == null ? 0 : p6i0Var.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list = this.i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.j;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampResponse(id=");
        sb.append(this.f37276a);
        sb.append(", selectors=");
        sb.append(this.b);
        sb.append(", totalRowCount=");
        rz4.v(this.c, ", title=", this.d, ", season=", sb);
        f140.v(sb, this.e, ", discipline=", this.f, ", competitorType=");
        cs0.A(sb, this.g, ", lastGameDate=", this.h, ", tableTitles=");
        return kng0.n(", ratingRows=", Separators.RPAREN, sb, this.i, this.j);
    }
}
