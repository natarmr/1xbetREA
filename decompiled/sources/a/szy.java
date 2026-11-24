package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class szy extends uzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33090a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final t6n f;
    public final t6n g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;

    public szy(String str, String str2, String str3, String str4, String str5, t6n t6nVar, t6n t6nVar2, String str6, String str7, String str8, String str9, String str10, int i, String str11) {
        ohs0.z(str, str2, str3, str4, str5);
        brm0.B(str6, str7, str9);
        this.f33090a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = t6nVar;
        this.g = t6nVar2;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = i;
        this.n = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szy)) {
            return false;
        }
        szy szyVar = (szy) obj;
        return Intrinsics.d(this.f33090a, szyVar.f33090a) && Intrinsics.d(this.b, szyVar.b) && Intrinsics.d(this.c, szyVar.c) && Intrinsics.d(this.d, szyVar.d) && Intrinsics.d(this.e, szyVar.e) && this.f.equals(szyVar.f) && this.g.equals(szyVar.g) && Intrinsics.d(this.h, szyVar.h) && Intrinsics.d(this.i, szyVar.i) && this.j.equals(szyVar.j) && Intrinsics.d(this.k, szyVar.k) && this.l.equals(szyVar.l) && this.m == szyVar.m && this.n.equals(szyVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + twn.a(this.m, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((this.g.hashCode() + ((this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f33090a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LastGamePlayerDataUiModel(tournamentTitle=", this.f33090a, ", goals=", this.b, ", redCards=");
        f140.v(sbN, this.c, ", scoreTeamOne=", this.d, ", scoreTeamTwo=");
        sbN.append(this.e);
        sbN.append(", team1ImageModel=");
        sbN.append(this.f);
        sbN.append(", team2ImageModel=");
        sbN.append(this.g);
        sbN.append(", team1Title=");
        sbN.append(this.h);
        sbN.append(", team2Title=");
        f140.v(sbN, this.i, ", time=", this.j, ", yellowCards=");
        f140.v(sbN, this.k, ", gameId=", this.l, ", goalDrawable=");
        return rw2.k(this.m, ", sportIconUrl=", this.n, Separators.RPAREN, sbN);
    }
}
