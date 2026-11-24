package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tca implements mca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpp0 f33711a;
    public final List b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;

    public tca(rpp0 rpp0Var, List list, List list2, String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        list.getClass();
        list2.getClass();
        str5.getClass();
        this.f33711a = rpp0Var;
        this.b = list;
        this.c = list2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tca)) {
            return false;
        }
        tca tcaVar = (tca) obj;
        return this.f33711a.equals(tcaVar.f33711a) && Intrinsics.d(this.b, tcaVar.b) && Intrinsics.d(this.c, tcaVar.c) && this.d.equals(tcaVar.d) && this.e.equals(tcaVar.e) && this.f.equals(tcaVar.f) && this.g.equals(tcaVar.g) && Intrinsics.d(this.h, tcaVar.h) && this.i == tcaVar.i && this.j.equals(tcaVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(dw9.a(dw9.a(this.f33711a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardCommonLineModel(teamsInfoModel=");
        sb.append(this.f33711a);
        sb.append(", teamOneImageUrls=");
        sb.append(this.b);
        sb.append(", teamTwoImageUrls=");
        h97.y(", tournamentStage=", this.d, ", seriesScore=", sb, this.c);
        f140.v(sb, this.e, ", matchFormat=", this.f, ", surfaceDescription=");
        f140.v(sb, this.g, ", vid=", this.h, ", hostsVsGuests=");
        return twn.q(", locationCountry=", this.j, Separators.RPAREN, sb, this.i);
    }
}
