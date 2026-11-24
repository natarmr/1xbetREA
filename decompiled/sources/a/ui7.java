package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ui7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35717a;

    public final boolean equals(Object obj) {
        if (obj instanceof ui7) {
            return Intrinsics.d(this.f35717a, ((ui7) obj).f35717a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35717a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnHistoryItemClick(betId=", this.f35717a, Separators.RPAREN);
    }
}
