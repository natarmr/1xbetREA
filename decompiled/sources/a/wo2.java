package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wo2 {
    public static final vo2 Companion = new vo2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39470a;
    public final String b;

    public /* synthetic */ wo2(String str, int i, long j) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, uo2.f35990a.getDescriptor());
            throw null;
        }
        this.f39470a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo2)) {
            return false;
        }
        wo2 wo2Var = (wo2) obj;
        return this.f39470a == wo2Var.f39470a && Intrinsics.d(this.b, wo2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f39470a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f39470a, "AlternativeInfoRequest(gameId=", ", language=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    public wo2(long j, String str) {
        this.f39470a = j;
        this.b = str;
    }
}
