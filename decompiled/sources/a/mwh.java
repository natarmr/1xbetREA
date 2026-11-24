package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mwh {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9a0 f22502a;
    public final List b;

    static {
        b9a0 b9a0Var = b9a0.g;
    }

    public mwh(b9a0 b9a0Var, List list) {
        b9a0Var.getClass();
        list.getClass();
        this.f22502a = b9a0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwh)) {
            return false;
        }
        mwh mwhVar = (mwh) obj;
        return Intrinsics.d(this.f22502a, mwhVar.f22502a) && Intrinsics.d(this.b, mwhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22502a.hashCode() * 31);
    }

    public final String toString() {
        return "CyclingPlayersStatisticModel(player=" + this.f22502a + ", resultsList=" + this.b + Separators.RPAREN;
    }
}
