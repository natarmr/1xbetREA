package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class inn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4f f15082a;
    public final boolean b;
    public final List c;
    public final int d;
    public final xte e;
    public final rse f;
    public final amn g;
    public final v0f h;
    public final nnn i;
    public final boolean j;
    public final boolean k;
    public final en7 l;
    public final long m;
    public final boolean n;
    public final boolean o;

    public inn(q4f q4fVar, boolean z, List list, int i, xte xteVar, rse rseVar, amn amnVar, v0f v0fVar, nnn nnnVar, boolean z2, boolean z3, en7 en7Var, long j, boolean z4, boolean z5) {
        list.getClass();
        this.f15082a = q4fVar;
        this.b = z;
        this.c = list;
        this.d = i;
        this.e = xteVar;
        this.f = rseVar;
        this.g = amnVar;
        this.h = v0fVar;
        this.i = nnnVar;
        this.j = z2;
        this.k = z3;
        this.l = en7Var;
        this.m = j;
        this.n = z4;
        this.o = z5;
    }

    public static inn a(inn innVar, q4f q4fVar, boolean z, List list, amn amnVar, v0f v0fVar, nnn nnnVar, boolean z2, boolean z3, en7 en7Var, long j, boolean z4, int i) {
        q4f q4fVar2 = (i & 1) != 0 ? innVar.f15082a : q4fVar;
        boolean z5 = (i & 2) != 0 ? innVar.b : z;
        List list2 = (i & 4) != 0 ? innVar.c : list;
        int i2 = innVar.d;
        xte xteVar = innVar.e;
        rse rseVar = innVar.f;
        amn amnVar2 = (i & 64) != 0 ? innVar.g : amnVar;
        v0f v0fVar2 = (i & 128) != 0 ? innVar.h : v0fVar;
        nnn nnnVar2 = (i & 256) != 0 ? innVar.i : nnnVar;
        boolean z6 = (i & 512) != 0 ? innVar.j : z2;
        boolean z7 = (i & 1024) != 0 ? innVar.k : z3;
        en7 en7Var2 = (i & 2048) != 0 ? innVar.l : en7Var;
        long j2 = (i & 4096) != 0 ? innVar.m : j;
        boolean z8 = (i & 8192) != 0 ? innVar.n : z4;
        boolean z9 = innVar.o;
        innVar.getClass();
        q4fVar2.getClass();
        list2.getClass();
        v0fVar2.getClass();
        en7Var2.getClass();
        return new inn(q4fVar2, z5, list2, i2, xteVar, rseVar, amnVar2, v0fVar2, nnnVar2, z6, z7, en7Var2, j2, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inn)) {
            return false;
        }
        inn innVar = (inn) obj;
        return this.f15082a == innVar.f15082a && this.b == innVar.b && Intrinsics.d(this.c, innVar.c) && this.d == innVar.d && this.e == innVar.e && this.f == innVar.f && this.g.equals(innVar.g) && this.h.equals(innVar.h) && this.i.equals(innVar.i) && this.j == innVar.j && this.k == innVar.k && this.l.equals(innVar.l) && this.m == innVar.m && this.n == innVar.n && this.o == innVar.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + brm0.e(rw2.b((this.l.hashCode() + brm0.e(brm0.e((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + twn.a(this.d, dw9.a(brm0.e(this.f15082a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditCouponState(selectedCouponType=");
        sb.append(this.f15082a);
        sb.append(", canSelectCouponType=");
        sb.append(this.b);
        sb.append(", availableCouponTypesList=");
        brm0.v(this.d, ", lottieAnimationTypeId=", ", couponCardStyleType=", sb, this.c);
        sb.append(this.e);
        sb.append(", separatorStyleType=");
        sb.append(this.f);
        sb.append(", editCouponEventsState=");
        sb.append(this.g);
        sb.append(", couponParamsModel=");
        sb.append(this.h);
        sb.append(", taxState=");
        sb.append(this.i);
        sb.append(", canSaveCouponEdits=");
        sb.append(this.j);
        sb.append(", isAccountWithTax=");
        sb.append(this.k);
        sb.append(", selectedBetSystemModel=");
        sb.append(this.l);
        sb.append(", eventGameIdForDeletion=");
        hne.t(this.m, ", showLoader=", sb, this.n);
        return f140.n(sb, ", isCouponCardRtlSupportEnabled=", this.o, Separators.RPAREN);
    }
}
