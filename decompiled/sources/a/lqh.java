package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lqh implements oqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f20487a;
    public final cqh b;

    public lqh(i4 i4Var, cqh cqhVar) {
        i4Var.getClass();
        this.f20487a = i4Var;
        this.b = cqhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqh)) {
            return false;
        }
        lqh lqhVar = (lqh) obj;
        return Intrinsics.d(this.f20487a, lqhVar.f20487a) && Intrinsics.d(this.b, lqhVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f20487a.hashCode() * 31;
        cqh cqhVar = this.b;
        return iHashCode + (cqhVar == null ? 0 : cqhVar.hashCode());
    }

    public final String toString() {
        return "Chart(indicators=" + this.f20487a + ", textIndicator=" + this.b + Separators.RPAREN;
    }
}
