package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xwp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41620a;
    public final uvp b;
    public final uvp c;
    public final Object d;

    public xwp(Object obj, uvp uvpVar, uvp uvpVar2, Object obj2) {
        uvpVar.getClass();
        uvpVar2.getClass();
        this.f41620a = obj;
        this.b = uvpVar;
        this.c = uvpVar2;
        this.d = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwp)) {
            return false;
        }
        xwp xwpVar = (xwp) obj;
        Object obj2 = xwpVar.f41620a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f41620a, obj2) && Intrinsics.d(this.b, xwpVar.b) && Intrinsics.d(this.c, xwpVar.c) && Intrinsics.d(this.d, xwpVar.d);
    }

    public final int hashCode() {
        return j0g0.b(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (j0g0.b(this.f41620a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FighterScenarioModel(fighterModel=" + j0g0.d(this.f41620a) + ", liveGamesModel=" + this.b + ", lineGamesModel=" + this.c + ", results=" + j0g0.d(this.d) + Separators.RPAREN;
    }
}
