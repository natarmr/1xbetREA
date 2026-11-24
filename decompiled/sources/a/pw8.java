package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$BrandsLanguageSelectionScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class pw8 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final duj o;
    public final oeg0 p;
    public final mne q;
    public final hut r;
    public final fuu s;
    public final hut t;
    public bby u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw8(duj dujVar, oeg0 oeg0Var, ctf0 ctf0Var, mne mneVar, bzt bztVar, hut hutVar, xoc xocVar, fuu fuuVar, hut hutVar2, gut gutVar) {
        super(new sk1(bztVar, (byte) 2), cvm0.p(mneVar.c, mneVar.f22085a), new ep4(ctf0Var, (byte) 6), (yzn0) null);
        oeg0Var.getClass();
        ctf0Var.getClass();
        this.o = dujVar;
        this.p = oeg0Var;
        this.q = mneVar;
        this.r = hutVar;
        this.s = fuuVar;
        this.t = hutVar2;
        M();
    }

    public final void M() {
        bby bbyVar = this.u;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.u = sac.V(jiu0.a(this), new d38(this, (byte) 13), null, this.q.b, new jc1((Object) this, yjeVar, (byte) 2), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        Object value;
        lv8 lv8Var = (lv8) obj;
        lv8Var.getClass();
        super.x(lv8Var);
        if (lv8Var.equals(dv8.f6731a)) {
            E();
            return;
        }
        boolean zEquals = lv8Var.equals(fv8.f10203a);
        p0w0 p0w0Var = p0w0.f26173a;
        oeg0 oeg0Var = this.p;
        if (zEquals) {
            i1w0 i1w0VarC = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0VarC, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            byte b = 27;
            yje yjeVar = null;
            if (lv8Var.equals(ev8.f8456a)) {
                ux8 ux8Var = ((jw8) D()).f17240a;
                if (ux8Var instanceof qx8) {
                    qx8 qx8Var = (qx8) ux8Var;
                    AggregatorSortingOptionModel aggregatorSortingOptionModel = (AggregatorSortingOptionModel) CollectionsKt.U(qx8Var.f29469a);
                    AggregatorSortingOptionModel aggregatorSortingOptionModel2 = qx8Var.b;
                    if (Intrinsics.d(aggregatorSortingOptionModel2, aggregatorSortingOptionModel)) {
                        aggregatorSortingOptionModel2 = null;
                    }
                    sac.V(jiu0.a(this), null, new vb8(this, (byte) 9), this.q.b, new xw5(this, aggregatorSortingOptionModel2, yjeVar, b), 9);
                    return;
                }
                i1w0 i1w0VarC2 = oeg0Var.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0VarC2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0VarC2.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if (lv8Var.equals(gv8.f11964a)) {
                    H(new m87(((jw8) D()).f17240a, (byte) 18));
                    return;
                }
                if (lv8Var.equals(hv8.f13714a)) {
                    M();
                    return;
                }
                if (!lv8Var.equals(iv8.f15434a)) {
                    if (lv8Var.equals(jv8.f17196a)) {
                        ux8 ux8Var2 = ((jw8) D()).f17240a;
                        if (ux8Var2 instanceof qx8) {
                            qx8 qx8Var2 = (qx8) ux8Var2;
                            G(new iw8(qx8Var2.f29469a, qx8Var2.b));
                            return;
                        }
                        return;
                    }
                    if (!(lv8Var instanceof kv8)) {
                        t9f.b();
                        return;
                    }
                    String str = ((kv8) lv8Var).f18945a;
                    ux8 ux8Var3 = ((jw8) D()).f17240a;
                    if (ux8Var3 instanceof qx8) {
                        Iterator it = ((qx8) ux8Var3).f29469a.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.d(((AggregatorSortingOptionModel) next).f46274a, str));
                        AggregatorSortingOptionModel aggregatorSortingOptionModel3 = (AggregatorSortingOptionModel) next;
                        if (aggregatorSortingOptionModel3 == null) {
                            return;
                        }
                        p7m0 p7m0Var = this.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            this.f.getClass();
                        } while (!p7m0Var.m(value, jw8.a((jw8) value, qx8.a((qx8) ux8Var3, aggregatorSortingOptionModel3), null, 27)));
                        return;
                    }
                    return;
                }
                i1w0 i1w0VarC3 = oeg0Var.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0VarC3);
                FragmentScreen aggregatorScreens$BrandsLanguageSelectionScreen = new AggregatorScreens$BrandsLanguageSelectionScreen();
                if (aggregatorScreens$BrandsLanguageSelectionScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) aggregatorScreens$BrandsLanguageSelectionScreen)));
                } else {
                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(aggregatorScreens$BrandsLanguageSelectionScreen)));
                }
                ListIterator listIteratorO = b1j.o(i1w0VarC3, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0VarC3.a((oe50) pawVar3.next());
                    }
                }
            }
        }
    }
}
