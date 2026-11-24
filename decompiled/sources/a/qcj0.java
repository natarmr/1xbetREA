package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qcj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28486a;

    public qcj0(boolean z) {
        this.f28486a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcj0) && this.f28486a == ((qcj0) obj).f28486a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28486a);
    }

    public final String toString() {
        return defpackage.c.d("ShowWarningOpenSiteDialog(officialSite=", Separators.RPAREN, this.f28486a);
    }
}
