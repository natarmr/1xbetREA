package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualGameCategoryParams;

/* JADX INFO: loaded from: classes4.dex */
public final class upu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VirtualGameCategoryParams f36085a;
    public final sff0 b;
    public final j0g0 c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public upu0(VirtualGameCategoryParams virtualGameCategoryParams, sff0 sff0Var, j0g0 j0g0Var, List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f36085a = virtualGameCategoryParams;
        this.b = sff0Var;
        this.c = j0g0Var;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upu0)) {
            return false;
        }
        upu0 upu0Var = (upu0) obj;
        return this.f36085a.equals(upu0Var.f36085a) && this.b.equals(upu0Var.b) && Intrinsics.d(this.c, upu0Var.c) && Intrinsics.d(this.d, upu0Var.d) && this.e == upu0Var.e && this.f == upu0Var.f && this.g == upu0Var.g;
    }

    public final int hashCode() {
        int iC = cs0.c(this.b, this.f36085a.hashCode() * 31, 31);
        j0g0 j0g0Var = this.c;
        return Boolean.hashCode(this.g) + brm0.e(brm0.e(dw9.a((iC + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualGameCategoryMainStateModel(params=");
        sb.append(this.f36085a);
        sb.append(", remoteConfig=");
        sb.append(this.b);
        sb.append(", gameCategoryScenarioModel=");
        sb.append(this.c);
        sb.append(", specialEventList=");
        sb.append(this.d);
        sb.append(", tablet=");
        ua80.u(", bettingDisabled=", ", supportRtl=", sb, this.e, this.f);
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
