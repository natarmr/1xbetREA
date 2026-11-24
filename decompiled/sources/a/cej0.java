package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cej0 implements eej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4216a;

    public static String a(boolean z) {
        return defpackage.c.d("Enable(value=", Separators.RPAREN, z);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cej0) {
            return this.f4216a == ((cej0) obj).f4216a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4216a);
    }

    public final String toString() {
        return a(this.f4216a);
    }
}
