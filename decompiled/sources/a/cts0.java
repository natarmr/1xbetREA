package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class cts0 {
    public static final yss0 Companion = new yss0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bts0 f4957a;

    public /* synthetic */ cts0(int i, bts0 bts0Var) {
        if ((i & 1) == 0) {
            this.f4957a = null;
        } else {
            this.f4957a = bts0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cts0) && Intrinsics.d(this.f4957a, ((cts0) obj).f4957a);
    }

    public final int hashCode() {
        bts0 bts0Var = this.f4957a;
        if (bts0Var == null) {
            return 0;
        }
        return bts0Var.hashCode();
    }

    public final String toString() {
        return "TvBetJackpotResponse(data=" + this.f4957a + Separators.RPAREN;
    }
}
