package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class iz0 implements lz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f15612a;

    public iz0(a4x a4xVar) {
        a4xVar.getClass();
        this.f15612a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz0) && Intrinsics.d(this.f15612a, ((iz0) obj).f15612a);
    }

    public final int hashCode() {
        return this.f15612a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f15612a, "Content(categories=", Separators.RPAREN);
    }
}
