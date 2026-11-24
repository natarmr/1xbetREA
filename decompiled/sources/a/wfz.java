package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wfz extends yfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f39089a;

    public wfz(a4x a4xVar) {
        a4xVar.getClass();
        this.f39089a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfz) && Intrinsics.d(this.f39089a, ((wfz) obj).f39089a);
    }

    public final int hashCode() {
        return this.f39089a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f39089a, "Content(items=", Separators.RPAREN);
    }
}
