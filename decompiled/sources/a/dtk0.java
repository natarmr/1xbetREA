package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dtk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f6659a;
    public final List b;

    public dtk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f6659a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtk0)) {
            return false;
        }
        dtk0 dtk0Var = (dtk0) obj;
        return this.f6659a.equals(dtk0Var.f6659a) && Intrinsics.d(this.b, dtk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6659a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("SpecialEventTabCyberTeamsStateModel(contentStatus=", this.f6659a, ", content=", this.b, Separators.RPAREN);
    }
}
