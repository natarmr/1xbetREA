package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1p f35803a;
    public final mlr b;
    public final boolean c;
    public final List d;
    public final long e;
    public final List f;
    public final List g;
    public final uhc0 h;
    public final List i;
    public final boolean j;

    public uk0(y1p y1pVar, mlr mlrVar, boolean z, List list, long j, List list2, List list3, uhc0 uhc0Var, List list4, boolean z2) {
        hne.C(list, list2, list3, list4);
        this.f35803a = y1pVar;
        this.b = mlrVar;
        this.c = z;
        this.d = list;
        this.e = j;
        this.f = list2;
        this.g = list3;
        this.h = uhc0Var;
        this.i = list4;
        this.j = z2;
    }

    public static uk0 a(uk0 uk0Var, mlr mlrVar, boolean z, List list, long j, ArrayList arrayList, ArrayList arrayList2, uhc0 uhc0Var, List list2, boolean z2, int i) {
        y1p y1pVar = y1p.POPULAR_NEW_TOP;
        if ((i & 1) != 0) {
            y1pVar = uk0Var.f35803a;
        }
        if ((i & 2) != 0) {
            mlrVar = uk0Var.b;
        }
        if ((i & 4) != 0) {
            z = uk0Var.c;
        }
        if ((i & 8) != 0) {
            list = uk0Var.d;
        }
        if ((i & 16) != 0) {
            j = uk0Var.e;
        }
        List list3 = arrayList;
        if ((i & 32) != 0) {
            list3 = uk0Var.f;
        }
        List list4 = arrayList2;
        if ((i & 64) != 0) {
            list4 = uk0Var.g;
        }
        if ((i & 128) != 0) {
            uhc0Var = uk0Var.h;
        }
        if ((i & 256) != 0) {
            list2 = uk0Var.i;
        }
        if ((i & 512) != 0) {
            z2 = uk0Var.j;
        }
        boolean z3 = z2;
        uk0Var.getClass();
        mlrVar.getClass();
        list.getClass();
        list3.getClass();
        list4.getClass();
        list2.getClass();
        List list5 = list2;
        uhc0 uhc0Var2 = uhc0Var;
        long j2 = j;
        List list6 = list;
        boolean z4 = z;
        mlr mlrVar2 = mlrVar;
        return new uk0(y1pVar, mlrVar2, z4, list6, j2, list3, list4, uhc0Var2, list5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk0)) {
            return false;
        }
        uk0 uk0Var = (uk0) obj;
        return this.f35803a == uk0Var.f35803a && this.b.equals(uk0Var.b) && this.c == uk0Var.c && Intrinsics.d(this.d, uk0Var.d) && this.e == uk0Var.e && Intrinsics.d(this.f, uk0Var.f) && Intrinsics.d(this.g, uk0Var.g) && Intrinsics.d(this.h, uk0Var.h) && Intrinsics.d(this.i, uk0Var.i) && this.j == uk0Var.j;
    }

    public final int hashCode() {
        int iA = dw9.a(dw9.a(rw2.b(dw9.a(brm0.e((this.b.hashCode() + (this.f35803a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        uhc0 uhc0Var = this.h;
        return Boolean.hashCode(this.j) + dw9.a((iA + (uhc0Var == null ? 0 : uhc0Var.hashCode())) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorDelegateState(fatmanScreenType=");
        sb.append(this.f35803a);
        sb.append(", game=");
        sb.append(this.b);
        sb.append(", isBrandsFullInfo=");
        vqd.y(sb, ", categoryList=", this.d, ", subCategoryId=", this.c);
        hne.x(sb, this.e, ", virtualGameList=", this.f);
        sb.append(", recommendedGamesList=");
        sb.append(this.g);
        sb.append(", promoGames=");
        sb.append(this.h);
        esw0.k(sb, ", tournaments=", this.i, ", isTimeExpired=", this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
