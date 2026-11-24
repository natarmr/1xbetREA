package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qcw implements scw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jfw f28504a;

    public qcw(jfw jfwVar) {
        this.f28504a = jfwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcw) && this.f28504a.equals(((qcw) obj).f28504a);
    }

    public final int hashCode() {
        return this.f28504a.hashCode();
    }

    public final String toString() {
        return "OnPromotionClick(item=" + this.f28504a + Separators.RPAREN;
    }
}
