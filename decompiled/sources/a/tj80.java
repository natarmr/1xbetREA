package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tj80 implements wj80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f34037a;

    public tj80(Throwable th) {
        th.getClass();
        this.f34037a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj80) && Intrinsics.d(this.f34037a, ((tj80) obj).f34037a);
    }

    public final int hashCode() {
        return this.f34037a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(throwable=", Separators.RPAREN, this.f34037a);
    }
}
