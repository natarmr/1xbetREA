package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ce2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4192a;
    public final boolean b;
    public final hie c;
    public final v5l0 d;
    public final h8l0 e;
    public final zvh0 f;
    public final int g;
    public final boolean h;
    public final List i;
    public final y78 j;
    public final wcb k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public ce2(String str, boolean z, hie hieVar, v5l0 v5l0Var, h8l0 h8l0Var, zvh0 zvh0Var, int i, boolean z2, List list, y78 y78Var, wcb wcbVar, boolean z3, boolean z4, boolean z5) {
        list.getClass();
        this.f4192a = str;
        this.b = z;
        this.c = hieVar;
        this.d = v5l0Var;
        this.e = h8l0Var;
        this.f = zvh0Var;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = y78Var;
        this.k = wcbVar;
        this.l = z3;
        this.m = z4;
        this.n = z5;
    }

    public static ce2 a(ce2 ce2Var, String str, boolean z, hie hieVar, int i, boolean z2, List list, wcb wcbVar, boolean z3, boolean z4, int i2) {
        String str2 = (i2 & 1) != 0 ? ce2Var.f4192a : str;
        boolean z5 = (i2 & 2) != 0 ? ce2Var.b : z;
        hie hieVar2 = (i2 & 4) != 0 ? ce2Var.c : hieVar;
        v5l0 v5l0Var = ce2Var.d;
        h8l0 h8l0Var = ce2Var.e;
        zvh0 zvh0Var = ce2Var.f;
        int i3 = (i2 & 64) != 0 ? ce2Var.g : i;
        boolean z6 = (i2 & 128) != 0 ? ce2Var.h : z2;
        List list2 = (i2 & 256) != 0 ? ce2Var.i : list;
        y78 y78Var = ce2Var.j;
        wcb wcbVar2 = (i2 & 1024) != 0 ? ce2Var.k : wcbVar;
        boolean z7 = (i2 & 2048) != 0 ? ce2Var.l : z3;
        boolean z8 = (i2 & 4096) != 0 ? ce2Var.m : z4;
        boolean z9 = ce2Var.n;
        ce2Var.getClass();
        hieVar2.getClass();
        list2.getClass();
        return new ce2(str2, z5, hieVar2, v5l0Var, h8l0Var, zvh0Var, i3, z6, list2, y78Var, wcbVar2, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce2)) {
            return false;
        }
        ce2 ce2Var = (ce2) obj;
        return this.f4192a.equals(ce2Var.f4192a) && this.b == ce2Var.b && this.c.equals(ce2Var.c) && this.d == ce2Var.d && this.e == ce2Var.e && this.f == ce2Var.f && this.g == ce2Var.g && this.h == ce2Var.h && Intrinsics.d(this.i, ce2Var.i) && this.j.equals(ce2Var.j) && Intrinsics.d(this.k, ce2Var.k) && this.l == ce2Var.l && this.m == ce2Var.m && this.n == ce2Var.n;
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() + dw9.a(brm0.e(twn.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + axq.c(this.d, (this.c.hashCode() + brm0.e(this.f4192a.hashCode() * 31, 31, this.b)) * 31, 31)) * 31)) * 31, 31), 31, this.h), 31, this.i)) * 31;
        wcb wcbVar = this.k;
        return Boolean.hashCode(this.n) + brm0.e(brm0.e((iHashCode + (wcbVar == null ? 0 : wcbVar.hashCode())) * 31, 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("AltResultLiveGamesState(query=", this.f4192a, ", refresh=", this.b, ", contentState=");
        sbU.append(this.c);
        sbU.append(", sportEventCardStyle=");
        sbU.append(this.d);
        sbU.append(", sportFeedHeaderStyle=");
        sbU.append(this.e);
        sbU.append(", segmentControlStyleModel=");
        sbU.append(this.f);
        sbU.append(", lottieType=");
        brm0.w(this.g, ", isSearchActive=", ", specialEventList=", sbU, this.h);
        sbU.append(this.i);
        sbU.append(", gameUtilsProvider=");
        sbU.append(this.j);
        sbU.append(", champImagesHolder=");
        sbU.append(this.k);
        sbU.append(", isBettingDisabled=");
        sbU.append(this.l);
        sbU.append(", hasStream=");
        return ohs0.p(", supportRtl=", Separators.RPAREN, sbU, this.m, this.n);
    }
}
