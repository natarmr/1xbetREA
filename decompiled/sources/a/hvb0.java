package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hvb0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f13720a;

    public hvb0(a4x a4xVar) {
        a4xVar.getClass();
        this.f13720a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvb0) && Intrinsics.d(this.f13720a, ((hvb0) obj).f13720a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "PREVIOUS_MAPS";
    }

    public final int hashCode() {
        return this.f13720a.hashCode() - 940733183;
    }

    public final String toString() {
        return h97.i(this.f13720a, "PreviousMapsUiModel(key=PREVIOUS_MAPS, previousMaps=", Separators.RPAREN);
    }
}
