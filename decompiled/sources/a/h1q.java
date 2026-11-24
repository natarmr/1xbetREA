package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12296a;
    public final int b;
    public final String c;

    public h1q(String str, int i, boolean z) {
        str.getClass();
        this.f12296a = z;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1q)) {
            return false;
        }
        h1q h1qVar = (h1q) obj;
        return this.f12296a == h1qVar.f12296a && this.b == h1qVar.b && Intrinsics.d(this.c, h1qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Boolean.hashCode(this.f12296a) * 31, 31);
    }

    public final String toString() {
        return axq.n(ohs0.t(this.b, "Currency(isRequired=", ", id=", ", name=", this.f12296a), this.c, Separators.RPAREN);
    }
}
