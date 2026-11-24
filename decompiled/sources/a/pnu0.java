package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pnu0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27305a;
    public final String b;
    public final int c;
    public final String d;

    public pnu0(int i, long j, String str, String str2) {
        str2.getClass();
        this.f27305a = j;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnu0)) {
            return false;
        }
        pnu0 pnu0Var = (pnu0) obj;
        return this.f27305a == pnu0Var.f27305a && this.b.equals(pnu0Var.b) && this.c == pnu0Var.c && Intrinsics.d(this.d, pnu0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, ua80.b(Long.hashCode(this.f27305a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f27305a, "VirtualEventBannerUiModel(id=", ", bannerImage=", this.b);
        w6x.w(this.c, ", bannerPlaceHolder=", ", eventName=", this.d, sbO);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
