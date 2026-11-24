package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hp6 implements ip6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13427a;

    public hp6(boolean z) {
        this.f13427a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp6) && this.f13427a == ((hp6) obj).f13427a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13427a);
    }

    public final String toString() {
        return defpackage.c.d("ShowWaitDialog(show=", Separators.RPAREN, this.f13427a);
    }
}
