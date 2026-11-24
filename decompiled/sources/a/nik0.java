package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nik0 implements pik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23593a;

    public final boolean equals(Object obj) {
        if (obj instanceof nik0) {
            return this.f23593a == ((nik0) obj).f23593a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23593a);
    }

    public final String toString() {
        return defpackage.c.d("Progress(show=", Separators.RPAREN, this.f23593a);
    }
}
