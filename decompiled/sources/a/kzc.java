package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kzc implements lzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19147a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public kzc(String str, String str2, String str3, boolean z, String str4) {
        str.getClass();
        str3.getClass();
        this.f19147a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzc)) {
            return false;
        }
        kzc kzcVar = (kzc) obj;
        return Intrinsics.d(this.f19147a, kzcVar.f19147a) && this.b.equals(kzcVar.b) && Intrinsics.d(this.c, kzcVar.c) && this.d == kzcVar.d && this.e.equals(kzcVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(ua80.b(ua80.b(this.f19147a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SINGLE(coef=", this.f19147a, ", subGameTitle=", this.b, ", subBetTitle=");
        brm0.C(this.c, ", coefVisibility=", ", sportImageUrl=", sbN, this.d);
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
