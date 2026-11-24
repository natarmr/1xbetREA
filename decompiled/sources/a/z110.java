package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z110 implements f210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43596a;

    public final boolean equals(Object obj) {
        if (obj instanceof z110) {
            return Intrinsics.d(this.f43596a, ((z110) obj).f43596a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43596a.hashCode();
    }

    public final String toString() {
        return kng0.l("SelectCompositionPlayer(value=", this.f43596a, Separators.RPAREN);
    }
}
