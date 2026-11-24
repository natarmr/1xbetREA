package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yar0 implements bbr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42314a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final a4x f;
    public final v12 g;
    public final String h;

    public yar0(String str, String str2, String str3, String str4, String str5, i4 i4Var, v12 v12Var) {
        str2.getClass();
        i4Var.getClass();
        this.f42314a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i4Var;
        this.g = v12Var;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yar0)) {
            return false;
        }
        yar0 yar0Var = (yar0) obj;
        return this.f42314a.equals(yar0Var.f42314a) && Intrinsics.d(this.b, yar0Var.b) && this.c.equals(yar0Var.c) && this.d.equals(yar0Var.d) && this.e.equals(yar0Var.e) && Intrinsics.d(this.f, yar0Var.f) && this.g == yar0Var.g;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.h;
    }

    public final int hashCode() {
        return this.g.hashCode() + cs0.b(this.f, ua80.b(ua80.b(ua80.b(ua80.b(this.f42314a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TopPlayerCellDefaultUiModel(playerId=", this.f42314a, ", playerNumber=", this.b, ", playerImage=");
        f140.v(sbN, this.c, ", playerName=", this.d, ", playerCountry=");
        cs0.B(sbN, this.e, ", playerStatistic=", this.f, ", alignmentInSection=");
        sbN.append(this.g);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
