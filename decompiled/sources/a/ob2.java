package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ob2 implements tb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24956a;

    public final boolean equals(Object obj) {
        if (obj instanceof ob2) {
            return this.f24956a == ((ob2) obj).f24956a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24956a);
    }

    public final String toString() {
        return defpackage.c.d("OnMultiSelectShown(value=", Separators.RPAREN, this.f24956a);
    }
}
