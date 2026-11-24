package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final htr f37248a;
    public final htr b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;

    public vdt(htr htrVar, htr htrVar2, List list, int i, int i2, int i3) {
        list.getClass();
        this.f37248a = htrVar;
        this.b = htrVar2;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdt)) {
            return false;
        }
        vdt vdtVar = (vdt) obj;
        return this.f37248a.equals(vdtVar.f37248a) && this.b.equals(vdtVar.b) && Intrinsics.d(this.c, vdtVar.c) && this.d == vdtVar.d && this.e == vdtVar.e && this.f == vdtVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, twn.a(this.d, dw9.a((this.b.hashCode() + (this.f37248a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesUiState(gamesList=");
        sb.append(this.f37248a);
        sb.append(", cachedGamesList=");
        sb.append(this.b);
        sb.append(", favoriteGamesList=");
        brm0.v(this.d, ", listFirstVisibleItemIndex=", ", listFirstVisibleItemScrollOffset=", sb, this.c);
        return w6x.o(this.e, this.f, ", gamesCount=", Separators.RPAREN, sb);
    }
}
