package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k7t {
    public static final k7t g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17839a;
    public final List b;
    public final int c;
    public final List d;
    public final List e;
    public final List f;

    static {
        iun iunVar = iun.f15405a;
        g = new k7t(0, iunVar, 0, iunVar, iunVar, iunVar);
    }

    public k7t(int i, List list, int i2, List list2, List list3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f17839a = i;
        this.b = list;
        this.c = i2;
        this.d = list2;
        this.e = list3;
        this.f = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7t)) {
            return false;
        }
        k7t k7tVar = (k7t) obj;
        return this.f17839a == k7tVar.f17839a && Intrinsics.d(this.b, k7tVar.b) && this.c == k7tVar.c && Intrinsics.d(this.d, k7tVar.d) && Intrinsics.d(this.e, k7tVar.e) && Intrinsics.d(this.f, k7tVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(dw9.a(twn.a(this.c, dw9.a(Integer.hashCode(this.f17839a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesManiaFieldModel(position=");
        sb.append(this.f17839a);
        sb.append(", puzzleList=");
        sb.append(this.b);
        sb.append(", newPuzzleId=");
        ohs0.v(this.c, ", shotsValue=", ", fieldList=", sb, this.d);
        return kng0.n(", cellsList=", Separators.RPAREN, sb, this.e, this.f);
    }
}
