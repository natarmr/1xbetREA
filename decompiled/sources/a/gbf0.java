package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gbf0 implements lbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11015a;

    public gbf0(boolean z) {
        this.f11015a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbf0) && this.f11015a == ((gbf0) obj).f11015a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11015a);
    }

    public final String toString() {
        return defpackage.c.d("ShowFileDownloadingSnack(show=", Separators.RPAREN, this.f11015a);
    }
}
