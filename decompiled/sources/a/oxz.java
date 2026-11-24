package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class oxz implements qxz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26035a;

    public final boolean equals(Object obj) {
        if (obj instanceof oxz) {
            return Intrinsics.d(this.f26035a, ((oxz) obj).f26035a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26035a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnLimitValueChange(newValue=", this.f26035a, Separators.RPAREN);
    }
}
