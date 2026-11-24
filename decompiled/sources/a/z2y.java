package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z2y implements e3y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f43694a;

    public z2y(a4x a4xVar) {
        a4xVar.getClass();
        this.f43694a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2y) && Intrinsics.d(this.f43694a, ((z2y) obj).f43694a);
    }

    public final int hashCode() {
        return this.f43694a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f43694a, "Content(tirageUiItems=", Separators.RPAREN);
    }
}
