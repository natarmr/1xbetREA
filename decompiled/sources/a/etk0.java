package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class etk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f8380a;
    public final List b;

    public etk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f8380a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etk0)) {
            return false;
        }
        etk0 etk0Var = (etk0) obj;
        return this.f8380a.equals(etk0Var.f8380a) && Intrinsics.d(this.b, etk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8380a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("SpecialEventTabCyberTopPlayersStateModel(contentStatus=", this.f8380a, ", content=", this.b, Separators.RPAREN);
    }
}
