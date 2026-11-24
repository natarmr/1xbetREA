package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iyv0 implements pyv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on60 f15607a;

    public final boolean equals(Object obj) {
        if (obj instanceof iyv0) {
            return this.f15607a.equals(((iyv0) obj).f15607a);
        }
        return false;
    }

    public final int hashCode() {
        return 547077237;
    }

    public final String toString() {
        return "OnOneXGamesDelegateEffect(delegateEffect=" + this.f15607a + Separators.RPAREN;
    }
}
