package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z7s0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43935a;

    public final boolean equals(Object obj) {
        if (obj instanceof z7s0) {
            return this.f43935a == ((z7s0) obj).f43935a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43935a);
    }

    public final String toString() {
        return defpackage.c.d("Collapsed(value=", Separators.RPAREN, this.f43935a);
    }
}
