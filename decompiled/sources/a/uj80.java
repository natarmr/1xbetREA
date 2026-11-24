package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uj80 implements wj80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35766a;

    public uj80(boolean z) {
        this.f35766a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uj80) && this.f35766a == ((uj80) obj).f35766a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35766a);
    }

    public final String toString() {
        return defpackage.c.d("Idle(endOfPaginationReached=", Separators.RPAREN, this.f35766a);
    }
}
