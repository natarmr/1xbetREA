package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pk70 extends rk70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27122a;

    public pk70(boolean z) {
        this.f27122a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pk70) && this.f27122a == ((pk70) obj).f27122a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27122a);
    }

    public final String toString() {
        return defpackage.c.d("EnableButtons(enable=", Separators.RPAREN, this.f27122a);
    }
}
