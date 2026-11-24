package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class baj implements haj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2259a;

    public baj(i4 i4Var) {
        i4Var.getClass();
        this.f2259a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof baj) && Intrinsics.d(this.f2259a, ((baj) obj).f2259a);
    }

    @Override // a.haj
    public final jaj getType() {
        return jaj.MATCH_REVIEW;
    }

    public final int hashCode() {
        return this.f2259a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f2259a, "MatchReview(events=", Separators.RPAREN);
    }
}
