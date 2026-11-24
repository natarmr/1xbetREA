package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o3p implements q3p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f24596a;

    public o3p(uid uidVar) {
        this.f24596a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3p) && this.f24596a.equals(((o3p) obj).f24596a);
    }

    public final int hashCode() {
        return this.f24596a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f24596a, Separators.RPAREN);
    }
}
