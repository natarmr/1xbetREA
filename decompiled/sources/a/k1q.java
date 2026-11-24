package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17540a;
    public final String b;

    public k1q(String str, boolean z) {
        str.getClass();
        this.f17540a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1q)) {
            return false;
        }
        k1q k1qVar = (k1q) obj;
        return this.f17540a == k1qVar.f17540a && Intrinsics.d(this.b, k1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f17540a) * 31);
    }

    public final String toString() {
        return ua80.k("FirstName(isRequired=", this.f17540a, ", firstName=", this.b, Separators.RPAREN);
    }
}
