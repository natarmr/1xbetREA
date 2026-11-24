package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uvp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36361a;
    public final List b;
    public final Set c;

    public uvp(Object obj, List list, Set set) {
        list.getClass();
        set.getClass();
        this.f36361a = obj;
        this.b = list;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvp)) {
            return false;
        }
        uvp uvpVar = (uvp) obj;
        Object obj2 = uvpVar.f36361a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f36361a, obj2) && Intrinsics.d(this.b, uvpVar.b) && Intrinsics.d(this.c, uvpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(j0g0.b(this.f36361a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("FighterGameZipsModel(gameZipsResult=", j0g0.d(this.f36361a), ", fighterImages=", this.b, ", headlineGameIds=");
        sbF.append(this.c);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
