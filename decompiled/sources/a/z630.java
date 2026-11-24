package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z630 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43845a;

    public z630(boolean z) {
        this.f43845a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z630) && this.f43845a == ((z630) obj).f43845a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43845a);
    }

    public final String toString() {
        return defpackage.c.d("ToolbarState(searchCollapsed=", Separators.RPAREN, this.f43845a);
    }
}
