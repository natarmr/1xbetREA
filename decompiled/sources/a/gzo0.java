package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gzo0 implements hzo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f12189a;

    public gzo0(a4x a4xVar) {
        a4xVar.getClass();
        this.f12189a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzo0) && Intrinsics.d(this.f12189a, ((gzo0) obj).f12189a);
    }

    public final int hashCode() {
        return this.f12189a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f12189a, "Shimmers(items=", Separators.RPAREN);
    }
}
