package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aiv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hyl f944a;
    public final String b;
    public final a4x c;

    public aiv(fyl fylVar, String str, i4 i4Var) {
        i4Var.getClass();
        this.f944a = fylVar;
        this.b = str;
        this.c = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiv)) {
            return false;
        }
        aiv aivVar = (aiv) obj;
        return Intrinsics.d(this.f944a, aivVar.f944a) && this.b.equals(aivVar.b) && Intrinsics.d(this.c, aivVar.c);
    }

    public final int hashCode() {
        hyl hylVar = this.f944a;
        return this.c.hashCode() + ua80.b((hylVar == null ? 0 : hylVar.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupStageUiState(groups=");
        sb.append(this.f944a);
        sb.append(", selectedGroupTitle=");
        sb.append(this.b);
        sb.append(", groupTitles=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
