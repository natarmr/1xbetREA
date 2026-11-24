package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11907a;
    public final z1s0 b;
    public final boolean c;
    public final boolean d;
    public final j88 e;
    public final w88 f;
    public final List g;
    public final k98 h;
    public final s98 i;
    public final z78 j;
    public final o98 k;
    public final w98 l;
    public final int m;
    public final gqt0 n;
    public final lf9 o;
    public final re9 p;
    public final long q;
    public final List r;

    public gu1(long j, z1s0 z1s0Var, boolean z, boolean z2, j88 j88Var, w88 w88Var, List list, k98 k98Var, s98 s98Var, z78 z78Var, o98 o98Var, w98 w98Var, int i, gqt0 gqt0Var, lf9 lf9Var, re9 re9Var, long j2, List list2) {
        list.getClass();
        list2.getClass();
        this.f11907a = j;
        this.b = z1s0Var;
        this.c = z;
        this.d = z2;
        this.e = j88Var;
        this.f = w88Var;
        this.g = list;
        this.h = k98Var;
        this.i = s98Var;
        this.j = z78Var;
        this.k = o98Var;
        this.l = w98Var;
        this.m = i;
        this.n = gqt0Var;
        this.o = lf9Var;
        this.p = re9Var;
        this.q = j2;
        this.r = list2;
    }

    public static gu1 a(gu1 gu1Var, boolean z, k98 k98Var, gqt0 gqt0Var, long j, List list, int i) {
        long j2 = gu1Var.f11907a;
        z1s0 z1s0Var = gu1Var.b;
        boolean z2 = (i & 4) != 0 ? gu1Var.c : z;
        boolean z3 = gu1Var.d;
        j88 j88Var = gu1Var.e;
        w88 w88Var = gu1Var.f;
        List list2 = gu1Var.g;
        k98 k98Var2 = (i & 128) != 0 ? gu1Var.h : k98Var;
        s98 s98Var = gu1Var.i;
        z78 z78Var = gu1Var.j;
        o98 o98Var = gu1Var.k;
        w98 w98Var = gu1Var.l;
        int i2 = gu1Var.m;
        gqt0 gqt0Var2 = (i & 8192) != 0 ? gu1Var.n : gqt0Var;
        lf9 lf9Var = gu1Var.o;
        re9 re9Var = gu1Var.p;
        long j3 = (i & 65536) != 0 ? gu1Var.q : j;
        List list3 = (i & 131072) != 0 ? gu1Var.r : list;
        gu1Var.getClass();
        list2.getClass();
        gqt0Var2.getClass();
        list3.getClass();
        return new gu1(j2, z1s0Var, z2, z3, j88Var, w88Var, list2, k98Var2, s98Var, z78Var, o98Var, w98Var, i2, gqt0Var2, lf9Var, re9Var, j3, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu1)) {
            return false;
        }
        gu1 gu1Var = (gu1) obj;
        return this.f11907a == gu1Var.f11907a && this.b == gu1Var.b && this.c == gu1Var.c && this.d == gu1Var.d && this.e.equals(gu1Var.e) && this.f.equals(gu1Var.f) && Intrinsics.d(this.g, gu1Var.g) && this.h.equals(gu1Var.h) && this.i.equals(gu1Var.i) && this.j.equals(gu1Var.j) && this.k.equals(gu1Var.k) && this.l.equals(gu1Var.l) && this.m == gu1Var.m && this.n == gu1Var.n && this.o.equals(gu1Var.o) && this.p == gu1Var.p && this.q == gu1Var.q && Intrinsics.d(this.r, gu1Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + rw2.b((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + twn.a(this.m, dw9.a((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + dw9.a(dw9.a((this.f.hashCode() + ((this.e.hashCode() + brm0.e(brm0.e((this.b.hashCode() + (Long.hashCode(this.f11907a) * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h.f17902a)) * 31)) * 31)) * 31, 31, this.l.f38767a), 31)) * 31)) * 31)) * 31, 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorTournamentFullInfoModel(id=");
        sb.append(this.f11907a);
        sb.append(", kind=");
        sb.append(this.b);
        w6x.A(", meParticipating=", ", providerTournamentWithStages=", sb, this.c, this.d);
        sb.append(", blockHeader=");
        sb.append(this.e);
        sb.append(", blockPrize=");
        sb.append(this.f);
        sb.append(", productsList=");
        sb.append(this.g);
        sb.append(", blockResult=");
        sb.append(this.h);
        sb.append(", blockRule=");
        sb.append(this.i);
        sb.append(", blockFullRule=");
        sb.append(this.j);
        sb.append(", blockRuleStage=");
        sb.append(this.k);
        sb.append(", blockStages=");
        sb.append(this.l);
        sb.append(", type=");
        sb.append(this.m);
        sb.append(", userActionButtonType=");
        sb.append(this.n);
        sb.append(", buttons=");
        sb.append(this.o);
        sb.append(", buttonStatus=");
        sb.append(this.p);
        kng0.A(sb, ", crmParticipantCurrentStage=", this.q, ", games=");
        return dw9.r(sb, this.r, Separators.RPAREN);
    }
}
