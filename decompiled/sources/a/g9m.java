package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g9m implements i9m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f10921a;

    public g9m(a4x a4xVar) {
        a4xVar.getClass();
        this.f10921a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9m) && Intrinsics.d(this.f10921a, ((g9m) obj).f10921a);
    }

    public final int hashCode() {
        return this.f10921a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f10921a, "Content(items=", Separators.RPAREN);
    }
}
