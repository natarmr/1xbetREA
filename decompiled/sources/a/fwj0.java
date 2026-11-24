package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fwj0 implements hwj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10264a;

    public fwj0(String str) {
        this.f10264a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwj0) && this.f10264a.equals(((fwj0) obj).f10264a);
    }

    public final int hashCode() {
        return this.f10264a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowShankMessage(message=", this.f10264a, Separators.RPAREN);
    }
}
