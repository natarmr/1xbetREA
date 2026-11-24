package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class w9h {
    public static final v9h Companion = new v9h();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38780a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Float f;
    public final List g;

    static {
        wez wezVar = wez.f39042a;
        h = new a8z[]{maz.a(wezVar, new x3h((byte) 24)), null, null, null, null, null, maz.a(wezVar, new x3h((byte) 25))};
    }

    public /* synthetic */ w9h(int i, List list, Integer num, Integer num2, Integer num3, Integer num4, Float f, List list2) {
        if ((i & 1) == 0) {
            this.f38780a = null;
        } else {
            this.f38780a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = f;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9h)) {
            return false;
        }
        w9h w9hVar = (w9h) obj;
        return Intrinsics.d(this.f38780a, w9hVar.f38780a) && Intrinsics.d(this.b, w9hVar.b) && Intrinsics.d(this.c, w9hVar.c) && Intrinsics.d(this.d, w9hVar.d) && Intrinsics.d(this.e, w9hVar.e) && Intrinsics.d(this.f, w9hVar.f) && Intrinsics.d(this.g, w9hVar.g);
    }

    public final int hashCode() {
        List list = this.f38780a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.f;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        List list2 = this.g;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = cs0.r(this.b, "CyberMlbbTeamStatisticResponse(heroes=", ", side=", ", towers=", this.f38780a);
        rz4.y(sbR, this.c, ", lords=", this.d, ", turtles=");
        sbR.append(this.e);
        sbR.append(", gold=");
        sbR.append(this.f);
        sbR.append(", goldHistoryList=");
        return dw9.r(sbR, this.g, Separators.RPAREN);
    }
}
