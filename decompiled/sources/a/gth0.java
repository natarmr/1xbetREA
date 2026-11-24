package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gth0 implements kth0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11881a;

    public gth0(boolean z) {
        this.f11881a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gth0) && this.f11881a == ((gth0) obj).f11881a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11881a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return defpackage.c.d("Cell(isFirst=false, isLast=", Separators.RPAREN, this.f11881a);
    }
}
