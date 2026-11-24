package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l2j0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19312a;

    public final boolean equals(Object obj) {
        if (obj instanceof l2j0) {
            return this.f19312a == ((l2j0) obj).f19312a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19312a);
    }

    public final String toString() {
        return defpackage.c.d("ConfirmAnyChangeType(value=", Separators.RPAREN, this.f19312a);
    }
}
