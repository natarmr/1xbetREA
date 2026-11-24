package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpp0 f2594a;
    public final List b;
    public final List c;
    public final float d;
    public final float e;
    public final float f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    public bha(rpp0 rpp0Var, List list, List list2, float f, float f2, float f3, boolean z, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7) {
        list.getClass();
        list2.getClass();
        str2.getClass();
        str3.getClass();
        this.f2594a = rpp0Var;
        this.b = list;
        this.c = list2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = z;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = j;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bha)) {
            return false;
        }
        bha bhaVar = (bha) obj;
        return this.f2594a.equals(bhaVar.f2594a) && Intrinsics.d(this.b, bhaVar.b) && Intrinsics.d(this.c, bhaVar.c) && Float.compare(this.d, bhaVar.d) == 0 && Float.compare(this.e, bhaVar.e) == 0 && Float.compare(this.f, bhaVar.f) == 0 && this.g == bhaVar.g && this.h.equals(bhaVar.h) && Intrinsics.d(this.i, bhaVar.i) && Intrinsics.d(this.j, bhaVar.j) && this.k == bhaVar.k && this.l.equals(bhaVar.l) && this.m.equals(bhaVar.m) && this.n.equals(bhaVar.n) && this.o.equals(bhaVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(brm0.e(defpackage.c.a(defpackage.c.a(defpackage.c.a(dw9.a(dw9.a(this.f2594a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), this.f, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardFootballActivitiesModel(teamsInfoModel=");
        sb.append(this.f2594a);
        sb.append(", teamOneImageUrls=");
        sb.append(this.b);
        sb.append(", teamTwoImageUrls=");
        sb.append(this.c);
        sb.append(", currentRightZoneActivity=");
        sb.append(this.d);
        sb.append(", currentCentralZoneActivity=");
        vqd.v(sb, this.e, ", currentLeftZoneActivity=", this.f, ", finished=");
        f140.s(", matchFormat=", this.h, ", vid=", sb, this.g);
        f140.v(sb, this.i, ", dopInfo=", this.j, ", sportId=");
        kng0.z(sb, this.k, ", tournamentStage=", this.l);
        f140.v(sb, ", seriesScore=", this.m, ", locationCountry=", this.n);
        return rw2.o(sb, ", surfaceDescription=", this.o, Separators.RPAREN);
    }
}
