package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o4f0 implements t4f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24632a;

    public o4f0(boolean z) {
        this.f24632a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4f0) && this.f24632a == ((o4f0) obj).f24632a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24632a);
    }

    public final String toString() {
        return defpackage.c.d("ShowFileDownloadingSnack(show=", Separators.RPAREN, this.f24632a);
    }
}
