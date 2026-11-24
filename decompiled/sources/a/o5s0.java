package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class o5s0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24704a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public o5s0(String str, String str2, String str3, String str4) {
        this.f24704a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = w6x.q(sre0.f32672a.b(o5s0.class).J(), BundleUtil.UNDERLINE_TAG, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5s0)) {
            return false;
        }
        o5s0 o5s0Var = (o5s0) obj;
        return this.f24704a.equals(o5s0Var.f24704a) && this.b.equals(o5s0Var.b) && this.c.equals(o5s0Var.c) && this.d.equals(o5s0Var.d);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return Intrinsics.d(p6t0Var.getKey(), p6t0Var2.getKey());
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.e;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(twn.a(R.drawable.ic_globe_gray, this.f24704a.hashCode() * 31, 31), 31, this.b), 31, this.c);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.drawable.ic_globe_gray, "TournamentSocialMediaUiModel(name=", this.f24704a, ", iconRes=", ", iconUrl=");
        f140.v(sbP, this.b, ", appPackageName=", this.c, ", uri=");
        return axq.n(sbP, this.d, Separators.RPAREN);
    }
}
