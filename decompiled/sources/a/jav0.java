package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jav0 extends lav0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16210a;

    public jav0(boolean z) {
        this.f16210a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jav0) && this.f16210a == ((jav0) obj).f16210a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16210a);
    }

    public final String toString() {
        return defpackage.c.d("ShowWheel(show=", Separators.RPAREN, this.f16210a);
    }
}
