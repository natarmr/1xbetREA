package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iye f19100a;
    public final String b;

    public kye(iye iyeVar, String str) {
        str.getClass();
        this.f19100a = iyeVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kye)) {
            return false;
        }
        kye kyeVar = (kye) obj;
        return this.f19100a == kyeVar.f19100a && Intrinsics.d(this.b, kyeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19100a.hashCode() * 31);
    }

    public final String toString() {
        return "CouponInteractionUiModel(couponButtonState=" + this.f19100a + ", couponButtonText=" + this.b + Separators.RPAREN;
    }
}
