package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s8c0 implements k9c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31794a;

    public s8c0(String str) {
        str.getClass();
        this.f31794a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8c0) && Intrinsics.d(this.f31794a, ((s8c0) obj).f31794a);
    }

    public final int hashCode() {
        return this.f31794a.hashCode();
    }

    public final String toString() {
        return kng0.l("ActivatePromoCode(promoCode=", this.f31794a, Separators.RPAREN);
    }
}
