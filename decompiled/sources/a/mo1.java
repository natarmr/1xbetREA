package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mo1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22113a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ mo1(ArrayList arrayList, int i) {
        this.f22113a = (byte) 1;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22113a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                bo1 bo1Var = (bo1) obj2;
                ((oyg0) obj).getClass();
                bo1Var.getClass();
                c9h0 c9h0Var = new c9h0(arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w3d.u(arrayList2, ((j8b) it.next()).c);
                }
                int iA = wp20.a(r3d.q(arrayList2, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj3 : arrayList2) {
                    linkedHashMap.put(Long.valueOf(((mlr) obj3).f22006a), obj3);
                }
                return bo1.a(bo1Var, null, c9h0Var, null, null, true, linkedHashMap, false, false, null, null, false, 0L, 1048413);
            case 1:
                ((Integer) obj2).getClass();
                ahy.h(x8x.L(1), (fet) obj, arrayList);
                return Unit.f46060a;
            case 2:
                p650 p650Var = (p650) obj2;
                List list = p650Var.h;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    if (!(((jge) obj4) instanceof ige)) {
                        arrayList3.add(obj4);
                    }
                }
                return p650.a(p650Var, null, CollectionsKt.q0(arrayList3, arrayList), null, false, 262015);
            case 3:
                return ko90.a((ko90) obj2, 0, null, null, dyb.o0(arrayList), 15);
            case 4:
                u2b0 u2b0Var = (u2b0) obj2;
                List<df40> list2 = u2b0Var.l;
                ArrayList arrayList4 = new ArrayList();
                for (df40 df40Var : list2) {
                    w3d.u(arrayList4, ((df40Var instanceof pe40) && (((pe40) df40Var).f26833a instanceof t4t)) ? arrayList : kotlin.collections.a.c(df40Var));
                }
                return u2b0.a(u2b0Var, false, false, false, false, null, null, arrayList4, 2047);
            case 5:
                dvk0 dvk0Var = (dvk0) obj2;
                return dvk0.a(dvk0Var, false, xl9.a(dvk0Var.b, arrayList, null, 2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821);
            case 6:
                dvk0 dvk0Var2 = (dvk0) obj2;
                return dvk0.a(dvk0Var2, false, null, a9l0.a(dvk0Var2.c, arrayList, 0L, 2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741819);
            default:
                gvn0 gvn0Var = (gvn0) obj2;
                List<epn0> list3 = gvn0Var.e;
                ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                for (epn0 epn0VarA : list3) {
                    if (arrayList.contains(epn0VarA)) {
                        epn0VarA = epn0.a(epn0VarA, true);
                    }
                    arrayList5.add(epn0VarA);
                }
                return gvn0.a(gvn0Var, false, false, false, false, arrayList5, null, null, 239);
        }
    }

    public /* synthetic */ mo1(ArrayList arrayList, byte b) {
        this.f22113a = b;
        this.b = arrayList;
    }
}
