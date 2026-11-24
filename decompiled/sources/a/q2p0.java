package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q2p0 implements t2p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f28012a;

    public q2p0(a4x a4xVar) {
        a4xVar.getClass();
        this.f28012a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2p0) && Intrinsics.d(this.f28012a, ((q2p0) obj).f28012a);
    }

    public final int hashCode() {
        return this.f28012a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f28012a, "Content(items=", Separators.RPAREN);
    }
}
