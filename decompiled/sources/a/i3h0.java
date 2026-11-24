package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i3h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14096a;
    public final List b;
    public final cso c;
    public final nbr d;
    public final jzm0 e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final cnq0 j;
    public final String k;
    public final int l;

    public i3h0(String str, List list, cso csoVar, nbr nbrVar, jzm0 jzm0Var, int i, int i2, String str2, String str3, cnq0 cnq0Var, String str4, int i3) {
        str.getClass();
        list.getClass();
        csoVar.getClass();
        nbrVar.getClass();
        jzm0Var.getClass();
        this.f14096a = str;
        this.b = list;
        this.c = csoVar;
        this.d = nbrVar;
        this.e = jzm0Var;
        this.f = i;
        this.g = i2;
        this.h = str2;
        this.i = str3;
        this.j = cnq0Var;
        this.k = str4;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3h0)) {
            return false;
        }
        i3h0 i3h0Var = (i3h0) obj;
        return Intrinsics.d(this.f14096a, i3h0Var.f14096a) && Intrinsics.d(this.b, i3h0Var.b) && Intrinsics.d(this.c, i3h0Var.c) && Intrinsics.d(this.d, i3h0Var.d) && Intrinsics.d(this.e, i3h0Var.e) && this.f == i3h0Var.f && this.g == i3h0Var.g && this.h.equals(i3h0Var.h) && this.i.equals(i3h0Var.i) && this.j.equals(i3h0Var.j) && this.k.equals(i3h0Var.k) && this.l == i3h0Var.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + ua80.b((this.j.hashCode() + ua80.b(ua80.b(twn.a(this.g, twn.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + dw9.a(this.f14096a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31), 31), 31, this.h), 31, this.i)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("ScoreConfiguredModel(fullScore=", this.f14096a, ", periodScores=", this.b, ", extendedScore=");
        sbF.append(this.c);
        sbF.append(", fullScoreDetail=");
        sbF.append(this.d);
        sbF.append(", subScore=");
        sbF.append(this.e);
        sbF.append(", serve=");
        sbF.append(this.f);
        sbF.append(", currentPeriod=");
        kng0.w(this.g, ", currentPeriodName=", this.h, ", periodScoresStr=", sbF);
        sbF.append(this.i);
        sbF.append(", timer=");
        sbF.append(this.j);
        sbF.append(", info=");
        return brm0.j(this.l, this.k, ", periodsCount=", Separators.RPAREN, sbF);
    }
}
