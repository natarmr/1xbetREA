package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qg10 implements sg10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f28661a;

    public qg10(i4 i4Var) {
        i4Var.getClass();
        this.f28661a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qg10) && Intrinsics.d(this.f28661a, ((qg10) obj).f28661a);
    }

    public final int hashCode() {
        return this.f28661a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f28661a, "Content(items=", Separators.RPAREN);
    }
}
