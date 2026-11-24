package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wfm0 {
    public static final tfm0 Companion = new tfm0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39079a;
    public final String b;

    public /* synthetic */ wfm0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f39079a = null;
        } else {
            this.f39079a = str;
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
        if (!(obj instanceof wfm0)) {
            return false;
        }
        wfm0 wfm0Var = (wfm0) obj;
        return Intrinsics.d(this.f39079a, wfm0Var.f39079a) && Intrinsics.d(this.b, wfm0Var.b);
    }

    public final int hashCode() {
        String str = this.f39079a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("StatisticResponse(id=", this.f39079a, ", value=", this.b, Separators.RPAREN);
    }
}
