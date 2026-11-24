package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gsp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eme f11841a;
    public final hdm0 b;
    public final nc5 c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public gsp0(eme emeVar, hdm0 hdm0Var, nc5 nc5Var, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        this.f11841a = emeVar;
        this.b = hdm0Var;
        this.c = nc5Var;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public static gsp0 a(gsp0 gsp0Var, eme emeVar, hdm0 hdm0Var, nc5 nc5Var, List list, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            emeVar = gsp0Var.f11841a;
        }
        eme emeVar2 = emeVar;
        if ((i & 2) != 0) {
            hdm0Var = gsp0Var.b;
        }
        hdm0 hdm0Var2 = hdm0Var;
        if ((i & 4) != 0) {
            nc5Var = gsp0Var.c;
        }
        nc5 nc5Var2 = nc5Var;
        if ((i & 8) != 0) {
            list = gsp0Var.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = gsp0Var.e;
        }
        boolean z5 = z;
        if ((i & 32) != 0) {
            z2 = gsp0Var.f;
        }
        boolean z6 = z2;
        boolean z7 = (i & 64) != 0 ? gsp0Var.g : z3;
        boolean z8 = (i & 128) != 0 ? gsp0Var.h : z4;
        gsp0Var.getClass();
        hdm0Var2.getClass();
        list2.getClass();
        return new gsp0(emeVar2, hdm0Var2, nc5Var2, list2, z5, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsp0)) {
            return false;
        }
        gsp0 gsp0Var = (gsp0) obj;
        return this.f11841a == gsp0Var.f11841a && this.b.equals(gsp0Var.b) && this.c.equals(gsp0Var.c) && Intrinsics.d(this.d, gsp0Var.d) && this.e == gsp0Var.e && this.f == gsp0Var.f && this.g == gsp0Var.g && this.h == gsp0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.e(dw9.a((this.c.hashCode() + ((this.b.hashCode() + (this.f11841a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamsStatisticMenuState(coreHeaderModel=");
        sb.append(this.f11841a);
        sb.append(", statisticHeaderModel=");
        sb.append(this.b);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.c);
        sb.append(", menuList=");
        sb.append(this.d);
        sb.append(", isLoading=");
        ua80.u(", isError=", ", isEmpty=", sb, this.e, this.f);
        return ohs0.p(", isLive=", Separators.RPAREN, sb, this.g, this.h);
    }
}
