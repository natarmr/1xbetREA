package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class itc0 implements otc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f15348a;

    public final boolean equals(Object obj) {
        if (obj instanceof itc0) {
            return Intrinsics.d(this.f15348a, ((itc0) obj).f15348a);
        }
        return false;
    }

    public final int hashCode() {
        o0x o0xVar = this.f15348a;
        if (o0xVar == null) {
            return 0;
        }
        return o0xVar.hashCode();
    }

    public final String toString() {
        return "EndIcon(value=" + this.f15348a + Separators.RPAREN;
    }
}
