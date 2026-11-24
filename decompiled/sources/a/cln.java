package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cln implements fln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4567a;
    public final rmn b;

    public cln(String str, rmn rmnVar) {
        str.getClass();
        this.f4567a = str;
        this.b = rmnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cln)) {
            return false;
        }
        cln clnVar = (cln) obj;
        return Intrinsics.d(this.f4567a, clnVar.f4567a) && this.b.equals(clnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4567a.hashCode() * 31);
    }

    public final String toString() {
        return "CouponParamUiItem(title=" + this.f4567a + ", valueState=" + this.b + Separators.RPAREN;
    }
}
