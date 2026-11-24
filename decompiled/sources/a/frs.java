package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes5.dex */
public final class frs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10034a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;
    public final GameBroadcastType g;
    public final boolean h;

    public frs(String str, long j, boolean z, long j2, long j3, long j4, GameBroadcastType gameBroadcastType, boolean z2) {
        str.getClass();
        gameBroadcastType.getClass();
        this.f10034a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = gameBroadcastType;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frs)) {
            return false;
        }
        frs frsVar = (frs) obj;
        return Intrinsics.d(this.f10034a, frsVar.f10034a) && this.b == frsVar.b && this.c == frsVar.c && this.d == frsVar.d && this.e == frsVar.e && this.f == frsVar.f && this.g == frsVar.g && this.h == frsVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + rw2.b(rw2.b(rw2.b(brm0.e(rw2.b(this.f10034a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "GameScreenInitParams(componentKey=", this.f10034a, ", sportId=");
        rz4.A(sbO, ", live=", this.c, ", gameId=");
        sbO.append(this.d);
        kng0.A(sbO, ", subGameId=", this.e, ", champId=");
        sbO.append(this.f);
        sbO.append(", gameBroadcastType=");
        sbO.append(this.g);
        return f140.n(sbO, ", cyberClassicGameScreen=", this.h, Separators.RPAREN);
    }
}
