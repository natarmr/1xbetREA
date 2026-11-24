package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class kr90 implements tr90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ir90 f18753a;
    public final ArrayList b;
    public final boolean c;

    public kr90(ir90 ir90Var, ArrayList arrayList, boolean z) {
        this.f18753a = ir90Var;
        this.b = arrayList;
        this.c = z;
    }

    @Override // a.tr90
    public final ir90 a() {
        return this.f18753a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr90)) {
            return false;
        }
        kr90 kr90Var = (kr90) obj;
        return this.f18753a.equals(kr90Var.f18753a) && this.b.equals(kr90Var.b) && this.c == kr90Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.g(this.b, this.f18753a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(uiModel=");
        sb.append(this.f18753a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", isScrollToUp=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
