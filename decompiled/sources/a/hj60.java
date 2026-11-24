package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hj60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f13146a;

    public hj60(a4x a4xVar) {
        a4xVar.getClass();
        this.f13146a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hj60) && Intrinsics.d(this.f13146a, ((hj60) obj).f13146a);
    }

    public final int hashCode() {
        return this.f13146a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f13146a, "OnboardingCyberSectionsUiState(sectionList=", Separators.RPAREN);
    }
}
