package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kz0 implements lz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f19130a;

    public kz0(a4x a4xVar) {
        a4xVar.getClass();
        this.f19130a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kz0) && Intrinsics.d(this.f19130a, ((kz0) obj).f19130a);
    }

    public final int hashCode() {
        return this.f19130a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f19130a, "Loading(categories=", Separators.RPAREN);
    }
}
