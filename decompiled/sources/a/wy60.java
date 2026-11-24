package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wy60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39962a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;

    public wy60(int i, int i2, int i3, int i4, List list) {
        list.getClass();
        this.f39962a = i;
        this.b = list;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static wy60 a(wy60 wy60Var, int i, ArrayList arrayList, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = wy60Var.f39962a;
        }
        int i6 = i;
        List list = arrayList;
        if ((i5 & 2) != 0) {
            list = wy60Var.b;
        }
        List list2 = list;
        if ((i5 & 4) != 0) {
            i2 = wy60Var.c;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = wy60Var.d;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = wy60Var.e;
        }
        wy60Var.getClass();
        list2.getClass();
        return new wy60(i6, i7, i8, i4, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy60)) {
            return false;
        }
        wy60 wy60Var = (wy60) obj;
        return this.f39962a == wy60Var.f39962a && Intrinsics.d(this.b, wy60Var.b) && this.c == wy60Var.c && this.d == wy60Var.d && this.e == wy60Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, twn.a(this.c, dw9.a(Integer.hashCode(this.f39962a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewState(selectedCategory=");
        sb.append(this.f39962a);
        sb.append(", chipValueNamePairs=");
        sb.append(this.b);
        sb.append(", sortId=");
        axq.r(this.c, this.d, ", coeffId=", ", counter=", sb);
        return rz4.j(this.e, Separators.RPAREN, sb);
    }
}
