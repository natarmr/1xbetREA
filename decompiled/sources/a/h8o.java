package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h8o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12637a;
    public final Map b;

    public h8o(List list, Map map) {
        list.getClass();
        map.getClass();
        this.f12637a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8o)) {
            return false;
        }
        h8o h8oVar = (h8o) obj;
        return Intrinsics.d(this.f12637a, h8oVar.f12637a) && Intrinsics.d(this.b, h8oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12637a.hashCode() * 31);
    }

    public final String toString() {
        return "EsportsWorldCupEventsModel(games=" + this.f12637a + ", sportModels=" + this.b + Separators.RPAREN;
    }
}
