package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bqk0 extends dqk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f3036a;

    public bqk0(Throwable th) {
        th.getClass();
        this.f3036a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqk0) && Intrinsics.d(this.f3036a, ((bqk0) obj).f3036a);
    }

    public final int hashCode() {
        return this.f3036a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Failure(throwable=", Separators.RPAREN, this.f3036a);
    }
}
