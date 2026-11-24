package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class u3j0 implements w3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35000a;

    public final boolean equals(Object obj) {
        if (obj instanceof u3j0) {
            return this.f35000a == ((u3j0) obj).f35000a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35000a);
    }

    public final String toString() {
        return defpackage.c.d("FromLineToLiveToggleChangeState(value=", Separators.RPAREN, this.f35000a);
    }
}
