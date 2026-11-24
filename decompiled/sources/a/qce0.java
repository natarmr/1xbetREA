package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class qce0 implements uce0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28481a;

    public qce0(boolean z) {
        this.f28481a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qce0) && this.f28481a == ((qce0) obj).f28481a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28481a);
    }

    public final String toString() {
        return defpackage.c.d("OnDontRemindChanged(dontRemind=", Separators.RPAREN, this.f28481a);
    }
}
