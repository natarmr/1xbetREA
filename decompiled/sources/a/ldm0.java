package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ldm0 implements odm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19858a;
    public final String b;
    public final String c;
    public final bom0 d;

    public ldm0(String str, String str2, String str3, bom0 bom0Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        bom0Var.getClass();
        this.f19858a = str;
        this.b = str2;
        this.c = str3;
        this.d = bom0Var;
    }

    @Override // a.odm0
    public final bom0 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldm0)) {
            return false;
        }
        ldm0 ldm0Var = (ldm0) obj;
        return Intrinsics.d(this.f19858a, ldm0Var.f19858a) && Intrinsics.d(this.b, ldm0Var.b) && Intrinsics.d(this.c, ldm0Var.c) && Intrinsics.d(this.d, ldm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f19858a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OneTeam(eventTitle=", this.f19858a, ", logo=", this.b, ", title=");
        sbN.append(this.c);
        sbN.append(", gameStatusModel=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
