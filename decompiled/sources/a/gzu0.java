package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gzu0 implements pzu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yzu0 f12200a;

    public gzu0(yzu0 yzu0Var) {
        this.f12200a = yzu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzu0) && this.f12200a.equals(((gzu0) obj).f12200a);
    }

    public final int hashCode() {
        return this.f12200a.hashCode();
    }

    public final String toString() {
        return "OnAccountClick(accountItem=" + this.f12200a + Separators.RPAREN;
    }
}
