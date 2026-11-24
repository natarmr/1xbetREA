package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c270 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3611a;
    public final String b;
    public final d270 c;
    public final boolean d;
    public final boolean e;
    public final m170 f;
    public final k170 g;
    public final List h;

    public c270(String str, String str2, d270 d270Var, boolean z, boolean z2, m170 m170Var, k170 k170Var, List list) {
        list.getClass();
        this.f3611a = str;
        this.b = str2;
        this.c = d270Var;
        this.d = z;
        this.e = z2;
        this.f = m170Var;
        this.g = k170Var;
        this.h = list;
    }

    public static c270 a(c270 c270Var, String str, String str2, d270 d270Var, boolean z, boolean z2, m170 m170Var, k170 k170Var, List list, int i) {
        if ((i & 1) != 0) {
            str = c270Var.f3611a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = c270Var.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            d270Var = c270Var.c;
        }
        d270 d270Var2 = d270Var;
        if ((i & 8) != 0) {
            z = c270Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = c270Var.e;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            m170Var = c270Var.f;
        }
        m170 m170Var2 = m170Var;
        k170 k170Var2 = (i & 64) != 0 ? c270Var.g : k170Var;
        List list2 = (i & 128) != 0 ? c270Var.h : list;
        c270Var.getClass();
        list2.getClass();
        return new c270(str3, str4, d270Var2, z3, z4, m170Var2, k170Var2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c270)) {
            return false;
        }
        c270 c270Var = (c270) obj;
        return this.f3611a.equals(c270Var.f3611a) && this.b.equals(c270Var.b) && this.c == c270Var.c && this.d == c270Var.d && this.e == c270Var.e && this.f == c270Var.f && this.g.equals(c270Var.g) && Intrinsics.d(this.h, c270Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + brm0.e(brm0.e((this.c.hashCode() + ua80.b(this.f3611a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OneXGamesPromoState(screenName=", this.f3611a, ", umResultKey=", this.b, ", deepLinkPromoType=");
        sbN.append(this.c);
        sbN.append(", connected=");
        sbN.append(this.d);
        sbN.append(", loading=");
        sbN.append(this.e);
        sbN.append(", error=");
        sbN.append(this.f);
        sbN.append(", balance=");
        sbN.append(this.g);
        sbN.append(", promoItems=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
