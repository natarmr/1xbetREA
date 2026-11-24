package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hjs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kc50 f13175a;
    public final kc50 b;
    public final kc50 c;
    public final tf50 d;

    public hjs(kc50 kc50Var, kc50 kc50Var2, kc50 kc50Var3, tf50 tf50Var) {
        this.f13175a = kc50Var;
        this.b = kc50Var2;
        this.c = kc50Var3;
        this.d = tf50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjs)) {
            return false;
        }
        hjs hjsVar = (hjs) obj;
        return this.f13175a.equals(hjsVar.f13175a) && Intrinsics.d(this.b, hjsVar.b) && Intrinsics.d(this.c, hjsVar.c) && this.d == hjsVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f13175a.hashCode() * 31;
        kc50 kc50Var = this.b;
        int iHashCode2 = (iHashCode + (kc50Var == null ? 0 : kc50Var.hashCode())) * 31;
        kc50 kc50Var2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (kc50Var2 != null ? kc50Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GameLiteNavigationBarUiModel(gameBoard=" + this.f13175a + ", broadcast=" + this.b + ", info=" + this.c + ", selectedTab=" + this.d + Separators.RPAREN;
    }
}
