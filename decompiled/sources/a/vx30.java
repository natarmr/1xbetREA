package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class vx30 implements wx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38183a;
    public final long b;
    public final String c;
    public final long d;
    public final m0x e;

    public vx30(String str, String str2, m0x m0xVar) {
        pz40 pz40Var = s6t0.f31722a;
        long textPrimary = s6t0.b().f33626a.getTextPrimary();
        long secondary = s6t0.b().f33626a.getSecondary();
        str.getClass();
        this.f38183a = str;
        this.b = textPrimary;
        this.c = str2;
        this.d = secondary;
        this.e = m0xVar;
    }

    @Override // a.wx30
    public final long b() {
        return this.b;
    }

    @Override // a.wx30
    public final long c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx30)) {
            return false;
        }
        vx30 vx30Var = (vx30) obj;
        if (!Intrinsics.d(this.f38183a, vx30Var.f38183a)) {
            return false;
        }
        long j = vx30Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && Intrinsics.d(this.c, vx30Var.c) && h2t0.a(this.d, vx30Var.d) && this.e.equals(vx30Var.e);
    }

    @Override // a.wx30
    public final String getSubTitle() {
        return this.c;
    }

    @Override // a.wx30
    public final String getTitle() {
        return this.f38183a;
    }

    public final int hashCode() {
        int iHashCode = this.f38183a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(iHashCode, 31, this.b);
        String str = this.c;
        return Integer.hashCode(R.drawable.ic_status_green_check_circle) + twn.a(R.drawable.ic_status_green_check_circle, cs0.a(this.e, rw2.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31), 31);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.d);
        StringBuilder sbN = b1j.n("TitleWithSubTitleIcon(title=", this.f38183a, ", titleColor=", strI, ", subTitle=");
        f140.v(sbN, this.c, ", subTitleColor=", strI2, ", subtitleIcon=");
        sbN.append(this.e);
        sbN.append(", subtitleIconPlaceholder=");
        sbN.append(R.drawable.ic_status_green_check_circle);
        sbN.append(", subtitleIconError=");
        return rz4.j(R.drawable.ic_status_green_check_circle, Separators.RPAREN, sbN);
    }
}
