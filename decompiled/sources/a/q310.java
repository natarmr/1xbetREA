package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q310 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28027a;
    public final long b;
    public final r510 c;
    public final r510 d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    public final long i;
    public final List j;

    public q310(int i, long j, r510 r510Var, r510 r510Var2, String str, int i2, int i3, String str2, long j2, List list) {
        list.getClass();
        this.f28027a = i;
        this.b = j;
        this.c = r510Var;
        this.d = r510Var2;
        this.e = str;
        this.f = i2;
        this.g = i3;
        this.h = str2;
        this.i = j2;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q310)) {
            return false;
        }
        q310 q310Var = (q310) obj;
        return this.f28027a == q310Var.f28027a && this.b == q310Var.b && this.c.equals(q310Var.c) && this.d.equals(q310Var.d) && this.e.equals(q310Var.e) && this.f == q310Var.f && this.g == q310Var.g && this.h.equals(q310Var.h) && this.i == q310Var.i && Intrinsics.d(this.j, q310Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + rw2.b(ua80.b(twn.a(this.g, twn.a(this.f, ua80.b((this.d.hashCode() + ((this.c.hashCode() + rw2.b(Integer.hashCode(this.f28027a) * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31), 31), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f28027a, this.b, "LolStatisticMatchModel(id=", ", tournamentId=");
        sbQ.append(", teamOne=");
        sbQ.append(this.c);
        sbQ.append(", teamTwo=");
        sbQ.append(this.d);
        axq.s(this.f, ", type=", this.e, ", teamOneScore=", sbQ);
        w6x.w(this.g, ", teamTwoScore=", ", startTime=", this.h, sbQ);
        kng0.A(sbQ, ", startTimestamp=", this.i, ", matches=");
        return dw9.r(sbQ, this.j, Separators.RPAREN);
    }
}
