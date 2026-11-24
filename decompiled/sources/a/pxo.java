package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pxo implements vxo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27761a;

    public pxo(String str) {
        str.getClass();
        this.f27761a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxo) && Intrinsics.d(this.f27761a, ((pxo) obj).f27761a);
    }

    public final int hashCode() {
        return this.f27761a.hashCode();
    }

    public final String toString() {
        return kng0.l("CaptchaPassed(verifyToken=", this.f27761a, Separators.RPAREN);
    }
}
