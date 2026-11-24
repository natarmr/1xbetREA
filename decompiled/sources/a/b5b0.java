package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b5b0 implements d5b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1995a;

    public b5b0(boolean z) {
        this.f1995a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5b0) && this.f1995a == ((b5b0) obj).f1995a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1995a);
    }

    public final String toString() {
        return defpackage.c.d("Loading(showShimmers=", Separators.RPAREN, this.f1995a);
    }
}
