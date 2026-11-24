package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rh implements sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30462a;

    public final boolean equals(Object obj) {
        if (obj instanceof rh) {
            return this.f30462a == ((rh) obj).f30462a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30462a);
    }

    public final String toString() {
        return defpackage.c.d("Stream(autoStreamEnable=", Separators.RPAREN, this.f30462a);
    }
}
