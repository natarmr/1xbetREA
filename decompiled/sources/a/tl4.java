package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tl4 implements xl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru4 f34127a;

    public tl4(ru4 ru4Var) {
        this.f34127a = ru4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tl4) && this.f34127a.equals(((tl4) obj).f34127a);
    }

    public final int hashCode() {
        return this.f34127a.f31106a.hashCode();
    }

    public final String toString() {
        return "Perform(authorizationData=" + this.f34127a + Separators.RPAREN;
    }
}
