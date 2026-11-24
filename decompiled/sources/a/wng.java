package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wng implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qng f39446a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ing i;
    public final nng j;
    public final rng k;
    public final jng l;
    public final String m;

    public wng(qng qngVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, ing ingVar, nng nngVar, rng rngVar, jng jngVar, String str8) {
        str.getClass();
        str2.getClass();
        this.f39446a = qngVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = ingVar;
        this.j = nngVar;
        this.k = rngVar;
        this.l = jngVar;
        this.m = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wng)) {
            return false;
        }
        wng wngVar = (wng) obj;
        return this.f39446a.equals(wngVar.f39446a) && Intrinsics.d(this.b, wngVar.b) && Intrinsics.d(this.c, wngVar.c) && this.d.equals(wngVar.d) && this.e.equals(wngVar.e) && this.f.equals(wngVar.f) && this.g.equals(wngVar.g) && this.h.equals(wngVar.h) && this.i.equals(wngVar.i) && this.j.equals(wngVar.j) && this.k.equals(wngVar.k) && this.l.equals(wngVar.l) && this.m.equals(wngVar.m);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof wng) && (p6t0Var2 instanceof wng);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "DURAK_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((this.f39446a.hashCode() + 1479124885) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof wng) || !(p6t0Var2 instanceof wng)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        wng wngVar = (wng) p6t0Var;
        wng wngVar2 = (wng) p6t0Var2;
        k9x.G(linkedHashSet, wngVar.f39446a, wngVar2.f39446a);
        k9x.G(linkedHashSet, new ong(wngVar.b), new ong(wngVar2.b));
        k9x.G(linkedHashSet, new sng(wngVar.c), new sng(wngVar2.c));
        k9x.G(linkedHashSet, new png(wngVar.d), new png(wngVar2.d));
        k9x.G(linkedHashSet, new tng(wngVar.e), new tng(wngVar2.e));
        k9x.G(linkedHashSet, new lng(wngVar.f), new lng(wngVar2.f));
        k9x.G(linkedHashSet, new kng(wngVar.g), new kng(wngVar2.g));
        k9x.G(linkedHashSet, new mng(wngVar.h), new mng(wngVar2.h));
        k9x.G(linkedHashSet, wngVar.i, wngVar2.i);
        k9x.G(linkedHashSet, wngVar.j, wngVar2.j);
        k9x.G(linkedHashSet, wngVar.k, wngVar2.k);
        k9x.G(linkedHashSet, wngVar.l, wngVar2.l);
        k9x.G(linkedHashSet, new ung(wngVar.m), new ung(wngVar2.m));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("FirstPlayerName(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("SecondPlayerName(value=", this.c, Separators.RPAREN);
        String strL3 = kng0.l("FirstPlayerStatus(value=", this.d, Separators.RPAREN);
        String strL4 = kng0.l("SecondPlayerStatus(value=", this.e, Separators.RPAREN);
        String strL5 = kng0.l("CountStepTitle(value=", this.f, Separators.RPAREN);
        String strL6 = kng0.l("CountReboundTitle(value=", this.g, Separators.RPAREN);
        String strL7 = kng0.l("CountTakenTitle(value=", this.h, Separators.RPAREN);
        String strL8 = kng0.l("TableBackground(value=", this.m, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("CyberDurakUiModel(key=DURAK_KEY, matchDescription=");
        sb.append(this.f39446a);
        sb.append(", firstPlayerName=");
        sb.append(strL);
        sb.append(", secondPlayerName=");
        f140.v(sb, strL2, ", firstPlayerStatus=", strL3, ", secondPlayerStatus=");
        f140.v(sb, strL4, ", countStep=", strL5, ", countReboundTitle=");
        f140.v(sb, strL6, ", countTakenTitle=", strL7, ", cardDeck=");
        sb.append(this.i);
        sb.append(", firstPlayerCardList=");
        sb.append(this.j);
        sb.append(", secondPlayerCardList=");
        sb.append(this.k);
        sb.append(", cardOnTable=");
        sb.append(this.l);
        sb.append(", tableBackground=");
        return axq.n(sb, strL8, Separators.RPAREN);
    }
}
