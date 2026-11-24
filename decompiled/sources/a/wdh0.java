package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wdh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38974a;

    public final boolean equals(Object obj) {
        if (obj instanceof wdh0) {
            return Intrinsics.d(this.f38974a, ((wdh0) obj).f38974a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38974a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlayerOneName(value=", this.f38974a, Separators.RPAREN);
    }
}
