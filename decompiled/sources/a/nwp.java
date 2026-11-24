package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nwp implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f24245a;

    public nwp(a4x a4xVar) {
        a4xVar.getClass();
        this.f24245a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwp) && Intrinsics.d(this.f24245a, ((nwp) obj).f24245a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "LAST_FIGHTS";
    }

    public final int hashCode() {
        return this.f24245a.hashCode() + 1966258516;
    }

    public final String toString() {
        return h97.i(this.f24245a, "FighterResultUiModel(key=LAST_FIGHTS, results=", Separators.RPAREN);
    }
}
