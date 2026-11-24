package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uoz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oiq0 f36035a;
    public final w85 b;

    public uoz(oiq0 oiq0Var, w85 w85Var) {
        this.f36035a = oiq0Var;
        this.b = w85Var;
    }

    public static uoz a(uoz uozVar, oiq0 oiq0Var, w85 w85Var, int i) {
        if ((i & 1) != 0) {
            oiq0Var = uozVar.f36035a;
        }
        if ((i & 2) != 0) {
            w85Var = uozVar.b;
        }
        return new uoz(oiq0Var, w85Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoz)) {
            return false;
        }
        uoz uozVar = (uoz) obj;
        return Intrinsics.d(this.f36035a, uozVar.f36035a) && Intrinsics.d(this.b, uozVar.b);
    }

    public final int hashCode() {
        oiq0 oiq0Var = this.f36035a;
        int iHashCode = (oiq0Var == null ? 0 : oiq0Var.hashCode()) * 31;
        w85 w85Var = this.b;
        return Boolean.hashCode(false) + ((iHashCode + (w85Var == null ? 0 : w85Var.hashCode())) * 31);
    }

    public final String toString() {
        return "LimitSelfExcludeAfricaState(availableTimeLimit=" + this.f36035a + ", selectedLimit=" + this.b + ", isLoading=false)";
    }
}
