package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hda implements mca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12861a;
    public final List b;
    public final List c;
    public final List d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;
    public final String l;

    public hda(List list, List list2, List list3, List list4, String str, String str2, boolean z, String str3, String str4, String str5, long j, String str6) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        str4.getClass();
        str5.getClass();
        this.f12861a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = j;
        this.l = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hda)) {
            return false;
        }
        hda hdaVar = (hda) obj;
        return Intrinsics.d(this.f12861a, hdaVar.f12861a) && Intrinsics.d(this.b, hdaVar.b) && Intrinsics.d(this.c, hdaVar.c) && Intrinsics.d(this.d, hdaVar.d) && this.e.equals(hdaVar.e) && this.f.equals(hdaVar.f) && this.g == hdaVar.g && this.h.equals(hdaVar.h) && Intrinsics.d(this.i, hdaVar.i) && Intrinsics.d(this.j, hdaVar.j) && this.k == hdaVar.k && this.l.equals(hdaVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + rw2.b(ua80.b(ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(dw9.a(dw9.a(dw9.a(this.f12861a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("CardCommonMultiTeamLiveModel(teamOneNames=", ", teamTwoNames=", this.f12861a, ", teamOneImageUrls=", this.b);
        b1j.y(", teamTwoImageUrls=", ", tournamentStage=", sbT, this.c, this.d);
        f140.v(sbT, this.e, ", seriesScore=", this.f, ", finished=");
        f140.s(", matchFormat=", this.h, ", vid=", sbT, this.g);
        f140.v(sbT, this.i, ", dopInfo=", this.j, ", sportId=");
        kng0.z(sbT, this.k, ", locationCountry=", this.l);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
