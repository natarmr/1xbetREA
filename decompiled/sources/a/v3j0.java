package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v3j0 implements w3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36735a;

    public final boolean equals(Object obj) {
        if (obj instanceof v3j0) {
            return this.f36735a == ((v3j0) obj).f36735a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36735a);
    }

    public final String toString() {
        return defpackage.c.d("ResetCoefOnScoreToggleChangeState(value=", Separators.RPAREN, this.f36735a);
    }
}
