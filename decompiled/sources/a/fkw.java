package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fkw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f9713a;
    public final uiw b;
    public final boolean c;

    public fkw(n0x n0xVar, uiw uiwVar, boolean z) {
        this.f9713a = n0xVar;
        this.b = uiwVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkw)) {
            return false;
        }
        fkw fkwVar = (fkw) obj;
        return this.f9713a.equals(fkwVar.f9713a) && Intrinsics.d(this.b, fkwVar.b) && this.c == fkwVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.f9713a.hashCode() * 31;
        uiw uiwVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (uiwVar == null ? 0 : uiwVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeToolbarUiModel(toolbarImage=");
        sb.append(this.f9713a);
        sb.append(", cardUiModel=");
        sb.append(this.b);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
