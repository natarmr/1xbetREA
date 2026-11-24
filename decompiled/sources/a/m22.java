package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m22 implements s22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ill0 f21035a;

    public m22(ill0 ill0Var) {
        this.f21035a = ill0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m22) && this.f21035a.equals(((m22) obj).f21035a);
    }

    public final int hashCode() {
        return this.f21035a.hashCode();
    }

    public final String toString() {
        return "CardResultHistoryDelegateAction(delegateAction=" + this.f21035a + Separators.RPAREN;
    }
}
