package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class muq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22424a;

    public muq0(boolean z) {
        this.f22424a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof muq0) && this.f22424a == ((muq0) obj).f22424a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22424a);
    }

    public final String toString() {
        return defpackage.c.d("SipCRMTestModel(enable=", Separators.RPAREN, this.f22424a);
    }
}
