package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class xtd implements aud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41460a;

    public xtd(boolean z) {
        this.f41460a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xtd) && this.f41460a == ((xtd) obj).f41460a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41460a);
    }

    public final String toString() {
        return defpackage.c.d("HasIncompatibleEventsWithBetBuilder(isBetBuilder=", Separators.RPAREN, this.f41460a);
    }
}
