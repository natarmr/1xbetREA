package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class h9j implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12679a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final ArrayList g;
    public final String h;
    public final String i;
    public final f9a0 j;
    public final f9j k;
    public final String l;

    public h9j(int i, String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, String str5, String str6, f9a0 f9a0Var, f9j f9jVar, String str7) {
        this.f12679a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
        this.j = f9a0Var;
        this.k = f9jVar;
        this.l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9j)) {
            return false;
        }
        h9j h9jVar = (h9j) obj;
        return this.f12679a == h9jVar.f12679a && this.b.equals(h9jVar.b) && this.c.equals(h9jVar.c) && this.d.equals(h9jVar.d) && this.e.equals(h9jVar.e) && this.f.equals(h9jVar.f) && this.g.equals(h9jVar.g) && this.h.equals(h9jVar.h) && this.i.equals(h9jVar.i) && this.j == h9jVar.j && this.k.equals(h9jVar.k) && this.l.equals(h9jVar.l);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof h9j) && (p6t0Var2 instanceof h9j);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "DARTS_LIVE_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ua80.b(ua80.b(twn.g(this.g, twn.g(this.f, ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.f12679a, -180577463, 31), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i)) * 31)) * 31)) * 31) + 600660052;
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof h9j) || !(p6t0Var2 instanceof h9j)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h9j h9jVar = (h9j) p6t0Var;
        h9j h9jVar2 = (h9j) p6t0Var2;
        k9x.G(linkedHashSet, new a9j(h9jVar.f12679a), new a9j(h9jVar2.f12679a));
        k9x.G(linkedHashSet, new y8j(h9jVar.b), new y8j(h9jVar2.b));
        k9x.G(linkedHashSet, new e9j(h9jVar.c), new e9j(h9jVar2.c));
        k9x.G(linkedHashSet, new v8j(h9jVar.d), new v8j(h9jVar2.d));
        k9x.G(linkedHashSet, new b9j(h9jVar.e), new b9j(h9jVar2.e));
        k9x.G(linkedHashSet, new x8j(h9jVar.f), new x8j(h9jVar2.f));
        k9x.G(linkedHashSet, new d9j(h9jVar.g), new d9j(h9jVar2.g));
        k9x.G(linkedHashSet, new w8j(h9jVar.h), new w8j(h9jVar2.h));
        k9x.G(linkedHashSet, new c9j(h9jVar.i), new c9j(h9jVar2.i));
        k9x.G(linkedHashSet, new z8j(h9jVar.j), new z8j(h9jVar2.j));
        k9x.G(linkedHashSet, h9jVar.k, h9jVar2.k);
        k9x.G(linkedHashSet, new u8j(h9jVar.l), new u8j(h9jVar2.l));
        k9x.G(linkedHashSet, new t8j(), new t8j());
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strE = ua80.e(this.f12679a, "RoundNumber(value=", Separators.RPAREN);
        String strL = kng0.l("FirstPlayerTotal(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("SecondPlayerTotal(value=", this.c, Separators.RPAREN);
        String strL3 = kng0.l("FirstPlayerNumberOfThrow(value=", this.d, Separators.RPAREN);
        String strL4 = kng0.l("SecondPlayerNumberOfThrow(value=", this.e, Separators.RPAREN);
        String strO = hne.o("FirstPlayerThrows(value=", Separators.RPAREN, this.f);
        String strO2 = hne.o("SecondPlayerThrows(value=", Separators.RPAREN, this.g);
        String strL5 = kng0.l("FirstPlayerSumOfThrows(value=", this.h, Separators.RPAREN);
        String strL6 = kng0.l("SecondPlayerSumOfThrows(value=", this.i, Separators.RPAREN);
        String str = "Move(value=" + this.j + Separators.RPAREN;
        String strL7 = kng0.l("Description(value=", this.l, Separators.RPAREN);
        StringBuilder sbN = b1j.n("DartsLiveUiModel(key=DARTS_LIVE_KEY, roundNumber=", strE, ", firstPlayerTotal=", strL, ", secondPlayerTotal=");
        f140.v(sbN, strL2, ", firstPlayerNumberOfThrow=", strL3, ", secondPlayerNumberOfThrow=");
        f140.v(sbN, strL4, ", firstPlayerThrows=", strO, ", secondPlayerThrows=");
        f140.v(sbN, strO2, ", firstPlayerSumOfThrows=", strL5, ", secondPlayerSumOfThrows=");
        f140.v(sbN, strL6, ", move=", str, ", timer=");
        sbN.append(this.k);
        sbN.append(", description=");
        sbN.append(strL7);
        sbN.append(", fieldImage=DartsFieldImage(value=static/img/ImgDefault/Esports/Virtual/Darts/dartboard.png))");
        return sbN.toString();
    }
}
