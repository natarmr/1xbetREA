package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class oxr implements rxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26026a;
    public final boolean b;
    public final long c;

    public oxr(String str, long j, boolean z) {
        str.getClass();
        this.f26026a = str;
        this.b = z;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxr)) {
            return false;
        }
        oxr oxrVar = (oxr) obj;
        return Intrinsics.d(this.f26026a, oxrVar.f26026a) && this.b == oxrVar.b && this.c == oxrVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + brm0.e(this.f26026a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, brm0.u("Status(status=", this.f26026a, ", showTimer=", this.b, ", timeStart="));
    }
}
