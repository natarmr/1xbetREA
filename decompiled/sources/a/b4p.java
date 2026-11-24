package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b4p implements d4p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f1970a;

    public b4p(a4x a4xVar) {
        a4xVar.getClass();
        this.f1970a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4p) && Intrinsics.d(this.f1970a, ((b4p) obj).f1970a);
    }

    public final int hashCode() {
        return this.f1970a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f1970a, "Loading(shimmerList=", Separators.RPAREN);
    }
}
