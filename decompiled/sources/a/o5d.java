package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f24682a;

    public o5d(a4x a4xVar) {
        a4xVar.getClass();
        this.f24682a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5d) && Intrinsics.d(this.f24682a, ((o5d) obj).f24682a);
    }

    public final int hashCode() {
        return this.f24682a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f24682a, "ColorsUiModel(buttons=", Separators.RPAREN);
    }
}
