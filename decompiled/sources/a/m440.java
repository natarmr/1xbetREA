package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21150a;

    public final boolean equals(Object obj) {
        if (obj instanceof m440) {
            return Intrinsics.d(this.f21150a, ((m440) obj).f21150a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21150a.hashCode();
    }

    public final String toString() {
        return kng0.l("External(externalUrl=", this.f21150a, Separators.RPAREN);
    }
}
