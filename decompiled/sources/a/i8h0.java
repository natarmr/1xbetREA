package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i8h0 implements g9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f14338a;

    public i8h0(a4x a4xVar) {
        a4xVar.getClass();
        this.f14338a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8h0) && Intrinsics.d(this.f14338a, ((i8h0) obj).f14338a);
    }

    public final int hashCode() {
        return this.f14338a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f14338a, "EmptySearch(items=", Separators.RPAREN);
    }
}
