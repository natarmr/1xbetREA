package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class uxe0 implements zxe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36438a;

    public uxe0(boolean z) {
        this.f36438a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxe0) && this.f36438a == ((uxe0) obj).f36438a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36438a);
    }

    public final String toString() {
        return defpackage.c.d("ShowFileDownloadingSnack(show=", Separators.RPAREN, this.f36438a);
    }
}
