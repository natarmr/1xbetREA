package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z5j0 implements a6j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43820a;

    public final boolean equals(Object obj) {
        if (obj instanceof z5j0) {
            return this.f43820a == ((z5j0) obj).f43820a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43820a);
    }

    public final String toString() {
        return defpackage.c.d("VipBetToggleChangeState(value=", Separators.RPAREN, this.f43820a);
    }
}
