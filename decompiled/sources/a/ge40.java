package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ge40 implements he40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rcc f11134a;
    public final a4x b;

    public ge40(rcc rccVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f11134a = rccVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge40)) {
            return false;
        }
        ge40 ge40Var = (ge40) obj;
        return Intrinsics.d(this.f11134a, ge40Var.f11134a) && Intrinsics.d(this.b, ge40Var.b);
    }

    public final int hashCode() {
        rcc rccVar = this.f11134a;
        return this.b.hashCode() + ((rccVar == null ? 0 : rccVar.f30231a.hashCode()) * 31);
    }

    public final String toString() {
        return "PitchMode(chipsSectionUiModel=" + this.f11134a + ", players=" + this.b + Separators.RPAREN;
    }
}
