package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zmo0 {
    public static final ymo0 Companion = new ymo0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7m0 f44636a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ zmo0(int i, b7m0 b7m0Var, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f44636a = null;
        } else {
            this.f44636a = b7m0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmo0)) {
            return false;
        }
        zmo0 zmo0Var = (zmo0) obj;
        return this.f44636a == zmo0Var.f44636a && Intrinsics.d(this.b, zmo0Var.b) && Intrinsics.d(this.c, zmo0Var.c) && Intrinsics.d(this.d, zmo0Var.d);
    }

    public final int hashCode() {
        b7m0 b7m0Var = this.f44636a;
        int iHashCode = (b7m0Var == null ? 0 : b7m0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabloStatItemResponse(id=");
        sb.append(this.f44636a);
        sb.append(", s1=");
        sb.append(this.b);
        sb.append(", s2=");
        return ua80.m(sb, this.c, ", name=", this.d, Separators.RPAREN);
    }
}
