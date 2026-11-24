package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qnu0 implements snu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mqu0 f29047a;

    public qnu0(mqu0 mqu0Var) {
        this.f29047a = mqu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnu0) && this.f29047a == ((qnu0) obj).f29047a;
    }

    public final int hashCode() {
        return this.f29047a.hashCode();
    }

    public final String toString() {
        return "Content(ruleType=" + this.f29047a + Separators.RPAREN;
    }
}
