package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y2g0 implements z2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f41903a;

    public y2g0(a4x a4xVar) {
        a4xVar.getClass();
        this.f41903a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2g0) && Intrinsics.d(this.f41903a, ((y2g0) obj).f41903a);
    }

    public final int hashCode() {
        return this.f41903a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f41903a, "Loading(items=", Separators.RPAREN);
    }
}
