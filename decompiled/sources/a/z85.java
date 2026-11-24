package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z85 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43950a;
    public final String b;
    public final String c;

    public z85(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f43950a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z85)) {
            return false;
        }
        z85 z85Var = (z85) obj;
        return this.f43950a == z85Var.f43950a && Intrinsics.d(this.b, z85Var.b) && Intrinsics.d(this.c, z85Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f43950a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f43950a, "AvailableValueModel(value=", ", measure=", this.b), ", valueView=", this.c, Separators.RPAREN);
    }
}
