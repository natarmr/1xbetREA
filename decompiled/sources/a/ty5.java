package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ty5 extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f34736a;

    public ty5(csr csrVar) {
        csrVar.getClass();
        this.f34736a = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty5) && Intrinsics.d(this.f34736a, ((ty5) obj).f34736a);
    }

    public final int hashCode() {
        return this.f34736a.hashCode();
    }

    public final String toString() {
        return "ResetWithBonusCommand(bonus=" + this.f34736a + Separators.RPAREN;
    }
}
