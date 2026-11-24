package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r5c0 implements s5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29878a;

    public final boolean equals(Object obj) {
        if (obj instanceof r5c0) {
            return this.f29878a == ((r5c0) obj).f29878a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29878a);
    }

    public final String toString() {
        return defpackage.c.d("ShowBalance(value=", Separators.RPAREN, this.f29878a);
    }
}
