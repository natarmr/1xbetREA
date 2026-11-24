package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bep0 {
    public static final bep0 k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2462a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final dlp0 g;
    public final dlp0 h;
    public final int i;
    public final int j;

    static {
        iun iunVar = iun.f15405a;
        dlp0 dlp0Var = dlp0.d;
        k = new bep0(0, iunVar, iunVar, iunVar, iunVar, iunVar, dlp0Var, dlp0Var, 0, 0);
    }

    public bep0(int i, List list, List list2, List list3, List list4, List list5, dlp0 dlp0Var, dlp0 dlp0Var2, int i2, int i3) {
        rz4.B(list, list2, list3, list4, list5);
        this.f2462a = i;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = dlp0Var;
        this.h = dlp0Var2;
        this.i = i2;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bep0)) {
            return false;
        }
        bep0 bep0Var = (bep0) obj;
        return this.f2462a == bep0Var.f2462a && Intrinsics.d(this.b, bep0Var.b) && Intrinsics.d(this.c, bep0Var.c) && Intrinsics.d(this.d, bep0Var.d) && Intrinsics.d(this.e, bep0Var.e) && Intrinsics.d(this.f, bep0Var.f) && this.g.equals(bep0Var.g) && this.h.equals(bep0Var.h) && this.i == bep0Var.i && this.j == bep0Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + twn.a(this.i, (this.h.hashCode() + ((this.g.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(dw9.a(Integer.hashCode(this.f2462a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamGamesModel(drawCount=");
        sb.append(this.f2462a);
        sb.append(", lastGameModels=");
        sb.append(this.b);
        sb.append(", team1FutureLastGameModels=");
        b1j.y(", team1LastGameModels=", ", team2FutureLastGameModels=", sb, this.c, this.d);
        b1j.y(", team2LastGameModels=", ", teamStatModel1=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", teamStatModel2=");
        sb.append(this.h);
        sb.append(", winCount1=");
        return w6x.o(this.i, this.j, ", winCount2=", Separators.RPAREN, sb);
    }
}
