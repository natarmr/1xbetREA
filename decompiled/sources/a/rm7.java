package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class rm7 implements vm7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30731a;

    public rm7(boolean z) {
        this.f30731a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rm7) && this.f30731a == ((rm7) obj).f30731a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30731a);
    }

    public final String toString() {
        return defpackage.c.d("EditCoupon(resetToExpress=", Separators.RPAREN, this.f30731a);
    }
}
