package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ru4 implements uu4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31106a;

    public final boolean equals(Object obj) {
        if (obj instanceof ru4) {
            return Intrinsics.d(this.f31106a, ((ru4) obj).f31106a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31106a.hashCode();
    }

    public final String toString() {
        return kng0.l("Qr(value=", this.f31106a, Separators.RPAREN);
    }
}
