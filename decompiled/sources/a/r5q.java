package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r5q implements v5q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f29900a;

    public r5q(a4x a4xVar) {
        a4xVar.getClass();
        this.f29900a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5q) && Intrinsics.d(this.f29900a, ((r5q) obj).f29900a);
    }

    public final int hashCode() {
        return this.f29900a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f29900a, "Content(categoryFilterStates=", Separators.RPAREN);
    }
}
