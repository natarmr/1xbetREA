package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rol0 implements vol0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30845a;

    public final boolean equals(Object obj) {
        if (obj instanceof rol0) {
            return this.f30845a == ((rol0) obj).f30845a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30845a);
    }

    public final String toString() {
        return defpackage.c.d("OnGameGroupClick(live=", Separators.RPAREN, this.f30845a);
    }
}
