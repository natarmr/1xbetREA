package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sle extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f32395a;

    public sle(csr csrVar) {
        csrVar.getClass();
        this.f32395a = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sle) && Intrinsics.d(this.f32395a, ((sle) obj).f32395a);
    }

    public final int hashCode() {
        return this.f32395a.hashCode();
    }

    public final String toString() {
        return "SendBonusNotUsedResultCommand(bonus=" + this.f32395a + Separators.RPAREN;
    }
}
