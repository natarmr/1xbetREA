package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class auq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1491a;

    public auq0(boolean z) {
        this.f1491a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof auq0) && this.f1491a == ((auq0) obj).f1491a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1491a);
    }

    public final String toString() {
        return defpackage.c.d("AllowDebugIframeModel(enable=", Separators.RPAREN, this.f1491a);
    }
}
