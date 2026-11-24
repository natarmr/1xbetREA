package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class umf0 implements wmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f35918a;

    public umf0(a4x a4xVar) {
        a4xVar.getClass();
        this.f35918a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof umf0) && Intrinsics.d(this.f35918a, ((umf0) obj).f35918a);
    }

    public final int hashCode() {
        return this.f35918a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f35918a, "Loaded(items=", Separators.RPAREN);
    }
}
