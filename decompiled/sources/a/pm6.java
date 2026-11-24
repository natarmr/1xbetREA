package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class pm6 {
    public static final om6 Companion = new om6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f27215a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ pm6(int i, Boolean bool, Boolean bool2, String str) {
        if ((i & 1) == 0) {
            this.f27215a = null;
        } else {
            this.f27215a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm6)) {
            return false;
        }
        pm6 pm6Var = (pm6) obj;
        return Intrinsics.d(this.f27215a, pm6Var.f27215a) && Intrinsics.d(this.b, pm6Var.b) && Intrinsics.d(this.c, pm6Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.f27215a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.c;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetBuilderVideoResponse(enabled=");
        sb.append(this.f27215a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", needStartVideo=");
        return defpackage.c.e(sb, this.c, Separators.RPAREN);
    }
}
