package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class i9r {
    public static final h9r Companion = new h9r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9r f14401a;

    public /* synthetic */ i9r(int i, f9r f9rVar) {
        if ((i & 1) == 0) {
            this.f14401a = null;
        } else {
            this.f14401a = f9rVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i9r) && Intrinsics.d(this.f14401a, ((i9r) obj).f14401a);
    }

    public final int hashCode() {
        f9r f9rVar = this.f14401a;
        if (f9rVar == null) {
            return 0;
        }
        return f9rVar.hashCode();
    }

    public final String toString() {
        return "FruitBlastCoefResponse(coeffs=" + this.f14401a + Separators.RPAREN;
    }
}
