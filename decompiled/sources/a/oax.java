package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class oax implements pax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24951a;

    public oax(boolean z) {
        this.f24951a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oax) && this.f24951a == ((oax) obj).f24951a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24951a);
    }

    public final String toString() {
        return defpackage.c.d("ShowFileDownloadingSnack(show=", Separators.RPAREN, this.f24951a);
    }
}
