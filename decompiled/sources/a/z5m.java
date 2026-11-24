package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z5m implements a6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6m f43824a;

    public z5m(l6m l6mVar) {
        this.f43824a = l6mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5m) && Intrinsics.d(this.f43824a, ((z5m) obj).f43824a);
    }

    public final int hashCode() {
        l6m l6mVar = this.f43824a;
        if (l6mVar == null) {
            return 0;
        }
        return l6mVar.hashCode();
    }

    public final String toString() {
        return "Vs(victoryIndicator=" + this.f43824a + Separators.RPAREN;
    }
}
