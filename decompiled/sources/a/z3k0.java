package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z3k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43723a;

    public z3k0(boolean z) {
        this.f43723a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3k0) && this.f43723a == ((z3k0) obj).f43723a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43723a);
    }

    public final String toString() {
        return defpackage.c.d("SingleStageStateModel(isHeaderVisible=", Separators.RPAREN, this.f43723a);
    }
}
