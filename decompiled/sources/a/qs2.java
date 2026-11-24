package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qs2 {
    public static final ps2 Companion = new ps2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xs2 f29238a;

    public /* synthetic */ qs2(int i, xs2 xs2Var) {
        if (1 == (i & 1)) {
            this.f29238a = xs2Var;
        } else {
            m2x.I(i, 1, os2.f25764a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs2) && Intrinsics.d(this.f29238a, ((qs2) obj).f29238a);
    }

    public final int hashCode() {
        return this.f29238a.hashCode();
    }

    public final String toString() {
        return "AnalyticsEventRequest(data=" + this.f29238a + Separators.RPAREN;
    }

    public qs2(xs2 xs2Var) {
        this.f29238a = xs2Var;
    }
}
