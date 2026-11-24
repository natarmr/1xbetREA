package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fam0 implements ham0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9216a;

    public final boolean equals(Object obj) {
        if (obj instanceof fam0) {
            return this.f9216a == ((fam0) obj).f9216a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9216a);
    }

    public final String toString() {
        return defpackage.c.d("Selected(value=", Separators.RPAREN, this.f9216a);
    }
}
