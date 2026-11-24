package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;

/* JADX INFO: loaded from: classes4.dex */
public final class dfg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberChampParams f5999a;
    public final sff0 b;
    public final j0g0 c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public dfg(CyberChampParams cyberChampParams, sff0 sff0Var, j0g0 j0g0Var, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        this.f5999a = cyberChampParams;
        this.b = sff0Var;
        this.c = j0g0Var;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public static dfg a(dfg dfgVar, j0g0 j0g0Var, boolean z, boolean z2, int i) {
        CyberChampParams cyberChampParams = dfgVar.f5999a;
        sff0 sff0Var = dfgVar.b;
        if ((i & 4) != 0) {
            j0g0Var = dfgVar.c;
        }
        j0g0 j0g0Var2 = j0g0Var;
        List list = dfgVar.d;
        boolean z3 = dfgVar.e;
        if ((i & 32) != 0) {
            z = dfgVar.f;
        }
        boolean z4 = z;
        if ((i & 64) != 0) {
            z2 = dfgVar.g;
        }
        boolean z5 = dfgVar.h;
        dfgVar.getClass();
        list.getClass();
        return new dfg(cyberChampParams, sff0Var, j0g0Var2, list, z3, z4, z2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfg)) {
            return false;
        }
        dfg dfgVar = (dfg) obj;
        return this.f5999a.equals(dfgVar.f5999a) && this.b.equals(dfgVar.b) && Intrinsics.d(this.c, dfgVar.c) && Intrinsics.d(this.d, dfgVar.d) && this.e == dfgVar.e && this.f == dfgVar.f && this.g == dfgVar.g && this.h == dfgVar.h;
    }

    public final int hashCode() {
        int iC = cs0.c(this.b, this.f5999a.hashCode() * 31, 31);
        j0g0 j0g0Var = this.c;
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.e(dw9.a((iC + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampionshipEventsStateModel(params=");
        sb.append(this.f5999a);
        sb.append(", remoteConfig=");
        sb.append(this.b);
        sb.append(", eventsResult=");
        sb.append(this.c);
        sb.append(", specialEventList=");
        sb.append(this.d);
        sb.append(", bettingDisabled=");
        ua80.u(", connected=", ", betGroupMultiline=", sb, this.e, this.f);
        return ohs0.p(", supportRtl=", Separators.RPAREN, sb, this.g, this.h);
    }
}
