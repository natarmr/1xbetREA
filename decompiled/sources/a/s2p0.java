package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s2p0 implements t2p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f31513a;

    public s2p0(a4x a4xVar) {
        a4xVar.getClass();
        this.f31513a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2p0) && Intrinsics.d(this.f31513a, ((s2p0) obj).f31513a);
    }

    public final int hashCode() {
        return this.f31513a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f31513a, "Shimmers(items=", Separators.RPAREN);
    }
}
