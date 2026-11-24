package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hgj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13020a;
    public final List b;

    public hgj(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f13020a = list;
        this.b = list2;
    }

    public static hgj a(hgj hgjVar, ArrayList arrayList, List list, int i) {
        List list2 = arrayList;
        if ((i & 1) != 0) {
            list2 = hgjVar.f13020a;
        }
        if ((i & 2) != 0) {
            list = hgjVar.b;
        }
        list2.getClass();
        list.getClass();
        return new hgj(list2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgj)) {
            return false;
        }
        hgj hgjVar = (hgj) obj;
        return Intrinsics.d(this.f13020a, hgjVar.f13020a) && Intrinsics.d(this.b, hgjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13020a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("DayExpressDelegateState(expressEventModels=", ", expressModels=", this.f13020a, Separators.RPAREN, this.b);
    }
}
