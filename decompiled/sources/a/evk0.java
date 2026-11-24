package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class evk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f8473a;
    public final List b;

    public evk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f8473a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evk0)) {
            return false;
        }
        evk0 evk0Var = (evk0) obj;
        return this.f8473a.equals(evk0Var.f8473a) && Intrinsics.d(this.b, evk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8473a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("SpecialEventTabTeamsStateModel(contentStatus=", this.f8473a, ", content=", this.b, Separators.RPAREN);
    }
}
