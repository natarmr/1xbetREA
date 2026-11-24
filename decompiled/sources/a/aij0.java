package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class aij0 implements dij0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f926a;

    public static String a(boolean z) {
        return defpackage.c.d("Enable(value=", Separators.RPAREN, z);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aij0) {
            return this.f926a == ((aij0) obj).f926a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f926a);
    }

    public final String toString() {
        return a(this.f926a);
    }
}
