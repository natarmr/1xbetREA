package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class rcx extends p4 {
    public static final Set f = tx3.l0(new ar20[]{cy2.T, cy2.U, pfr.f26918a, pfr.c});
    public final dgu c;
    public int d;
    public int e;

    public rcx(peg0 peg0Var, dgu dguVar) {
        super(peg0Var, (byte) 13);
        this.c = dguVar;
        this.d = -1;
    }

    public final void n1(dgu dguVar, ArrayList arrayList, int i, int i2, int i3) {
        wvq0 wvq0Var = new wvq0(dguVar, i);
        int i4 = 0;
        while (true) {
            int i5 = i4 + i2;
            if (wvq0Var.f(i5).f20728a == null || wvq0Var.f(i5).b == i3) {
                break;
            } else {
                i4 = i5;
            }
        }
        while (i4 != 0) {
            ar20 ar20Var = wvq0Var.f(i4).f20728a;
            ar20Var.getClass();
            arrayList.addAll(((peg0) this.b).h(ar20Var, wvq0Var.f(i4).b, wvq0Var.f(i4 + 1).b));
            i4 -= i2;
        }
    }

    @Override // a.p4
    public final eqs0 s0(fqs0 fqs0Var, List list, boolean z) {
        rcx rcxVar;
        dgu dguVar;
        list.getClass();
        sgi0 sgi0Var = fqs0Var.c;
        ar20 ar20Var = sgi0Var.b;
        IntRange intRange = sgi0Var.f32162a;
        int i = intRange.f46068a;
        int i2 = intRange.b;
        ArrayList arrayList = new ArrayList(list.size());
        dgu dguVar2 = this.c;
        if (z) {
            dguVar = dguVar2;
            n1(dguVar, arrayList, i, -1, -1);
            rcxVar = this;
        } else {
            rcxVar = this;
            dguVar = dguVar2;
        }
        int size = list.size();
        for (int i3 = 1; i3 < size; i3++) {
            eqs0 eqs0Var = (eqs0) list.get(i3 - 1);
            eqs0 eqs0Var2 = (eqs0) list.get(i3);
            arrayList.add(eqs0Var.f8252a);
            rcxVar.n1(dguVar, arrayList, eqs0Var.c - 1, 1, new wvq0(dguVar, eqs0Var2.b).d());
        }
        if (!list.isEmpty()) {
            arrayList.add(((eqs0) CollectionsKt.d0(list)).f8252a);
        }
        if (z) {
            rcxVar.n1(dguVar, arrayList, i2 - 1, 1, new wvq0(dguVar, i2).d());
        }
        return new eqs0(((peg0) rcxVar.b).g(ar20Var, arrayList), i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4 A[SYNTHETIC] */
    @Override // a.p4
    public final void v0(fqs0 fqs0Var, List list) {
        eqs0 eqs0Var;
        int i;
        ar20 ar20Var = cy2.x;
        fqs0Var.getClass();
        int i2 = fqs0Var.f9990a;
        if (this.d == -1) {
            this.d = i2;
        }
        while (true) {
            int i3 = this.d;
            if (i3 >= i2) {
                if (Intrinsics.d(fqs0Var.c.b, wb.A)) {
                    if (fqs0Var.c()) {
                        this.e++;
                        return;
                    } else {
                        if (fqs0Var.b()) {
                            return;
                        }
                        this.e--;
                        return;
                    }
                }
                return;
            }
            peg0 peg0Var = (peg0) this.b;
            dgu dguVar = this.c;
            wvq0 wvq0Var = new wvq0(dguVar, i3);
            if (wvq0Var.e() == null) {
                throw new byw("");
            }
            ar20 ar20VarE = wvq0Var.e();
            ar20VarE.getClass();
            if (this.e > 0 && f.contains(ar20VarE)) {
                ar20VarE = ar20Var;
            }
            if (this.e <= 0 || !Intrinsics.d(ar20VarE, ar20Var) || list == null || (eqs0Var = (eqs0) CollectionsKt.f0(list)) == null) {
                for (j jVar : peg0Var.h(ar20VarE, wvq0Var.d(), wvq0Var.c())) {
                    if (list != null) {
                        int i4 = wvq0Var.f39851a;
                        list.add(new eqs0(jVar, i4, i4 + 1));
                    }
                }
            } else {
                int i5 = eqs0Var.b;
                if (Intrinsics.d(eqs0Var.f8252a.f15657a, ar20Var) && (i = eqs0Var.c) == i3 && new wvq0(dguVar, i - 1).c() == wvq0Var.d()) {
                    list.set(list.size() - 1, new eqs0((j) CollectionsKt.v0(peg0Var.h(ar20Var, new wvq0(dguVar, i5).d(), wvq0Var.c())), i5, i3 + 1));
                } else {
                    while (r2.hasNext()) {
                        if (list != null) {
                            int i6 = wvq0Var.f39851a;
                            list.add(new eqs0(jVar, i6, i6 + 1));
                        }
                    }
                }
            }
            this.d++;
        }
    }
}
