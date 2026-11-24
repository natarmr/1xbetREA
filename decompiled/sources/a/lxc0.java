package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lxc0 implements pxc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20808a;

    public lxc0(boolean z) {
        this.f20808a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxc0) && this.f20808a == ((lxc0) obj).f20808a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20808a);
    }

    public final String toString() {
        return defpackage.c.d("EnableDebugMode(enabled=", Separators.RPAREN, this.f20808a);
    }
}
