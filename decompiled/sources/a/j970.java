package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j970 implements m970 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16124a;

    public j970(boolean z) {
        this.f16124a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j970) && this.f16124a == ((j970) obj).f16124a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16124a);
    }

    public final String toString() {
        return defpackage.c.d("ExitButtonEnable(enable=", Separators.RPAREN, this.f16124a);
    }
}
