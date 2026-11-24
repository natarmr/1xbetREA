package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ixn0 implements uxn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15550a;

    public ixn0(String str) {
        str.getClass();
        this.f15550a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixn0) && Intrinsics.d(this.f15550a, ((ixn0) obj).f15550a);
    }

    public final int hashCode() {
        return this.f15550a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBetError(errorMessage=", this.f15550a, Separators.RPAREN);
    }
}
