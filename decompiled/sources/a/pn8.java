package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class pn8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27274a;

    public pn8(boolean z) {
        this.f27274a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pn8) && this.f27274a == ((pn8) obj).f27274a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27274a);
    }

    public final String toString() {
        return defpackage.c.d("BottomContentKeyModel(isMakeBetButtonEnabled=", Separators.RPAREN, this.f27274a);
    }
}
