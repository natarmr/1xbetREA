package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20299a;
    public final int b;

    public lmk(String str, int i) {
        str.getClass();
        this.f20299a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmk)) {
            return false;
        }
        lmk lmkVar = (lmk) obj;
        return Intrinsics.d(this.f20299a, lmkVar.f20299a) && this.b == lmkVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f20299a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "NonceCounter(nonce=", this.f20299a, ", count=", Separators.RPAREN);
    }
}
