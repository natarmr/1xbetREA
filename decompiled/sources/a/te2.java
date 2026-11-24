package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class te2 implements ye2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33798a;

    public te2(boolean z) {
        this.f33798a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te2) && this.f33798a == ((te2) obj).f33798a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33798a);
    }

    public final String toString() {
        return defpackage.c.d("OnMultiSelectShown(show=", Separators.RPAREN, this.f33798a);
    }
}
