package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p310 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o310 f26277a;
    public final List b;

    public p310(o310 o310Var, List list) {
        list.getClass();
        this.f26277a = o310Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p310)) {
            return false;
        }
        p310 p310Var = (p310) obj;
        return this.f26277a.equals(p310Var.f26277a) && Intrinsics.d(this.b, p310Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26277a.hashCode() * 31);
    }

    public final String toString() {
        return "LolStatisticInfoModel(cyberStatisticGameModel=" + this.f26277a + ", periodScores=" + this.b + Separators.RPAREN;
    }
}
