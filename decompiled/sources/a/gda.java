package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gda implements mca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11094a;
    public final List b;
    public final List c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public gda(List list, List list2, List list3, List list4, String str, String str2, String str3, String str4, String str5) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        str4.getClass();
        this.f11094a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gda)) {
            return false;
        }
        gda gdaVar = (gda) obj;
        return Intrinsics.d(this.f11094a, gdaVar.f11094a) && Intrinsics.d(this.b, gdaVar.b) && Intrinsics.d(this.c, gdaVar.c) && Intrinsics.d(this.d, gdaVar.d) && this.e.equals(gdaVar.e) && this.f.equals(gdaVar.f) && this.g.equals(gdaVar.g) && Intrinsics.d(this.h, gdaVar.h) && this.i.equals(gdaVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(dw9.a(dw9.a(dw9.a(this.f11094a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("CardCommonMultiTeamLineModel(teamOneNames=", ", teamTwoNames=", this.f11094a, ", teamOneImageUrls=", this.b);
        b1j.y(", teamTwoImageUrls=", ", tournamentStage=", sbT, this.c, this.d);
        f140.v(sbT, this.e, ", seriesScore=", this.f, ", matchFormat=");
        f140.v(sbT, this.g, ", vid=", this.h, ", locationCountry=");
        return axq.n(sbT, this.i, Separators.RPAREN);
    }
}
