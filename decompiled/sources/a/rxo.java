package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rxo implements vxo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31274a;

    public rxo(String str) {
        str.getClass();
        this.f31274a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxo) && Intrinsics.d(this.f31274a, ((rxo) obj).f31274a);
    }

    public final int hashCode() {
        return this.f31274a.hashCode();
    }

    public final String toString() {
        return kng0.l("EnterNewPass(value=", this.f31274a, Separators.RPAREN);
    }
}
