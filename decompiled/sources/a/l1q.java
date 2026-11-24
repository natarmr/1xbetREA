package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19268a;
    public final String b;

    public l1q(String str, boolean z) {
        str.getClass();
        this.f19268a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1q)) {
            return false;
        }
        l1q l1qVar = (l1q) obj;
        return this.f19268a == l1qVar.f19268a && Intrinsics.d(this.b, l1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f19268a) * 31);
    }

    public final String toString() {
        return ua80.k("LastName(isRequired=", this.f19268a, ", lastName=", this.b, Separators.RPAREN);
    }
}
