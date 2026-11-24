package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fsk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f10069a;
    public final List b;

    public fsk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f10069a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsk0)) {
            return false;
        }
        fsk0 fsk0Var = (fsk0) obj;
        return this.f10069a.equals(fsk0Var.f10069a) && Intrinsics.d(this.b, fsk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10069a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("LolPopularChampions(status=", this.f10069a, ", content=", this.b, Separators.RPAREN);
    }
}
