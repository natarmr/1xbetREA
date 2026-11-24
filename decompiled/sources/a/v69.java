package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v69 implements e79 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36864a;

    public v69(boolean z) {
        this.f36864a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v69) && this.f36864a == ((v69) obj).f36864a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36864a);
    }

    public final String toString() {
        return defpackage.c.d("OnZoneFormatChangeAvailable(available=", Separators.RPAREN, this.f36864a);
    }
}
