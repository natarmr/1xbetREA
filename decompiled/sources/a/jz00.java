package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class jz00 {
    public static final iz00 Companion = new iz00();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new x800((byte) 27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17385a;
    public final String b;
    public final Float c;
    public final Integer d;
    public final Integer e;
    public final lz00 f;

    public /* synthetic */ jz00(int i, String str, String str2, Float f, Integer num, Integer num2, lz00 lz00Var) {
        if ((i & 1) == 0) {
            this.f17385a = null;
        } else {
            this.f17385a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = lz00Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz00)) {
            return false;
        }
        jz00 jz00Var = (jz00) obj;
        return Intrinsics.d(this.f17385a, jz00Var.f17385a) && Intrinsics.d(this.b, jz00Var.b) && Intrinsics.d(this.c, jz00Var.c) && Intrinsics.d(this.d, jz00Var.d) && Intrinsics.d(this.e, jz00Var.e) && this.f == jz00Var.f;
    }

    public final int hashCode() {
        String str = this.f17385a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.c;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        lz00 lz00Var = this.f;
        return iHashCode5 + (lz00Var != null ? lz00Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LolChampionResponse(name=", this.f17385a, ", image=", this.b, ", winRate=");
        sbN.append(this.c);
        sbN.append(", pickRate=");
        sbN.append(this.d);
        sbN.append(", tier=");
        sbN.append(this.e);
        sbN.append(", role=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
