package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6087a;
    public final List b;
    public final Map c;

    public dhf(ArrayList arrayList, List list, Map map) {
        list.getClass();
        this.f6087a = arrayList;
        this.b = list;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhf)) {
            return false;
        }
        dhf dhfVar = (dhf) obj;
        return this.f6087a.equals(dhfVar.f6087a) && Intrinsics.d(this.b, dhfVar.b) && this.c.equals(dhfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f6087a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "CrystalRoundModel(field=" + this.f6087a + ", winCombos=" + this.b + ", newCrystals=" + this.c + Separators.RPAREN;
    }
}
