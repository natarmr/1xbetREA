package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bgs implements egs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9s f2571a;
    public final List b;
    public final List c;
    public final zvl0 d;
    public final p700 e;
    public final List f;
    public final boolean g;

    public bgs(l9s l9sVar, List list, List list2, zvl0 zvl0Var, p700 p700Var, List list3, boolean z) {
        this.f2571a = l9sVar;
        this.b = list;
        this.c = list2;
        this.d = zvl0Var;
        this.e = p700Var;
        this.f = list3;
        this.g = z;
    }

    public static bgs a(bgs bgsVar, l9s l9sVar, List list, List list2, zvl0 zvl0Var, p700 p700Var, List list3, boolean z, int i) {
        if ((i & 1) != 0) {
            l9sVar = bgsVar.f2571a;
        }
        l9s l9sVar2 = l9sVar;
        if ((i & 2) != 0) {
            list = bgsVar.b;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            list2 = bgsVar.c;
        }
        List list5 = list2;
        if ((i & 8) != 0) {
            zvl0Var = bgsVar.d;
        }
        zvl0 zvl0Var2 = zvl0Var;
        if ((i & 16) != 0) {
            p700Var = bgsVar.e;
        }
        p700 p700Var2 = p700Var;
        if ((i & 32) != 0) {
            list3 = bgsVar.f;
        }
        List list6 = list3;
        if ((i & 64) != 0) {
            z = bgsVar.g;
        }
        return new bgs(l9sVar2, list4, list5, zvl0Var2, p700Var2, list6, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgs)) {
            return false;
        }
        bgs bgsVar = (bgs) obj;
        return this.f2571a.equals(bgsVar.f2571a) && Intrinsics.d(this.b, bgsVar.b) && Intrinsics.d(this.c, bgsVar.c) && Intrinsics.d(this.d, bgsVar.d) && Intrinsics.d(this.e, bgsVar.e) && this.f.equals(bgsVar.f) && this.g == bgsVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.f2571a.hashCode() * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        zvl0 zvl0Var = this.d;
        int iHashCode4 = (iHashCode3 + (zvl0Var == null ? 0 : zvl0Var.hashCode())) * 31;
        p700 p700Var = this.e;
        return Boolean.hashCode(this.g) + dw9.a((iHashCode4 + (p700Var != null ? p700Var.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(gameDetailsModel=");
        sb.append(this.f2571a);
        sb.append(", matchReviewEventModelList=");
        sb.append(this.b);
        sb.append(", shortStatisticItemModelList=");
        sb.append(this.c);
        sb.append(", stadiumInfoModel=");
        sb.append(this.d);
        sb.append(", lineStatisticModel=");
        sb.append(this.e);
        sb.append(", sportModelList=");
        sb.append(this.f);
        sb.append(", show24=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
