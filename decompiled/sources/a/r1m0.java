package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r1m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0m0 f29689a;
    public final List b;

    public r1m0(y0m0 y0m0Var, List list) {
        list.getClass();
        this.f29689a = y0m0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1m0)) {
            return false;
        }
        r1m0 r1m0Var = (r1m0) obj;
        return this.f29689a.equals(r1m0Var.f29689a) && Intrinsics.d(this.b, r1m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29689a.hashCode() * 31);
    }

    public final String toString() {
        return "StageNetWithHeaderModel(header=" + this.f29689a + ", stageNetList=" + this.b + Separators.RPAREN;
    }
}
