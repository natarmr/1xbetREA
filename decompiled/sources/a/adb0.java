package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class adb0 {
    public static final zcb0 Companion = new zcb0();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new npa0(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f670a;
    public final Long b;
    public final String c;
    public final List d;

    public /* synthetic */ adb0(int i, Long l, Long l2, String str, List list) {
        if ((i & 1) == 0) {
            this.f670a = null;
        } else {
            this.f670a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adb0)) {
            return false;
        }
        adb0 adb0Var = (adb0) obj;
        return Intrinsics.d(this.f670a, adb0Var.f670a) && Intrinsics.d(this.b, adb0Var.b) && Intrinsics.d(this.c, adb0Var.c) && Intrinsics.d(this.d, adb0Var.d);
    }

    public final int hashCode() {
        Long l = this.f670a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return rw2.m(this.c, ", heroes=", Separators.RPAREN, rz4.o(this.f670a, this.b, "PopularHeroesTeamResponse(id=", ", feedId=", ", name="), this.d);
    }
}
