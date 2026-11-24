package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class py1 implements ry1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ky1 f27784a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final kdm l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final fy1 q;
    public final ny1 r;

    public py1(ky1 ky1Var, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, kdm kdmVar, String str10, String str11, String str12, String str13, fy1 fy1Var, ny1 ny1Var) {
        ky1Var.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        this.f27784a = ky1Var;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = kdmVar;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = fy1Var;
        this.r = ny1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py1)) {
            return false;
        }
        py1 py1Var = (py1) obj;
        return Intrinsics.d(this.f27784a, py1Var.f27784a) && this.b == py1Var.b && this.c.equals(py1Var.c) && Intrinsics.d(this.d, py1Var.d) && Intrinsics.d(this.e, py1Var.e) && this.f.equals(py1Var.f) && Intrinsics.d(this.g, py1Var.g) && this.h.equals(py1Var.h) && this.i.equals(py1Var.i) && this.j.equals(py1Var.j) && this.k.equals(py1Var.k) && this.l.equals(py1Var.l) && Intrinsics.d(this.m, py1Var.m) && Intrinsics.d(this.n, py1Var.n) && Intrinsics.d(this.o, py1Var.o) && Intrinsics.d(this.p, py1Var.p) && this.q.equals(py1Var.q) && this.r.equals(py1Var.r);
    }

    public final int hashCode() {
        int iHashCode = (this.l.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(twn.a(R.drawable.ic_tournament_banner, ua80.b(rw2.b(this.f27784a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31;
        String str = this.m;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        return this.r.hashCode() + ((this.q.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(style=");
        sb.append(this.f27784a);
        sb.append(", tournamentId=");
        sb.append(this.b);
        axq.s(R.drawable.ic_tournament_banner, ", pictureUrl=", this.c, ", placeholder=", sb);
        f140.v(sb, ", prizeLabel=", this.d, ", datesLabel=", this.e);
        f140.v(sb, ", prizeValue=", this.f, ", title=", this.g);
        f140.v(sb, ", startDate=", this.h, ", endDate=", this.i);
        f140.v(sb, ", dsDatesLabel=", this.j, ", timeLabel=", this.k);
        sb.append(", dsDateContainerUiModel=");
        sb.append(this.l);
        sb.append(", startCardDay=");
        sb.append(this.m);
        f140.v(sb, ", startCardMonth=", this.n, ", endCardDay=", this.o);
        sb.append(", endCardMonth=");
        sb.append(this.p);
        sb.append(", buttons=");
        sb.append(this.q);
        sb.append(", tags=");
        sb.append(this.r);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
