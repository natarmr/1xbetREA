package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c8s0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3930a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public c8s0(int i, String str, String str2, String str3, String str4, boolean z) {
        this.f3930a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = w6x.q(sre0.f32672a.b(c8s0.class).J(), BundleUtil.UNDERLINE_TAG, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8s0)) {
            return false;
        }
        c8s0 c8s0Var = (c8s0) obj;
        return this.f3930a.equals(c8s0Var.f3930a) && this.b == c8s0Var.b && this.c.equals(c8s0Var.c) && this.d.equals(c8s0Var.d) && this.e.equals(c8s0Var.e) && this.f == c8s0Var.f;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return Intrinsics.d(p6t0Var.getKey(), p6t0Var2.getKey());
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.g;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b(twn.a(this.b, this.f3930a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "TournamentTeamPrizeDistributionUiModel(placeNumber=", this.f3930a, ", placeTextSize=", ", name=");
        f140.v(sbP, this.c, ", image=", this.d, ", prize=");
        return defpackage.c.c(this.e, ", requireTopMargin=", Separators.RPAREN, sbP, this.f);
    }
}
