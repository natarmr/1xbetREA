package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cfb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4251a;
    public final dxh0 b;
    public final int c;

    public cfb(List list, dxh0 dxh0Var, int i) {
        list.getClass();
        this.f4251a = list;
        this.b = dxh0Var;
        this.c = i;
    }

    public static cfb a(cfb cfbVar, ArrayList arrayList, int i, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = cfbVar.f4251a;
        }
        dxh0 dxh0Var = cfbVar.b;
        if ((i2 & 4) != 0) {
            i = cfbVar.c;
        }
        cfbVar.getClass();
        list.getClass();
        return new cfb(list, dxh0Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfb)) {
            return false;
        }
        cfb cfbVar = (cfb) obj;
        return Intrinsics.d(this.f4251a, cfbVar.f4251a) && this.b.equals(cfbVar.b) && this.c == cfbVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hne.h(this.b, this.f4251a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampSegmentedControlState(pageList=");
        sb.append(this.f4251a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", currentPageIndex=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
