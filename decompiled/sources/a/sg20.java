package a;

import android.gov.nist.core.Separators;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class sg20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FinBetInfoModel f32140a;
    public final ky6 b;
    public final ym5 c;
    public final eo7 d;
    public final qvj0 e;
    public final ifc0 f;
    public final ua20 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;

    public sg20(FinBetInfoModel finBetInfoModel, ky6 ky6Var, ym5 ym5Var, eo7 eo7Var, qvj0 qvj0Var, ifc0 ifc0Var, ua20 ua20Var, boolean z, boolean z2, boolean z3, int i) {
        this.f32140a = finBetInfoModel;
        this.b = ky6Var;
        this.c = ym5Var;
        this.d = eo7Var;
        this.e = qvj0Var;
        this.f = ifc0Var;
        this.g = ua20Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = i;
    }

    public static sg20 a(sg20 sg20Var, ky6 ky6Var, ym5 ym5Var, eo7 eo7Var, qvj0 qvj0Var, ifc0 ifc0Var, boolean z, boolean z2, boolean z3, int i, int i2) {
        FinBetInfoModel finBetInfoModel = sg20Var.f32140a;
        if ((i2 & 2) != 0) {
            ky6Var = sg20Var.b;
        }
        ky6 ky6Var2 = ky6Var;
        if ((i2 & 4) != 0) {
            ym5Var = sg20Var.c;
        }
        ym5 ym5Var2 = ym5Var;
        eo7 eo7Var2 = (i2 & 8) != 0 ? sg20Var.d : eo7Var;
        qvj0 qvj0Var2 = (i2 & 16) != 0 ? sg20Var.e : qvj0Var;
        ifc0 ifc0Var2 = (i2 & 32) != 0 ? sg20Var.f : ifc0Var;
        ua20 ua20Var = sg20Var.g;
        boolean z4 = (i2 & 128) != 0 ? sg20Var.h : z;
        boolean z5 = (i2 & 256) != 0 ? sg20Var.i : z2;
        boolean z6 = (i2 & 512) != 0 ? sg20Var.j : z3;
        int i3 = (i2 & 1024) != 0 ? sg20Var.k : i;
        sg20Var.getClass();
        eo7Var2.getClass();
        return new sg20(finBetInfoModel, ky6Var2, ym5Var2, eo7Var2, qvj0Var2, ifc0Var2, ua20Var, z4, z5, z6, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg20)) {
            return false;
        }
        sg20 sg20Var = (sg20) obj;
        return this.f32140a.equals(sg20Var.f32140a) && this.b.equals(sg20Var.b) && this.c.equals(sg20Var.c) && this.d.equals(sg20Var.d) && this.e.equals(sg20Var.e) && this.f.equals(sg20Var.f) && this.g == sg20Var.g && this.h == sg20Var.h && this.i == sg20Var.i && this.j == sg20Var.j && this.k == sg20Var.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + brm0.e(brm0.e(brm0.e((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f32140a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MakeBetStateModel(finBetInfoModel=");
        sb.append(this.f32140a);
        sb.append(", betGameInfo=");
        sb.append(this.b);
        sb.append(", balanceState=");
        sb.append(this.c);
        sb.append(", betTypeStateModel=");
        sb.append(this.d);
        sb.append(", simpleBetState=");
        sb.append(this.e);
        sb.append(", promoCodeState=");
        sb.append(this.f);
        sb.append(", styleType=");
        sb.append(this.g);
        sb.append(", isTaxStatusInitialized=");
        sb.append(this.h);
        sb.append(", isTaxLoaded=");
        ua80.u(", isAuthorized=", ", tabsCount=", sb, this.i, this.j);
        return rz4.j(this.k, Separators.RPAREN, sb);
    }
}
