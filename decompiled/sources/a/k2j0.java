package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k2j0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17576a;

    public final boolean equals(Object obj) {
        if (obj instanceof k2j0) {
            return this.f17576a == ((k2j0) obj).f17576a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17576a);
    }

    public final String toString() {
        return defpackage.c.d("AcceptChangeIncreaseType(value=", Separators.RPAREN, this.f17576a);
    }
}
