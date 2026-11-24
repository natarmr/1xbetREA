package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zha implements dia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mha f44383a;

    public final boolean equals(Object obj) {
        if (obj instanceof zha) {
            return this.f44383a.equals(((zha) obj).f44383a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44383a.hashCode();
    }

    public final String toString() {
        return "FirstPeriod(value=" + this.f44383a + Separators.RPAREN;
    }
}
