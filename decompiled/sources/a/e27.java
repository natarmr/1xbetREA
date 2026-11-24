package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7071a;

    public final boolean equals(Object obj) {
        if (obj instanceof e27) {
            return Intrinsics.d(this.f7071a, ((e27) obj).f7071a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7071a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnHistoryItemClick(betId=", this.f7071a, Separators.RPAREN);
    }
}
