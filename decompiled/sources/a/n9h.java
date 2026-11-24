package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class n9h {
    public static final m9h Companion = new m9h();
    public static final a8z[] k = {null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new x3h(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f23138a;
    public final String b;
    public final Long c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final Integer g;
    public final Float h;
    public final q9h i;
    public final List j;

    public /* synthetic */ n9h(int i, Long l, String str, Long l2, Integer num, Integer num2, String str2, Integer num3, Float f, q9h q9hVar, List list) {
        if ((i & 1) == 0) {
            this.f23138a = null;
        } else {
            this.f23138a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
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
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = f;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = q9hVar;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9h)) {
            return false;
        }
        n9h n9hVar = (n9h) obj;
        return Intrinsics.d(this.f23138a, n9hVar.f23138a) && Intrinsics.d(this.b, n9hVar.b) && Intrinsics.d(this.c, n9hVar.c) && Intrinsics.d(this.d, n9hVar.d) && Intrinsics.d(this.e, n9hVar.e) && Intrinsics.d(this.f, n9hVar.f) && Intrinsics.d(this.g, n9hVar.g) && Intrinsics.d(this.h, n9hVar.h) && Intrinsics.d(this.i, n9hVar.i) && Intrinsics.d(this.j, n9hVar.j);
    }

    public final int hashCode() {
        Long l = this.f23138a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.h;
        int iHashCode8 = (iHashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        q9h q9hVar = this.i;
        int iHashCode9 = (iHashCode8 + (q9hVar == null ? 0 : q9hVar.hashCode())) * 31;
        List list = this.j;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f23138a, "CyberMlbbHeroResponse(heroId=", ", heroName=", this.b, ", respawnTimer=");
        brm0.A(this.d, this.c, ", positionX=", ", positionY=", sbS);
        b1j.u(this.e, ", playerName=", this.f, ", level=", sbS);
        sbS.append(this.g);
        sbS.append(", gold=");
        sbS.append(this.h);
        sbS.append(", heroStatistic=");
        sbS.append(this.i);
        sbS.append(", items=");
        sbS.append(this.j);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
