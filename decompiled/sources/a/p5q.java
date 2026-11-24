package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p5q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmy f26417a;
    public final cny b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final wul f;
    public final wul g;
    public final hjm h;
    public final hjm i;

    public p5q(nmy nmyVar, cny cnyVar, i4 i4Var, i4 i4Var2, String str, wul wulVar, wul wulVar2, hjm hjmVar, hjm hjmVar2) {
        i4Var.getClass();
        i4Var2.getClass();
        str.getClass();
        this.f26417a = nmyVar;
        this.b = cnyVar;
        this.c = i4Var;
        this.d = i4Var2;
        this.e = str;
        this.f = wulVar;
        this.g = wulVar2;
        this.h = hjmVar;
        this.i = hjmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5q)) {
            return false;
        }
        p5q p5qVar = (p5q) obj;
        return this.f26417a == p5qVar.f26417a && this.b == p5qVar.b && Intrinsics.d(this.c, p5qVar.c) && Intrinsics.d(this.d, p5qVar.d) && Intrinsics.d(this.e, p5qVar.e) && this.f.equals(p5qVar.f) && this.g.equals(p5qVar.g) && this.h.equals(p5qVar.h) && this.i.equals(p5qVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + hne.e(this.h, i8i.a(this.g, i8i.a(this.f, ua80.b(cs0.b(this.d, cs0.b(this.c, (this.b.hashCode() + (this.f26417a.hashCode() * 31)) * 31, 31), 31), 31, this.e), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FiltersBSDialogUiState(chosenFilterType=");
        sb.append(this.f26417a);
        sb.append(", chosenSortType=");
        sb.append(this.b);
        sb.append(", filterTabs=");
        hne.y(sb, this.c, ", sortTabs=", this.d, ", title=");
        sb.append(this.e);
        sb.append(", applyButtonModel=");
        sb.append(this.f);
        sb.append(", resetButtonModel=");
        sb.append(this.g);
        sb.append(", headerSubtitleModel=");
        sb.append(this.h);
        sb.append(", headerSortSubtitleModel=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
