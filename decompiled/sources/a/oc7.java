package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class oc7 extends qc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25014a;

    public oc7(boolean z) {
        this.f25014a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oc7) && this.f25014a == ((oc7) obj).f25014a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25014a);
    }

    public final String toString() {
        return defpackage.c.d("EnableBetInfo(enable=", Separators.RPAREN, this.f25014a);
    }
}
