package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e3j0 implements g3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7139a;

    public final boolean equals(Object obj) {
        if (obj instanceof e3j0) {
            return this.f7139a == ((e3j0) obj).f7139a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7139a);
    }

    public final String toString() {
        return defpackage.c.d("DefaultBetSumToggleChangeState(value=", Separators.RPAREN, this.f7139a);
    }
}
