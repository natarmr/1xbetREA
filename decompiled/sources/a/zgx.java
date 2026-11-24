package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zgx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygx f44365a;
    public final a4x b;
    public final String c;
    public final udl0 d;

    public zgx(ygx ygxVar, a4x a4xVar, String str, udl0 udl0Var) {
        a4xVar.getClass();
        this.f44365a = ygxVar;
        this.b = a4xVar;
        this.c = str;
        this.d = udl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgx)) {
            return false;
        }
        zgx zgxVar = (zgx) obj;
        return this.f44365a.equals(zgxVar.f44365a) && Intrinsics.d(this.b, zgxVar.b) && this.c.equals(zgxVar.c) && this.d == zgxVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cs0.b(this.b, this.f44365a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "InsightsMarketGroupUiModel(header=" + this.f44365a + ", rows=" + this.b + ", key=" + ((Object) this.c) + ", sportGameType=" + this.d + Separators.RPAREN;
    }
}
