package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nj00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23613a;
    public final mj00 b;
    public final List c;
    public final ais d;
    public final Set e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public nj00(String str, mj00 mj00Var, List list, ais aisVar, Set set, boolean z, boolean z2, String str2, boolean z3) {
        str.getClass();
        list.getClass();
        set.getClass();
        this.f23613a = str;
        this.b = mj00Var;
        this.c = list;
        this.d = aisVar;
        this.e = set;
        this.f = z;
        this.g = z2;
        this.h = str2;
        this.i = z3;
    }

    public static nj00 a(nj00 nj00Var, String str, mj00 mj00Var, List list, ais aisVar, Set set, boolean z, String str2, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = nj00Var.f23613a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            mj00Var = nj00Var.b;
        }
        mj00 mj00Var2 = mj00Var;
        if ((i & 4) != 0) {
            list = nj00Var.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            aisVar = nj00Var.d;
        }
        ais aisVar2 = aisVar;
        if ((i & 16) != 0) {
            set = nj00Var.e;
        }
        Set set2 = set;
        boolean z3 = (i & 32) != 0 ? nj00Var.f : z;
        boolean z4 = (i & 64) != 0 ? nj00Var.g : false;
        String str4 = (i & 128) != 0 ? nj00Var.h : str2;
        boolean z5 = (i & 256) != 0 ? nj00Var.i : z2;
        nj00Var.getClass();
        str3.getClass();
        list2.getClass();
        set2.getClass();
        str4.getClass();
        return new nj00(str3, mj00Var2, list2, aisVar2, set2, z3, z4, str4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj00)) {
            return false;
        }
        nj00 nj00Var = (nj00) obj;
        return Intrinsics.d(this.f23613a, nj00Var.f23613a) && Intrinsics.d(this.b, nj00Var.b) && Intrinsics.d(this.c, nj00Var.c) && this.d == nj00Var.d && Intrinsics.d(this.e, nj00Var.e) && this.f == nj00Var.f && this.g == nj00Var.g && this.h.equals(nj00Var.h) && this.i == nj00Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.f23613a.hashCode() * 31;
        mj00 mj00Var = this.b;
        return Boolean.hashCode(this.i) + ua80.b(brm0.e(brm0.e(ohs0.g(this.e, (this.d.hashCode() + dw9.a((iHashCode + (mj00Var == null ? 0 : mj00Var.hashCode())) * 31, 31, this.c)) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveExpressesScreenState(headerTitle=");
        sb.append(this.f23613a);
        sb.append(", config=");
        sb.append(this.b);
        sb.append(", eventCardList=");
        sb.append(this.c);
        sb.append(", errorType=");
        sb.append(this.d);
        sb.append(", collapsedItems=");
        sb.append(this.e);
        sb.append(", isRefreshing=");
        sb.append(this.f);
        sb.append(", isLoading=");
        f140.s(", query=", this.h, ", isTablet=", sb, this.g);
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
