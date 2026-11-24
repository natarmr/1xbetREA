package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gyr implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12144a;
    public final String b;
    public final String c;
    public final String d;

    public gyr(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f12144a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyr)) {
            return false;
        }
        gyr gyrVar = (gyr) obj;
        return Intrinsics.d(this.f12144a, gyrVar.f12144a) && Intrinsics.d(this.b, gyrVar.b) && Intrinsics.d(this.c, gyrVar.c) && Intrinsics.d(this.d, gyrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f12144a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("GameCardType4PlayerRoundUiModel(diceOneValue=", this.f12144a, ", diceTwoValue=", this.b, ", roundScore="), this.c, ", roundNumber=", this.d, Separators.RPAREN);
    }
}
