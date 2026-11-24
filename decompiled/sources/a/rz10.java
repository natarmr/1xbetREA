package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class rz10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31337a;
    public final dxh0 b;
    public final int c;

    public rz10(List list, dxh0 dxh0Var, int i) {
        this.f31337a = list;
        this.b = dxh0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz10)) {
            return false;
        }
        rz10 rz10Var = (rz10) obj;
        return this.f31337a.equals(rz10Var.f31337a) && this.b.equals(rz10Var.b) && this.c == rz10Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hne.h(this.b, this.f31337a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainSegmentedControlState(pageList=");
        sb.append(this.f31337a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", currentPageIndex=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
