package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y2j0 implements a3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41907a;

    public final boolean equals(Object obj) {
        if (obj instanceof y2j0) {
            return this.f41907a == ((y2j0) obj).f41907a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41907a);
    }

    public final String toString() {
        return defpackage.c.d("SubscribeBetUpdate(hasEnable=", Separators.RPAREN, this.f41907a);
    }
}
