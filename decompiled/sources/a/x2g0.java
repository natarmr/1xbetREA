package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x2g0 implements z2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f40166a;

    public x2g0(a4x a4xVar) {
        a4xVar.getClass();
        this.f40166a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2g0) && Intrinsics.d(this.f40166a, ((x2g0) obj).f40166a);
    }

    public final int hashCode() {
        return this.f40166a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f40166a, "Loaded(items=", Separators.RPAREN);
    }
}
