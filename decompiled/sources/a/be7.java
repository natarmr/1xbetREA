package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class be7 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2434a;

    public final boolean equals(Object obj) {
        if (obj instanceof be7) {
            return this.f2434a == ((be7) obj).f2434a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2434a);
    }

    public final String toString() {
        return defpackage.c.d("IsClickable(value=", Separators.RPAREN, this.f2434a);
    }
}
