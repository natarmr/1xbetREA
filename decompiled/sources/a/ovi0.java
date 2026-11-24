package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ovi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25927a;

    public ovi0(boolean z) {
        this.f25927a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovi0) && this.f25927a == ((ovi0) obj).f25927a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25927a);
    }

    public final String toString() {
        return defpackage.c.d("Switch(on=", Separators.RPAREN, this.f25927a);
    }
}
