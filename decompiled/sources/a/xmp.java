package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;

/* JADX INFO: loaded from: classes4.dex */
public final class xmp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jnb f41139a;
    public final rlp b;
    public final String c;
    public final Set d;
    public final FeedsChampsItemsSelectionState e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final String j;
    public final boolean k;
    public final j700 l;
    public final zmb m;
    public final boolean n;

    public xmp(jnb jnbVar, rlp rlpVar, String str, Set set, FeedsChampsItemsSelectionState feedsChampsItemsSelectionState, boolean z, boolean z2, boolean z3, List list, String str2, boolean z4, j700 j700Var, zmb zmbVar, boolean z5) {
        set.getClass();
        list.getClass();
        str2.getClass();
        j700Var.getClass();
        this.f41139a = jnbVar;
        this.b = rlpVar;
        this.c = str;
        this.d = set;
        this.e = feedsChampsItemsSelectionState;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = list;
        this.j = str2;
        this.k = z4;
        this.l = j700Var;
        this.m = zmbVar;
        this.n = z5;
    }

    public static xmp a(xmp xmpVar, jnb jnbVar, rlp rlpVar, String str, LinkedHashSet linkedHashSet, FeedsChampsItemsSelectionState feedsChampsItemsSelectionState, boolean z, boolean z2, List list, boolean z3, zmb zmbVar, boolean z4, int i) {
        jnb jnbVar2 = (i & 1) != 0 ? xmpVar.f41139a : jnbVar;
        rlp rlpVar2 = (i & 2) != 0 ? xmpVar.b : rlpVar;
        String str2 = (i & 4) != 0 ? xmpVar.c : str;
        Set set = (i & 8) != 0 ? xmpVar.d : linkedHashSet;
        FeedsChampsItemsSelectionState feedsChampsItemsSelectionState2 = (i & 16) != 0 ? xmpVar.e : feedsChampsItemsSelectionState;
        boolean z5 = (i & 32) != 0 ? xmpVar.f : z;
        boolean z6 = (i & 64) != 0 ? xmpVar.g : false;
        boolean z7 = (i & 128) != 0 ? xmpVar.h : z2;
        List list2 = (i & 256) != 0 ? xmpVar.i : list;
        String str3 = xmpVar.j;
        boolean z8 = (i & 1024) != 0 ? xmpVar.k : z3;
        j700 j700Var = xmpVar.l;
        zmb zmbVar2 = (i & 4096) != 0 ? xmpVar.m : zmbVar;
        boolean z9 = (i & 8192) != 0 ? xmpVar.n : z4;
        xmpVar.getClass();
        str2.getClass();
        set.getClass();
        list2.getClass();
        str3.getClass();
        j700Var.getClass();
        zmbVar2.getClass();
        return new xmp(jnbVar2, rlpVar2, str2, set, feedsChampsItemsSelectionState2, z5, z6, z7, list2, str3, z8, j700Var, zmbVar2, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmp)) {
            return false;
        }
        xmp xmpVar = (xmp) obj;
        return this.f41139a.equals(xmpVar.f41139a) && Intrinsics.d(this.b, xmpVar.b) && this.c.equals(xmpVar.c) && Intrinsics.d(this.d, xmpVar.d) && this.e.equals(xmpVar.e) && this.f == xmpVar.f && this.g == xmpVar.g && this.h == xmpVar.h && Intrinsics.d(this.i, xmpVar.i) && Intrinsics.d(this.j, xmpVar.j) && this.k == xmpVar.k && this.l == xmpVar.l && this.m == xmpVar.m && this.n == xmpVar.n;
    }

    public final int hashCode() {
        int iHashCode = this.f41139a.hashCode() * 31;
        rlp rlpVar = this.b;
        return Boolean.hashCode(this.n) + ((this.m.hashCode() + ((this.l.hashCode() + brm0.e(ua80.b(dw9.a(brm0.e(brm0.e(brm0.e((this.e.hashCode() + ohs0.g(this.d, ua80.b((iHashCode + (rlpVar == null ? 0 : rlpVar.hashCode())) * 31, 31, this.c), 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedsChampsItemsState(champsWithLiveTabs=");
        sb.append(this.f41139a);
        sb.append(", config=");
        sb.append(this.b);
        sb.append(", query=");
        sb.append(this.c);
        sb.append(", expandedIds=");
        sb.append(this.d);
        sb.append(", selection=");
        sb.append(this.e);
        sb.append(", showRefreshing=");
        sb.append(this.f);
        sb.append(", showShimmers=");
        ua80.u(", showConnectionError=", ", expandedGamesIds=", sb, this.g, this.h);
        h97.y(", subtitleText=", this.j, ", showSelectionButton=", sb, this.i);
        sb.append(this.k);
        sb.append(", screenType=");
        sb.append(this.l);
        sb.append(", champSortType=");
        sb.append(this.m);
        sb.append(", scrollToTop=");
        sb.append(this.n);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
