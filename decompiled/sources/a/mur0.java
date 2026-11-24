package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mur0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22426a = 1;
    public final /* synthetic */ nyq0 b;
    public final /* synthetic */ vhv0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ ugd g;
    public final /* synthetic */ ugd h;
    public final /* synthetic */ ugd i;
    public final /* synthetic */ ugd j;

    public /* synthetic */ mur0(ugd ugdVar, ugd ugdVar2, ugd ugdVar3, Function0 function0, long j, nyq0 nyq0Var, ugd ugdVar4, vhv0 vhv0Var, ugd ugdVar5) {
        this.f = ugdVar;
        this.g = ugdVar2;
        this.h = ugdVar3;
        this.e = function0;
        this.d = j;
        this.b = nyq0Var;
        this.i = ugdVar4;
        this.c = vhv0Var;
        this.j = ugdVar5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        switch (this.f22426a) {
            case 0:
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                int i = p4e.i(p4eVar.f26347a);
                final int iH = p4e.h(p4eVar.f26347a);
                byte b = 0;
                long jB = p4e.b(p4eVar.f26347a, 0, 0, 0, 0, 10);
                List listK = c5n0Var.k(h1h0.f12283a, this.f);
                final ArrayList arrayList = new ArrayList(listK.size());
                int size = listK.size();
                for (int iE = 0; iE < size; iE = w6x.e((pj30) listK.get(iE), jB, arrayList, iE, 1)) {
                }
                if (arrayList.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList.get(0);
                    int i2 = ((pu90) obj3).b;
                    int size2 = arrayList.size() - 1;
                    if (1 <= size2) {
                        int i3 = 1;
                        while (true) {
                            Object obj8 = arrayList.get(i3);
                            int i4 = ((pu90) obj8).b;
                            if (i2 < i4) {
                                obj3 = obj8;
                                i2 = i4;
                            }
                            if (i3 != size2) {
                                i3++;
                            }
                        }
                    }
                }
                pu90 pu90Var = (pu90) obj3;
                final int i5 = pu90Var != null ? pu90Var.b : 0;
                List listK2 = c5n0Var.k(h1h0.c, this.g);
                final ArrayList arrayList2 = new ArrayList(listK2.size());
                int size3 = listK2.size();
                for (int iE2 = 0; iE2 < size3; iE2 = w6x.e((pj30) listK2.get(iE2), jB, arrayList2, iE2, 1)) {
                }
                if (arrayList2.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList2.get(0);
                    int i6 = ((pu90) obj4).b;
                    int size4 = arrayList2.size() - 1;
                    if (1 <= size4) {
                        int i7 = 1;
                        while (true) {
                            Object obj9 = arrayList2.get(i7);
                            int i8 = ((pu90) obj9).b;
                            if (i6 < i8) {
                                obj4 = obj9;
                                i6 = i8;
                            }
                            if (i7 != size4) {
                                i7++;
                            }
                        }
                    }
                }
                pu90 pu90Var2 = (pu90) obj4;
                int i9 = pu90Var2 != null ? pu90Var2.b : 0;
                List listK3 = c5n0Var.k(h1h0.b, this.h);
                ArrayList arrayList3 = new ArrayList(listK3.size());
                int size5 = listK3.size();
                int iE3 = 0;
                while (iE3 < size5) {
                    pj30 pj30Var = (pj30) listK3.get(iE3);
                    zcl zclVar = qmk.f28987a;
                    int iW0 = i9 + i5 + ((int) c5n0Var.w0(30.0f));
                    if (iW0 < 0) {
                        zcx.a("height must be >= 0");
                    }
                    ArrayList arrayList4 = arrayList3;
                    iE3 = w6x.e(pj30Var, p4e.b(r4e.h(0, Integer.MAX_VALUE, iW0, iW0), 0, i, 0, 0, 13), arrayList4, iE3, 1);
                    size5 = size5;
                    arrayList3 = arrayList4;
                }
                final ArrayList arrayList5 = arrayList3;
                if (arrayList5.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList5.get(0);
                    int i10 = ((pu90) obj5).b;
                    int size6 = arrayList5.size() - 1;
                    if (1 <= size6) {
                        int i11 = 1;
                        while (true) {
                            Object obj10 = arrayList5.get(i11);
                            int i12 = ((pu90) obj10).b;
                            if (i10 < i12) {
                                obj5 = obj10;
                                i10 = i12;
                            }
                            if (i11 != size6) {
                                i11++;
                            }
                        }
                    }
                }
                pu90 pu90Var3 = (pu90) obj5;
                int i13 = i9;
                List listK4 = c5n0Var.k(h1h0.e, new ugd(1915948790, true, new xhh(c5n0Var, pu90Var3 != null ? pu90Var3.b : 0, this.e, this.d)));
                final ArrayList arrayList6 = new ArrayList(listK4.size());
                int size7 = listK4.size();
                for (int iE4 = 0; iE4 < size7; iE4 = w6x.e((pj30) listK4.get(iE4), jB, arrayList6, iE4, 1)) {
                }
                List listK5 = c5n0Var.k(h1h0.d, new ugd(-1759788916, true, new nur0(this.b, c5n0Var, i13, b)));
                final ArrayList arrayList7 = new ArrayList(listK5.size());
                int size8 = listK5.size();
                for (int iE5 = 0; iE5 < size8; iE5 = w6x.e((pj30) listK5.get(iE5), jB, arrayList7, iE5, 1)) {
                }
                if (arrayList7.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList7.get(0);
                    int i14 = ((pu90) obj6).b;
                    int size9 = arrayList7.size() - 1;
                    if (1 <= size9) {
                        int i15 = 1;
                        while (true) {
                            Object obj11 = arrayList7.get(i15);
                            int i16 = ((pu90) obj11).b;
                            if (i14 < i16) {
                                obj6 = obj11;
                                i14 = i16;
                            }
                            if (i15 != size9) {
                                i15++;
                            }
                        }
                    }
                }
                pu90 pu90Var4 = (pu90) obj6;
                int i17 = pu90Var4 != null ? pu90Var4.b : 0;
                List listK6 = c5n0Var.k(h1h0.g, new ugd(535357338, true, new kqj0(this.i, (byte) 4)));
                final ArrayList arrayList8 = new ArrayList(listK6.size());
                int size10 = listK6.size();
                for (int iE6 = 0; iE6 < size10; iE6 = w6x.e((pj30) listK6.get(iE6), jB, arrayList8, iE6, 1)) {
                }
                if (arrayList8.isEmpty()) {
                    obj7 = null;
                } else {
                    obj7 = arrayList8.get(0);
                    int i18 = ((pu90) obj7).b;
                    int size11 = arrayList8.size() - 1;
                    if (1 <= size11) {
                        int i19 = 1;
                        while (true) {
                            Object obj12 = arrayList8.get(i19);
                            int i20 = ((pu90) obj12).b;
                            if (i18 < i20) {
                                i18 = i20;
                                obj7 = obj12;
                            }
                            if (i19 != size11) {
                                i19++;
                            }
                        }
                    }
                }
                pu90 pu90Var5 = (pu90) obj7;
                int i21 = pu90Var5 != null ? pu90Var5.b : 0;
                List listK7 = c5n0Var.k(h1h0.f, new ugd(-136769749, true, new vo6(this.c, c5n0Var, i5, i17, this.j)));
                final ArrayList arrayList9 = new ArrayList(listK7.size());
                int size12 = listK7.size();
                for (int iE7 = 0; iE7 < size12; iE7 = w6x.e((pj30) listK7.get(iE7), jB, arrayList9, iE7, 1)) {
                }
                final int i22 = i21;
                return vj30.x(c5n0Var, i, iH, new Function1() { // from class: a.our0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj13) {
                        ou90 ou90Var = (ou90) obj13;
                        ou90Var.getClass();
                        ArrayList arrayList10 = arrayList5;
                        int size13 = arrayList10.size();
                        for (int i23 = 0; i23 < size13; i23++) {
                            ou90Var.g((pu90) arrayList10.get(i23), 0, 0, 0.0f);
                        }
                        ArrayList arrayList11 = arrayList2;
                        int size14 = arrayList11.size();
                        for (int i24 = 0; i24 < size14; i24++) {
                            ou90Var.g((pu90) arrayList11.get(i24), 0, i5, 0.0f);
                        }
                        ArrayList arrayList12 = arrayList6;
                        int size15 = arrayList12.size();
                        for (int i25 = 0; i25 < size15; i25++) {
                            ou90Var.g((pu90) arrayList12.get(i25), 0, 0, 0.0f);
                        }
                        ArrayList arrayList13 = arrayList9;
                        int size16 = arrayList13.size();
                        for (int i26 = 0; i26 < size16; i26++) {
                            ou90Var.g((pu90) arrayList13.get(i26), 0, 0, 0.0f);
                        }
                        ArrayList arrayList14 = arrayList7;
                        int size17 = arrayList14.size();
                        for (int i27 = 0; i27 < size17; i27++) {
                            ou90Var.g((pu90) arrayList14.get(i27), 0, 0, 0.0f);
                        }
                        ArrayList arrayList15 = arrayList;
                        int size18 = arrayList15.size();
                        for (int i28 = 0; i28 < size18; i28++) {
                            ou90Var.g((pu90) arrayList15.get(i28), 0, 0, 0.0f);
                        }
                        ArrayList arrayList16 = arrayList8;
                        int size19 = arrayList16.size();
                        for (int i29 = 0; i29 < size19; i29++) {
                            ou90Var.g((pu90) arrayList16.get(i29), 0, iH - i22, 0.0f);
                        }
                        return Unit.f46060a;
                    }
                });
            default:
                ((Integer) obj2).getClass();
                zcm0.e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ mur0(nyq0 nyq0Var, vhv0 vhv0Var, long j, Function0 function0, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, ugd ugdVar5, int i) {
        this.b = nyq0Var;
        this.c = vhv0Var;
        this.d = j;
        this.e = function0;
        this.f = ugdVar;
        this.g = ugdVar2;
        this.h = ugdVar3;
        this.i = ugdVar4;
        this.j = ugdVar5;
    }
}
