package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class jr3 {
    public static final ir3 Companion = new ir3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16982a;
    public final String b;
    public final String c;
    public final pv90 d;
    public final qgk e;

    public /* synthetic */ jr3(int i, String str, String str2, String str3, pv90 pv90Var, qgk qgkVar) {
        if ((i & 1) == 0) {
            this.f16982a = null;
        } else {
            this.f16982a = str;
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
            this.d = pv90Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = qgkVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr3)) {
            return false;
        }
        jr3 jr3Var = (jr3) obj;
        return Intrinsics.d(this.f16982a, jr3Var.f16982a) && Intrinsics.d(this.b, jr3Var.b) && Intrinsics.d(this.c, jr3Var.c) && Intrinsics.d(this.d, jr3Var.d) && Intrinsics.d(this.e, jr3Var.e);
    }

    public final int hashCode() {
        String str = this.f16982a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        pv90 pv90Var = this.d;
        int iHashCode4 = (iHashCode3 + (pv90Var == null ? 0 : pv90Var.hashCode())) * 31;
        qgk qgkVar = this.e;
        return iHashCode4 + (qgkVar != null ? qgkVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Application(channel=", this.f16982a, ", name=", this.b, ", version=");
        sbN.append(this.c);
        sbN.append(", platform=");
        sbN.append(this.d);
        sbN.append(", device=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public jr3(String str, String str2, pv90 pv90Var, qgk qgkVar) {
        this.f16982a = "App_Android";
        this.b = str;
        this.c = str2;
        this.d = pv90Var;
        this.e = qgkVar;
    }
}
