package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c4p implements d4p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f3736a;

    public c4p(i4 i4Var) {
        i4Var.getClass();
        this.f3736a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c4p) && Intrinsics.d(this.f3736a, ((c4p) obj).f3736a);
    }

    public final int hashCode() {
        return this.f3736a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f3736a, "RecommendedGames(cardList=", Separators.RPAREN);
    }
}
