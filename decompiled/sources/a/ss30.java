package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ss30 {
    public static final rs30 Companion = new rs30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32708a;
    public final String b;
    public final int c;

    public /* synthetic */ ss30(String str, int i, int i2, long j) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, qs30.f29241a.getDescriptor());
            throw null;
        }
        this.f32708a = j;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss30)) {
            return false;
        }
        ss30 ss30Var = (ss30) obj;
        return this.f32708a == ss30Var.f32708a && Intrinsics.d(this.b, ss30Var.b) && this.c == ss30Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(Long.hashCode(this.f32708a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(axq.o(this.f32708a, "MemoryGetActiveGameRequest(accountId=", ", lng=", this.b), ", whence=", this.c, Separators.RPAREN);
    }

    public ss30(long j, String str) {
        this.f32708a = j;
        this.b = str;
        this.c = 22;
    }
}
