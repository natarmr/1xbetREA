package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bx20 implements cx20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3356a;

    public final boolean equals(Object obj) {
        if (obj instanceof bx20) {
            return this.f3356a == ((bx20) obj).f3356a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3356a);
    }

    public final String toString() {
        return defpackage.c.d("IsActive(value=", Separators.RPAREN, this.f3356a);
    }
}
