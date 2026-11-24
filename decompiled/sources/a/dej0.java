package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dej0 implements eej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5954a;

    public static String a(boolean z) {
        return defpackage.c.d("Switched(value=", Separators.RPAREN, z);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dej0) {
            return this.f5954a == ((dej0) obj).f5954a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5954a);
    }

    public final String toString() {
        return a(this.f5954a);
    }
}
