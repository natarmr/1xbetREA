package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ms60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22304a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ clo d;

    public /* synthetic */ ms60(ugd ugdVar, ugd ugdVar2, clo cloVar, byte b) {
        this.f22304a = b;
        this.b = ugdVar;
        this.c = ugdVar2;
        this.d = cloVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        float f;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        byte b = this.f22304a;
        clo cloVar = this.d;
        ugd ugdVar = this.c;
        ugd ugdVar2 = this.b;
        switch (b) {
            case 0:
                oyq0 oyq0Var = cloVar.f4569a;
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                kie0 kie0Var = new kie0();
                List listK = c5n0Var.k("staticContentId", ugdVar2);
                ArrayList arrayList = new ArrayList(listK.size());
                int size = listK.size();
                for (int iE = 0; iE < size; iE = w6x.e((pj30) listK.get(iE), p4eVar.f26347a, arrayList, iE, 1)) {
                }
                List listK2 = c5n0Var.k("dynamicContentId", ugdVar);
                ArrayList arrayList2 = new ArrayList(listK2.size());
                int size2 = listK2.size();
                for (int iE2 = 0; iE2 < size2; iE2 = w6x.e((pj30) listK2.get(iE2), p4eVar.f26347a, arrayList2, iE2, 1)) {
                }
                int i = 1;
                if (arrayList.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList.get(0);
                    int i2 = ((pu90) obj3).b;
                    int size3 = arrayList.size() - 1;
                    if (1 <= size3) {
                        int i3 = 1;
                        while (true) {
                            Object obj12 = arrayList.get(i3);
                            int i4 = ((pu90) obj12).b;
                            if (i2 < i4) {
                                obj3 = obj12;
                                i2 = i4;
                            }
                            if (i3 != size3) {
                                i3++;
                            }
                        }
                    }
                }
                pu90 pu90Var = (pu90) obj3;
                float fA = pu90Var != null ? pu90Var.b : 0.0f;
                if (arrayList2.isEmpty() || arrayList.isEmpty()) {
                    oyq0Var.f26070a = -1.0f;
                } else {
                    if (arrayList2.isEmpty()) {
                        obj4 = null;
                    } else {
                        obj4 = arrayList2.get(0);
                        int i5 = ((pu90) obj4).b;
                        int size4 = arrayList2.size() - 1;
                        if (1 <= size4) {
                            int i6 = 1;
                            while (true) {
                                Object obj13 = arrayList2.get(i6);
                                int i7 = ((pu90) obj13).b;
                                if (i5 < i7) {
                                    obj4 = obj13;
                                    i5 = i7;
                                }
                                if (i6 != size4) {
                                    i6++;
                                }
                            }
                        }
                    }
                    pu90 pu90Var2 = (pu90) obj4;
                    float f2 = pu90Var2 != null ? pu90Var2.b : 0.0f;
                    if (arrayList.isEmpty()) {
                        obj5 = null;
                    } else {
                        Object obj14 = arrayList.get(0);
                        int i8 = ((pu90) obj14).b;
                        int size5 = arrayList.size() - 1;
                        if (1 <= size5) {
                            while (true) {
                                Object obj15 = arrayList.get(i);
                                int i9 = ((pu90) obj15).b;
                                if (i8 < i9) {
                                    obj14 = obj15;
                                    i8 = i9;
                                }
                                if (i != size5) {
                                    i++;
                                }
                            }
                        }
                        obj5 = obj14;
                    }
                    pu90 pu90Var3 = (pu90) obj5;
                    f = pu90Var3 != null ? pu90Var3.b : 0.0f;
                    oyq0Var.f26070a = -f2;
                    float f3 = f + f2;
                    fA = rw2.a(fA, f3, oyq0Var.a(), f3);
                    kie0Var.f18333a = si30.b((((f - f2) - f) * oyq0Var.a()) + f);
                }
                return vj30.x(c5n0Var, p4e.i(p4eVar.f26347a), si30.b(fA), new gi0(arrayList2, arrayList, kie0Var, (byte) 4));
            case 1:
                oyq0 oyq0Var2 = cloVar.f4569a;
                c5n0 c5n0Var2 = (c5n0) obj;
                p4e p4eVar2 = (p4e) obj2;
                c5n0Var2.getClass();
                kie0 kie0Var2 = new kie0();
                List listK3 = c5n0Var2.k("staticContentId", ugdVar2);
                ArrayList arrayList3 = new ArrayList(listK3.size());
                int size6 = listK3.size();
                for (int iE3 = 0; iE3 < size6; iE3 = w6x.e((pj30) listK3.get(iE3), p4eVar2.f26347a, arrayList3, iE3, 1)) {
                }
                List listK4 = c5n0Var2.k("dynamicContentId", ugdVar);
                ArrayList arrayList4 = new ArrayList(listK4.size());
                int size7 = listK4.size();
                for (int iE4 = 0; iE4 < size7; iE4 = w6x.e((pj30) listK4.get(iE4), p4eVar2.f26347a, arrayList4, iE4, 1)) {
                }
                int i10 = 1;
                if (arrayList3.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList3.get(0);
                    int i11 = ((pu90) obj6).b;
                    int size8 = arrayList3.size() - 1;
                    if (1 <= size8) {
                        int i12 = 1;
                        while (true) {
                            Object obj16 = arrayList3.get(i12);
                            int i13 = ((pu90) obj16).b;
                            if (i11 < i13) {
                                obj6 = obj16;
                                i11 = i13;
                            }
                            if (i12 != size8) {
                                i12++;
                            }
                        }
                    }
                }
                pu90 pu90Var4 = (pu90) obj6;
                float fA2 = pu90Var4 != null ? pu90Var4.b : 0.0f;
                if (arrayList4.isEmpty() || arrayList3.isEmpty()) {
                    oyq0Var2.f26070a = -1.0f;
                } else {
                    if (arrayList4.isEmpty()) {
                        obj7 = null;
                    } else {
                        obj7 = arrayList4.get(0);
                        int i14 = ((pu90) obj7).b;
                        int size9 = arrayList4.size() - 1;
                        if (1 <= size9) {
                            int i15 = 1;
                            while (true) {
                                Object obj17 = arrayList4.get(i15);
                                int i16 = ((pu90) obj17).b;
                                if (i14 < i16) {
                                    obj7 = obj17;
                                    i14 = i16;
                                }
                                if (i15 != size9) {
                                    i15++;
                                }
                            }
                        }
                    }
                    pu90 pu90Var5 = (pu90) obj7;
                    float f4 = pu90Var5 != null ? pu90Var5.b : 0.0f;
                    if (arrayList3.isEmpty()) {
                        obj8 = null;
                    } else {
                        Object obj18 = arrayList3.get(0);
                        int i17 = ((pu90) obj18).b;
                        int size10 = arrayList3.size() - 1;
                        if (1 <= size10) {
                            while (true) {
                                Object obj19 = arrayList3.get(i10);
                                int i18 = ((pu90) obj19).b;
                                if (i17 < i18) {
                                    obj18 = obj19;
                                    i17 = i18;
                                }
                                if (i10 != size10) {
                                    i10++;
                                }
                            }
                        }
                        obj8 = obj18;
                    }
                    pu90 pu90Var6 = (pu90) obj8;
                    f = pu90Var6 != null ? pu90Var6.b : 0.0f;
                    oyq0Var2.f26070a = -f4;
                    float f5 = f + f4;
                    fA2 = rw2.a(fA2, f5, oyq0Var2.a(), f5);
                    kie0Var2.f18333a = si30.b((((f - f4) - f) * oyq0Var2.a()) + f);
                }
                return vj30.x(c5n0Var2, p4e.i(p4eVar2.f26347a), si30.b(fA2), new gi0(arrayList4, arrayList3, kie0Var2, (byte) 5));
            default:
                oyq0 oyq0Var3 = cloVar.f4569a;
                c5n0 c5n0Var3 = (c5n0) obj;
                p4e p4eVar3 = (p4e) obj2;
                c5n0Var3.getClass();
                kie0 kie0Var3 = new kie0();
                List listK5 = c5n0Var3.k("staticContentId", ugdVar2);
                ArrayList arrayList5 = new ArrayList(listK5.size());
                int size11 = listK5.size();
                int iE5 = 0;
                while (true) {
                    int i19 = 1;
                    if (iE5 >= size11) {
                        List listK6 = c5n0Var3.k("dynamicContentId", ugdVar);
                        ArrayList arrayList6 = new ArrayList(listK6.size());
                        int size12 = listK6.size();
                        int iE6 = 0;
                        while (iE6 < size12) {
                            int i20 = i19;
                            iE6 = w6x.e((pj30) listK6.get(iE6), p4eVar3.f26347a, arrayList6, iE6, i20);
                            i19 = i20;
                        }
                        int i21 = i19;
                        if (arrayList5.isEmpty()) {
                            obj9 = null;
                        } else {
                            obj9 = arrayList5.get(0);
                            int i22 = ((pu90) obj9).b;
                            int size13 = arrayList5.size() - i21;
                            if (i21 <= size13) {
                                int i23 = i21;
                                while (true) {
                                    Object obj20 = arrayList5.get(i23);
                                    int i24 = ((pu90) obj20).b;
                                    if (i22 < i24) {
                                        i22 = i24;
                                        obj9 = obj20;
                                    }
                                    if (i23 != size13) {
                                        i23++;
                                    }
                                }
                            }
                        }
                        pu90 pu90Var7 = (pu90) obj9;
                        float fA3 = pu90Var7 != null ? pu90Var7.b : 0.0f;
                        if (arrayList6.isEmpty() || arrayList5.isEmpty()) {
                            oyq0Var3.f26070a = -1.0f;
                        } else {
                            if (arrayList6.isEmpty()) {
                                obj10 = null;
                            } else {
                                obj10 = arrayList6.get(0);
                                int i25 = ((pu90) obj10).b;
                                int size14 = arrayList6.size() - i21;
                                if (i21 <= size14) {
                                    int i26 = i21;
                                    while (true) {
                                        Object obj21 = arrayList6.get(i26);
                                        int i27 = ((pu90) obj21).b;
                                        if (i25 < i27) {
                                            obj10 = obj21;
                                            i25 = i27;
                                        }
                                        if (i26 != size14) {
                                            i26++;
                                        }
                                    }
                                }
                            }
                            pu90 pu90Var8 = (pu90) obj10;
                            float f6 = pu90Var8 != null ? pu90Var8.b : 0.0f;
                            if (arrayList5.isEmpty()) {
                                obj11 = null;
                            } else {
                                Object obj22 = arrayList5.get(0);
                                int i28 = ((pu90) obj22).b;
                                int size15 = arrayList5.size() - i21;
                                if (i21 <= size15) {
                                    while (true) {
                                        Object obj23 = arrayList5.get(i21);
                                        int i29 = ((pu90) obj23).b;
                                        if (i28 < i29) {
                                            obj22 = obj23;
                                            i28 = i29;
                                        }
                                        if (i21 != size15) {
                                            i21++;
                                        }
                                    }
                                }
                                obj11 = obj22;
                            }
                            pu90 pu90Var9 = (pu90) obj11;
                            f = pu90Var9 != null ? pu90Var9.b : 0.0f;
                            oyq0Var3.f26070a = -f6;
                            float f7 = f + f6;
                            fA3 = rw2.a(fA3, f7, oyq0Var3.a(), f7);
                            kie0Var3.f18333a = si30.b((((f - f6) - f) * oyq0Var3.a()) + f);
                        }
                        return vj30.x(c5n0Var3, p4e.i(p4eVar3.f26347a), si30.b(fA3), new gi0(arrayList6, arrayList5, kie0Var3, (byte) 6));
                    }
                    iE5 = w6x.e((pj30) listK5.get(iE5), p4eVar3.f26347a, arrayList5, iE5, 1);
                }
                break;
        }
    }
}
