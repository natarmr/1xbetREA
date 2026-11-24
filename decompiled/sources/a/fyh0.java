package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fyh0 implements hyh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pxh0 f10359a;

    public final boolean equals(Object obj) {
        if (obj instanceof fyh0) {
            return this.f10359a.equals(((fyh0) obj).f10359a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10359a.hashCode();
    }

    public final String toString() {
        return "SecondPlayerCardsSum(value=" + this.f10359a + Separators.RPAREN;
    }
}
