package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fus0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dus0 f10181a;
    public final dus0 b;
    public final String c;
    public final wnq0 d;
    public final String e;
    public final String f;
    public final float g;

    public fus0(dus0 dus0Var, dus0 dus0Var2, String str, wnq0 wnq0Var, String str2, String str3, float f) {
        str.getClass();
        this.f10181a = dus0Var;
        this.b = dus0Var2;
        this.c = str;
        this.d = wnq0Var;
        this.e = str2;
        this.f = str3;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fus0)) {
            return false;
        }
        fus0 fus0Var = (fus0) obj;
        return this.f10181a.equals(fus0Var.f10181a) && this.b.equals(fus0Var.b) && Intrinsics.d(this.c, fus0Var.c) && this.d.equals(fus0Var.d) && this.e.equals(fus0Var.e) && this.f.equals(fus0Var.f) && ycl.b(this.g, fus0Var.g);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "TWENTY_ONE_DOTA_KEY";
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + ua80.b(ua80.b((this.d.hashCode() + ua80.b((this.b.hashCode() + ((this.f10181a.hashCode() - 2089097023) * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String strC = ycl.c(this.g);
        StringBuilder sb = new StringBuilder("TwentyOneDotaUiModel(key=TWENTY_ONE_DOTA_KEY, player=");
        sb.append(this.f10181a);
        sb.append(", dealer=");
        sb.append(this.b);
        sb.append(", matchDescription=");
        sb.append(this.c);
        sb.append(", timer=");
        sb.append(this.d);
        sb.append(", timerBackground=");
        f140.v(sb, this.e, ", tableBackgroundUrl=", this.f, ", tableHeight=");
        return axq.n(sb, strC, Separators.RPAREN);
    }
}
