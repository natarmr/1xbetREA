package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rr40 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f30963a;

    public rr40(a4x a4xVar) {
        a4xVar.getClass();
        this.f30963a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr40) && Intrinsics.d(this.f30963a, ((rr40) obj).f30963a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "MORTAL_KOMBAT_KEY";
    }

    public final int hashCode() {
        return this.f30963a.hashCode() + 698231908;
    }

    public final String toString() {
        return h97.i(this.f30963a, "MortalKombatUiModel(key=MORTAL_KOMBAT_KEY, rounds=", Separators.RPAREN);
    }
}
