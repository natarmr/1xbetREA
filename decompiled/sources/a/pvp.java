package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pvp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27673a;
    public final List b;
    public final Set c;

    public pvp(ArrayList arrayList, List list, Set set) {
        list.getClass();
        set.getClass();
        this.f27673a = arrayList;
        this.b = list;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvp)) {
            return false;
        }
        pvp pvpVar = (pvp) obj;
        return this.f27673a.equals(pvpVar.f27673a) && Intrinsics.d(this.b, pvpVar.b) && Intrinsics.d(this.c, pvpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f27673a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "FighterEventsModel(gameEventModels=" + this.f27673a + ", fighterImages=" + this.b + ", headlineGameIds=" + this.c + Separators.RPAREN;
    }
}
