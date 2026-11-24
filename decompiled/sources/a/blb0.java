package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class blb0 implements flb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ggj f2788a;

    public final boolean equals(Object obj) {
        if (obj instanceof blb0) {
            return this.f2788a.equals(((blb0) obj).f2788a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2788a.hashCode();
    }

    public final String toString() {
        return "SendDayExpressDelegateSideEffect(value=" + this.f2788a + Separators.RPAREN;
    }
}
