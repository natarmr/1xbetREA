package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q6n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28207a;
    public final c280 b;
    public final n0x c;
    public final boolean d;
    public final boolean e;

    public q6n(String str, c280 c280Var, n0x n0xVar, boolean z, boolean z2) {
        str.getClass();
        this.f28207a = str;
        this.b = c280Var;
        this.c = n0xVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6n)) {
            return false;
        }
        q6n q6nVar = (q6n) obj;
        return Intrinsics.d(this.f28207a, q6nVar.f28207a) && this.b.equals(q6nVar.b) && this.c.equals(q6nVar.c) && this.d == q6nVar.d && this.e == q6nVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(f140.f(this.c, hne.g(this.b, this.f28207a.hashCode() * 31, 31), 31), 31, true), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "DsTeamBetHeaderUiModel(title=", this.f28207a, ", teamLogo=", ", sportIcon=");
        sbP.append(this.c);
        sbP.append(", hasNotificationIcon=true, isFavorite=");
        sbP.append(this.d);
        sbP.append(", isSubscribed=");
        return rw2.p(sbP, this.e, Separators.RPAREN);
    }
}
