package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rjp0 implements sjp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30607a;

    public final boolean equals(Object obj) {
        if (obj instanceof rjp0) {
            return this.f30607a == ((rjp0) obj).f30607a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30607a);
    }

    public final String toString() {
        return defpackage.c.d("SelectedState(value=", Separators.RPAREN, this.f30607a);
    }
}
