package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3586a;
    public final int b;
    public final String c;

    public c1q(String str, int i, boolean z) {
        str.getClass();
        this.f3586a = z;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1q)) {
            return false;
        }
        c1q c1qVar = (c1q) obj;
        return this.f3586a == c1qVar.f3586a && this.b == c1qVar.b && Intrinsics.d(this.c, c1qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Boolean.hashCode(this.f3586a) * 31, 31);
    }

    public final String toString() {
        return axq.n(ohs0.t(this.b, "Bonus(isRequired=", ", id=", ", name=", this.f3586a), this.c, Separators.RPAREN);
    }
}
