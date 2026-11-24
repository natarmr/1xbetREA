package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w4g0 implements z4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38542a;

    public w4g0(a4x a4xVar) {
        a4xVar.getClass();
        this.f38542a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4g0) && Intrinsics.d(this.f38542a, ((w4g0) obj).f38542a);
    }

    public final int hashCode() {
        return this.f38542a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f38542a, "Requesting(items=", Separators.RPAREN);
    }
}
