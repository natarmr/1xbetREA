package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t8c0 implements k9c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33507a;

    public t8c0(String str) {
        str.getClass();
        this.f33507a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8c0) && Intrinsics.d(this.f33507a, ((t8c0) obj).f33507a);
    }

    public final int hashCode() {
        return this.f33507a.hashCode();
    }

    public final String toString() {
        return kng0.l("AfterTextChanged(promoCode=", this.f33507a, Separators.RPAREN);
    }
}
