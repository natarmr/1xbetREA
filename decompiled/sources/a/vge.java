package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vge implements bie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f37377a;

    public vge(a4x a4xVar) {
        a4xVar.getClass();
        this.f37377a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vge) && Intrinsics.d(this.f37377a, ((vge) obj).f37377a);
    }

    public final int hashCode() {
        return this.f37377a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f37377a, "Content(items=", Separators.RPAREN);
    }
}
