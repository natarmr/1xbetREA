package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class j8f0 {
    public static final i8f0 Companion = new i8f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16081a;
    public final v20 b;
    public final String c;
    public final String d;

    public /* synthetic */ j8f0(int i, String str, v20 v20Var, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f16081a = null;
        } else {
            this.f16081a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = v20Var;
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
        if (!(obj instanceof j8f0)) {
            return false;
        }
        j8f0 j8f0Var = (j8f0) obj;
        return Intrinsics.d(this.f16081a, j8f0Var.f16081a) && Intrinsics.d(this.b, j8f0Var.b) && Intrinsics.d(this.c, j8f0Var.c) && Intrinsics.d(this.d, j8f0Var.d);
    }

    public final int hashCode() {
        String str = this.f16081a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        v20 v20Var = this.b;
        int iHashCode2 = (iHashCode + (v20Var == null ? 0 : v20Var.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationUser(id=");
        sb.append(this.f16081a);
        sb.append(", address=");
        sb.append(this.b);
        sb.append(", phone=");
        return ua80.m(sb, this.c, ", token=", this.d, Separators.RPAREN);
    }

    public j8f0(String str, v20 v20Var, String str2, String str3) {
        this.f16081a = str;
        this.b = v20Var;
        this.c = str2;
        this.d = str3;
    }
}
