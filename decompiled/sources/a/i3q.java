package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i3q implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14108a;

    public i3q(String str) {
        str.getClass();
        this.f14108a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3q) && Intrinsics.d(this.f14108a, ((i3q) obj).f14108a);
    }

    public final int hashCode() {
        return this.f14108a.hashCode();
    }

    public final String toString() {
        return kng0.l("FilterHeaderUiModel(title=", this.f14108a, Separators.RPAREN);
    }
}
