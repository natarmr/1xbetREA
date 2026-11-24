package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class yx30 implements fy30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43403a;

    public yx30(boolean z) {
        this.f43403a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yx30) && this.f43403a == ((yx30) obj).f43403a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43403a);
    }

    public final String toString() {
        return defpackage.c.d("Accordion(isExpand=", Separators.RPAREN, this.f43403a);
    }
}
