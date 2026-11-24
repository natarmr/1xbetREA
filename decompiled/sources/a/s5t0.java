package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ufc.api.game.UfcPostGameParams;

/* JADX INFO: loaded from: classes6.dex */
public final class s5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UfcPostGameParams f31671a;
    public final n5t0 b;
    public final i6t0 c;
    public final rsp d;
    public final lov e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final ypl0 j;
    public final bqr k;
    public final boolean l;
    public final long m;
    public final boolean n;
    public final long o;
    public final long p;
    public final long q;

    public s5t0(UfcPostGameParams ufcPostGameParams, n5t0 n5t0Var, i6t0 i6t0Var, rsp rspVar, lov lovVar, List list, List list2, List list3, List list4, ypl0 ypl0Var, bqr bqrVar, boolean z, long j, boolean z2, long j2, long j3, long j4) {
        b1j.B(list, list2, list3);
        this.f31671a = ufcPostGameParams;
        this.b = n5t0Var;
        this.c = i6t0Var;
        this.d = rspVar;
        this.e = lovVar;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = list4;
        this.j = ypl0Var;
        this.k = bqrVar;
        this.l = z;
        this.m = j;
        this.n = z2;
        this.o = j2;
        this.p = j3;
        this.q = j4;
    }

    public static s5t0 a(s5t0 s5t0Var, n5t0 n5t0Var, i6t0 i6t0Var, rsp rspVar, lov lovVar, List list, List list2, ArrayList arrayList, ypl0 ypl0Var, bqr bqrVar, boolean z, long j, long j2, long j3, long j4, int i) {
        UfcPostGameParams ufcPostGameParams = s5t0Var.f31671a;
        n5t0 n5t0Var2 = (i & 2) != 0 ? s5t0Var.b : n5t0Var;
        i6t0 i6t0Var2 = (i & 4) != 0 ? s5t0Var.c : i6t0Var;
        rsp rspVar2 = (i & 8) != 0 ? s5t0Var.d : rspVar;
        lov lovVar2 = (i & 16) != 0 ? s5t0Var.e : lovVar;
        List list3 = (i & 32) != 0 ? s5t0Var.f : list;
        List list4 = (i & 64) != 0 ? s5t0Var.g : list2;
        List list5 = (i & 128) != 0 ? s5t0Var.h : arrayList;
        List list6 = s5t0Var.i;
        ypl0 ypl0Var2 = (i & 512) != 0 ? s5t0Var.j : ypl0Var;
        bqr bqrVar2 = (i & 1024) != 0 ? s5t0Var.k : bqrVar;
        boolean z2 = (i & 2048) != 0 ? s5t0Var.l : z;
        long j5 = (i & 4096) != 0 ? s5t0Var.m : j;
        boolean z3 = s5t0Var.n;
        long j6 = (i & 16384) != 0 ? s5t0Var.o : j2;
        long j7 = (i & 32768) != 0 ? s5t0Var.p : j3;
        long j8 = (i & 65536) != 0 ? s5t0Var.q : j4;
        s5t0Var.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        ypl0Var2.getClass();
        bqrVar2.getClass();
        return new s5t0(ufcPostGameParams, n5t0Var2, i6t0Var2, rspVar2, lovVar2, list3, list4, list5, list6, ypl0Var2, bqrVar2, z2, j5, z3, j6, j7, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5t0)) {
            return false;
        }
        s5t0 s5t0Var = (s5t0) obj;
        return this.f31671a.equals(s5t0Var.f31671a) && this.b == s5t0Var.b && Intrinsics.d(this.c, s5t0Var.c) && Intrinsics.d(this.d, s5t0Var.d) && Intrinsics.d(this.e, s5t0Var.e) && Intrinsics.d(this.f, s5t0Var.f) && Intrinsics.d(this.g, s5t0Var.g) && Intrinsics.d(this.h, s5t0Var.h) && this.i.equals(s5t0Var.i) && this.j.equals(s5t0Var.j) && this.k.equals(s5t0Var.k) && this.l == s5t0Var.l && this.m == s5t0Var.m && this.n == s5t0Var.n && this.o == s5t0Var.o && this.p == s5t0Var.p && this.q == s5t0Var.q;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f31671a.hashCode() * 31)) * 31;
        i6t0 i6t0Var = this.c;
        int iHashCode2 = (iHashCode + (i6t0Var == null ? 0 : i6t0Var.hashCode())) * 31;
        rsp rspVar = this.d;
        int iHashCode3 = (iHashCode2 + (rspVar == null ? 0 : rspVar.hashCode())) * 31;
        lov lovVar = this.e;
        return Long.hashCode(this.q) + rw2.b(rw2.b(brm0.e(rw2.b(brm0.e((this.k.hashCode() + ((this.j.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a((iHashCode3 + (lovVar != null ? lovVar.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UfcPostGameStateModel(screenParams=");
        sb.append(this.f31671a);
        sb.append(", loadState=");
        sb.append(this.b);
        sb.append(", shortGame=");
        sb.append(this.c);
        sb.append(", fightInfo=");
        sb.append(this.d);
        sb.append(", headToHeadModel=");
        sb.append(this.e);
        sb.append(", fighterStats=");
        sb.append(this.f);
        sb.append(", favoriteTeams=");
        b1j.y(", statisticBlocks=", ", availableStats=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", sportSimpleModel=");
        sb.append(this.j);
        sb.append(", gameBackgroundModel=");
        sb.append(this.k);
        sb.append(", resetScroll=");
        sb.append(this.l);
        sb.append(", generalStatisticTabIdSelected=");
        hne.t(this.m, ", supportRtl=", sb, this.n);
        kng0.A(sb, ", fightStatisticTabIdSelected=", this.o, ", headToHeadStatisticTabIdSelected=");
        sb.append(this.p);
        return rw2.n(sb, this.q, ", shotMapTabIdSelected=", Separators.RPAREN);
    }
}
