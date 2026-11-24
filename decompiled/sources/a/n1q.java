package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22763a;
    public final String b;

    public n1q(String str, boolean z) {
        str.getClass();
        this.f22763a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1q)) {
            return false;
        }
        n1q n1qVar = (n1q) obj;
        return this.f22763a == n1qVar.f22763a && Intrinsics.d(this.b, n1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f22763a) * 31);
    }

    public final String toString() {
        return ua80.k("MiddleName(isRequired=", this.f22763a, ", name=", this.b, Separators.RPAREN);
    }
}
