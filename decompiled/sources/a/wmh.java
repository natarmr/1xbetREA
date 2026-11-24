package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wmh implements ymh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f39406a;

    public wmh(i4 i4Var) {
        i4Var.getClass();
        this.f39406a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wmh) && Intrinsics.d(this.f39406a, ((wmh) obj).f39406a);
    }

    public final int hashCode() {
        return this.f39406a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f39406a, "Content(items=", Separators.RPAREN);
    }
}
