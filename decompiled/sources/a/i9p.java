package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14397a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final List h;
    public final List i;
    public final mdm j;
    public final mdm k;
    public final mdm l;
    public final boolean m;

    public i9p(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list, List list2, List list3, mdm mdmVar, mdm mdmVar2, mdm mdmVar3, boolean z7) {
        b1j.B(list, list2, list3);
        this.f14397a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = list;
        this.h = list2;
        this.i = list3;
        this.j = mdmVar;
        this.k = mdmVar2;
        this.l = mdmVar3;
        this.m = z7;
    }

    public static i9p a(i9p i9pVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList arrayList, List list, List list2, boolean z6, int i) {
        boolean z7 = (i & 1) != 0 ? i9pVar.f14397a : false;
        boolean z8 = (i & 2) != 0 ? i9pVar.b : z;
        boolean z9 = (i & 4) != 0 ? i9pVar.c : z2;
        boolean z10 = (i & 8) != 0 ? i9pVar.d : z3;
        boolean z11 = (i & 16) != 0 ? i9pVar.e : z4;
        boolean z12 = (i & 32) != 0 ? i9pVar.f : z5;
        List list3 = (i & 64) != 0 ? i9pVar.g : arrayList;
        List list4 = (i & 128) != 0 ? i9pVar.h : list;
        List list5 = (i & 256) != 0 ? i9pVar.i : list2;
        mdm mdmVar = i9pVar.j;
        mdm mdmVar2 = i9pVar.k;
        mdm mdmVar3 = i9pVar.l;
        boolean z13 = (i & 4096) != 0 ? i9pVar.m : z6;
        i9pVar.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        return new i9p(z7, z8, z9, z10, z11, z12, list3, list4, list5, mdmVar, mdmVar2, mdmVar3, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9p)) {
            return false;
        }
        i9p i9pVar = (i9p) obj;
        return this.f14397a == i9pVar.f14397a && this.b == i9pVar.b && this.c == i9pVar.c && this.d == i9pVar.d && this.e == i9pVar.e && this.f == i9pVar.f && Intrinsics.d(this.g, i9pVar.g) && Intrinsics.d(this.h, i9pVar.h) && Intrinsics.d(this.i, i9pVar.i) && this.j.equals(i9pVar.j) && this.k.equals(i9pVar.k) && this.l.equals(i9pVar.l) && this.m == i9pVar.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + f140.d(this.l, f140.d(this.k, f140.d(this.j, dw9.a(dw9.a(dw9.a(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f14397a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("FavoriteGamesState(showShimmers=", ", refreshing=", ", scrollTop=", this.f14397a, this.b);
        ua80.u(", authorized=", ", showConnectionError=", sbQ, this.c, this.d);
        ua80.u(", showDataError=", ", defaultGames=", sbQ, this.e, this.f);
        b1j.y(", allGames=", ", favoriteGames=", sbQ, this.g, this.h);
        sbQ.append(this.i);
        sbQ.append(", lottieConfigConnectionError=");
        sbQ.append(this.j);
        sbQ.append(", lottieConfigEmptyWithGames=");
        sbQ.append(this.k);
        sbQ.append(", lottieConfigDataError=");
        sbQ.append(this.l);
        sbQ.append(", connected=");
        return rw2.p(sbQ, this.m, Separators.RPAREN);
    }
}
