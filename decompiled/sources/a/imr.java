package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class imr {
    public static final hmr Companion = new hmr();
    public static final a8z[] c = {maz.a(wez.f39042a, new s9r(20)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fmr f15039a;
    public final String b;

    public /* synthetic */ imr(int i, fmr fmrVar, String str) {
        if ((i & 1) == 0) {
            this.f15039a = null;
        } else {
            this.f15039a = fmrVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imr)) {
            return false;
        }
        imr imrVar = (imr) obj;
        return this.f15039a == imrVar.f15039a && Intrinsics.d(this.b, imrVar.b);
    }

    public final int hashCode() {
        fmr fmrVar = this.f15039a;
        int iHashCode = (fmrVar == null ? 0 : fmrVar.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "GameAddTimeResponse(keyInfo=" + this.f15039a + ", valueInfo=" + this.b + Separators.RPAREN;
    }
}
