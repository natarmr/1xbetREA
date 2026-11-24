package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class edw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7640a;
    public final Object b;

    public edw(Object obj, Object obj2) {
        this.f7640a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edw)) {
            return false;
        }
        edw edwVar = (edw) obj;
        Object obj2 = edwVar.f7640a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f7640a, obj2) && Intrinsics.d(this.b, edwVar.b);
    }

    public final int hashCode() {
        return j0g0.b(this.b) + (j0g0.b(this.f7640a) * 31);
    }

    public final String toString() {
        return b1j.k("HltvAwardsGameDetailsScenarioModel(liveGameDetails=", j0g0.d(this.f7640a), ", lineGameDetails=", j0g0.d(this.b), Separators.RPAREN);
    }
}
