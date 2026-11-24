package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fop0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f9894a;
    public final a4x b;
    public final boolean c;

    public fop0(a4x a4xVar, a4x a4xVar2, boolean z) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f9894a = a4xVar;
        this.b = a4xVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fop0)) {
            return false;
        }
        fop0 fop0Var = (fop0) obj;
        return Intrinsics.d(this.f9894a, fop0Var.f9894a) && Intrinsics.d(this.b, fop0Var.b) && this.c == fop0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f9894a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rw2.p(rw2.q("TeamsCardUiModel(firstTeamList=", this.f9894a, ", secondTeamList=", this.b, ", isExpanded="), this.c, Separators.RPAREN);
    }
}
