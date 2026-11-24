package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i8m implements k8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f14346a;

    public i8m(a4x a4xVar) {
        a4xVar.getClass();
        this.f14346a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8m) && Intrinsics.d(this.f14346a, ((i8m) obj).f14346a);
    }

    public final int hashCode() {
        return this.f14346a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f14346a, "Content(items=", Separators.RPAREN);
    }
}
