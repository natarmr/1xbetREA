package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class m610 {
    public static final l610 Companion = new l610();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21245a;
    public final Long b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final Integer f;

    public /* synthetic */ m610(int i, Long l, Long l2, Boolean bool, String str, String str2, Integer num) {
        if ((i & 1) == 0) {
            this.f21245a = null;
        } else {
            this.f21245a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m610)) {
            return false;
        }
        m610 m610Var = (m610) obj;
        return Intrinsics.d(this.f21245a, m610Var.f21245a) && Intrinsics.d(this.b, m610Var.b) && Intrinsics.d(this.c, m610Var.c) && Intrinsics.d(this.d, m610Var.d) && Intrinsics.d(this.e, m610Var.e) && Intrinsics.d(this.f, m610Var.f);
    }

    public final int hashCode() {
        Long l = this.f21245a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f21245a, this.b, "LolTopTeamResponse(id=", ", feedId=", ", partner=");
        defpackage.c.h(this.c, ", teamIcon=", this.d, ", teamName=", sbO);
        return vqd.l(this.f, this.e, ", winner=", Separators.RPAREN, sbO);
    }
}
