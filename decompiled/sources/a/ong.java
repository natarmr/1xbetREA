package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ong implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25545a;

    public final boolean equals(Object obj) {
        if (obj instanceof ong) {
            return Intrinsics.d(this.f25545a, ((ong) obj).f25545a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25545a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstPlayerName(value=", this.f25545a, Separators.RPAREN);
    }
}
