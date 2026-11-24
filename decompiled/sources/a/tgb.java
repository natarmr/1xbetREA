package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tgb implements ygb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33902a;

    public final boolean equals(Object obj) {
        if (obj instanceof tgb) {
            return this.f33902a == ((tgb) obj).f33902a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33902a);
    }

    public final String toString() {
        return defpackage.c.d("BettingDisabled(value=", Separators.RPAREN, this.f33902a);
    }
}
