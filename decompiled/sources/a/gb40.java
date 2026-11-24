package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gb40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10999a;
    public final long b;
    public final String c;
    public final hb40 d;
    public final hb40 e;
    public final int f;

    public gb40(List list, long j, String str, hb40 hb40Var, hb40 hb40Var2, int i) {
        list.getClass();
        this.f10999a = list;
        this.b = j;
        this.c = str;
        this.d = hb40Var;
        this.e = hb40Var2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb40)) {
            return false;
        }
        gb40 gb40Var = (gb40) obj;
        return Intrinsics.d(this.f10999a, gb40Var.f10999a) && this.b == gb40Var.b && this.c.equals(gb40Var.c) && this.d.equals(gb40Var.d) && this.e.equals(gb40Var.e) && this.f == gb40Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ua80.b(rw2.b(this.f10999a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        return "MetaHeroesEventModel(heroIds=" + this.f10999a + ", id=" + this.b + ", championshipName=" + this.c + ", firstOpponent=" + this.d + ", secondOpponent=" + this.e + ", bestOfMaps=" + this.f + Separators.RPAREN;
    }
}
