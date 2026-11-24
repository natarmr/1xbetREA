package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w2j0 implements a3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38451a;

    public final boolean equals(Object obj) {
        if (obj instanceof w2j0) {
            return this.f38451a == ((w2j0) obj).f38451a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38451a);
    }

    public final String toString() {
        return defpackage.c.d("SetDefaultBetSum(hasEnable=", Separators.RPAREN, this.f38451a);
    }
}
