package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class lx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20796a;
    public final ql5 b;
    public final a5w c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final HistoryTypeModel i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public lx30(String str, ql5 ql5Var, a5w a5wVar, boolean z, List list, boolean z2, boolean z3, List list2, HistoryTypeModel historyTypeModel, boolean z4, boolean z5, boolean z6) {
        list.getClass();
        list2.getClass();
        this.f20796a = str;
        this.b = ql5Var;
        this.c = a5wVar;
        this.d = z;
        this.e = list;
        this.f = z2;
        this.g = z3;
        this.h = list2;
        this.i = historyTypeModel;
        this.j = z4;
        this.k = z5;
        this.l = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx30)) {
            return false;
        }
        lx30 lx30Var = (lx30) obj;
        return this.f20796a.equals(lx30Var.f20796a) && Intrinsics.d(this.b, lx30Var.b) && Intrinsics.d(this.c, lx30Var.c) && this.d == lx30Var.d && Intrinsics.d(this.e, lx30Var.e) && this.f == lx30Var.f && this.g == lx30Var.g && Intrinsics.d(this.h, lx30Var.h) && this.i == lx30Var.i && this.j == lx30Var.j && this.k == lx30Var.k && this.l == lx30Var.l;
    }

    public final int hashCode() {
        int iHashCode = this.f20796a.hashCode() * 31;
        ql5 ql5Var = this.b;
        int iHashCode2 = (iHashCode + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31;
        a5w a5wVar = this.c;
        return Boolean.hashCode(this.l) + brm0.e(brm0.e((this.i.hashCode() + dw9.a(brm0.e(brm0.e(dw9.a(brm0.e((iHashCode2 + (a5wVar != null ? a5wVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuBetHistoryState(betId=");
        sb.append(this.f20796a);
        sb.append(", balanceModel=");
        sb.append(this.b);
        sb.append(", historyModel=");
        sb.append(this.c);
        sb.append(", marketGroupIdEnable=");
        sb.append(this.d);
        sb.append(", eventModelList=");
        rz4.z(sb, ", showParsingNumber=", this.e, ", hasBetSellPart=", this.f);
        vqd.y(sb, ", eventGroupsList=", this.h, ", historyTypeModel=", this.g);
        sb.append(this.i);
        sb.append(", isNewEventParams=");
        sb.append(this.j);
        sb.append(", logNewEventParams=");
        return ohs0.p(", historySaleDsToggle=", Separators.RPAREN, sb, this.k, this.l);
    }
}
