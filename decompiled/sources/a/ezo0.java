package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ezo0 implements hzo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f8681a;

    public ezo0(a4x a4xVar) {
        a4xVar.getClass();
        this.f8681a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezo0) && Intrinsics.d(this.f8681a, ((ezo0) obj).f8681a);
    }

    public final int hashCode() {
        return this.f8681a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f8681a, "Content(items=", Separators.RPAREN);
    }
}
