package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class udf0 implements xdf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f35475a;

    public final boolean equals(Object obj) {
        if (obj instanceof udf0) {
            return this.f35475a.equals(((udf0) obj).f35475a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35475a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f35475a, Separators.RPAREN);
    }
}
