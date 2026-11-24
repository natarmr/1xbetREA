package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y630 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42077a;

    public y630(boolean z) {
        this.f42077a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y630) && this.f42077a == ((y630) obj).f42077a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42077a);
    }

    public final String toString() {
        return defpackage.c.d("ToolbarState(searchCollapsed=", Separators.RPAREN, this.f42077a);
    }
}
