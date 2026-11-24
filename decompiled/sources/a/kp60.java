package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kp60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on60 f18663a;

    public kp60(on60 on60Var) {
        this.f18663a = on60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp60) && this.f18663a.equals(((kp60) obj).f18663a);
    }

    public final int hashCode() {
        return 547077237;
    }

    public final String toString() {
        return "OnOneXGamesDelegateEffect(delegateEffect=" + this.f18663a + Separators.RPAREN;
    }
}
