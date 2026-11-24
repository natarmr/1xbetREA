package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ue70 extends we70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35511a;

    public ue70(boolean z) {
        this.f35511a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue70) && this.f35511a == ((ue70) obj).f35511a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35511a);
    }

    public final String toString() {
        return defpackage.c.d("ShowBalanceDialog(value=", Separators.RPAREN, this.f35511a);
    }
}
