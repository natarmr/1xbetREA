package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kde implements pde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f18102a;

    public kde(a4x a4xVar) {
        a4xVar.getClass();
        this.f18102a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kde) && Intrinsics.d(this.f18102a, ((kde) obj).f18102a);
    }

    public final int hashCode() {
        return this.f18102a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f18102a, "Success(items=", Separators.RPAREN);
    }
}
