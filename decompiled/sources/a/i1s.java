package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i1s implements v1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14015a;

    public i1s(boolean z) {
        this.f14015a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1s) && this.f14015a == ((i1s) obj).f14015a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14015a);
    }

    public final String toString() {
        return defpackage.c.d("ExpandClick(isExpanded=", Separators.RPAREN, this.f14015a);
    }
}
