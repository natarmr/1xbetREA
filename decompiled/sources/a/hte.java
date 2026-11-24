package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13629a;

    public final boolean equals(Object obj) {
        if (obj instanceof hte) {
            return Intrinsics.d(this.f13629a, ((hte) obj).f13629a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13629a.hashCode();
    }

    public final String toString() {
        return kng0.l("ErrorText(value=", this.f13629a, Separators.RPAREN);
    }
}
