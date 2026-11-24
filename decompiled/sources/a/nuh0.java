package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nuh0 implements puh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24147a;

    public nuh0(String str) {
        str.getClass();
        this.f24147a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nuh0) && Intrinsics.d(this.f24147a, ((nuh0) obj).f24147a);
    }

    public final int hashCode() {
        return this.f24147a.hashCode();
    }

    public final String toString() {
        return kng0.l("PromotionSuccessDialog(message=", this.f24147a, Separators.RPAREN);
    }
}
