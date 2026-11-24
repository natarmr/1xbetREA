package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v1s0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f36647a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;

    /* JADX WARN: Type inference failed for: r0v0, types: [byte, int] */
    public v1s0(long j, String str, String str2, String str3, String str4, boolean z, int i, int i2, int i3) {
        brm0.B(str2, str3, str4);
        this.f36647a = (int) j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = sre0.f32672a.b(v1s0.class).J() + BundleUtil.UNDERLINE_TAG + j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1s0)) {
            return false;
        }
        v1s0 v1s0Var = (v1s0) obj;
        return ((long) this.f36647a) == ((long) v1s0Var.f36647a) && this.b.equals(v1s0Var.b) && Intrinsics.d(this.c, v1s0Var.c) && Intrinsics.d(this.d, v1s0Var.d) && Intrinsics.d(this.e, v1s0Var.e) && this.f == v1s0Var.f && this.g == v1s0Var.g && this.h == v1s0Var.h && this.i == v1s0Var.i;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return Intrinsics.d(p6t0Var.getKey(), p6t0Var2.getKey());
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.j;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + twn.a(this.h, twn.a(this.g, brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f36647a) * 31, 29791, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f36647a, "TournamentInformationUiModel(id=", ", date=", this.b);
        f140.v(sbO, ", type=, place=, descriptionShort=", this.c, ", descriptionLong=", this.d);
        w6x.z(", total=", this.e, ", collapsed=", sbO, this.f);
        rw2.s(this.g, this.h, ", totalColorStart=", ", totalColorEnd=", sbO);
        return vqd.p(sbO, ", descriptionTitleColor=", this.i, Separators.RPAREN);
    }
}
