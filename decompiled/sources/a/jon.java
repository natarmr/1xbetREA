package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jon implements oon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f16867a;
    public final ion b;

    public jon(Map map, ion ionVar) {
        ionVar.getClass();
        this.f16867a = map;
        this.b = ionVar;
    }

    public static jon a(jon jonVar, LinkedHashMap linkedHashMap, ion ionVar, int i) {
        Map map = linkedHashMap;
        if ((i & 1) != 0) {
            map = jonVar.f16867a;
        }
        if ((i & 2) != 0) {
            ionVar = jonVar.b;
        }
        ionVar.getClass();
        return new jon(map, ionVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jon)) {
            return false;
        }
        jon jonVar = (jon) obj;
        return this.f16867a.equals(jonVar.f16867a) && Intrinsics.d(this.b, jonVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16867a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(marketGroupsExpansionStateMap=" + this.f16867a + ", editEventDataModel=" + this.b + Separators.RPAREN;
    }
}
