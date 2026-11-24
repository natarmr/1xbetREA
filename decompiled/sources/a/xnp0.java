package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xnp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41180a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final jlp0 f;
    public final boolean g;

    public xnp0(String str, String str2, boolean z, boolean z2) {
        jlp0 jlp0Var = jlp0.b;
        str2.getClass();
        this.f41180a = str;
        this.b = str2;
        this.c = z;
        this.d = true;
        this.e = R.color.static_black_40;
        this.f = jlp0Var;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnp0)) {
            return false;
        }
        xnp0 xnp0Var = (xnp0) obj;
        return Intrinsics.d(this.f41180a, xnp0Var.f41180a) && Intrinsics.d(this.b, xnp0Var.b) && this.c == xnp0Var.c && this.d == xnp0Var.d && this.e == xnp0Var.e && this.f == xnp0Var.f && this.g == xnp0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + twn.a(this.e, brm0.e(brm0.e(ua80.b(this.f41180a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamUiModel(teamImage=", this.f41180a, ", teamName=", this.b, ", teamRadiant=");
        ua80.u(", sideIndicatorEnable=", ", backgroundColor=", sbN, this.c, this.d);
        sbN.append(this.e);
        sbN.append(", heroPlayerType=");
        sbN.append(this.f);
        sbN.append(", winnerTagEnable=");
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
