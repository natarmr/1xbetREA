package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class sda0 {
    public static final rda0 Companion = new rda0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new raa0(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nda0 f32024a;
    public final List b;

    public /* synthetic */ sda0(int i, nda0 nda0Var, List list) {
        if ((i & 1) == 0) {
            this.f32024a = null;
        } else {
            this.f32024a = nda0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sda0)) {
            return false;
        }
        sda0 sda0Var = (sda0) obj;
        return Intrinsics.d(this.f32024a, sda0Var.f32024a) && Intrinsics.d(this.b, sda0Var.b);
    }

    public final int hashCode() {
        nda0 nda0Var = this.f32024a;
        int iHashCode = (nda0Var == null ? 0 : nda0Var.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PlayerTransfersResponse(player=" + this.f32024a + ", transfers=" + this.b + Separators.RPAREN;
    }
}
