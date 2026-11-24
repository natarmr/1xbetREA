package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m110 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20981a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public m110(String str, String str2, String str3, String str4, String str5, String str6) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f20981a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m110)) {
            return false;
        }
        m110 m110Var = (m110) obj;
        return Intrinsics.d(this.f20981a, m110Var.f20981a) && Intrinsics.d(this.b, m110Var.b) && Intrinsics.d(this.c, m110Var.c) && Intrinsics.d(this.d, m110Var.d) && Intrinsics.d(this.e, m110Var.e) && Intrinsics.d(this.f, m110Var.f);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return m110.class;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f20981a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LolPopularChampionsHeaderUiModel(indexTitle=", this.f20981a, ", title=", this.b, ", picksTitle=");
        f140.v(sbN, this.c, ", tierTitle=", this.d, ", laneTitle=");
        return ua80.m(sbN, this.e, ", winRateTitle=", this.f, Separators.RPAREN);
    }
}
