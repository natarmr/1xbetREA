package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gtk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f11886a;
    public final List b;

    public gtk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f11886a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtk0)) {
            return false;
        }
        gtk0 gtk0Var = (gtk0) obj;
        return this.f11886a.equals(gtk0Var.f11886a) && Intrinsics.d(this.b, gtk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11886a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("SpecialEventTabDotaPopularHeroesModel(contentStatus=", this.f11886a, ", content=", this.b, Separators.RPAREN);
    }
}
