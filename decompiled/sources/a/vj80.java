package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vj80 implements wj80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37515a;

    public vj80(boolean z) {
        this.f37515a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vj80) && this.f37515a == ((vj80) obj).f37515a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37515a);
    }

    public final String toString() {
        return defpackage.c.d("Loading(isInitial=", Separators.RPAREN, this.f37515a);
    }
}
