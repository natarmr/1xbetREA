package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class owr0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25979a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final byte f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;

    /* JADX WARN: Multi-variable type inference failed */
    public owr0(int i, String str, String str2, String str3, boolean z, int i2, String str4, int i3, String str5, String str6) {
        str.getClass();
        this.f25979a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
        this.g = str4;
        this.h = i3;
        this.i = str5;
        this.j = str6;
        this.k = sre0.f32672a.b(owr0.class).J() + BundleUtil.UNDERLINE_TAG + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owr0)) {
            return false;
        }
        owr0 owr0Var = (owr0) obj;
        return this.f25979a == owr0Var.f25979a && Intrinsics.d(this.b, owr0Var.b) && this.c.equals(owr0Var.c) && this.d.equals(owr0Var.d) && this.e == owr0Var.e && this.f == owr0Var.f && this.g.equals(owr0Var.g) && this.h == owr0Var.h && this.i.equals(owr0Var.i) && this.j.equals(owr0Var.j);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return Intrinsics.d(p6t0Var.getKey(), p6t0Var2.getKey());
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.k;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.j.hashCode() + ua80.b(twn.a(this.h, ua80.b(twn.a(this.f, brm0.e(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f25979a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31), 31, this.i);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f25979a, "TournamentBannerUiModel(id=", ", title=", this.b, ", description=");
        f140.v(sbR, this.c, ", image=", this.d, ", action=");
        ua80.q(this.f, ", actionType=", ", translationId=", sbR, this.e);
        twn.w(this.h, this.g, ", lotteryId=", ", deepLink=", sbR);
        return ua80.m(sbR, this.i, ", siteLink=", this.j, Separators.RPAREN);
    }
}
