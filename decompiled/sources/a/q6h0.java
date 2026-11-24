package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q6h0 implements r6h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28198a;

    public q6h0(boolean z) {
        this.f28198a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6h0) && this.f28198a == ((q6h0) obj).f28198a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28198a);
    }

    public final String toString() {
        return defpackage.c.d("ShowProgress(show=", Separators.RPAREN, this.f28198a);
    }
}
