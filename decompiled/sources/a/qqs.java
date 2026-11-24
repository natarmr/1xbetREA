package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29180a;
    public final String b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final znq0 k;
    public final String l;
    public final boolean m;
    public final int n;
    public final oqs o;
    public final int p;

    public qqs(String str, String str2, List list, int i, int i2, int i3, String str3, long j, boolean z, boolean z2, znq0 znq0Var, String str4, boolean z3, int i4, oqs oqsVar, int i5) {
        list.getClass();
        this.f29180a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str3;
        this.h = j;
        this.i = z;
        this.j = z2;
        this.k = znq0Var;
        this.l = str4;
        this.m = z3;
        this.n = i4;
        this.o = oqsVar;
        this.p = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqs)) {
            return false;
        }
        qqs qqsVar = (qqs) obj;
        return this.f29180a.equals(qqsVar.f29180a) && this.b.equals(qqsVar.b) && Intrinsics.d(this.c, qqsVar.c) && this.d == qqsVar.d && this.e == qqsVar.e && this.f == qqsVar.f && this.g.equals(qqsVar.g) && znq0.e(this.h, qqsVar.h) && this.i == qqsVar.i && this.j == qqsVar.j && Intrinsics.d(this.k, qqsVar.k) && this.l.equals(qqsVar.l) && this.m == qqsVar.m && this.n == qqsVar.n && this.o.equals(qqsVar.o) && this.p == qqsVar.p;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(rw2.b(ua80.b(twn.a(this.f, twn.a(this.e, twn.a(this.d, dw9.a(ua80.b(this.f29180a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        znq0 znq0Var = this.k;
        return Integer.hashCode(this.p) + ((this.o.hashCode() + twn.a(this.n, brm0.e(ua80.b((iE + (znq0Var == null ? 0 : Long.hashCode(znq0Var.f44687a))) * 31, 31, this.l), 31, this.m), 31)) * 31);
    }

    public final String toString() {
        String strH = znq0.h(this.h);
        StringBuilder sbN = b1j.n("GameScoreModel(periodName=", this.f29180a, ", fullScoreStr=", this.b, ", periodScoreList=");
        brm0.v(this.d, ", scoreFirst=", ", scoreSecond=", sbN, this.c);
        axq.r(this.e, this.f, ", serve=", ", periodFullScore=", sbN);
        f140.v(sbN, this.g, ", timePassed=", strH, ", timerRun=");
        ua80.u(", timeBackDirection=", ", stageTime=", sbN, this.i, this.j);
        sbN.append(this.k);
        sbN.append(", dopInfo=");
        sbN.append(this.l);
        sbN.append(", matchIsBreak=");
        ua80.q(this.n, ", periodCount=", ", fullScoreDetails=", sbN, this.m);
        sbN.append(this.o);
        sbN.append(", currentPeriod=");
        sbN.append(this.p);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
