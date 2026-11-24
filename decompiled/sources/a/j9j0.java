package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j9j0 implements l9j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16142a;

    public static String a(boolean z) {
        return defpackage.c.d("Enable(value=", Separators.RPAREN, z);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j9j0) {
            return this.f16142a == ((j9j0) obj).f16142a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16142a);
    }

    public final String toString() {
        return a(this.f16142a);
    }
}
