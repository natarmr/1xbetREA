package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e2j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final omm f7089a;

    public e2j(omm ommVar) {
        ommVar.getClass();
        this.f7089a = ommVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2j) && Intrinsics.d(this.f7089a, ((e2j) obj).f7089a);
    }

    public final int hashCode() {
        return this.f7089a.hashCode();
    }

    public final String toString() {
        return "DailyTaskOnboardingUiState(dsOnboardingUiModel=" + this.f7089a + Separators.RPAREN;
    }
}
