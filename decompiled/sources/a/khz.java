package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class khz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f18312a;

    public khz(a4x a4xVar) {
        a4xVar.getClass();
        this.f18312a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khz) && Intrinsics.d(this.f18312a, ((khz) obj).f18312a);
    }

    public final int hashCode() {
        return this.f18312a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f18312a, "LeaderboardTeamsTypeBottomContent(items=", Separators.RPAREN);
    }
}
