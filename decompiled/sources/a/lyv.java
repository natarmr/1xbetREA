package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lyv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20881a;

    public lyv(boolean z) {
        this.f20881a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lyv) && this.f20881a == ((lyv) obj).f20881a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20881a);
    }

    public final String toString() {
        return defpackage.c.d("ApplyButtonState(isEnabled=", Separators.RPAREN, this.f20881a);
    }
}
