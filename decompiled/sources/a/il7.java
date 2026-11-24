package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class il7 implements kl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14962a;

    public final boolean equals(Object obj) {
        if (obj instanceof il7) {
            return Intrinsics.d(this.f14962a, ((il7) obj).f14962a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14962a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowServerError(message=", this.f14962a, Separators.RPAREN);
    }
}
