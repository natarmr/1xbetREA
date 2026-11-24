package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ufb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35570a;
    public final boolean b;
    public final boolean c;
    public final seb0 d;
    public final boolean e;
    public final lq5 f;
    public final List g;
    public final List h;
    public final hfe i;
    public final hfe j;
    public final hfe k;
    public final hfe l;

    public ufb0(String str, boolean z, boolean z2, seb0 seb0Var, boolean z3, lq5 lq5Var, List list, List list2, hfe hfeVar, hfe hfeVar2, hfe hfeVar3, hfe hfeVar4) {
        list.getClass();
        this.f35570a = str;
        this.b = z;
        this.c = z2;
        this.d = seb0Var;
        this.e = z3;
        this.f = lq5Var;
        this.g = list;
        this.h = list2;
        this.i = hfeVar;
        this.j = hfeVar2;
        this.k = hfeVar3;
        this.l = hfeVar4;
    }

    public static ufb0 a(ufb0 ufb0Var, String str, boolean z, boolean z2, seb0 seb0Var, boolean z3, lq5 lq5Var, List list, hfe hfeVar, hfe hfeVar2, hfe hfeVar3, hfe hfeVar4, int i) {
        if ((i & 1) != 0) {
            str = ufb0Var.f35570a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = ufb0Var.b;
        }
        boolean z4 = z;
        boolean z5 = (i & 4) != 0 ? ufb0Var.c : z2;
        seb0 seb0Var2 = (i & 8) != 0 ? ufb0Var.d : seb0Var;
        boolean z6 = (i & 16) != 0 ? ufb0Var.e : z3;
        lq5 lq5Var2 = (i & 32) != 0 ? ufb0Var.f : lq5Var;
        List list2 = (i & 64) != 0 ? ufb0Var.g : list;
        List list3 = ufb0Var.h;
        hfe hfeVar5 = (i & 256) != 0 ? ufb0Var.i : hfeVar;
        hfe hfeVar6 = (i & 512) != 0 ? ufb0Var.j : hfeVar2;
        hfe hfeVar7 = (i & 1024) != 0 ? ufb0Var.k : hfeVar3;
        hfe hfeVar8 = (i & 2048) != 0 ? ufb0Var.l : hfeVar4;
        ufb0Var.getClass();
        list2.getClass();
        hfeVar7.getClass();
        return new ufb0(str2, z4, z5, seb0Var2, z6, lq5Var2, list2, list3, hfeVar5, hfeVar6, hfeVar7, hfeVar8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufb0)) {
            return false;
        }
        ufb0 ufb0Var = (ufb0) obj;
        return this.f35570a.equals(ufb0Var.f35570a) && this.b == ufb0Var.b && this.c == ufb0Var.c && this.d == ufb0Var.d && this.e == ufb0Var.e && this.f.equals(ufb0Var.f) && Intrinsics.d(this.g, ufb0Var.g) && this.h.equals(ufb0Var.h) && this.i.equals(ufb0Var.i) && this.j.equals(ufb0Var.j) && this.k.equals(ufb0Var.k) && this.l.equals(ufb0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + dw9.a(dw9.a((this.f.hashCode() + brm0.e((this.d.hashCode() + brm0.e(brm0.e(this.f35570a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("PopularOneXGamesState(screenName=", this.f35570a, ", connected=", this.b, ", authorized=");
        sbU.append(this.c);
        sbU.append(", error=");
        sbU.append(this.d);
        sbU.append(", bannersEnable=");
        sbU.append(this.e);
        sbU.append(", bannersStyle=");
        sbU.append(this.f);
        sbU.append(", contentOrder=");
        b1j.y(", defaultContentOrder=", ", bannersContentLoadingState=", sbU, this.g, this.h);
        sbU.append(this.i);
        sbU.append(", categoriesContentLoadingState=");
        sbU.append(this.j);
        sbU.append(", jackpotContentLoadingState=");
        sbU.append(this.k);
        sbU.append(", luckyWheelContentLoadingState=");
        sbU.append(this.l);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
