package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zaf implements bbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44064a;

    public zaf(boolean z) {
        this.f44064a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zaf) && this.f44064a == ((zaf) obj).f44064a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44064a);
    }

    public final String toString() {
        return defpackage.c.d("SetLoading(loading=", Separators.RPAREN, this.f44064a);
    }
}
