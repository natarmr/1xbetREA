package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zl70 extends im70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44566a;

    public zl70(boolean z) {
        this.f44566a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl70) && this.f44566a == ((zl70) obj).f44566a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44566a);
    }

    public final String toString() {
        return defpackage.c.d("AutoSpinButtonChecked(enable=", Separators.RPAREN, this.f44566a);
    }
}
