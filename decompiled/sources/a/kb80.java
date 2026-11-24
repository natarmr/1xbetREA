package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on60 f18001a;

    public final boolean equals(Object obj) {
        if (obj instanceof kb80) {
            return this.f18001a.equals(((kb80) obj).f18001a);
        }
        return false;
    }

    public final int hashCode() {
        return 547077237;
    }

    public final String toString() {
        return "OnOneXGamesDelegateEffect(delegateEffect=" + this.f18001a + Separators.RPAREN;
    }
}
