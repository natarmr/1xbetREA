package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b9h0 implements g9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2209a;

    public b9h0(a4x a4xVar) {
        a4xVar.getClass();
        this.f2209a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9h0) && Intrinsics.d(this.f2209a, ((b9h0) obj).f2209a);
    }

    public final int hashCode() {
        return this.f2209a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f2209a, "SuccessfulSearch(items=", Separators.RPAREN);
    }
}
