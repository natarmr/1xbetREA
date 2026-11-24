package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xuq0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41523a;

    public final boolean equals(Object obj) {
        if (obj instanceof xuq0) {
            return this.f41523a == ((xuq0) obj).f41523a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41523a);
    }

    public final String toString() {
        return defpackage.c.d("SwitchStateChange(enable=", Separators.RPAREN, this.f41523a);
    }
}
