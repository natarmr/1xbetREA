package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class mhu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final twz f21814a;

    public mhu(twz twzVar) {
        twzVar.getClass();
        this.f21814a = twzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ucq ucqVar, zje zjeVar) {
        lhu lhuVar;
        Object objA;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        if (zjeVar instanceof lhu) {
            lhuVar = (lhu) zjeVar;
            int i = lhuVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                lhuVar.n = i - Integer.MIN_VALUE;
            } else {
                lhuVar = new lhu(this, zjeVar);
            }
        } else {
            lhuVar = new lhu(this, zjeVar);
        }
        Object objA2 = lhuVar.l;
        wne wneVar = wne.f39444a;
        int i2 = lhuVar.n;
        twz twzVar = this.f21814a;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objA2);
            lhuVar.i = ucqVar;
            lhuVar.n = 1;
            objA2 = twzVar.a(str, lhuVar);
            if (objA2 != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            ucqVar = lhuVar.i;
            z1x.P(objA2);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = lhuVar.k;
            arrayList2 = lhuVar.j;
            z1x.P(objA2);
        }
        return new lzz(arrayList2, arrayList);
        lzz lzzVar = (lzz) objA2;
        List list = lzzVar.f20926a;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            xrz xrzVar = ((qcq) next).b;
            if (xrzVar instanceof xh7) {
                z2 = ucqVar.l;
            } else if (xrzVar instanceof q8k) {
                z2 = ucqVar.i;
            }
            if (z2) {
                arrayList3.add(next);
            }
        }
        List list2 = lzzVar.b;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            xrz xrzVar2 = ((siq0) obj2).b;
            if (xrzVar2 instanceof h8i0) {
                z = ucqVar.k;
            } else if (xrzVar2 instanceof qmq0) {
                z = ucqVar.n;
            } else {
                z = xrzVar2 instanceof tbe0 ? ucqVar.o : false;
            }
            if (z) {
                arrayList4.add(obj2);
            }
        }
        lhuVar.i = null;
        lhuVar.j = arrayList3;
        lhuVar.k = arrayList4;
        lhuVar.n = 2;
        if (twzVar.c.i) {
            objA = Unit.f46060a;
        } else {
            for (Object obj3 : arrayList4) {
                siq0 siq0Var = (siq0) obj3;
                if (siq0Var.b == tbe0.f33660a && siq0Var.j == lrz.b) {
                    obj = obj3;
                    break;
                }
            }
            siq0 siq0Var2 = (siq0) obj;
            if (siq0Var2 == null) {
                objA = Unit.f46060a;
            } else {
                uen uenVar = wen.b;
                long jE = wen.e(ibc.u0(siq0Var2.e, bfn.MINUTES));
                kwz kwzVar = twzVar.c;
                if (jE != kwzVar.e) {
                    kwzVar.e = jE;
                    qoj0 qoj0Var = kwzVar.d;
                    Unit unit = Unit.f46060a;
                    objA = qoj0Var.a(unit, lhuVar);
                    wne wneVar2 = wne.f39444a;
                    if (objA != wneVar2) {
                        objA = unit;
                    }
                    if (objA != wneVar2) {
                        objA = unit;
                    }
                    if (objA != wneVar2) {
                        objA = unit;
                    }
                } else {
                    objA = Unit.f46060a;
                }
            }
        }
        if (objA != wneVar) {
            arrayList = arrayList4;
            arrayList2 = arrayList3;
            return new lzz(arrayList2, arrayList);
        }
        return wneVar;
    }
}
