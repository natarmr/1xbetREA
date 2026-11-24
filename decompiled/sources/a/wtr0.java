package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wtr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td80 f39756a;
    public final List b;

    public wtr0(td80 td80Var, List list) {
        list.getClass();
        this.f39756a = td80Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtr0)) {
            return false;
        }
        wtr0 wtr0Var = (wtr0) obj;
        return this.f39756a == wtr0Var.f39756a && Intrinsics.d(this.b, wtr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39756a.hashCode() * 31);
    }

    public final String toString() {
        return "TotoOutcomesSelectionBlockModel(outcomeType=" + this.f39756a + ", outcomes=" + this.b + Separators.RPAREN;
    }
}
