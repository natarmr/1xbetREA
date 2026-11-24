package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qro implements tro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f29219a;

    public qro(Throwable th) {
        th.getClass();
        this.f29219a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qro) && Intrinsics.d(this.f29219a, ((qro) obj).f29219a);
    }

    public final int hashCode() {
        return this.f29219a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f29219a);
    }
}
