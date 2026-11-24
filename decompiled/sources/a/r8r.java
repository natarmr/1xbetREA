package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class r8r {
    public static final q8r Companion = new q8r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f30041a;
    public final String b;

    public /* synthetic */ r8r(int i, Double d, String str) {
        if ((i & 1) == 0) {
            this.f30041a = null;
        } else {
            this.f30041a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8r)) {
            return false;
        }
        r8r r8rVar = (r8r) obj;
        return Intrinsics.d(this.f30041a, r8rVar.f30041a) && Intrinsics.d(this.b, r8rVar.b);
    }

    public final int hashCode() {
        Double d = this.f30041a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FreeValueConfigurationTimeMinMaxResponse(value=" + this.f30041a + ", measure=" + this.b + Separators.RPAREN;
    }
}
