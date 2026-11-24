package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vkp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37584a;

    public final boolean equals(Object obj) {
        if (obj instanceof vkp) {
            return this.f37584a == ((vkp) obj).f37584a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37584a);
    }

    public final String toString() {
        return defpackage.c.d("Expanded(value=", Separators.RPAREN, this.f37584a);
    }
}
