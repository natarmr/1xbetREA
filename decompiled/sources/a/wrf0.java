package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wrf0 {
    public static final vrf0 Companion = new vrf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f39640a;

    public /* synthetic */ wrf0(int i, Double d) {
        if ((i & 1) == 0) {
            this.f39640a = null;
        } else {
            this.f39640a = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrf0) && Intrinsics.d(this.f39640a, ((wrf0) obj).f39640a);
    }

    public final int hashCode() {
        Double d = this.f39640a;
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }

    public final String toString() {
        return "ResidentSecondLifeResponse(extinguisherValue=" + this.f39640a + Separators.RPAREN;
    }
}
