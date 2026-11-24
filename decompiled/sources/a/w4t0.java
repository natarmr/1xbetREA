package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w4t0 implements d5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdb f38558a;

    public w4t0(hdb hdbVar) {
        this.f38558a = hdbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4t0) && this.f38558a.equals(((w4t0) obj).f38558a);
    }

    public final int hashCode() {
        return this.f38558a.hashCode();
    }

    public final String toString() {
        return "OnChampInfoAction(value=" + this.f38558a + Separators.RPAREN;
    }
}
