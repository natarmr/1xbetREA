package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d9m implements f9m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f5708a;

    public d9m(a4x a4xVar) {
        a4xVar.getClass();
        this.f5708a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9m) && Intrinsics.d(this.f5708a, ((d9m) obj).f5708a);
    }

    public final int hashCode() {
        return this.f5708a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f5708a, "Content(items=", Separators.RPAREN);
    }
}
