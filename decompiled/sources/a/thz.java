package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class thz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f33983a;

    public thz(a4x a4xVar) {
        a4xVar.getClass();
        this.f33983a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thz) && Intrinsics.d(this.f33983a, ((thz) obj).f33983a);
    }

    public final int hashCode() {
        return this.f33983a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f33983a, "LeaderboardTypeBottomContent(items=", Separators.RPAREN);
    }
}
