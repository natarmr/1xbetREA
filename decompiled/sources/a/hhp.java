package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hhp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13076a;
    public final List b;

    public hhp(String str, List list) {
        list.getClass();
        this.f13076a = str;
        this.b = list;
    }

    public static hhp a(hhp hhpVar, String str, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            str = hhpVar.f13076a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = hhpVar.b;
        }
        hhpVar.getClass();
        list.getClass();
        return new hhp(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhp)) {
            return false;
        }
        hhp hhpVar = (hhp) obj;
        return this.f13076a.equals(hhpVar.f13076a) && Intrinsics.d(this.b, hhpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13076a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("FeatureTogglesState(searchValue=", this.f13076a, ", featureToggles=", this.b, Separators.RPAREN);
    }
}
