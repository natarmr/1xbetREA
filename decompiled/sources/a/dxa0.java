package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dxa0 {
    public static final cxa0 Companion = new cxa0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6839a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final axa0 f;

    public /* synthetic */ dxa0(int i, String str, String str2, Integer num, String str3, Integer num2, axa0 axa0Var) {
        if ((i & 1) == 0) {
            this.f6839a = null;
        } else {
            this.f6839a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = axa0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxa0)) {
            return false;
        }
        dxa0 dxa0Var = (dxa0) obj;
        return Intrinsics.d(this.f6839a, dxa0Var.f6839a) && Intrinsics.d(this.b, dxa0Var.b) && Intrinsics.d(this.c, dxa0Var.c) && Intrinsics.d(this.d, dxa0Var.d) && Intrinsics.d(this.e, dxa0Var.e) && Intrinsics.d(this.f, dxa0Var.f);
    }

    public final int hashCode() {
        String str = this.f6839a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        axa0 axa0Var = this.f;
        return iHashCode5 + (axa0Var != null ? axa0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PopUpResponse(id=", this.f6839a, ", text=", this.b, ", time=");
        b1j.u(this.c, ", title=", this.d, ", typeId=", sbN);
        sbN.append(this.e);
        sbN.append(", extension=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
