package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eje0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7905a;
    public final String b;
    public final String c;
    public final t6n d;
    public final t6n e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public eje0(String str, String str2, String str3, t6n t6nVar, t6n t6nVar2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        ohs0.z(str2, str3, str4, str5, str6);
        ohs0.z(str7, str8, str9, str10, str11);
        str12.getClass();
        this.f7905a = str;
        this.b = str2;
        this.c = str3;
        this.d = t6nVar;
        this.e = t6nVar2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eje0)) {
            return false;
        }
        eje0 eje0Var = (eje0) obj;
        return this.f7905a.equals(eje0Var.f7905a) && Intrinsics.d(this.b, eje0Var.b) && Intrinsics.d(this.c, eje0Var.c) && this.d.equals(eje0Var.d) && this.e.equals(eje0Var.e) && Intrinsics.d(this.f, eje0Var.f) && Intrinsics.d(this.g, eje0Var.g) && Intrinsics.d(this.h, eje0Var.h) && Intrinsics.d(this.i, eje0Var.i) && Intrinsics.d(this.j, eje0Var.j) && Intrinsics.d(this.k, eje0Var.k) && Intrinsics.d(this.l, eje0Var.l) && Intrinsics.d(this.m, eje0Var.m) && Intrinsics.d(this.n, eje0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(this.f7905a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RefereeLastGameUiModel(tournamentTitle=", this.f7905a, ", scoreTeamOne=", this.b, ", scoreTeamTwo=");
        sbN.append(this.c);
        sbN.append(", team1ImageModel=");
        sbN.append(this.d);
        sbN.append(", team2ImageModel=");
        sbN.append(this.e);
        sbN.append(", team1Title=");
        sbN.append(this.f);
        sbN.append(", team2Title=");
        f140.v(sbN, this.g, ", time=", this.h, ", team1RedCards=");
        f140.v(sbN, this.i, ", team1YellowCards=", this.j, ", team1PenaltiesConceded=");
        f140.v(sbN, this.k, ", team2RedCards=", this.l, ", team2YellowCards=");
        return ua80.m(sbN, this.m, ", team2PenaltiesConceded=", this.n, Separators.RPAREN);
    }
}
