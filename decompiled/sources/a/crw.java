package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class crw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4864a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final boolean e;

    public crw(List list, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        this.f4864a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = z4;
    }

    public static crw a(crw crwVar, boolean z, boolean z2, boolean z3, ArrayList arrayList, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = crwVar.f4864a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = crwVar.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = crwVar.c;
        }
        boolean z7 = z3;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = crwVar.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z4 = crwVar.e;
        }
        crwVar.getClass();
        list2.getClass();
        return new crw(list2, z5, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crw)) {
            return false;
        }
        crw crwVar = (crw) obj;
        return this.f4864a == crwVar.f4864a && this.b == crwVar.b && this.c == crwVar.c && Intrinsics.d(this.d, crwVar.d) && this.e == crwVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f4864a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("HorsesRaceRunnersState(isLoading=", ", isError=", ", isEmpty=", this.f4864a, this.b);
        vqd.y(sbQ, ", horseRunnersInfoStateModelList=", this.d, ", compactInfo=", this.c);
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
