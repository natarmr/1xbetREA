package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gzs implements hzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12196a;

    public gzs(boolean z) {
        this.f12196a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzs) && this.f12196a == ((gzs) obj).f12196a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12196a);
    }

    public final String toString() {
        return defpackage.c.d("ServiceError(isControlPanelVisible=", Separators.RPAREN, this.f12196a);
    }
}
