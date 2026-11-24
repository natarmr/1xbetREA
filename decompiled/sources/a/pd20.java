package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pd20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26787a;

    public pd20(String str) {
        this.f26787a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd20) && this.f26787a.equals(((pd20) obj).f26787a);
    }

    public final int hashCode() {
        return this.f26787a.hashCode();
    }

    public final String toString() {
        return kng0.l("AddDepositError(errorMessage=", this.f26787a, Separators.RPAREN);
    }
}
