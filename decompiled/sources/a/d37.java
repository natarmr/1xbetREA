package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class d37 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5389a;

    public d37(String str) {
        this.f5389a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d37) && this.f5389a.equals(((d37) obj).f5389a);
    }

    public final int hashCode() {
        return this.f5389a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSubscribeActivate(screenName=", this.f5389a, Separators.RPAREN);
    }
}
