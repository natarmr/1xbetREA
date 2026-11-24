package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nts {
    public static final mts Companion = new mts();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24115a;
    public final String b;

    public /* synthetic */ nts(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f24115a = null;
        } else {
            this.f24115a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nts)) {
            return false;
        }
        nts ntsVar = (nts) obj;
        return Intrinsics.d(this.f24115a, ntsVar.f24115a) && Intrinsics.d(this.b, ntsVar.b);
    }

    public final int hashCode() {
        String str = this.f24115a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("GameSubScoreZipResponse(subFirst=", this.f24115a, ", subSecond=", this.b, Separators.RPAREN);
    }
}
