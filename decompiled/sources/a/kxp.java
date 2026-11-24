package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kxp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19067a;
    public final xwp b;
    public final long c;
    public final sff0 d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final ypl0 h;

    public kxp(boolean z, xwp xwpVar, long j, sff0 sff0Var, boolean z2, List list, boolean z3, ypl0 ypl0Var) {
        list.getClass();
        this.f19067a = z;
        this.b = xwpVar;
        this.c = j;
        this.d = sff0Var;
        this.e = z2;
        this.f = list;
        this.g = z3;
        this.h = ypl0Var;
    }

    public static kxp a(kxp kxpVar, boolean z, xwp xwpVar, long j, ypl0 ypl0Var, int i) {
        if ((i & 1) != 0) {
            z = kxpVar.f19067a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            xwpVar = kxpVar.b;
        }
        xwp xwpVar2 = xwpVar;
        long j2 = (i & 4) != 0 ? kxpVar.c : j;
        sff0 sff0Var = kxpVar.d;
        boolean z3 = kxpVar.e;
        List list = kxpVar.f;
        boolean z4 = kxpVar.g;
        ypl0 ypl0Var2 = (i & 128) != 0 ? kxpVar.h : ypl0Var;
        kxpVar.getClass();
        list.getClass();
        ypl0Var2.getClass();
        return new kxp(z2, xwpVar2, j2, sff0Var, z3, list, z4, ypl0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxp)) {
            return false;
        }
        kxp kxpVar = (kxp) obj;
        return this.f19067a == kxpVar.f19067a && Intrinsics.d(this.b, kxpVar.b) && this.c == kxpVar.c && this.d.equals(kxpVar.d) && this.e == kxpVar.e && Intrinsics.d(this.f, kxpVar.f) && this.g == kxpVar.g && this.h.equals(kxpVar.h);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f19067a) * 31;
        xwp xwpVar = this.b;
        return this.h.hashCode() + brm0.e(dw9.a(brm0.e(cs0.c(this.d, rw2.b((iHashCode + (xwpVar == null ? 0 : xwpVar.hashCode())) * 31, 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FighterStateModel(connected=");
        sb.append(this.f19067a);
        sb.append(", scenarioModel=");
        sb.append(this.b);
        sb.append(", selectedStatisticTabId=");
        sb.append(this.c);
        sb.append(", remoteConfigModel=");
        sb.append(this.d);
        esw0.l(sb, ", bettingDisabled=", this.e, ", specialEventList=", this.f);
        sb.append(", supportRtl=");
        sb.append(this.g);
        sb.append(", sportSimpleModel=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
