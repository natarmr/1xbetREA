package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jsc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f17045a;

    public jsc(a4x a4xVar) {
        a4xVar.getClass();
        this.f17045a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsc) && Intrinsics.d(this.f17045a, ((jsc) obj).f17045a);
    }

    public final int hashCode() {
        return this.f17045a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f17045a, "ClearTeamsUiState(items=", Separators.RPAREN);
    }
}
