package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28044a;

    public final boolean equals(Object obj) {
        if (obj instanceof q3b) {
            return Intrinsics.d(this.f28044a, ((q3b) obj).f28044a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28044a.hashCode();
    }

    public final String toString() {
        return kng0.l("LabelChanged(label=", this.f28044a, Separators.RPAREN);
    }
}
