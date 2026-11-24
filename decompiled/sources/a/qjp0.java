package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qjp0 implements sjp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28851a;

    public final boolean equals(Object obj) {
        if (obj instanceof qjp0) {
            return this.f28851a == ((qjp0) obj).f28851a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28851a);
    }

    public final String toString() {
        return defpackage.c.d("ActiveSelectorState(value=", Separators.RPAREN, this.f28851a);
    }
}
