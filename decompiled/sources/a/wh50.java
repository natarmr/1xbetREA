package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wh50 {
    public static final vh50 Companion = new vh50();
    public static final a8z[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39150a;
    public final ig50 b;
    public final List c;
    public final mg50 d;
    public final ei50 e;
    public final Long f;
    public final String g;
    public final Boolean h;
    public final String i;
    public final qi50 j;
    public final Map k;

    static {
        wez wezVar = wez.f39042a;
        l = new a8z[]{null, null, maz.a(wezVar, new th50((byte) 0)), null, null, null, null, null, null, null, maz.a(wezVar, new th50((byte) 1))};
    }

    public /* synthetic */ wh50(int i, String str, ig50 ig50Var, List list, mg50 mg50Var, ei50 ei50Var, Long l2, String str2, Boolean bool, String str3, qi50 qi50Var, Map map) {
        if ((i & 1) == 0) {
            this.f39150a = null;
        } else {
            this.f39150a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ig50Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = mg50Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = ei50Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = qi50Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh50)) {
            return false;
        }
        wh50 wh50Var = (wh50) obj;
        return Intrinsics.d(this.f39150a, wh50Var.f39150a) && Intrinsics.d(this.b, wh50Var.b) && Intrinsics.d(this.c, wh50Var.c) && Intrinsics.d(this.d, wh50Var.d) && Intrinsics.d(this.e, wh50Var.e) && Intrinsics.d(this.f, wh50Var.f) && Intrinsics.d(this.g, wh50Var.g) && Intrinsics.d(this.h, wh50Var.h) && Intrinsics.d(this.i, wh50Var.i) && Intrinsics.d(this.j, wh50Var.j) && Intrinsics.d(this.k, wh50Var.k);
    }

    public final int hashCode() {
        String str = this.f39150a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ig50 ig50Var = this.b;
        int iHashCode2 = (iHashCode + (ig50Var == null ? 0 : ig50Var.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        mg50 mg50Var = this.d;
        int iHashCode4 = (iHashCode3 + (mg50Var == null ? 0 : mg50Var.hashCode())) * 31;
        ei50 ei50Var = this.e;
        int iHashCode5 = (iHashCode4 + (ei50Var == null ? 0 : ei50Var.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        qi50 qi50Var = this.j;
        int iHashCode10 = (iHashCode9 + (qi50Var == null ? 0 : qi50Var.hashCode())) * 31;
        Map map = this.k;
        return iHashCode10 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearestGameDetailsScoresResponse(fullScore=");
        sb.append(this.f39150a);
        sb.append(", extendedScore=");
        sb.append(this.b);
        sb.append(", periodScores=");
        sb.append(this.c);
        sb.append(", fullScoreDetail=");
        sb.append(this.d);
        sb.append(", subScore=");
        sb.append(this.e);
        sb.append(", serve=");
        sb.append(this.f);
        sb.append(", info=");
        h97.v(this.h, this.g, ", isBreak=", ", currentPeriodName=", sb);
        sb.append(this.i);
        sb.append(", timer=");
        sb.append(this.j);
        sb.append(", tabloStats=");
        sb.append(this.k);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
