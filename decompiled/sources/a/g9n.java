package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g9n implements j9n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10922a;
    public final boolean b;

    public g9n(String str, boolean z) {
        str.getClass();
        this.f10922a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9n)) {
            return false;
        }
        g9n g9nVar = (g9n) obj;
        return Intrinsics.d(this.f10922a, g9nVar.f10922a) && this.b == g9nVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f10922a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("Favorite(label=", this.f10922a, ", favorite=", this.b, Separators.RPAREN);
    }
}
