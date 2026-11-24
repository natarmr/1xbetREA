package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31489a;

    public final boolean equals(Object obj) {
        if (obj instanceof s27) {
            return Intrinsics.d(this.f31489a, ((s27) obj).f31489a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31489a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnHideHistoryApplied(betId=", this.f31489a, Separators.RPAREN);
    }
}
