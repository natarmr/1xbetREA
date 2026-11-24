package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vt70 implements cu70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37991a;

    public final boolean equals(Object obj) {
        if (obj instanceof vt70) {
            return this.f37991a == ((vt70) obj).f37991a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37991a);
    }

    public final String toString() {
        return defpackage.c.d("ScreenLock(isLock=", Separators.RPAREN, this.f37991a);
    }
}
