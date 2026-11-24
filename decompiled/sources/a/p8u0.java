package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p8u0 implements s8u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f26577a;

    public p8u0(a4x a4xVar) {
        a4xVar.getClass();
        this.f26577a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8u0) && Intrinsics.d(this.f26577a, ((p8u0) obj).f26577a);
    }

    public final int hashCode() {
        return this.f26577a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f26577a, "Content(items=", Separators.RPAREN);
    }
}
