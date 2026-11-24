package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gn90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11576a;
    public final rvm0 b;

    public gn90(List list, rvm0 rvm0Var) {
        list.getClass();
        this.f11576a = list;
        this.b = rvm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn90)) {
            return false;
        }
        gn90 gn90Var = (gn90) obj;
        return Intrinsics.d(this.f11576a, gn90Var.f11576a) && Intrinsics.d(this.b, gn90Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f11576a.hashCode() * 31;
        rvm0 rvm0Var = this.b;
        return iHashCode + (rvm0Var == null ? 0 : rvm0Var.hashCode());
    }

    public final String toString() {
        return "PickDuelSubGameStateModel(subGames=" + this.f11576a + ", currentSubGame=" + this.b + Separators.RPAREN;
    }
}
