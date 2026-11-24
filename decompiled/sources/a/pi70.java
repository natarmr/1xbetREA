package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pi70 extends si70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27031a;

    public pi70(boolean z) {
        this.f27031a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pi70) && this.f27031a == ((pi70) obj).f27031a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27031a);
    }

    public final String toString() {
        return defpackage.c.d("Enable(enable=", Separators.RPAREN, this.f27031a);
    }
}
