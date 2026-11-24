package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class o3q0 {
    public static final n3q0 Companion = new n3q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24599a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Boolean e;

    public /* synthetic */ o3q0(int i, String str, String str2, Integer num, String str3, Boolean bool) {
        if ((i & 1) == 0) {
            this.f24599a = null;
        } else {
            this.f24599a = str;
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
            this.e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3q0)) {
            return false;
        }
        o3q0 o3q0Var = (o3q0) obj;
        return Intrinsics.d(this.f24599a, o3q0Var.f24599a) && Intrinsics.d(this.b, o3q0Var.b) && Intrinsics.d(this.c, o3q0Var.c) && Intrinsics.d(this.d, o3q0Var.d) && Intrinsics.d(this.e, o3q0Var.e);
    }

    public final int hashCode() {
        String str = this.f24599a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TextBroadcastResponse(text=", this.f24599a, ", time=", this.b, ", type=");
        b1j.u(this.c, ", image=", this.d, ", isImportant=", sbN);
        return defpackage.c.e(sbN, this.e, Separators.RPAREN);
    }
}
