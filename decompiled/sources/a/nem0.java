package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nem0 {
    public static final kem0 Companion = new kem0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23392a;

    public /* synthetic */ nem0(int i, String str) {
        if ((i & 1) == 0) {
            this.f23392a = null;
        } else {
            this.f23392a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nem0) && Intrinsics.d(this.f23392a, ((nem0) obj).f23392a);
    }

    public final int hashCode() {
        String str = this.f23392a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("StatisticInfoResponse(gameId=", this.f23392a, Separators.RPAREN);
    }
}
