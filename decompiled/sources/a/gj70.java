package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gj70 extends oj70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11383a;

    public gj70(boolean z) {
        this.f11383a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gj70) && this.f11383a == ((gj70) obj).f11383a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11383a);
    }

    public final String toString() {
        return defpackage.c.d("ControlsClickable(enable=", Separators.RPAREN, this.f11383a);
    }
}
