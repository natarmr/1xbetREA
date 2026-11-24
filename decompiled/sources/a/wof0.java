package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wof0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39494a;
    public final csr b;
    public final double c;
    public final gpf0 d;
    public final int e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final double i;
    public final ArrayList j;
    public final lnm0 k;
    public final double l;

    public wof0(long j, csr csrVar, double d, gpf0 gpf0Var, int i, boolean z, String str, boolean z2, double d2, ArrayList arrayList, lnm0 lnm0Var, double d3) {
        csrVar.getClass();
        str.getClass();
        this.f39494a = j;
        this.b = csrVar;
        this.c = d;
        this.d = gpf0Var;
        this.e = i;
        this.f = z;
        this.g = str;
        this.h = z2;
        this.i = d2;
        this.j = arrayList;
        this.k = lnm0Var;
        this.l = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wof0)) {
            return false;
        }
        wof0 wof0Var = (wof0) obj;
        return this.f39494a == wof0Var.f39494a && Intrinsics.d(this.b, wof0Var.b) && Double.compare(this.c, wof0Var.c) == 0 && this.d == wof0Var.d && this.e == wof0Var.e && this.f == wof0Var.f && Intrinsics.d(this.g, wof0Var.g) && this.h == wof0Var.h && Double.compare(this.i, wof0Var.i) == 0 && this.j.equals(wof0Var.j) && this.k == wof0Var.k && Double.compare(this.l, wof0Var.l) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.l) + ((this.k.hashCode() + twn.g(this.j, brm0.d(this.i, brm0.e(ua80.b(brm0.e(twn.a(this.e, (this.d.hashCode() + brm0.d(this.c, (this.b.hashCode() + (Long.hashCode(this.f39494a) * 31)) * 31, 31)) * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResidentGameModel(accountId=");
        sb.append(this.f39494a);
        sb.append(", bonusInfo=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", betSum=", ", gameState=");
        sb.append(this.d);
        sb.append(", gameStep=");
        sb.append(this.e);
        sb.append(", useSecondChance=");
        f140.s(", gameId=", this.g, ", canIncreaseBet=", sb, this.f);
        sb.append(this.h);
        sb.append(", newBalance=");
        sb.append(this.i);
        sb.append(", safes=");
        sb.append(this.j);
        sb.append(", gameStatus=");
        sb.append(this.k);
        return brm0.m(sb, this.l, ", winSum=", Separators.RPAREN);
    }
}
