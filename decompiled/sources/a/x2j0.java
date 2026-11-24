package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x2j0 implements a3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40171a;

    public final boolean equals(Object obj) {
        if (obj instanceof x2j0) {
            return this.f40171a == ((x2j0) obj).f40171a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40171a);
    }

    public final String toString() {
        return defpackage.c.d("ShowQuickBets(hasEnable=", Separators.RPAREN, this.f40171a);
    }
}
