package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nsa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24043a;
    public final pn00 b;
    public final pn00 c;
    public final pn00 d;
    public final pn00 e;
    public final boolean f;
    public final bsa0 g;
    public final boolean h;
    public final List i;
    public final mdm j;

    public nsa0(boolean z, pn00 pn00Var, pn00 pn00Var2, pn00 pn00Var3, pn00 pn00Var4, boolean z2, bsa0 bsa0Var, boolean z3, List list, mdm mdmVar) {
        list.getClass();
        this.f24043a = z;
        this.b = pn00Var;
        this.c = pn00Var2;
        this.d = pn00Var3;
        this.e = pn00Var4;
        this.f = z2;
        this.g = bsa0Var;
        this.h = z3;
        this.i = list;
        this.j = mdmVar;
    }

    public static nsa0 a(nsa0 nsa0Var, pn00 pn00Var, pn00 pn00Var2, pn00 pn00Var3, boolean z, bsa0 bsa0Var, boolean z2, List list, int i) {
        boolean z3 = (i & 1) != 0 ? nsa0Var.f24043a : false;
        if ((i & 2) != 0) {
            pn00Var = nsa0Var.b;
        }
        pn00 pn00Var4 = pn00Var;
        if ((i & 4) != 0) {
            pn00Var2 = nsa0Var.c;
        }
        pn00 pn00Var5 = pn00Var2;
        pn00 pn00Var6 = nsa0Var.d;
        pn00 pn00Var7 = (i & 16) != 0 ? nsa0Var.e : pn00Var3;
        boolean z4 = (i & 32) != 0 ? nsa0Var.f : z;
        bsa0 bsa0Var2 = (i & 64) != 0 ? nsa0Var.g : bsa0Var;
        boolean z5 = (i & 128) != 0 ? nsa0Var.h : z2;
        List list2 = (i & 256) != 0 ? nsa0Var.i : list;
        mdm mdmVar = nsa0Var.j;
        nsa0Var.getClass();
        list2.getClass();
        return new nsa0(z3, pn00Var4, pn00Var5, pn00Var6, pn00Var7, z4, bsa0Var2, z5, list2, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsa0)) {
            return false;
        }
        nsa0 nsa0Var = (nsa0) obj;
        return this.f24043a == nsa0Var.f24043a && this.b.equals(nsa0Var.b) && this.c.equals(nsa0Var.c) && this.d.equals(nsa0Var.d) && this.e.equals(nsa0Var.e) && this.f == nsa0Var.f && Intrinsics.d(this.g, nsa0Var.g) && this.h == nsa0Var.h && Intrinsics.d(this.i, nsa0Var.i) && this.j.equals(nsa0Var.j);
    }

    public final int hashCode() {
        int iE = brm0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f24043a) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f);
        bsa0 bsa0Var = this.g;
        return this.j.hashCode() + dw9.a(brm0.e((iE + (bsa0Var == null ? 0 : bsa0Var.hashCode())) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "PolybetEventStateModel(initRequest=" + this.f24043a + ", gameDetailsState=" + this.b + ", eventsState=" + this.c + ", lineGamesState=" + this.d + ", rulesState=" + this.e + ", marketInfoExpand=" + this.f + ", config=" + this.g + ", quickBetActive=" + this.h + ", favoriteIds=" + this.i + ", errorConfig=" + this.j + Separators.RPAREN;
    }
}
