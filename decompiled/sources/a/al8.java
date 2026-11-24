package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class al8 implements il8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1055a;
    public final csr b;

    public al8(long j, csr csrVar) {
        csrVar.getClass();
        this.f1055a = j;
        this.b = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al8)) {
            return false;
        }
        al8 al8Var = (al8) obj;
        return this.f1055a == al8Var.f1055a && Intrinsics.d(this.b, al8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f1055a) * 31);
    }

    public final String toString() {
        return "PostNewGameWithBonusResult(gameId=" + this.f1055a + ", bonus=" + this.b + Separators.RPAREN;
    }
}
