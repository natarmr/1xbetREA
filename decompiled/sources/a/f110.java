package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class f110 {
    public static final e110 Companion = new e110();
    public static final a8z[] f = {null, null, null, maz.a(wez.f39042a, new t010((byte) 5)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8743a;
    public final String b;
    public final String c;
    public final List d;
    public final f4h e;

    public /* synthetic */ f110(int i, String str, String str2, String str3, List list, f4h f4hVar) {
        if ((i & 1) == 0) {
            this.f8743a = null;
        } else {
            this.f8743a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f4hVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f110)) {
            return false;
        }
        f110 f110Var = (f110) obj;
        return Intrinsics.d(this.f8743a, f110Var.f8743a) && Intrinsics.d(this.b, f110Var.b) && Intrinsics.d(this.c, f110Var.c) && Intrinsics.d(this.d, f110Var.d) && Intrinsics.d(this.e, f110Var.e);
    }

    public final int hashCode() {
        String str = this.f8743a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        f4h f4hVar = this.e;
        return iHashCode4 + (f4hVar != null ? f4hVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LolPlayersCompositionResponse(teamName=", this.f8743a, ", teamImage=", this.b, ", teamImageS3=");
        cs0.y(this.c, ", players=", ", statistics=", sbN, this.d);
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
