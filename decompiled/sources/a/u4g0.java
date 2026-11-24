package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u4g0 implements x4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f35047a;

    public u4g0(a4x a4xVar) {
        a4xVar.getClass();
        this.f35047a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4g0) && Intrinsics.d(this.f35047a, ((u4g0) obj).f35047a);
    }

    public final int hashCode() {
        return this.f35047a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f35047a, "Requesting(items=", Separators.RPAREN);
    }
}
