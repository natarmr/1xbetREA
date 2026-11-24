package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o22 implements s22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f24509a;

    public o22(uid uidVar) {
        this.f24509a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o22) && this.f24509a.equals(((o22) obj).f24509a);
    }

    public final int hashCode() {
        return this.f24509a.hashCode();
    }

    public final String toString() {
        return vqd.m("GameCardDelegateAction(delegateAction=", this.f24509a, Separators.RPAREN);
    }
}
