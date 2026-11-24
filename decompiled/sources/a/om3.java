package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class om3 implements pm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25485a;

    public final boolean equals(Object obj) {
        if (obj instanceof om3) {
            return this.f25485a == ((om3) obj).f25485a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25485a);
    }

    public final String toString() {
        return defpackage.c.d("Error(isFullExternal=", Separators.RPAREN, this.f25485a);
    }
}
