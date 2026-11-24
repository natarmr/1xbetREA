package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cyh0 implements hyh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pxh0 f5175a;

    public final boolean equals(Object obj) {
        if (obj instanceof cyh0) {
            return this.f5175a.equals(((cyh0) obj).f5175a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5175a.hashCode();
    }

    public final String toString() {
        return "FirstPlayerCardsSum(value=" + this.f5175a + Separators.RPAREN;
    }
}
