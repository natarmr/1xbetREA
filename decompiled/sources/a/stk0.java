package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class stk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f32777a;
    public final List b;

    public stk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f32777a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stk0)) {
            return false;
        }
        stk0 stk0Var = (stk0) obj;
        return this.f32777a.equals(stk0Var.f32777a) && Intrinsics.d(this.b, stk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32777a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("SpecialEventTabRankingsStateModel(contentStatus=", this.f32777a, ", content=", this.b, Separators.RPAREN);
    }
}
