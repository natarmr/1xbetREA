package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class igp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ufp0 f14745a;
    public final List b;

    public igp0(ufp0 ufp0Var, List list) {
        list.getClass();
        this.f14745a = ufp0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igp0)) {
            return false;
        }
        igp0 igp0Var = (igp0) obj;
        return this.f14745a.equals(igp0Var.f14745a) && Intrinsics.d(this.b, igp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14745a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamNewsModel(teamModel=" + this.f14745a + ", newsList=" + this.b + Separators.RPAREN;
    }
}
