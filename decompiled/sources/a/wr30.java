package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wr30 {
    public static final vr30 Companion = new vr30();
    public static final a8z[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f39620a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final List h;

    static {
        wez wezVar = wez.f39042a;
        i = new a8z[]{null, maz.a(wezVar, new gj30((byte) 6)), null, null, null, null, null, maz.a(wezVar, new gj30((byte) 7))};
    }

    public /* synthetic */ wr30(int i2, Integer num, List list, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List list2) {
        if ((i2 & 1) == 0) {
            this.f39620a = null;
        } else {
            this.f39620a = num;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = num5;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num6;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr30)) {
            return false;
        }
        wr30 wr30Var = (wr30) obj;
        return Intrinsics.d(this.f39620a, wr30Var.f39620a) && Intrinsics.d(this.b, wr30Var.b) && Intrinsics.d(this.c, wr30Var.c) && Intrinsics.d(this.d, wr30Var.d) && Intrinsics.d(this.e, wr30Var.e) && Intrinsics.d(this.f, wr30Var.f) && Intrinsics.d(this.g, wr30Var.g) && Intrinsics.d(this.h, wr30Var.h);
    }

    public final int hashCode() {
        Integer num = this.f39620a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.g;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List list2 = this.h;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemoryGameResponse(actionNumber=");
        sb.append(this.f39620a);
        sb.append(", hintIndexList=");
        sb.append(this.b);
        sb.append(", clickedCell=");
        rz4.y(sb, this.c, ", indexCell=", this.d, ", gameStatus=");
        rz4.y(sb, this.e, ", sportId=", this.f, ", winPoints=");
        sb.append(this.g);
        sb.append(", cardStateList=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
