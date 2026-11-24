package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x5c0 implements c6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f40309a;

    public x5c0(a4x a4xVar) {
        a4xVar.getClass();
        this.f40309a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5c0) && Intrinsics.d(this.f40309a, ((x5c0) obj).f40309a);
    }

    public final int hashCode() {
        return this.f40309a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f40309a, "Content(banners=", Separators.RPAREN);
    }
}
