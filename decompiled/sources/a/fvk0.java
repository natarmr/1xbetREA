package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f10220a;
    public final List b;
    public final List c;
    public final List d;

    public fvk0(btk0 btk0Var, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f10220a = btk0Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvk0)) {
            return false;
        }
        fvk0 fvk0Var = (fvk0) obj;
        return this.f10220a.equals(fvk0Var.f10220a) && Intrinsics.d(this.b, fvk0Var.b) && Intrinsics.d(this.c, fvk0Var.c) && Intrinsics.d(this.d, fvk0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(dw9.a(this.f10220a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialEventTabTopPlayersStateModel(contentStatus=");
        sb.append(this.f10220a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", players=");
        return kng0.n(", legends=", Separators.RPAREN, sb, this.c, this.d);
    }
}
