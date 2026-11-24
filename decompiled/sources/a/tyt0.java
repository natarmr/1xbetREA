package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tyt0 implements zyt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34773a;

    public final boolean equals(Object obj) {
        if (obj instanceof tyt0) {
            return Intrinsics.d(this.f34773a, ((tyt0) obj).f34773a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34773a.hashCode();
    }

    public final String toString() {
        return kng0.l("SelectCompositionPlayer(value=", this.f34773a, Separators.RPAREN);
    }
}
