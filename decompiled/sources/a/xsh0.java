package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xsh0 implements bth0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41417a;

    public final boolean equals(Object obj) {
        if (obj instanceof xsh0) {
            return this.f41417a == ((xsh0) obj).f41417a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41417a);
    }

    public final String toString() {
        return defpackage.c.d("Checked(value=", Separators.RPAREN, this.f41417a);
    }
}
