package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kqh implements oqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f18723a;

    public kqh(i4 i4Var) {
        i4Var.getClass();
        this.f18723a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kqh) && Intrinsics.d(this.f18723a, ((kqh) obj).f18723a);
    }

    public final int hashCode() {
        return this.f18723a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f18723a, "BeatMap(cells=", Separators.RPAREN);
    }
}
