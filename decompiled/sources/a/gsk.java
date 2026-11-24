package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lpk f11834a;
    public final a4x b;
    public final boolean c;

    public gsk(lpk lpkVar, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f11834a = lpkVar;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsk)) {
            return false;
        }
        gsk gskVar = (gsk) obj;
        return Intrinsics.d(this.f11834a, gskVar.f11834a) && Intrinsics.d(this.b, gskVar.b) && this.c == gskVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f11834a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisciplineDetailsScreenStateUiModel(contentState=");
        sb.append(this.f11834a);
        sb.append(", itemList=");
        sb.append(this.b);
        sb.append(", loading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    public gsk(kpk kpkVar) {
        this(kpkVar, lak0.c, false);
    }
}
