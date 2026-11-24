package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yi7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42673a;

    public final boolean equals(Object obj) {
        if (obj instanceof yi7) {
            return Intrinsics.d(this.f42673a, ((yi7) obj).f42673a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42673a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnMoreClick(betId=", this.f42673a, Separators.RPAREN);
    }
}
