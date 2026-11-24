package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ta70 implements wb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f33602a;

    public ta70(csr csrVar) {
        csrVar.getClass();
        this.f33602a = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta70) && Intrinsics.d(this.f33602a, ((ta70) obj).f33602a);
    }

    public final int hashCode() {
        return this.f33602a.hashCode();
    }

    public final String toString() {
        return "SendExternalBonusNotUsedResult(bonus=" + this.f33602a + Separators.RPAREN;
    }
}
