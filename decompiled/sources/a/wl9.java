package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wl9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39342a;
    public final dxh0 b;
    public final int c;
    public final boolean d;

    public wl9(List list, dxh0 dxh0Var, int i, boolean z) {
        list.getClass();
        this.f39342a = list;
        this.b = dxh0Var;
        this.c = i;
        this.d = z;
    }

    public static wl9 a(wl9 wl9Var, ArrayList arrayList, int i, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = wl9Var.f39342a;
        }
        dxh0 dxh0Var = wl9Var.b;
        if ((i2 & 4) != 0) {
            i = wl9Var.c;
        }
        boolean z = (i2 & 8) != 0 ? wl9Var.d : true;
        wl9Var.getClass();
        list.getClass();
        return new wl9(list, dxh0Var, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl9)) {
            return false;
        }
        wl9 wl9Var = (wl9) obj;
        return Intrinsics.d(this.f39342a, wl9Var.f39342a) && this.b.equals(wl9Var.b) && this.c == wl9Var.c && this.d == wl9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, hne.h(this.b, this.f39342a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarSegmentedControlState(pageList=");
        sb.append(this.f39342a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", currentPageIndex=");
        return ohs0.k(this.c, ", initialPageLoaded=", Separators.RPAREN, sb, this.d);
    }
}
