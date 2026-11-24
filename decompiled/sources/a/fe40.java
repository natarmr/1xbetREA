package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fe40 implements he40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f9387a;

    public fe40(a4x a4xVar) {
        a4xVar.getClass();
        this.f9387a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe40) && Intrinsics.d(this.f9387a, ((fe40) obj).f9387a);
    }

    public final int hashCode() {
        return this.f9387a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f9387a, "ListMode(players=", Separators.RPAREN);
    }
}
