package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r8g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30024a;
    public final List b;

    public r8g0(String str, List list) {
        list.getClass();
        this.f30024a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8g0)) {
            return false;
        }
        r8g0 r8g0Var = (r8g0) obj;
        return this.f30024a.equals(r8g0Var.f30024a) && Intrinsics.d(this.b, r8g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30024a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("ResultsModel(title=", this.f30024a, ", resultValues=", this.b, Separators.RPAREN);
    }
}
