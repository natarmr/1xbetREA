package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class soa0 {
    public static final qoa0 Companion = new qoa0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32537a;
    public final String b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;

    public /* synthetic */ soa0(int i, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        if ((i & 1) == 0) {
            this.f32537a = null;
        } else {
            this.f32537a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soa0)) {
            return false;
        }
        soa0 soa0Var = (soa0) obj;
        return Intrinsics.d(this.f32537a, soa0Var.f32537a) && Intrinsics.d(this.b, soa0Var.b) && Intrinsics.d(this.c, soa0Var.c) && Intrinsics.d(this.d, soa0Var.d) && Intrinsics.d(this.e, soa0Var.e) && Intrinsics.d(this.f, soa0Var.f) && Intrinsics.d(this.g, soa0Var.g);
    }

    public final int hashCode() {
        String str = this.f32537a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.e;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.g;
        return iHashCode6 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PointResponse(scoreOne=", this.f32537a, ", scoreTwo=", this.b, ", isBreakPoint=");
        defpackage.c.j(sbN, this.c, ", isSetPoint=", this.d, ", isMatchPoint=");
        defpackage.c.j(sbN, this.e, ", isDarts140=", this.f, ", isDarts180=");
        return defpackage.c.e(sbN, this.g, Separators.RPAREN);
    }
}
