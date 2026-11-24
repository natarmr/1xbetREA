package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rz7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31344a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final a4x k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final boolean t;

    public rz7(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, a4x a4xVar, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z) {
        a4xVar.getClass();
        this.f31344a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = a4xVar;
        this.l = str11;
        this.m = str12;
        this.n = str13;
        this.o = str14;
        this.p = str15;
        this.q = str16;
        this.r = str17;
        this.s = str18;
        this.t = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz7)) {
            return false;
        }
        rz7 rz7Var = (rz7) obj;
        return this.f31344a.equals(rz7Var.f31344a) && this.b.equals(rz7Var.b) && this.c.equals(rz7Var.c) && this.d.equals(rz7Var.d) && this.e.equals(rz7Var.e) && this.f.equals(rz7Var.f) && this.g.equals(rz7Var.g) && this.h.equals(rz7Var.h) && this.i.equals(rz7Var.i) && this.j.equals(rz7Var.j) && Intrinsics.d(this.k, rz7Var.k) && this.l.equals(rz7Var.l) && this.m.equals(rz7Var.m) && this.n.equals(rz7Var.n) && this.o.equals(rz7Var.o) && this.p.equals(rz7Var.p) && this.q.equals(rz7Var.q) && this.r.equals(rz7Var.r) && this.s.equals(rz7Var.s) && this.t == rz7Var.t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(cs0.b(this.k, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f31344a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BigPigNumberImagesUiModel(gameInfoBackground=", this.f31344a, ", tableImage=", this.b, ", currentPlayerWithoutHandImage=");
        f140.v(sbN, this.c, ", currentPlayerWaitingImage=", this.d, ", currentPlayerWaitingLeftHandImage=");
        f140.v(sbN, this.e, ", currentPlayerWaitingRightHandImage=", this.f, ", currentPlayerSadImage=");
        f140.v(sbN, this.g, ", currentPlayerHandStartPositionImage=", this.h, ", currentPlayerHandSecondPositionImage=");
        f140.v(sbN, this.i, ", currentPlayerThrowShoulderImage=", this.j, ", animationDiceFrames=");
        sbN.append(this.k);
        sbN.append(", firstDiceResultImage=");
        sbN.append(this.l);
        sbN.append(", secondDiceResultImage=");
        f140.v(sbN, this.m, ", winnerImage=", this.n, ", winnerLeftShoulderImage=");
        f140.v(sbN, this.o, ", winnerLeftHandImage=", this.p, ", winnerRightShoulderImage=");
        f140.v(sbN, this.q, ", winnerRightHandImage=", this.r, ", loserImage=");
        return defpackage.c.c(this.s, ", isSecondPlayerWinner=", Separators.RPAREN, sbN, this.t);
    }
}
