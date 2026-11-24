package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jj70 extends oj70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16609a;

    public jj70(boolean z) {
        this.f16609a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jj70) && this.f16609a == ((jj70) obj).f16609a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16609a);
    }

    public final String toString() {
        return defpackage.c.d("SetAutoSpinVisible(enable=", Separators.RPAREN, this.f16609a);
    }
}
