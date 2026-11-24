package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mtl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f22376a;

    public mtl(a4x a4xVar) {
        a4xVar.getClass();
        this.f22376a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mtl) && Intrinsics.d(this.f22376a, ((mtl) obj).f22376a);
    }

    public final int hashCode() {
        return this.f22376a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f22376a, "DsBottomBarModel(buttons=", Separators.RPAREN);
    }
}
