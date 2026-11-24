package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l0b0 implements n0b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f19192a;

    public l0b0(a4x a4xVar) {
        a4xVar.getClass();
        this.f19192a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0b0) && Intrinsics.d(this.f19192a, ((l0b0) obj).f19192a);
    }

    public final int hashCode() {
        return this.f19192a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f19192a, "Content(items=", Separators.RPAREN);
    }
}
