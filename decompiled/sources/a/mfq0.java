package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mfq0 extends ofq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21707a;
    public final List b;

    public mfq0(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f21707a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfq0)) {
            return false;
        }
        mfq0 mfq0Var = (mfq0) obj;
        return Intrinsics.d(this.f21707a, mfq0Var.f21707a) && Intrinsics.d(this.b, mfq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21707a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("StartGame(cells=", ", winCells=", this.f21707a, Separators.RPAREN, this.b);
    }
}
