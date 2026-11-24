package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fj70 extends oj70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9624a;

    public fj70(boolean z) {
        this.f9624a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fj70) && this.f9624a == ((fj70) obj).f9624a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9624a);
    }

    public final String toString() {
        return defpackage.c.d("AutoSpinButtonChecked(enable=", Separators.RPAREN, this.f9624a);
    }
}
