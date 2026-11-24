package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rsj0 implements ssj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31034a;

    public rsj0(boolean z) {
        this.f31034a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsj0) && this.f31034a == ((rsj0) obj).f31034a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31034a);
    }

    public final String toString() {
        return defpackage.c.d("Show(show=", Separators.RPAREN, this.f31034a);
    }
}
