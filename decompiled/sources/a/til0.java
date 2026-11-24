package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class til0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34014a;
    public final String b;
    public final String c;

    public til0(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f34014a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof til0)) {
            return false;
        }
        til0 til0Var = (til0) obj;
        return this.f34014a == til0Var.f34014a && Intrinsics.d(this.b, til0Var.b) && Intrinsics.d(this.c, til0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f34014a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f34014a, "SportModel(id=", ", name=", this.b), ", team=", this.c, Separators.RPAREN);
    }
}
