package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rgz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f30461a;

    public rgz(a4x a4xVar) {
        a4xVar.getClass();
        this.f30461a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgz) && Intrinsics.d(this.f30461a, ((rgz) obj).f30461a);
    }

    public final int hashCode() {
        return this.f30461a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f30461a, "LeaderboardRegionsBottomContent(items=", Separators.RPAREN);
    }
}
