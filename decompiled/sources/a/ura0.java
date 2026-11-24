package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ura0 implements zra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36155a;

    public ura0(boolean z) {
        this.f36155a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ura0) && this.f36155a == ((ura0) obj).f36155a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36155a);
    }

    public final String toString() {
        return defpackage.c.d("OnMarketInfoExpand(expand=", Separators.RPAREN, this.f36155a);
    }
}
