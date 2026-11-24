package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qeh0 implements xeh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ill0 f28584a;

    public qeh0(ill0 ill0Var) {
        this.f28584a = ill0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qeh0) && this.f28584a.equals(((qeh0) obj).f28584a);
    }

    public final int hashCode() {
        return this.f28584a.hashCode();
    }

    public final String toString() {
        return "CardResultHistoryDelegateAction(delegateAction=" + this.f28584a + Separators.RPAREN;
    }
}
