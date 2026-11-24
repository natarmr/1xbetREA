package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ujg {
    public static final tjg Companion = new tjg();
    public static final a8z[] n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f35777a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Integer i;
    public List j;
    public List k;
    public List l;
    public List m;

    static {
        wez wezVar = wez.f39042a;
        n = new a8z[]{null, null, null, null, null, null, null, null, null, maz.a(wezVar, new jcg((byte) 18)), maz.a(wezVar, new jcg((byte) 19)), maz.a(wezVar, new jcg((byte) 20)), maz.a(wezVar, new jcg((byte) 21))};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujg)) {
            return false;
        }
        ujg ujgVar = (ujg) obj;
        return Intrinsics.d(this.f35777a, ujgVar.f35777a) && Intrinsics.d(this.b, ujgVar.b) && Intrinsics.d(this.c, ujgVar.c) && Intrinsics.d(this.d, ujgVar.d) && Intrinsics.d(this.e, ujgVar.e) && Intrinsics.d(this.f, ujgVar.f) && Intrinsics.d(this.g, ujgVar.g) && Intrinsics.d(this.h, ujgVar.h) && Intrinsics.d(this.i, ujgVar.i) && Intrinsics.d(this.j, ujgVar.j) && Intrinsics.d(this.k, ujgVar.k) && Intrinsics.d(this.l, ujgVar.l) && Intrinsics.d(this.m, ujgVar.m);
    }

    public final int hashCode() {
        Boolean bool = this.f35777a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f;
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.g;
        int iHashCode7 = (iHashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.h;
        int iHashCode8 = (iHashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.k;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.l;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.m;
        return iHashCode12 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f35777a;
        Boolean bool2 = this.b;
        Boolean bool3 = this.c;
        Boolean bool4 = this.d;
        Boolean bool5 = this.e;
        Boolean bool6 = this.f;
        Boolean bool7 = this.g;
        Boolean bool8 = this.h;
        Integer num = this.i;
        List list = this.j;
        List list2 = this.k;
        List list3 = this.l;
        List list4 = this.m;
        StringBuilder sb = new StringBuilder("CyberConfig(hasCyberCyberStreamTab=");
        sb.append(bool);
        sb.append(", hasCyberSport=");
        sb.append(bool2);
        sb.append(", hasCyberOnboarding=");
        defpackage.c.j(sb, bool3, ", hasCyberRealTab=", bool4, ", hasCyberVirtualTab=");
        defpackage.c.j(sb, bool5, ", isNewFeedGame2=", bool6, ", isNewFeedFavourite=");
        defpackage.c.j(sb, bool7, ", isNewTimeLine=", bool8, ", cyberGeneralChampId=");
        cs0.z(sb, num, ", cyberGeneralChampSportsId=", list, ", cyberGeneralChampSportsDates=");
        b1j.y(", cyberGeneralChampSportsChampID=", ", hltvChampIds=", sb, list2, list3);
        return dw9.r(sb, list4, Separators.RPAREN);
    }
}
