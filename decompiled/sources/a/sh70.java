package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sh70 extends zh70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32199a;

    public sh70(boolean z) {
        this.f32199a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sh70) && this.f32199a == ((sh70) obj).f32199a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32199a);
    }

    public final String toString() {
        return defpackage.c.d("GameFinished(autoSpin=", Separators.RPAREN, this.f32199a);
    }
}
