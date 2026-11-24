package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class aef0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f725a;
    public final boolean b;
    public final boolean c;
    public final v5l0 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final wcb i;
    public final boolean j;
    public final boolean k;

    public aef0(List list, boolean z, boolean z2, v5l0 v5l0Var, int i, boolean z3, boolean z4, List list2, wcb wcbVar, boolean z5, boolean z6) {
        list.getClass();
        list2.getClass();
        this.f725a = list;
        this.b = z;
        this.c = z2;
        this.d = v5l0Var;
        this.e = i;
        this.f = z3;
        this.g = z4;
        this.h = list2;
        this.i = wcbVar;
        this.j = z5;
        this.k = z6;
    }

    public static aef0 a(aef0 aef0Var, List list, boolean z, wcb wcbVar, int i) {
        if ((i & 1) != 0) {
            list = aef0Var.f725a;
        }
        List list2 = list;
        boolean z2 = (i & 2) != 0 ? aef0Var.b : false;
        boolean z3 = (i & 4) != 0 ? aef0Var.c : z;
        v5l0 v5l0Var = aef0Var.d;
        int i2 = aef0Var.e;
        boolean z4 = aef0Var.f;
        boolean z5 = aef0Var.g;
        List list3 = aef0Var.h;
        wcb wcbVar2 = (i & 256) != 0 ? aef0Var.i : wcbVar;
        boolean z6 = aef0Var.j;
        boolean z7 = aef0Var.k;
        aef0Var.getClass();
        list2.getClass();
        list3.getClass();
        return new aef0(list2, z2, z3, v5l0Var, i2, z4, z5, list3, wcbVar2, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aef0)) {
            return false;
        }
        aef0 aef0Var = (aef0) obj;
        return Intrinsics.d(this.f725a, aef0Var.f725a) && this.b == aef0Var.b && this.c == aef0Var.c && this.d == aef0Var.d && this.e == aef0Var.e && this.f == aef0Var.f && this.g == aef0Var.g && Intrinsics.d(this.h, aef0Var.h) && Intrinsics.d(this.i, aef0Var.i) && this.j == aef0Var.j && this.k == aef0Var.k;
    }

    public final int hashCode() {
        int iA = dw9.a(brm0.e(brm0.e(twn.a(this.e, axq.c(this.d, brm0.e(brm0.e(this.f725a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h);
        wcb wcbVar = this.i;
        return Boolean.hashCode(this.k) + brm0.e((iA + (wcbVar == null ? 0 : wcbVar.hashCode())) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelatedGamesListState(relatedGamesItems=");
        sb.append(this.f725a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isError=");
        sb.append(this.c);
        sb.append(", sportEventCardStyle=");
        sb.append(this.d);
        sb.append(", lottieType=");
        brm0.w(this.e, ", hasStream=", ", bettingDisabled=", sb, this.f);
        vqd.y(sb, ", specialEventInfo=", this.h, ", champImagesHolder=", this.g);
        sb.append(this.i);
        sb.append(", isNewEventParams=");
        sb.append(this.j);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.k, Separators.RPAREN);
    }
}
