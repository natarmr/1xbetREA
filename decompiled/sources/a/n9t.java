package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n9t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23156a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final i9t h;
    public final i9t i;
    public final i9t j;

    public n9t(int i, List list, int i2, int i3, boolean z, List list2, boolean z2, i9t i9tVar, i9t i9tVar2, i9t i9tVar3) {
        list.getClass();
        list2.getClass();
        i9tVar2.getClass();
        i9tVar3.getClass();
        this.f23156a = i;
        this.b = list;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = list2;
        this.g = z2;
        this.h = i9tVar;
        this.i = i9tVar2;
        this.j = i9tVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9t)) {
            return false;
        }
        n9t n9tVar = (n9t) obj;
        return this.f23156a == n9tVar.f23156a && Intrinsics.d(this.b, n9tVar.b) && this.c == n9tVar.c && this.d == n9tVar.d && this.e == n9tVar.e && Intrinsics.d(this.f, n9tVar.f) && this.g == n9tVar.g && this.h.equals(n9tVar.h) && Intrinsics.d(this.i, n9tVar.i) && Intrinsics.d(this.j, n9tVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + brm0.e(dw9.a(brm0.e(twn.a(this.d, twn.a(this.c, dw9.a(Integer.hashCode(this.f23156a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesManiaModel(positionInField=");
        sb.append(this.f23156a);
        sb.append(", puzzleList=");
        sb.append(this.b);
        sb.append(", shotsValue=");
        axq.r(this.c, this.d, ", newPuzzle=", ", flagNewMap=", sb);
        vqd.y(sb, ", shotResult=", this.f, ", flagWin=", this.e);
        sb.append(this.g);
        sb.append(", currentMap=");
        sb.append(this.h);
        sb.append(", oldMap=");
        sb.append(this.i);
        sb.append(", newMap=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
