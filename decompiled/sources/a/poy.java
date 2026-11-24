package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class poy implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27350a;
    public final List b;
    public final float c;
    public final noy d;
    public final ArrayList e;
    public final loy f;
    public final moy g;
    public final ioy h;
    public final koy i;

    public poy(List list, List list2, float f, noy noyVar, ArrayList arrayList, loy loyVar, moy moyVar, ioy ioyVar, koy koyVar) {
        list.getClass();
        list2.getClass();
        this.f27350a = list;
        this.b = list2;
        this.c = f;
        this.d = noyVar;
        this.e = arrayList;
        this.f = loyVar;
        this.g = moyVar;
        this.h = ioyVar;
        this.i = koyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poy)) {
            return false;
        }
        poy poyVar = (poy) obj;
        return Intrinsics.d(this.f27350a, poyVar.f27350a) && Intrinsics.d(this.b, poyVar.b) && Float.compare(this.c, poyVar.c) == 0 && this.d.equals(poyVar.d) && this.e.equals(poyVar.e) && this.f.equals(poyVar.f) && this.g.equals(poyVar.g) && this.h.equals(poyVar.h) && this.i.equals(poyVar.i);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof poy) && (p6t0Var2 instanceof poy);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "KILLER_JOKER_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + twn.g(this.e, (this.d.hashCode() + defpackage.c.a(dw9.a(dw9.a(rw2.b(1360533441, 31, 0L), 31, this.f27350a), 31, this.b), this.c, 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof poy) || !(p6t0Var2 instanceof poy)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        poy poyVar = (poy) p6t0Var;
        poy poyVar2 = (poy) p6t0Var2;
        k9x.G(linkedHashSet, poyVar.d, poyVar2.d);
        k9x.G(linkedHashSet, poyVar.h, poyVar2.h);
        k9x.G(linkedHashSet, poyVar.f, poyVar2.f);
        k9x.G(linkedHashSet, poyVar.g, poyVar2.g);
        k9x.G(linkedHashSet, new joy(poyVar.e), new joy(poyVar2.e));
        k9x.G(linkedHashSet, poyVar.i, poyVar2.i);
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strO = hne.o("Cards(value=", Separators.RPAREN, this.e);
        StringBuilder sbT = w6x.t("KillerJokerUiModel(key=KILLER_JOKER_KEY, id=0, firstPlayerGameFiled=", ", secondPlayerGameFiled=", this.f27350a, ", alpha=", this.b);
        sbT.append(this.c);
        sbT.append(", timer=");
        sbT.append(this.d);
        sbT.append(", cards=");
        sbT.append(strO);
        sbT.append(", firstPlayerCardSize=");
        sbT.append(this.f);
        sbT.append(", secondPlayerCardSize=");
        sbT.append(this.g);
        sbT.append(", background=");
        sbT.append(this.h);
        sbT.append(", description=");
        sbT.append(this.i);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
