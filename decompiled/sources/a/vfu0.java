package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37352a;

    public vfu0(boolean z) {
        this.f37352a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfu0) && this.f37352a == ((vfu0) obj).f37352a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37352a);
    }

    public final String toString() {
        return defpackage.c.d("InitBalance(show=", Separators.RPAREN, this.f37352a);
    }
}
