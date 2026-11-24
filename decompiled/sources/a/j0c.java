package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class j0c {
    public static final i0c Companion = new i0c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15676a;
    public final String b;

    public /* synthetic */ j0c(String str, int i, long j) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, h0c.f12228a.getDescriptor());
            throw null;
        }
        this.f15676a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0c)) {
            return false;
        }
        j0c j0cVar = (j0c) obj;
        return this.f15676a == j0cVar.f15676a && Intrinsics.d(this.b, j0cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f15676a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f15676a, "CheckPasswordDataRequest(date=", ", oldPassword=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    public j0c(long j, String str) {
        this.f15676a = j;
        this.b = str;
    }
}
