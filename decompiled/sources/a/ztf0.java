package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ztf0 {
    public static final ytf0 Companion = new ytf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f44957a;
    public Boolean b;
    public Boolean c;
    public String d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztf0)) {
            return false;
        }
        ztf0 ztf0Var = (ztf0) obj;
        return Intrinsics.d(this.f44957a, ztf0Var.f44957a) && Intrinsics.d(this.b, ztf0Var.b) && Intrinsics.d(this.c, ztf0Var.c) && Intrinsics.d(this.d, ztf0Var.d) && Intrinsics.d(this.e, ztf0Var.e) && Intrinsics.d(this.f, ztf0Var.f) && Intrinsics.d(this.g, ztf0Var.g) && Intrinsics.d(this.h, ztf0Var.h) && Intrinsics.d(this.i, ztf0Var.i);
    }

    public final int hashCode() {
        Boolean bool = this.f44957a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.e;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.g;
        int iHashCode7 = (iHashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.h;
        int iHashCode8 = (iHashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.i;
        return iHashCode8 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f44957a;
        Boolean bool2 = this.b;
        Boolean bool3 = this.c;
        String str = this.d;
        Boolean bool4 = this.e;
        Boolean bool5 = this.f;
        Boolean bool6 = this.g;
        Boolean bool7 = this.h;
        Boolean bool8 = this.i;
        StringBuilder sb = new StringBuilder("ResponsibleConfig(hasResponsibleRules=");
        sb.append(bool);
        sb.append(", hasResponsibleRegistration=");
        sb.append(bool2);
        sb.append(", hasResponsibleBlockUser=");
        defpackage.c.h(bool3, ", linkResponsibleGaming=", str, ", hasResponsibleTop=", sb);
        defpackage.c.j(sb, bool4, ", hasResponsibleInfo=", bool5, ", hasResponsiblePersonalData=");
        defpackage.c.j(sb, bool6, ", hasResponsibleAccountManagement=", bool7, ", hasResponsibleBottomPopular=");
        return defpackage.c.e(sb, bool8, Separators.RPAREN);
    }
}
