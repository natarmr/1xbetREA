package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nxv extends rkb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f24301a;

    public nxv(a4x a4xVar) {
        a4xVar.getClass();
        this.f24301a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxv) && Intrinsics.d(this.f24301a, ((nxv) obj).f24301a);
    }

    public final int hashCode() {
        return this.f24301a.hashCode() - 1582665772;
    }

    public final String toString() {
        return h97.i(this.f24301a, "HighRatedChampsUiItem(id=high_rated_champs, champs=", Separators.RPAREN);
    }
}
