package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zi7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44428a;

    public final boolean equals(Object obj) {
        if (obj instanceof zi7) {
            return Intrinsics.d(this.f44428a, ((zi7) obj).f44428a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44428a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnNotificationClick(betId=", this.f44428a, Separators.RPAREN);
    }
}
