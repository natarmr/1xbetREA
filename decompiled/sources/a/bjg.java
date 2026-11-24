package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bjg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f2705a;
    public final a4x b;
    public final a4x c;
    public final cnb d;
    public final int e;

    public bjg(i4 i4Var, a4x a4xVar, a4x a4xVar2, cnb cnbVar, int i) {
        a4xVar.getClass();
        cnbVar.getClass();
        this.f2705a = i4Var;
        this.b = a4xVar;
        this.c = a4xVar2;
        this.d = cnbVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjg)) {
            return false;
        }
        bjg bjgVar = (bjg) obj;
        return this.f2705a.equals(bjgVar.f2705a) && Intrinsics.d(this.b, bjgVar.b) && this.c.equals(bjgVar.c) && Intrinsics.d(this.d, bjgVar.d) && this.e == bjgVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, this.f2705a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampsTabUiState(tabKeys=");
        sb.append(this.f2705a);
        sb.append(", segments=");
        sb.append(this.b);
        sb.append(", tabs=");
        sb.append(this.c);
        sb.append(", activeTabKey=");
        sb.append(this.d);
        sb.append(", selectedTabIndex=");
        return rz4.j(this.e, Separators.RPAREN, sb);
    }
}
