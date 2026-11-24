package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nh8 implements ci8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f23521a;

    public nh8(csr csrVar) {
        csrVar.getClass();
        this.f23521a = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nh8) && Intrinsics.d(this.f23521a, ((nh8) obj).f23521a);
    }

    public final int hashCode() {
        return this.f23521a.hashCode();
    }

    public final String toString() {
        return "OnGameWithBonusNotStarted(bonus=" + this.f23521a + Separators.RPAREN;
    }
}
