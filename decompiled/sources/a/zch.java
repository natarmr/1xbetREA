package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zch implements cdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44166a;

    public final boolean equals(Object obj) {
        if (obj instanceof zch) {
            return this.f44166a == ((zch) obj).f44166a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44166a);
    }

    public final String toString() {
        return defpackage.c.d("ScoreVisibility(value=", Separators.RPAREN, this.f44166a);
    }
}
