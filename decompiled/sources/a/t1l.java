package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t1l implements x1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33172a;

    public final boolean equals(Object obj) {
        if (obj instanceof t1l) {
            return Intrinsics.d(this.f33172a, ((t1l) obj).f33172a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33172a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSelectCompositionPlayer(value=", this.f33172a, Separators.RPAREN);
    }
}
