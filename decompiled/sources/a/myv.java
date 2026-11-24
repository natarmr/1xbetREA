package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class myv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22621a;

    public myv(boolean z) {
        this.f22621a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof myv) && this.f22621a == ((myv) obj).f22621a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22621a);
    }

    public final String toString() {
        return defpackage.c.d("ResetButtonState(isEnabled=", Separators.RPAREN, this.f22621a);
    }
}
