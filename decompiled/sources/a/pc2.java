package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pc2 implements uc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26737a;

    public final boolean equals(Object obj) {
        if (obj instanceof pc2) {
            return this.f26737a == ((pc2) obj).f26737a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26737a);
    }

    public final String toString() {
        return defpackage.c.d("OnMultiSelectShown(value=", Separators.RPAREN, this.f26737a);
    }
}
