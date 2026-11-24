package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w5j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38588a;
    public final bm5 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final i6j f;
    public final List g;

    public w5j(int i, bm5 bm5Var, boolean z, boolean z2, boolean z3, i6j i6jVar, List list) {
        this.f38588a = i;
        this.b = bm5Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i6jVar;
        this.g = list;
    }

    public static w5j a(w5j w5jVar, i6j i6jVar, ArrayList arrayList, int i) {
        int i2 = w5jVar.f38588a;
        bm5 bm5Var = w5jVar.b;
        boolean z = (i & 4) != 0 ? w5jVar.c : false;
        boolean z2 = (i & 8) != 0 ? w5jVar.d : false;
        boolean z3 = w5jVar.e;
        if ((i & 32) != 0) {
            i6jVar = w5jVar.f;
        }
        i6j i6jVar2 = i6jVar;
        List list = arrayList;
        if ((i & 64) != 0) {
            list = w5jVar.g;
        }
        w5jVar.getClass();
        return new w5j(i2, bm5Var, z, z2, z3, i6jVar2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5j)) {
            return false;
        }
        w5j w5jVar = (w5j) obj;
        return this.f38588a == w5jVar.f38588a && this.b == w5jVar.b && this.c == w5jVar.c && this.d == w5jVar.d && this.e == w5jVar.e && this.f.equals(w5jVar.f) && Intrinsics.d(this.g, w5jVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + brm0.e(brm0.e(brm0.e((this.b.hashCode() + (Integer.hashCode(this.f38588a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31;
        List list = this.g;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyTasksState(lottieType=");
        sb.append(this.f38588a);
        sb.append(", balanceScreenType=");
        sb.append(this.b);
        sb.append(", isFirstSwapSkipped=");
        ua80.u(", isCheckChangeBalance=", ", hasPlayerTasksEnabled=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", dailyTasksWidgetModel=");
        sb.append(this.f);
        sb.append(", dailyTasksCardModels=");
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
