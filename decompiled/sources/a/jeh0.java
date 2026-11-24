package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class jeh0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16375a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;

    public jeh0(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, float f, float f2, float f3, float f4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        str3.getClass();
        str4.getClass();
        this.f16375a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = f;
        this.j = f2;
        this.k = f3;
        this.l = f4;
        this.m = arrayList;
        this.n = arrayList2;
        this.o = arrayList3;
        this.p = arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jeh0)) {
            return false;
        }
        jeh0 jeh0Var = (jeh0) obj;
        return this.f16375a == jeh0Var.f16375a && this.b.equals(jeh0Var.b) && this.c.equals(jeh0Var.c) && Intrinsics.d(this.d, jeh0Var.d) && Intrinsics.d(this.e, jeh0Var.e) && this.f.equals(jeh0Var.f) && this.g.equals(jeh0Var.g) && this.h.equals(jeh0Var.h) && Float.compare(this.i, jeh0Var.i) == 0 && Float.compare(this.j, jeh0Var.j) == 0 && Float.compare(this.k, jeh0Var.k) == 0 && Float.compare(this.l, jeh0Var.l) == 0 && this.m.equals(jeh0Var.m) && this.n.equals(jeh0Var.n) && this.o.equals(jeh0Var.o) && this.p.equals(jeh0Var.p);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof jeh0) && (p6t0Var2 instanceof jeh0) && ((jeh0) p6t0Var).f16375a == ((jeh0) p6t0Var2).f16375a;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "SEA_BATTLE_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_player_placeholder) + twn.g(this.p, twn.g(this.o, twn.g(this.n, twn.g(this.m, defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(-1031496520, 31, this.f16375a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), this.i, 31), this.j, 31), this.k, 31), this.l, 31), 31), 31), 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof jeh0) || !(p6t0Var2 instanceof jeh0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        jeh0 jeh0Var = (jeh0) p6t0Var;
        jeh0 jeh0Var2 = (jeh0) p6t0Var2;
        k9x.G(linkedHashSet, new vdh0(jeh0Var.b), new vdh0(jeh0Var2.b));
        k9x.G(linkedHashSet, new ceh0(jeh0Var.c), new ceh0(jeh0Var2.c));
        k9x.G(linkedHashSet, new wdh0(jeh0Var.d), new wdh0(jeh0Var2.d));
        k9x.G(linkedHashSet, new deh0(jeh0Var.e), new deh0(jeh0Var2.e));
        k9x.G(linkedHashSet, new tdh0(jeh0Var.f), new tdh0(jeh0Var2.f));
        k9x.G(linkedHashSet, new ydh0(jeh0Var.g), new ydh0(jeh0Var2.g));
        k9x.G(linkedHashSet, new feh0(jeh0Var.h), new feh0(jeh0Var2.h));
        k9x.G(linkedHashSet, new xdh0(jeh0Var.i), new xdh0(jeh0Var2.i));
        k9x.G(linkedHashSet, new eeh0(jeh0Var.j), new eeh0(jeh0Var2.j));
        k9x.G(linkedHashSet, new udh0(jeh0Var.k), new udh0(jeh0Var2.k));
        k9x.G(linkedHashSet, new beh0(jeh0Var.l), new beh0(jeh0Var2.l));
        k9x.G(linkedHashSet, new zdh0(jeh0Var.m), new zdh0(jeh0Var2.m));
        k9x.G(linkedHashSet, new geh0(jeh0Var.n), new geh0(jeh0Var2.n));
        k9x.G(linkedHashSet, new aeh0(jeh0Var.o), new aeh0(jeh0Var2.o));
        k9x.G(linkedHashSet, new heh0(jeh0Var.p), new heh0(jeh0Var2.p));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("PlayerOneIcon(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("PlayerTwoIcon(value=", this.c, Separators.RPAREN);
        String strL3 = kng0.l("PlayerOneName(value=", this.d, Separators.RPAREN);
        String strL4 = kng0.l("PlayerTwoName(value=", this.e, Separators.RPAREN);
        String strL5 = kng0.l("MatchDescription(value=", this.f, Separators.RPAREN);
        String strL6 = kng0.l("PlayerOneScore(value=", this.g, Separators.RPAREN);
        String strL7 = kng0.l("PlayerTwoScore(value=", this.h, Separators.RPAREN);
        String strJ = rw2.j(this.i, "PlayerOneOpacity(value=", Separators.RPAREN);
        String strJ2 = rw2.j(this.j, "PlayerTwoOpacity(value=", Separators.RPAREN);
        String strJ3 = rw2.j(this.k, "PlayerOneFieldOpacity(value=", Separators.RPAREN);
        String strJ4 = rw2.j(this.l, "PlayerTwoFieldOpacity(value=", Separators.RPAREN);
        String strO = hne.o("PlayerOneShips(value=", Separators.RPAREN, this.m);
        String strO2 = hne.o("PlayerTwoShips(value=", Separators.RPAREN, this.n);
        String strO3 = hne.o("PlayerOneShots(value=", Separators.RPAREN, this.o);
        String strO4 = hne.o("PlayerTwoShots(value=", Separators.RPAREN, this.p);
        StringBuilder sbO = axq.o(this.f16375a, "SeaBattleUiModel(key=SEA_BATTLE_KEY, gameId=", ", playerOneIcon=", strL);
        f140.v(sbO, ", playerTwoIcon=", strL2, ", playerOneName=", strL3);
        f140.v(sbO, ", playerTwoName=", strL4, ", matchDescription=", strL5);
        f140.v(sbO, ", playerOneScore=", strL6, ", playerTwoScore=", strL7);
        f140.v(sbO, ", playerOneOpacity=", strJ, ", playerTwoOpacity=", strJ2);
        f140.v(sbO, ", playerOneFieldOpacity=", strJ3, ", playerTwoFieldOpacity=", strJ4);
        f140.v(sbO, ", playerOneShips=", strO, ", playerTwoShips=", strO2);
        f140.v(sbO, ", playerOneShots=", strO3, ", playerTwoShots=", strO4);
        return vqd.p(sbO, ", playerPlaceholder=", R.drawable.ic_player_placeholder, Separators.RPAREN);
    }
}
