package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fg50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ng50 f9477a;
    public final bg50 b;

    public fg50(ng50 ng50Var, bg50 bg50Var) {
        this.f9477a = ng50Var;
        this.b = bg50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg50)) {
            return false;
        }
        fg50 fg50Var = (fg50) obj;
        return Intrinsics.d(this.f9477a, fg50Var.f9477a) && Intrinsics.d(this.b, fg50Var.b);
    }

    public final int hashCode() {
        ng50 ng50Var = this.f9477a;
        int iHashCode = (ng50Var == null ? 0 : ng50Var.hashCode()) * 31;
        bg50 bg50Var = this.b;
        return iHashCode + (bg50Var != null ? bg50Var.hashCode() : 0);
    }

    public final String toString() {
        return "NearestGameDetailsExtendedScoreModel(innsStats=" + this.f9477a + ", cricketScore=" + this.b + Separators.RPAREN;
    }
}
