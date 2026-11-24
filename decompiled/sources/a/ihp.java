package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ihp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f14790a;
    public final a4x b;

    public ihp(imm immVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f14790a = immVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihp)) {
            return false;
        }
        ihp ihpVar = (ihp) obj;
        return this.f14790a.equals(ihpVar.f14790a) && Intrinsics.d(this.b, ihpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14790a.hashCode() * 31);
    }

    public final String toString() {
        return "FeatureTogglesUiState(navBarUiModel=" + this.f14790a + ", featureToggles=" + this.b + Separators.RPAREN;
    }
}
