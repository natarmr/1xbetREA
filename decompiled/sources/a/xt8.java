package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xt8 implements su8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41452a;

    public xt8(boolean z) {
        this.f41452a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt8) && this.f41452a == ((xt8) obj).f41452a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41452a);
    }

    public final String toString() {
        return defpackage.c.d("OnHeaderCollapsedStateChange(isCollapsed=", Separators.RPAREN, this.f41452a);
    }
}
