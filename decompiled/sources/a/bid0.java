package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bid0 implements hid0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2655a;

    public bid0(boolean z) {
        this.f2655a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bid0) && this.f2655a == ((bid0) obj).f2655a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2655a);
    }

    public final String toString() {
        return defpackage.c.d("SetLoading(loading=", Separators.RPAREN, this.f2655a);
    }
}
