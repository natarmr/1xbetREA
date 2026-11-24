package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class g800 {
    public static final f800 Companion = new f800();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10841a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{null, maz.a(wezVar, new jtz((byte) 25)), maz.a(wezVar, new jtz((byte) 26))};
    }

    public /* synthetic */ g800(int i, String str, List list, List list2) {
        if ((i & 1) == 0) {
            this.f10841a = null;
        } else {
            this.f10841a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g800)) {
            return false;
        }
        g800 g800Var = (g800) obj;
        return Intrinsics.d(this.f10841a, g800Var.f10841a) && Intrinsics.d(this.b, g800Var.b) && Intrinsics.d(this.c, g800Var.c);
    }

    public final int hashCode() {
        String str = this.f10841a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(defpackage.c.f("LineUpInfoResponse(team=", this.f10841a, ", lineUps=", this.b, ", missingPlayers="), this.c, Separators.RPAREN);
    }
}
