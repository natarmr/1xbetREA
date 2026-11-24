package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tr30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34405a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final List h;

    public tr30(int i, List list, int i2, int i3, int i4, int i5, int i6, List list2) {
        list.getClass();
        list2.getClass();
        this.f34405a = i;
        this.b = list;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr30)) {
            return false;
        }
        tr30 tr30Var = (tr30) obj;
        return this.f34405a == tr30Var.f34405a && Intrinsics.d(this.b, tr30Var.b) && this.c == tr30Var.c && this.d == tr30Var.d && this.e == tr30Var.e && this.f == tr30Var.f && this.g == tr30Var.g && Intrinsics.d(this.h, tr30Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, dw9.a(Integer.hashCode(this.f34405a) * 31, 31, this.b), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemoryGameModel(actionNumber=");
        sb.append(this.f34405a);
        sb.append(", hintIndexList=");
        sb.append(this.b);
        sb.append(", clickedCell=");
        axq.r(this.c, this.d, ", indexCell=", ", gameStatus=", sb);
        axq.r(this.e, this.f, ", sportId=", ", winPoints=", sb);
        sb.append(this.g);
        sb.append(", cardStateList=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
