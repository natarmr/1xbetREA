package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ftr implements htr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f10128a;

    public ftr(a4x a4xVar) {
        a4xVar.getClass();
        this.f10128a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ftr) && Intrinsics.d(this.f10128a, ((ftr) obj).f10128a);
    }

    public final int hashCode() {
        return this.f10128a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f10128a, "Games(items=", Separators.RPAREN);
    }
}
