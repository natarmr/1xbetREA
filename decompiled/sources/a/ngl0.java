package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feed.linelive.presentation.feeds.child.sports.models.SportItemsSelectionState;

/* JADX INFO: loaded from: classes4.dex */
public final class ngl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23492a;
    public final List b;
    public final String c;
    public final mgl0 d;
    public final j700 e;
    public final SportItemsSelectionState f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final boolean m;

    public ngl0(List list, List list2, String str, mgl0 mgl0Var, j700 j700Var, SportItemsSelectionState sportItemsSelectionState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, boolean z6) {
        list.getClass();
        list2.getClass();
        str2.getClass();
        this.f23492a = list;
        this.b = list2;
        this.c = str;
        this.d = mgl0Var;
        this.e = j700Var;
        this.f = sportItemsSelectionState;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = str2;
        this.m = z6;
    }

    public static ngl0 a(ngl0 ngl0Var, List list, List list2, String str, mgl0 mgl0Var, SportItemsSelectionState sportItemsSelectionState, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        List list3 = (i & 1) != 0 ? ngl0Var.f23492a : list;
        List list4 = (i & 2) != 0 ? ngl0Var.b : list2;
        String str2 = (i & 4) != 0 ? ngl0Var.c : str;
        mgl0 mgl0Var2 = (i & 8) != 0 ? ngl0Var.d : mgl0Var;
        j700 j700Var = ngl0Var.e;
        SportItemsSelectionState sportItemsSelectionState2 = (i & 32) != 0 ? ngl0Var.f : sportItemsSelectionState;
        boolean z5 = (i & 64) != 0 ? ngl0Var.g : z;
        boolean z6 = (i & 128) != 0 ? ngl0Var.h : false;
        boolean z7 = (i & 256) != 0 ? ngl0Var.i : z2;
        boolean z8 = (i & 512) != 0 ? ngl0Var.j : z3;
        boolean z9 = (i & 1024) != 0 ? ngl0Var.k : false;
        String str3 = ngl0Var.l;
        boolean z10 = (i & 4096) != 0 ? ngl0Var.m : z4;
        ngl0Var.getClass();
        list3.getClass();
        list4.getClass();
        str2.getClass();
        str3.getClass();
        return new ngl0(list3, list4, str2, mgl0Var2, j700Var, sportItemsSelectionState2, z5, z6, z7, z8, z9, str3, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngl0)) {
            return false;
        }
        ngl0 ngl0Var = (ngl0) obj;
        return Intrinsics.d(this.f23492a, ngl0Var.f23492a) && Intrinsics.d(this.b, ngl0Var.b) && this.c.equals(ngl0Var.c) && Intrinsics.d(this.d, ngl0Var.d) && this.e == ngl0Var.e && this.f.equals(ngl0Var.f) && this.g == ngl0Var.g && this.h == ngl0Var.h && this.i == ngl0Var.i && this.j == ngl0Var.j && this.k == ngl0Var.k && Intrinsics.d(this.l, ngl0Var.l) && this.m == ngl0Var.m;
    }

    public final int hashCode() {
        int iB = ua80.b(dw9.a(this.f23492a.hashCode() * 31, 31, this.b), 31, this.c);
        mgl0 mgl0Var = this.d;
        return Boolean.hashCode(this.m) + ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((this.f.hashCode() + ((this.e.hashCode() + ((iB + (mgl0Var == null ? 0 : mgl0Var.hashCode())) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("SportItemsState(sportModelItems=", ", allSportItems=", this.f23492a, ", query=", this.b);
        sbT.append(this.c);
        sbT.append(", config=");
        sbT.append(this.d);
        sbT.append(", screenType=");
        sbT.append(this.e);
        sbT.append(", selection=");
        sbT.append(this.f);
        sbT.append(", showRefreshing=");
        ua80.u(", showShimmers=", ", scrollToTop=", sbT, this.g, this.h);
        ua80.u(", showConnectionError=", ", showLoadingError=", sbT, this.i, this.j);
        f140.s(", subtitleText=", this.l, ", showSelectionButton=", sbT, this.k);
        return rw2.p(sbT, this.m, Separators.RPAREN);
    }
}
