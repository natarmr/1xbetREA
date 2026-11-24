package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cph implements eph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f4746a;

    public cph(a4x a4xVar) {
        a4xVar.getClass();
        this.f4746a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cph) && Intrinsics.d(this.f4746a, ((cph) obj).f4746a);
    }

    public final int hashCode() {
        return this.f4746a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f4746a, "CellIcon(cells=", Separators.RPAREN);
    }
}
