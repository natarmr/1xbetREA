package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18473a;
    public final boolean b;
    public final w3t c;
    public final je8 d;
    public final csr e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final List i;
    public final boolean j;
    public final List k;
    public final ql5 l;
    public final boolean m;
    public final kg n;
    public final boolean o;
    public final boolean p;

    public kl8(boolean z, boolean z2, w3t w3tVar, je8 je8Var, csr csrVar, boolean z3, boolean z4, List list, List list2, boolean z5, List list3, ql5 ql5Var, boolean z6, kg kgVar, boolean z7, boolean z8) {
        csrVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f18473a = z;
        this.b = z2;
        this.c = w3tVar;
        this.d = je8Var;
        this.e = csrVar;
        this.f = z3;
        this.g = z4;
        this.h = list;
        this.i = list2;
        this.j = z5;
        this.k = list3;
        this.l = ql5Var;
        this.m = z6;
        this.n = kgVar;
        this.o = z7;
        this.p = z8;
    }

    public static kl8 a(kl8 kl8Var, boolean z, w3t w3tVar, je8 je8Var, csr csrVar, boolean z2, boolean z3, List list, ArrayList arrayList, boolean z4, List list2, ql5 ql5Var, boolean z5, boolean z6, int i) {
        boolean z7 = kl8Var.f18473a;
        boolean z8 = (i & 2) != 0 ? kl8Var.b : z;
        w3t w3tVar2 = (i & 4) != 0 ? kl8Var.c : w3tVar;
        je8 je8Var2 = (i & 8) != 0 ? kl8Var.d : je8Var;
        csr csrVar2 = (i & 16) != 0 ? kl8Var.e : csrVar;
        boolean z9 = (i & 32) != 0 ? kl8Var.f : z2;
        boolean z10 = (i & 64) != 0 ? kl8Var.g : z3;
        List list3 = (i & 128) != 0 ? kl8Var.h : list;
        List list4 = (i & 256) != 0 ? kl8Var.i : arrayList;
        boolean z11 = (i & 512) != 0 ? kl8Var.j : z4;
        List list5 = (i & 1024) != 0 ? kl8Var.k : list2;
        ql5 ql5Var2 = (i & 2048) != 0 ? kl8Var.l : ql5Var;
        boolean z12 = (i & 4096) != 0 ? kl8Var.m : z5;
        kg kgVar = kl8Var.n;
        boolean z13 = (i & 16384) != 0 ? kl8Var.o : z6;
        boolean z14 = kl8Var.p;
        kl8Var.getClass();
        je8Var2.getClass();
        csrVar2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        return new kl8(z7, z8, w3tVar2, je8Var2, csrVar2, z9, z10, list3, list4, z11, list5, ql5Var2, z12, kgVar, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl8)) {
            return false;
        }
        kl8 kl8Var = (kl8) obj;
        return this.f18473a == kl8Var.f18473a && this.b == kl8Var.b && this.c.equals(kl8Var.c) && this.d == kl8Var.d && Intrinsics.d(this.e, kl8Var.e) && this.f == kl8Var.f && this.g == kl8Var.g && Intrinsics.d(this.h, kl8Var.h) && Intrinsics.d(this.i, kl8Var.i) && this.j == kl8Var.j && Intrinsics.d(this.k, kl8Var.k) && this.l.equals(kl8Var.l) && this.m == kl8Var.m && this.n == kl8Var.n && this.o == kl8Var.o && this.p == kl8Var.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + brm0.e((this.n.hashCode() + brm0.e((this.l.hashCode() + dw9.a(brm0.e(dw9.a(dw9.a(brm0.e(brm0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + brm0.e(Boolean.hashCode(this.f18473a) * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m)) * 31, 31, this.o);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BonusesState(authorized=", ", connected=", ", sourceScreen=", this.f18473a, this.b);
        sbQ.append(this.c);
        sbQ.append(", activeFilter=");
        sbQ.append(this.d);
        sbQ.append(", clickedItem=");
        sbQ.append(this.e);
        sbQ.append(", loading=");
        sbQ.append(this.f);
        sbQ.append(", refreshing=");
        vqd.y(sbQ, ", filters=", this.h, ", bonuses=", this.g);
        rz4.z(sbQ, ", bonusGameAllowed=", this.i, ", craftingBonuses=", this.j);
        sbQ.append(this.k);
        sbQ.append(", balance=");
        sbQ.append(this.l);
        sbQ.append(", balanceLoading=");
        sbQ.append(this.m);
        sbQ.append(", accountSelectionStyle=");
        sbQ.append(this.n);
        sbQ.append(", error=");
        return ohs0.p(", hasGamesWildFreebet=", Separators.RPAREN, sbQ, this.o, this.p);
    }
}
