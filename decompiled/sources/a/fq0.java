package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fq0 implements gq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f9952a;

    public fq0(i4 i4Var) {
        i4Var.getClass();
        this.f9952a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fq0) && Intrinsics.d(this.f9952a, ((fq0) obj).f9952a);
    }

    public final int hashCode() {
        return this.f9952a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f9952a, "Loading(filterItems=", Separators.RPAREN);
    }
}
