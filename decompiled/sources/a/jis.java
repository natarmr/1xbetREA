package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jis implements sis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o49 f16590a;

    public final boolean equals(Object obj) {
        if (obj instanceof jis) {
            return this.f16590a == ((jis) obj).f16590a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16590a.hashCode();
    }

    public final String toString() {
        return "BroadcastingTabShow(type=" + this.f16590a + Separators.RPAREN;
    }
}
