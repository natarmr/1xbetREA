package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b58 implements c58 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f1989a;

    public b58(a4x a4xVar) {
        a4xVar.getClass();
        this.f1989a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b58) && Intrinsics.d(this.f1989a, ((b58) obj).f1989a);
    }

    public final int hashCode() {
        return this.f1989a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f1989a, "Loading(shimmerList=", Separators.RPAREN);
    }
}
