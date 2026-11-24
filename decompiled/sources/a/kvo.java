package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kvo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18965a;
    public final List b;

    public kvo(int i, List list) {
        list.getClass();
        this.f18965a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvo)) {
            return false;
        }
        kvo kvoVar = (kvo) obj;
        return this.f18965a == kvoVar.f18965a && Intrinsics.d(this.b, kvoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f18965a) * 31);
    }

    public final String toString() {
        return "FactsModel(sportId=" + this.f18965a + ", factsList=" + this.b + Separators.RPAREN;
    }
}
