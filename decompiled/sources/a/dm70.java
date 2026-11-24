package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dm70 extends im70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6309a;

    public dm70(boolean z) {
        this.f6309a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm70) && this.f6309a == ((dm70) obj).f6309a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6309a);
    }

    public final String toString() {
        return defpackage.c.d("SetAutoSpinVisible(enable=", Separators.RPAREN, this.f6309a);
    }
}
