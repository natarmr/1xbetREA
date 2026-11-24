package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class uvc0 implements xvc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36342a;

    public uvc0(String str) {
        this.f36342a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvc0) && this.f36342a.equals(((uvc0) obj).f36342a);
    }

    public final int hashCode() {
        return this.f36342a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnOpenDeeplink(deeplink=", this.f36342a, Separators.RPAREN);
    }
}
