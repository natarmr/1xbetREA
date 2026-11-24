package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qmg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28981a;

    public qmg0(boolean z) {
        this.f28981a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmg0) && this.f28981a == ((qmg0) obj).f28981a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28981a);
    }

    public final String toString() {
        return defpackage.c.d("AllowDebug(allow=", Separators.RPAREN, this.f28981a);
    }
}
