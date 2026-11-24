package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class id8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14570a;
    public final boolean b;
    public final boolean c;
    public final mdm d;
    public final String e;
    public final String f;
    public final ArrayList g;

    public id8(boolean z, boolean z2, boolean z3, mdm mdmVar, String str, String str2, ArrayList arrayList) {
        this.f14570a = z;
        this.b = z2;
        this.c = z3;
        this.d = mdmVar;
        this.e = str;
        this.f = str2;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id8)) {
            return false;
        }
        id8 id8Var = (id8) obj;
        return this.f14570a == id8Var.f14570a && this.b == id8Var.b && this.c == id8Var.c && Intrinsics.d(this.d, id8Var.d) && this.e.equals(id8Var.e) && this.f.equals(id8Var.f) && this.g.equals(id8Var.g);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(Boolean.hashCode(this.f14570a) * 31, 31, this.b), 31, this.c);
        mdm mdmVar = this.d;
        return this.g.hashCode() + ua80.b(ua80.b((iE + (mdmVar == null ? 0 : mdmVar.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BonusAgreementsUiState(showLoading=", ", showRefresh=", ", showEmptyView=", this.f14570a, this.b);
        sbQ.append(this.c);
        sbQ.append(", emptyView=");
        sbQ.append(this.d);
        sbQ.append(", bonusInfoTitle=");
        f140.v(sbQ, this.e, ", bonusInfoDescription=", this.f, ", bonusItems=");
        return rz4.n(sbQ, this.g, Separators.RPAREN);
    }
}
