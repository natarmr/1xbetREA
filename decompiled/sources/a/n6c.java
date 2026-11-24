package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22990a;
    public final boolean b;

    public n6c(String str, boolean z) {
        str.getClass();
        this.f22990a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6c)) {
            return false;
        }
        n6c n6cVar = (n6c) obj;
        return Intrinsics.d(this.f22990a, n6cVar.f22990a) && this.b == n6cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f22990a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("ThirdButtonState(title=", this.f22990a, ", enable=", this.b, Separators.RPAREN);
    }
}
