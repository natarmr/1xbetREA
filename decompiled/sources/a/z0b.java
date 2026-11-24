package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z0b implements h1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43558a;

    public final boolean equals(Object obj) {
        if (obj instanceof z0b) {
            return this.f43558a == ((z0b) obj).f43558a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43558a);
    }

    public final String toString() {
        return defpackage.c.d("DemoAvailable(value=", Separators.RPAREN, this.f43558a);
    }
}
