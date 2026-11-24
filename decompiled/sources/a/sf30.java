package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sf30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f32099a;

    public sf30(i4 i4Var) {
        i4Var.getClass();
        this.f32099a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf30) && Intrinsics.d(this.f32099a, ((sf30) obj).f32099a);
    }

    public final int hashCode() {
        return this.f32099a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f32099a, "MatchReviewInfoUiModel(events=", Separators.RPAREN);
    }
}
