package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tvv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34621a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final a4x g;
    public final a4x h;
    public final a4x i;

    public tvv(long j, String str, String str2, String str3, boolean z, int i, a4x a4xVar, a4x a4xVar2, a4x a4xVar3) {
        str3.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        this.f34621a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i;
        this.g = a4xVar;
        this.h = a4xVar2;
        this.i = a4xVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvv)) {
            return false;
        }
        tvv tvvVar = (tvv) obj;
        return this.f34621a == tvvVar.f34621a && this.b.equals(tvvVar.b) && this.c.equals(tvvVar.c) && Intrinsics.d(this.d, tvvVar.d) && this.e == tvvVar.e && this.f == tvvVar.f && Intrinsics.d(this.g, tvvVar.g) && Intrinsics.d(this.h, tvvVar.h) && Intrinsics.d(this.i, tvvVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cs0.b(this.h, cs0.b(this.g, twn.a(this.f, brm0.e(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f34621a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f34621a, "HeroItemStatisticUiModel(playerId=", ", playerName=", this.b);
        f140.v(sbO, ", heroImage=", this.c, ", heroName=", this.d);
        cs0.v(this.f, ", expanded=", ", arrowImage=", sbO, this.e);
        sbO.append(", significantItems=");
        sbO.append(this.g);
        sbO.append(", neutralItems=");
        sbO.append(this.h);
        sbO.append(", supportItems=");
        sbO.append(this.i);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
