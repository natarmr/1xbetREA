package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i9c0 implements k9c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14379a;

    public i9c0(boolean z) {
        this.f14379a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i9c0) && this.f14379a == ((i9c0) obj).f14379a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14379a);
    }

    public final String toString() {
        return defpackage.c.d("UpdateKeyboardState(isKeyboardOpen=", Separators.RPAREN, this.f14379a);
    }
}
