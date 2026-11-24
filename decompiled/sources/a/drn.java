package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class drn implements hrn {
    public static final crn Companion = new crn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6569a;

    public /* synthetic */ drn(int i, int i2) {
        if (1 == (i & 1)) {
            this.f6569a = i2;
        } else {
            m2x.I(i, 1, brn.f3086a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drn) && this.f6569a == ((drn) obj).f6569a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6569a);
    }

    public final String toString() {
        return ua80.e(this.f6569a, "LockEmailAuthRequest(lockEmailAuth=", Separators.RPAREN);
    }

    public drn(int i) {
        this.f6569a = i;
    }
}
