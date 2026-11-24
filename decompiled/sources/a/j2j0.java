package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j2j0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15782a;

    public final boolean equals(Object obj) {
        if (obj instanceof j2j0) {
            return this.f15782a == ((j2j0) obj).f15782a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15782a);
    }

    public final String toString() {
        return defpackage.c.d("AcceptAnyChangeType(value=", Separators.RPAREN, this.f15782a);
    }
}
