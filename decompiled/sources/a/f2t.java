package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f2t implements n2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on60 f8829a;

    public final boolean equals(Object obj) {
        if (obj instanceof f2t) {
            return this.f8829a.equals(((f2t) obj).f8829a);
        }
        return false;
    }

    public final int hashCode() {
        return 547077237;
    }

    public final String toString() {
        return "OnOneXGamesDelegateEffect(delegateEffect=" + this.f8829a + Separators.RPAREN;
    }
}
