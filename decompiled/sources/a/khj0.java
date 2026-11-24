package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class khj0 implements ohj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18296a;

    public static String a(boolean z) {
        return defpackage.c.d("Enable(value=", Separators.RPAREN, z);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof khj0) {
            return this.f18296a == ((khj0) obj).f18296a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18296a);
    }

    public final String toString() {
        return a(this.f18296a);
    }
}
