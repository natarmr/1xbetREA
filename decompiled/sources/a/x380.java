package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x380 implements y380 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbv0 f40205a;

    public final boolean equals(Object obj) {
        if (obj instanceof x380) {
            return this.f40205a.equals(((x380) obj).f40205a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40205a.hashCode();
    }

    public final String toString() {
        return "OnCardDelegateUserAction(delegateAction=" + this.f40205a + Separators.RPAREN;
    }
}
