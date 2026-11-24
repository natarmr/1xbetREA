package a;

import android.gov.nist.core.Separators;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class qfl0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8l0 f28640a;

    public qfl0(j8l0 j8l0Var) {
        this.f28640a = j8l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfl0) && this.f28640a == ((qfl0) obj).f28640a;
    }

    @Override // a.p6t0
    public final String getKey() {
        return super.getKey() + UUID.randomUUID();
    }

    public final int hashCode() {
        return this.f28640a.hashCode();
    }

    public final String toString() {
        return "SportItemShimmerUiModel(type=" + this.f28640a + Separators.RPAREN;
    }
}
