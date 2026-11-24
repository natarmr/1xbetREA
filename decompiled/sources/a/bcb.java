package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bcb implements dcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2348a;

    public final boolean equals(Object obj) {
        if (obj instanceof bcb) {
            return this.f2348a == ((bcb) obj).f2348a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2348a);
    }

    public final String toString() {
        return defpackage.c.d("Expanded(value=", Separators.RPAREN, this.f2348a);
    }
}
