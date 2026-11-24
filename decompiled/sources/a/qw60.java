package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qw60 implements bx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on60 f29421a;

    public qw60(on60 on60Var) {
        this.f29421a = on60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qw60) && this.f29421a.equals(((qw60) obj).f29421a);
    }

    public final int hashCode() {
        return 547077237;
    }

    public final String toString() {
        return "OnOneXGamesDelegateEffect(delegateEffect=" + this.f29421a + Separators.RPAREN;
    }
}
