package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dxs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fxs0 f6862a;
    public final fxs0 b;
    public final String c;

    public dxs0(fxs0 fxs0Var, fxs0 fxs0Var2, String str) {
        str.getClass();
        this.f6862a = fxs0Var;
        this.b = fxs0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxs0)) {
            return false;
        }
        dxs0 dxs0Var = (dxs0) obj;
        return this.f6862a.equals(dxs0Var.f6862a) && this.b.equals(dxs0Var.b) && Intrinsics.d(this.c, dxs0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f6862a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairsCompactLineEventCardModel(teamOne=");
        sb.append(this.f6862a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
