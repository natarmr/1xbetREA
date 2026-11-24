package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uy00 implements yy00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36466a;

    public final boolean equals(Object obj) {
        if (obj instanceof uy00) {
            return Intrinsics.d(this.f36466a, ((uy00) obj).f36466a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36466a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSelectCompositionPlayer(value=", this.f36466a, Separators.RPAREN);
    }
}
