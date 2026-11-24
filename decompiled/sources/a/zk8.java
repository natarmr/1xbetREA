package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zk8 implements il8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f44517a;

    public zk8(csr csrVar) {
        csrVar.getClass();
        this.f44517a = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zk8) && Intrinsics.d(this.f44517a, ((zk8) obj).f44517a);
    }

    public final int hashCode() {
        return this.f44517a.hashCode();
    }

    public final String toString() {
        return "PostBonusResult(bonus=" + this.f44517a + Separators.RPAREN;
    }
}
