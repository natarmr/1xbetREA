package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class tal {
    public static final sal Companion = new sal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f33617a;
    public final Long b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;

    public /* synthetic */ tal(int i, Long l, Long l2, Boolean bool, String str, String str2, String str3, Integer num) {
        if ((i & 1) == 0) {
            this.f33617a = null;
        } else {
            this.f33617a = l;
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
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tal)) {
            return false;
        }
        tal talVar = (tal) obj;
        return Intrinsics.d(this.f33617a, talVar.f33617a) && Intrinsics.d(this.b, talVar.b) && Intrinsics.d(this.c, talVar.c) && Intrinsics.d(this.d, talVar.d) && Intrinsics.d(this.e, talVar.e) && Intrinsics.d(this.f, talVar.f) && Intrinsics.d(this.g, talVar.g);
    }

    public final int hashCode() {
        Long l = this.f33617a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f33617a, this.b, "DotaTopTeamResponse(id=", ", feedId=", ", isPartner=");
        defpackage.c.h(this.c, ", teamIcon=", this.d, ", teamIconS3=", sbO);
        f140.v(sbO, this.e, ", teamName=", this.f, ", winner=");
        return dw9.q(sbO, this.g, Separators.RPAREN);
    }
}
