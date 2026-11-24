package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xn70 extends io70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f41160a;

    public xn70(csr csrVar) {
        csrVar.getClass();
        this.f41160a = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn70) && Intrinsics.d(this.f41160a, ((xn70) obj).f41160a);
    }

    public final int hashCode() {
        return this.f41160a.hashCode();
    }

    public final String toString() {
        return "SendBonusNotUsedResult(bonus=" + this.f41160a + Separators.RPAREN;
    }
}
