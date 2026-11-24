package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tnf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34231a;

    public final boolean equals(Object obj) {
        if (obj instanceof tnf) {
            return this.f34231a == ((tnf) obj).f34231a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34231a);
    }

    public final String toString() {
        return defpackage.c.d("NeedExtraMargin(value=", Separators.RPAREN, this.f34231a);
    }
}
