package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g7g0 implements h7g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10811a;

    public g7g0(boolean z) {
        this.f10811a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7g0) && this.f10811a == ((g7g0) obj).f10811a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10811a);
    }

    public final String toString() {
        return defpackage.c.d("Empty(rtlSupport=", Separators.RPAREN, this.f10811a);
    }
}
