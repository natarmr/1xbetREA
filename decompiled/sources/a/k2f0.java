package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k2f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17568a;

    public k2f0(boolean z) {
        this.f17568a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2f0) && this.f17568a == ((k2f0) obj).f17568a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17568a);
    }

    public final String toString() {
        return defpackage.c.d("OnTabsVisibilityChange(isVisible=", Separators.RPAREN, this.f17568a);
    }
}
