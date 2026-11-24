package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class sdt0 {
    public static final rdt0 Companion = new rdt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32048a;
    public final String b;
    public final ijo0 c;

    static {
        hjo0 hjo0Var = ijo0.Companion;
    }

    public /* synthetic */ sdt0(int i, String str, String str2, ijo0 ijo0Var) {
        if ((i & 1) == 0) {
            this.f32048a = null;
        } else {
            this.f32048a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = ijo0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdt0)) {
            return false;
        }
        sdt0 sdt0Var = (sdt0) obj;
        return Intrinsics.d(this.f32048a, sdt0Var.f32048a) && Intrinsics.d(this.b, sdt0Var.b) && Intrinsics.d(this.c, sdt0Var.c);
    }

    public final int hashCode() {
        String str = this.f32048a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ijo0 ijo0Var = this.c;
        return iHashCode2 + (ijo0Var != null ? ijo0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("UniversalStageTableValueResponse(title=", this.f32048a, ", logoUrl=", this.b, ", table=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
