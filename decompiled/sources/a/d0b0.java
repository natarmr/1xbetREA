package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xza0 f5260a;
    public final zza0 b;
    public final yza0 c;
    public final b0b0 d;
    public final Set e;
    public final c0b0 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final a0b0 k;
    public final boolean l;

    public d0b0(xza0 xza0Var, zza0 zza0Var, yza0 yza0Var, b0b0 b0b0Var, Set set, c0b0 c0b0Var, boolean z, boolean z2, boolean z3, boolean z4, a0b0 a0b0Var, boolean z5) {
        set.getClass();
        this.f5260a = xza0Var;
        this.b = zza0Var;
        this.c = yza0Var;
        this.d = b0b0Var;
        this.e = set;
        this.f = c0b0Var;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = a0b0Var;
        this.l = z5;
    }

    public static d0b0 a(d0b0 d0b0Var, xza0 xza0Var, zza0 zza0Var, yza0 yza0Var, b0b0 b0b0Var, Set set, boolean z, boolean z2, boolean z3, boolean z4, a0b0 a0b0Var, boolean z5, int i) {
        if ((i & 1) != 0) {
            xza0Var = d0b0Var.f5260a;
        }
        xza0 xza0Var2 = xza0Var;
        if ((i & 2) != 0) {
            zza0Var = d0b0Var.b;
        }
        zza0 zza0Var2 = zza0Var;
        yza0 yza0Var2 = (i & 4) != 0 ? d0b0Var.c : yza0Var;
        b0b0 b0b0Var2 = (i & 8) != 0 ? d0b0Var.d : b0b0Var;
        Set set2 = (i & 16) != 0 ? d0b0Var.e : set;
        c0b0 c0b0Var = d0b0Var.f;
        boolean z6 = (i & 64) != 0 ? d0b0Var.g : z;
        boolean z7 = (i & 128) != 0 ? d0b0Var.h : z2;
        boolean z8 = (i & 256) != 0 ? d0b0Var.i : z3;
        boolean z9 = (i & 512) != 0 ? d0b0Var.j : z4;
        a0b0 a0b0Var2 = (i & 1024) != 0 ? d0b0Var.k : a0b0Var;
        boolean z10 = (i & 2048) != 0 ? d0b0Var.l : z5;
        d0b0Var.getClass();
        set2.getClass();
        return new d0b0(xza0Var2, zza0Var2, yza0Var2, b0b0Var2, set2, c0b0Var, z6, z7, z8, z9, a0b0Var2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0b0)) {
            return false;
        }
        d0b0 d0b0Var = (d0b0) obj;
        return this.f5260a.equals(d0b0Var.f5260a) && this.b.equals(d0b0Var.b) && this.c.equals(d0b0Var.c) && this.d.equals(d0b0Var.d) && Intrinsics.d(this.e, d0b0Var.e) && this.f.equals(d0b0Var.f) && this.g == d0b0Var.g && this.h == d0b0Var.h && this.i == d0b0Var.i && this.j == d0b0Var.j && Intrinsics.d(this.k, d0b0Var.k) && this.l == d0b0Var.l;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e((this.f.hashCode() + ohs0.g(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f5260a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        a0b0 a0b0Var = this.k;
        return Boolean.hashCode(this.l) + ((iE + (a0b0Var == null ? 0 : a0b0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopularAggregatorState(bannersState=");
        sb.append(this.f5260a);
        sb.append(", categorizedGamesState=");
        sb.append(this.b);
        sb.append(", categoriesState=");
        sb.append(this.c);
        sb.append(", promoEntitiesState=");
        sb.append(this.d);
        sb.append(", favoriteGamesIds=");
        sb.append(this.e);
        sb.append(", settings=");
        sb.append(this.f);
        sb.append(", isAuthorized=");
        ua80.u(", lastConnection=", ", isCountryBlocking=", sb, this.g, this.h);
        ua80.u(", isDarkTheme=", ", gameToOpen=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", cancelImmediateOnboarding=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
