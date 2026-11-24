package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class iqf0 {
    public static final hqf0 Companion = new hqf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15209a;
    public final String b;
    public final String c;

    public /* synthetic */ iqf0(int i, String str, int i2, String str2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, gqf0.f11731a.getDescriptor());
            throw null;
        }
        this.f15209a = i2;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqf0)) {
            return false;
        }
        iqf0 iqf0Var = (iqf0) obj;
        return this.f15209a == iqf0Var.f15209a && Intrinsics.d(this.b, iqf0Var.b) && Intrinsics.d(this.c, iqf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f15209a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f15209a, "ResidentGetWinRequest(whence=", ", lng=", this.b, ", gameId="), this.c, Separators.RPAREN);
    }

    public iqf0(String str, String str2) {
        str2.getClass();
        this.f15209a = 22;
        this.b = str;
        this.c = str2;
    }
}
