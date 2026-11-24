package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ez50 implements iz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on60 f8657a;

    public final boolean equals(Object obj) {
        if (obj instanceof ez50) {
            return this.f8657a.equals(((ez50) obj).f8657a);
        }
        return false;
    }

    public final int hashCode() {
        return 547077237;
    }

    public final String toString() {
        return "OnOneXGamesDelegateEffect(delegateEffect=" + this.f8657a + Separators.RPAREN;
    }
}
