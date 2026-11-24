package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class htt0 {
    public static final gtt0 Companion = new gtt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f13651a;

    public /* synthetic */ htt0(int i, Double d) {
        if ((i & 1) == 0) {
            this.f13651a = null;
        } else {
            this.f13651a = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof htt0) && Intrinsics.d(this.f13651a, ((htt0) obj).f13651a);
    }

    public final int hashCode() {
        Double d = this.f13651a;
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }

    public final String toString() {
        return "UtcLocalTimeResponse(utcLocalTime=" + this.f13651a + Separators.RPAREN;
    }
}
