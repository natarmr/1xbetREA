package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tm10 {
    public static final tm10 w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io10 f34172a;
    public final String b;
    public final String c;
    public final List d;
    public final esr e;
    public final esr f;
    public final boolean g;
    public final jo10 h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final ho10 p;
    public final List q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final csr u;
    public final ko10 v;

    static {
        io10 io10Var = io10.f15096a;
        iun iunVar = iun.f15405a;
        w = new tm10(io10Var, "", "", iunVar, null, null, false, jo10.c, "", true, false, "", false, 0L, false, null, iunVar, true, false, false, csr.e, ko10.c);
    }

    public tm10(io10 io10Var, String str, String str2, List list, esr esrVar, esr esrVar2, boolean z, jo10 jo10Var, String str3, boolean z2, boolean z3, String str4, boolean z4, long j, boolean z5, ho10 ho10Var, List list2, boolean z6, boolean z7, boolean z8, csr csrVar, ko10 ko10Var) {
        list.getClass();
        list2.getClass();
        csrVar.getClass();
        this.f34172a = io10Var;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = esrVar;
        this.f = esrVar2;
        this.g = z;
        this.h = jo10Var;
        this.i = str3;
        this.j = z2;
        this.k = z3;
        this.l = str4;
        this.m = z4;
        this.n = j;
        this.o = z5;
        this.p = ho10Var;
        this.q = list2;
        this.r = z6;
        this.s = z7;
        this.t = z8;
        this.u = csrVar;
        this.v = ko10Var;
    }

    public static tm10 a(tm10 tm10Var, io10 io10Var, String str, String str2, ArrayList arrayList, esr esrVar, esr esrVar2, boolean z, jo10 jo10Var, String str3, boolean z2, String str4, boolean z3, long j, boolean z4, ho10 ho10Var, List list, boolean z5, boolean z6, boolean z7, csr csrVar, ko10 ko10Var, int i) {
        io10 io10Var2 = (i & 1) != 0 ? tm10Var.f34172a : io10Var;
        String str5 = (i & 2) != 0 ? tm10Var.b : str;
        String str6 = (i & 4) != 0 ? tm10Var.c : str2;
        List list2 = (i & 8) != 0 ? tm10Var.d : arrayList;
        esr esrVar3 = (i & 16) != 0 ? tm10Var.e : esrVar;
        esr esrVar4 = (i & 32) != 0 ? tm10Var.f : esrVar2;
        boolean z8 = (i & 64) != 0 ? tm10Var.g : z;
        jo10 jo10Var2 = (i & 128) != 0 ? tm10Var.h : jo10Var;
        String str7 = (i & 256) != 0 ? tm10Var.i : str3;
        boolean z9 = (i & 512) != 0 ? tm10Var.j : true;
        boolean z10 = (i & 1024) != 0 ? tm10Var.k : z2;
        String str8 = (i & 2048) != 0 ? tm10Var.l : str4;
        boolean z11 = (i & 4096) != 0 ? tm10Var.m : z3;
        io10 io10Var3 = io10Var2;
        String str9 = str5;
        long j2 = (i & 8192) != 0 ? tm10Var.n : j;
        boolean z12 = (i & 16384) != 0 ? tm10Var.o : z4;
        ho10 ho10Var2 = (i & 32768) != 0 ? tm10Var.p : ho10Var;
        List list3 = (i & 65536) != 0 ? tm10Var.q : list;
        boolean z13 = (i & 131072) != 0 ? tm10Var.r : z5;
        boolean z14 = (i & 262144) != 0 ? tm10Var.s : z6;
        boolean z15 = (i & 524288) != 0 ? tm10Var.t : z7;
        csr csrVar2 = (i & 1048576) != 0 ? tm10Var.u : csrVar;
        ko10 ko10Var2 = (i & 2097152) != 0 ? tm10Var.v : ko10Var;
        tm10Var.getClass();
        io10Var3.getClass();
        str9.getClass();
        str6.getClass();
        list2.getClass();
        str7.getClass();
        str8.getClass();
        list3.getClass();
        csrVar2.getClass();
        return new tm10(io10Var3, str9, str6, list2, esrVar3, esrVar4, z8, jo10Var2, str7, z9, z10, str8, z11, j2, z12, ho10Var2, list3, z13, z14, z15, csrVar2, ko10Var2);
    }

    public final boolean b() {
        return this.s || this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm10)) {
            return false;
        }
        tm10 tm10Var = (tm10) obj;
        return this.f34172a == tm10Var.f34172a && this.b.equals(tm10Var.b) && this.c.equals(tm10Var.c) && Intrinsics.d(this.d, tm10Var.d) && this.e == tm10Var.e && this.f == tm10Var.f && this.g == tm10Var.g && this.h == tm10Var.h && this.i.equals(tm10Var.i) && this.j == tm10Var.j && this.k == tm10Var.k && this.l.equals(tm10Var.l) && this.m == tm10Var.m && this.n == tm10Var.n && this.o == tm10Var.o && Intrinsics.d(this.p, tm10Var.p) && Intrinsics.d(this.q, tm10Var.q) && this.r == tm10Var.r && this.s == tm10Var.s && this.t == tm10Var.t && Intrinsics.d(this.u, tm10Var.u) && this.v == tm10Var.v;
    }

    public final int hashCode() {
        int iA = dw9.a(ua80.b(ua80.b(this.f34172a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        esr esrVar = this.e;
        int iHashCode = (iA + (esrVar == null ? 0 : esrVar.hashCode())) * 31;
        esr esrVar2 = this.f;
        int iE = brm0.e(rw2.b(brm0.e(ua80.b(brm0.e(brm0.e(ua80.b((this.h.hashCode() + brm0.e((iHashCode + (esrVar2 == null ? 0 : esrVar2.hashCode())) * 31, 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        ho10 ho10Var = this.p;
        return this.v.hashCode() + ((this.u.hashCode() + brm0.e(brm0.e(brm0.e(dw9.a((iE + (ho10Var != null ? ho10Var.hashCode() : 0)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LuckyWheelGameState(screen=");
        sb.append(this.f34172a);
        sb.append(", balanceAmount=");
        sb.append(this.b);
        sb.append(", balanceCurrency=");
        cs0.y(this.c, ", wheelSectors=", ", rotateToBonusType=", sb, this.d);
        sb.append(this.e);
        sb.append(", rotateSpinAllBonusType=");
        sb.append(this.f);
        sb.append(", showActiveSector=");
        sb.append(this.g);
        sb.append(", screenSource=");
        sb.append(this.h);
        sb.append(", spinButtonText=");
        brm0.C(this.i, ", spinButtonEnabled=", ", spinAllButtonVisible=", sb, this.j);
        f140.s(", spinAllButtonText=", this.l, ", timerVisible=", sb, this.k);
        rw2.v(this.n, ", timerTargetMillis=", sb, this.m);
        sb.append(", bonusInfoButtonVisible=");
        sb.append(this.o);
        sb.append(", result=");
        sb.append(this.p);
        esw0.k(sb, ", prizes=", this.q, ", networkAvailable=", this.r);
        w6x.A(", isAwaitingSpinResponse=", ", isWheelSpinning=", sb, this.s, this.t);
        sb.append(", clickedBonus=");
        sb.append(this.u);
        sb.append(", spinType=");
        sb.append(this.v);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
