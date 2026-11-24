package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kj70 extends oj70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18374a;

    public kj70(boolean z) {
        this.f18374a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kj70) && this.f18374a == ((kj70) obj).f18374a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18374a);
    }

    public final String toString() {
        return defpackage.c.d("SetInstantBetButtonChecked(enable=", Separators.RPAREN, this.f18374a);
    }
}
