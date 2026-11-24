package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rro implements tro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30994a;

    public rro(boolean z) {
        this.f30994a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rro) && this.f30994a == ((rro) obj).f30994a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30994a);
    }

    public final String toString() {
        return defpackage.c.d("Loading(showShimmers=", Separators.RPAREN, this.f30994a);
    }
}
