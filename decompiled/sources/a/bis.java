package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2671a;
    public final boolean b;
    public final g8l0 c;
    public final wcb d;
    public final List e;
    public final v5l0 f;
    public final boolean g;

    public bis(wcb wcbVar, v5l0 v5l0Var, g8l0 g8l0Var, List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f2671a = z;
        this.b = z2;
        this.c = g8l0Var;
        this.d = wcbVar;
        this.e = list;
        this.f = v5l0Var;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bis)) {
            return false;
        }
        bis bisVar = (bis) obj;
        return this.f2671a == bisVar.f2671a && this.b == bisVar.b && this.c == bisVar.c && Intrinsics.d(this.d, bisVar.d) && Intrinsics.d(this.e, bisVar.e) && this.f == bisVar.f && this.g == bisVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + brm0.e(Boolean.hashCode(this.f2671a) * 31, 31, this.b)) * 31;
        wcb wcbVar = this.d;
        return Boolean.hashCode(this.g) + axq.c(this.f, dw9.a((iHashCode + (wcbVar == null ? 0 : wcbVar.hashCode())) * 31, 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("GameItemsScreenConfig(isBettingDisabled=", ", hasStream=", ", filterStyle=", this.f2671a, this.b);
        sbQ.append(this.c);
        sbQ.append(", champImagesHolder=");
        sbQ.append(this.d);
        sbQ.append(", specialEventList=");
        sbQ.append(this.e);
        sbQ.append(", sportEventCardStyle=");
        sbQ.append(this.f);
        sbQ.append(", supportRtl=");
        return rw2.p(sbQ, this.g, Separators.RPAREN);
    }
}
