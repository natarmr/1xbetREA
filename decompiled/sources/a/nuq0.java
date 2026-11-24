package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nuq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24158a;

    public nuq0(boolean z) {
        this.f24158a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nuq0) && this.f24158a == ((nuq0) obj).f24158a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24158a);
    }

    public final String toString() {
        return defpackage.c.d("SipCRMV2TestModel(enable=", Separators.RPAREN, this.f24158a);
    }
}
