package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t0t implements w0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33137a;

    public t0t(boolean z) {
        this.f33137a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0t) && this.f33137a == ((t0t) obj).f33137a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33137a);
    }

    public final String toString() {
        return defpackage.c.d("Error(isControlPanelVisible=", Separators.RPAREN, this.f33137a);
    }
}
