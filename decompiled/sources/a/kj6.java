package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kj6 implements nj6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18371a;

    public kj6(boolean z) {
        this.f18371a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kj6) && this.f18371a == ((kj6) obj).f18371a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18371a);
    }

    public final String toString() {
        return defpackage.c.d("Progress(rtlSupport=", Separators.RPAREN, this.f18371a);
    }
}
