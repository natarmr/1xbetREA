package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qr90 implements rr90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29199a;

    public qr90(String str) {
        str.getClass();
        this.f29199a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qr90) && Intrinsics.d(this.f29199a, ((qr90) obj).f29199a);
    }

    public final int hashCode() {
        return this.f29199a.hashCode();
    }

    public final String toString() {
        return kng0.l("OfferPhoneCode(text=", this.f29199a, Separators.RPAREN);
    }
}
