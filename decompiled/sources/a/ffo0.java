package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ffo0 implements hfo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9456a;

    public final boolean equals(Object obj) {
        if (obj instanceof ffo0) {
            return this.f9456a == ((ffo0) obj).f9456a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9456a);
    }

    public final String toString() {
        return defpackage.c.d("IsSelected(value=", Separators.RPAREN, this.f9456a);
    }
}
