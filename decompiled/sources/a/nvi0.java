package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nvi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24188a;

    public nvi0(boolean z) {
        this.f24188a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvi0) && this.f24188a == ((nvi0) obj).f24188a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24188a);
    }

    public final String toString() {
        return defpackage.c.d("RadioButton(selected=", Separators.RPAREN, this.f24188a);
    }
}
