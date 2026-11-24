package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class d8a0 {
    public static final c8a0 Companion = new c8a0();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new wm90(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5638a;
    public final Long b;
    public final String c;
    public final Integer d;
    public final String e;
    public final List f;

    public /* synthetic */ d8a0(int i, Integer num, Long l, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f5638a = null;
        } else {
            this.f5638a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8a0)) {
            return false;
        }
        d8a0 d8a0Var = (d8a0) obj;
        return Intrinsics.d(this.f5638a, d8a0Var.f5638a) && Intrinsics.d(this.b, d8a0Var.b) && Intrinsics.d(this.c, d8a0Var.c) && Intrinsics.d(this.d, d8a0Var.d) && Intrinsics.d(this.e, d8a0Var.e) && Intrinsics.d(this.f, d8a0Var.f);
    }

    public final int hashCode() {
        String str = this.f5638a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = kng0.s(this.b, "PlayerMenuDetailsResponse(id=", this.f5638a, ", birthDayInSecondsUnixTime=", ", teamId=");
        axq.x(this.d, this.c, ", age=", ", playerType=", sbS);
        return rw2.m(this.e, ", menu=", Separators.RPAREN, sbS, this.f);
    }
}
