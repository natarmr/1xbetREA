package a;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final class rjf0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ List j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ tcj n;
    public final /* synthetic */ GregorianCalendar o;
    public final /* synthetic */ v9v0 p;
    public final /* synthetic */ cgk0 q;
    public final /* synthetic */ cgk0 r;
    public final /* synthetic */ cgk0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjf0(tcj tcjVar, GregorianCalendar gregorianCalendar, v9v0 v9v0Var, List list, int i, int i2, int i3, cgk0 cgk0Var, cgk0 cgk0Var2, cgk0 cgk0Var3, yje yjeVar) {
        super(2, yjeVar);
        this.n = tcjVar;
        this.o = gregorianCalendar;
        this.p = v9v0Var;
        this.j = list;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.q = cgk0Var;
        this.r = cgk0Var2;
        this.s = cgk0Var3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new rjf0(this.n, this.o, this.p, this.j, this.k, this.l, this.m, this.q, this.r, this.s, yjeVar);
            default:
                return new rjf0(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((rjf0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        SimpleDate simpleDate;
        int iG;
        int i;
        int iD;
        boolean z;
        boolean z2;
        boolean z3;
        int iG2;
        byte b = this.i;
        int i2 = this.k;
        List list = this.j;
        v9v0 v9v0Var = this.p;
        int i3 = this.l;
        int i4 = this.m;
        GregorianCalendar gregorianCalendar = this.o;
        cgk0 cgk0Var = this.q;
        cgk0 cgk0Var2 = this.r;
        cgk0 cgk0Var3 = this.s;
        switch (b) {
            case 0:
                List list2 = v9v0Var.f37054a;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                tcj tcjVar = this.n;
                if (!vdx.U(tcjVar.f33721a, tcjVar.b, gregorianCalendar)) {
                    vdx.w(list, i2, v9v0Var, tcjVar);
                    int iIntValue = ((Number) ((u9v0) list2.get(l1e0.d(cgk0Var.l(), 0, q3d.i(list2)))).c).intValue();
                    vdx.v(tcjVar, list, i3, iIntValue);
                    vdx.u(tcjVar, this.o, this.j, this.m, iIntValue, cgk0Var2.l() + 1);
                    ((t9v0) list.get(i2)).d.i(cgk0Var.l());
                    ((t9v0) list.get(i3)).d.i(cgk0Var2.l());
                    ((t9v0) list.get(i4)).d.i(cgk0Var3.l());
                } else {
                    vdx.t(list, i2, i3, i4);
                }
                break;
            default:
                tcj tcjVar2 = this.n;
                SimpleDate simpleDate2 = tcjVar2.b;
                SimpleDate simpleDate3 = tcjVar2.f33721a;
                List list3 = v9v0Var.f37054a;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!((t9v0) list.get(i2)).e && !((t9v0) list.get(i3)).e && !((t9v0) list.get(i4)).e) {
                    if (!vdx.U(simpleDate3, simpleDate2, gregorianCalendar)) {
                        int iIntValue2 = ((Number) ((u9v0) list3.get(l1e0.d(cgk0Var.l(), 0, q3d.i(list3)))).c).intValue();
                        int iL = cgk0Var2.l();
                        int i5 = iL + 1;
                        int iL2 = cgk0Var3.l() + 1;
                        gregorianCalendar.getClass();
                        gregorianCalendar.set(1, iIntValue2);
                        gregorianCalendar.set(2, iL);
                        gregorianCalendar.set(5, 1);
                        int actualMaximum = gregorianCalendar.getActualMaximum(5);
                        if (iL2 > actualMaximum) {
                            iL2 = actualMaximum;
                        }
                        if (simpleDate3 != null && ((iG2 = vdx.G(iIntValue2, i5, iL2, simpleDate3)) < 0 || iG2 == 0)) {
                            simpleDate = vdx.Z(gregorianCalendar, simpleDate3.f47286a, simpleDate3.b, simpleDate3.c, true);
                        } else if (simpleDate2 == null || ((iG = vdx.G(iIntValue2, i5, iL2, simpleDate2)) <= 0 && iG != 0)) {
                            gregorianCalendar.set(1, iIntValue2);
                            gregorianCalendar.set(2, iL);
                            gregorianCalendar.set(5, 1);
                            int actualMaximum2 = gregorianCalendar.getActualMaximum(5);
                            if (iL2 > actualMaximum2) {
                                iL2 = actualMaximum2;
                            }
                            simpleDate = new SimpleDate(iIntValue2, i5, iL2);
                        } else {
                            simpleDate = vdx.Z(gregorianCalendar, simpleDate2.f47286a, simpleDate2.b, simpleDate2.c, false);
                        }
                        int i6 = simpleDate.f47286a;
                        u9v0 u9v0Var = (u9v0) CollectionsKt.firstOrNull(list3);
                        Integer num = u9v0Var != null ? (Integer) u9v0Var.c : null;
                        if (num != null) {
                            int iD2 = l1e0.d(i6 - num.intValue(), 0, ((t9v0) list.get(i2)).b.size() - 1);
                            u9v0 u9v0Var2 = (u9v0) CollectionsKt.W(iD2, list3);
                            if (u9v0Var2 == null || ((Number) u9v0Var2.c).intValue() != i6) {
                                Iterator it = list3.iterator();
                                int i7 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i7 = -1;
                                    } else if (((Number) ((u9v0) it.next()).c).intValue() != i6) {
                                        i7++;
                                    }
                                }
                                i = 0;
                                iD = l1e0.d(i7, 0, ((t9v0) list.get(i2)).b.size() - 1);
                            } else {
                                iD = iD2;
                                i = 0;
                            }
                        } else {
                            i = 0;
                            iD = 0;
                        }
                        int iD3 = l1e0.d(simpleDate.b - 1, i, 11);
                        int iD4 = l1e0.d(simpleDate.c - 1, i, 30);
                        vdx.w(list, i2, v9v0Var, tcjVar2);
                        if (iD != cgk0Var.l()) {
                            ((t9v0) list.get(i2)).d.i(iD);
                            z = true;
                        } else {
                            z = false;
                        }
                        vdx.v(tcjVar2, list, i3, i6);
                        if (iD3 != cgk0Var2.l()) {
                            ((t9v0) list.get(i3)).d.i(iD3);
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        vdx.u(tcjVar2, this.o, this.j, this.m, simpleDate.f47286a, simpleDate.b);
                        if (iD4 != cgk0Var3.l()) {
                            ((t9v0) list.get(i4)).d.i(iD4);
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (!z3) {
                            tcjVar2.c.invoke(simpleDate);
                        }
                    } else {
                        vdx.t(list, i2, i3, i4);
                    }
                }
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjf0(List list, int i, int i2, int i3, tcj tcjVar, GregorianCalendar gregorianCalendar, v9v0 v9v0Var, cgk0 cgk0Var, cgk0 cgk0Var2, cgk0 cgk0Var3, yje yjeVar) {
        super(2, yjeVar);
        this.j = list;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.n = tcjVar;
        this.o = gregorianCalendar;
        this.p = v9v0Var;
        this.q = cgk0Var;
        this.r = cgk0Var2;
        this.s = cgk0Var3;
    }
}
