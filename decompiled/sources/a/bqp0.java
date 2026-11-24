package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bqp0 implements fqp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f3044a;

    public final boolean equals(Object obj) {
        if (obj instanceof bqp0) {
            return Intrinsics.d(this.f3044a, ((bqp0) obj).f3044a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3044a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f3044a);
    }
}
