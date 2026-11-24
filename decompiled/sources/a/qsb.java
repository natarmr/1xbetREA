package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qsb implements vsb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29250a;

    public qsb(boolean z) {
        this.f29250a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qsb) && this.f29250a == ((qsb) obj).f29250a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29250a);
    }

    public final String toString() {
        return defpackage.c.d("OnBooleanValueChanged(value=", Separators.RPAREN, this.f29250a);
    }
}
