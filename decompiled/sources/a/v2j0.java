package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v2j0 implements a3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36686a;

    public final boolean equals(Object obj) {
        if (obj instanceof v2j0) {
            return this.f36686a == ((v2j0) obj).f36686a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36686a);
    }

    public final String toString() {
        return defpackage.c.d("ResetCoefOnScoreChanged(hasEnable=", Separators.RPAREN, this.f36686a);
    }
}
