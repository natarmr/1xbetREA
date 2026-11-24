package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class odt0 {
    public static final ndt0 Companion = new ndt0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sdt0 f25092a;
    public final Long b;
    public final List c;

    static {
        rdt0 rdt0Var = sdt0.Companion;
        d = new a8z[]{null, null, maz.a(wez.f39042a, new xns0((byte) 20))};
    }

    public /* synthetic */ odt0(int i, sdt0 sdt0Var, Long l, List list) {
        if ((i & 1) == 0) {
            this.f25092a = null;
        } else {
            this.f25092a = sdt0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odt0)) {
            return false;
        }
        odt0 odt0Var = (odt0) obj;
        return Intrinsics.d(this.f25092a, odt0Var.f25092a) && Intrinsics.d(this.b, odt0Var.b) && Intrinsics.d(this.c, odt0Var.c);
    }

    public final int hashCode() {
        sdt0 sdt0Var = this.f25092a;
        int iHashCode = (sdt0Var == null ? 0 : sdt0Var.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalStageTableBaseResponse(valueResponse=");
        sb.append(this.f25092a);
        sb.append(", sportId=");
        sb.append(this.b);
        sb.append(", teams=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
