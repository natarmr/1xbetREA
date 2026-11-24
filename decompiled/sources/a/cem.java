package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9q0 f4220a;
    public final d4d b;

    public cem(y9q0 y9q0Var, d4d d4dVar) {
        y9q0Var.getClass();
        d4dVar.getClass();
        this.f4220a = y9q0Var;
        this.b = d4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cem)) {
            return false;
        }
        cem cemVar = (cem) obj;
        return Intrinsics.d(this.f4220a, cemVar.f4220a) && this.b == cemVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4220a.hashCode() * 31);
    }

    public final String toString() {
        return "DsEventCardAdditionalLabelConfig(additionalLabelTextStyle=" + this.f4220a + ", additionalLabelTextColorKey=" + this.b + Separators.RPAREN;
    }
}
