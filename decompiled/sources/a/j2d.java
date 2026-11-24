package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j2d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15774a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ w2d d;

    public /* synthetic */ j2d(ugd ugdVar, ugd ugdVar2, w2d w2dVar, byte b) {
        this.f15774a = b;
        this.b = ugdVar;
        this.c = ugdVar2;
        this.d = w2dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        byte b = this.f15774a;
        w2d w2dVar = this.d;
        ugd ugdVar = this.c;
        ugd ugdVar2 = this.b;
        switch (b) {
            case 0:
                x2d x2dVar = w2dVar.f38442a;
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                List listK = c5n0Var.k("stickyContentId", ugdVar2);
                ArrayList arrayList = new ArrayList(listK.size());
                int size = listK.size();
                int iE = 0;
                while (true) {
                    int i = 1;
                    if (iE >= size) {
                        List listK2 = c5n0Var.k("collapsingContentId", ugdVar);
                        ArrayList arrayList2 = new ArrayList(listK2.size());
                        int size2 = listK2.size();
                        for (int iE2 = 0; iE2 < size2; iE2 = w6x.e((pj30) listK2.get(iE2), p4eVar.f26347a, arrayList2, iE2, 1)) {
                        }
                        if (arrayList.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList.get(0);
                            int i2 = ((pu90) obj3).b;
                            int size3 = arrayList.size() - 1;
                            if (1 <= size3) {
                                int i3 = 1;
                                while (true) {
                                    Object obj11 = arrayList.get(i3);
                                    int i4 = ((pu90) obj11).b;
                                    if (i2 < i4) {
                                        obj3 = obj11;
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
                        kie0 kie0Var = new kie0();
                        if (arrayList2.isEmpty() || arrayList.isEmpty()) {
                            x2dVar.c(-1.0f);
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
                                        Object obj12 = arrayList2.get(i6);
                                        int i7 = ((pu90) obj12).b;
                                        if (i5 < i7) {
                                            obj4 = obj12;
                                            i5 = i7;
                                        }
                                        if (i6 != size4) {
                                            i6++;
                                        }
                                    }
                                }
                            }
                            pu90 pu90Var2 = (pu90) obj4;
                            float f = pu90Var2 != null ? pu90Var2.b : 0.0f;
                            if (arrayList.isEmpty()) {
                                obj5 = null;
                            } else {
                                Object obj13 = arrayList.get(0);
                                int i8 = ((pu90) obj13).b;
                                int size5 = arrayList.size() - 1;
                                if (1 <= size5) {
                                    while (true) {
                                        Object obj14 = arrayList.get(i);
                                        int i9 = ((pu90) obj14).b;
                                        if (i8 < i9) {
                                            obj13 = obj14;
                                            i8 = i9;
                                        }
                                        if (i != size5) {
                                            i++;
                                        }
                                    }
                                }
                                obj5 = obj13;
                            }
                            pu90 pu90Var3 = (pu90) obj5;
                            float f2 = pu90Var3 != null ? pu90Var3.b : 0.0f;
                            x2dVar.c(-f);
                            float f3 = f2 + f;
                            fA = rw2.a(fA, f3, x2dVar.a(), f3);
                            kie0Var.f18333a = si30.b((((f2 - f) - f2) * x2dVar.a()) + f2);
                        }
                        int i10 = p4e.i(p4eVar.f26347a);
                        if (i10 < 0) {
                            i10 = 0;
                        }
                        int iB = si30.b(fA);
                        return vj30.x(c5n0Var, i10, iB >= 0 ? iB : 0, new gi0(arrayList2, arrayList, kie0Var, (byte) 1));
                    }
                    iE = w6x.e((pj30) listK.get(iE), p4eVar.f26347a, arrayList, iE, 1);
                }
                break;
            case 1:
                x2d x2dVar2 = w2dVar.f38442a;
                c5n0 c5n0Var2 = (c5n0) obj;
                p4e p4eVar2 = (p4e) obj2;
                c5n0Var2.getClass();
                List listK3 = c5n0Var2.k("stickyContentId", ugdVar2);
                ArrayList arrayList3 = new ArrayList(listK3.size());
                int size6 = listK3.size();
                int iE3 = 0;
                while (true) {
                    int i11 = 1;
                    if (iE3 >= size6) {
                        List listK4 = c5n0Var2.k("collapsingContentId", ugdVar);
                        ArrayList arrayList4 = new ArrayList(listK4.size());
                        int size7 = listK4.size();
                        int iE4 = 0;
                        while (iE4 < size7) {
                            int i12 = i11;
                            iE4 = w6x.e((pj30) listK4.get(iE4), p4eVar2.f26347a, arrayList4, iE4, i12);
                            i11 = i12;
                        }
                        int i13 = i11;
                        if (arrayList3.isEmpty()) {
                            obj6 = null;
                        } else {
                            obj6 = arrayList3.get(0);
                            int i14 = ((pu90) obj6).b;
                            int size8 = arrayList3.size() - i13;
                            if (i13 <= size8) {
                                int i15 = i13;
                                while (true) {
                                    Object obj15 = arrayList3.get(i15);
                                    int i16 = ((pu90) obj15).b;
                                    if (i14 < i16) {
                                        obj6 = obj15;
                                        i14 = i16;
                                    }
                                    if (i15 != size8) {
                                        i15++;
                                    }
                                }
                            }
                        }
                        pu90 pu90Var4 = (pu90) obj6;
                        float fO = pu90Var4 != null ? pu90Var4.b : 0.0f;
                        kie0 kie0Var2 = new kie0();
                        if (arrayList4.isEmpty() || arrayList3.isEmpty()) {
                            x2dVar2.c(-1.0f);
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList4.get(0);
                                int i17 = ((pu90) obj7).b;
                                int size9 = arrayList4.size() - i13;
                                if (i13 <= size9) {
                                    int i18 = i13;
                                    while (true) {
                                        Object obj16 = arrayList4.get(i18);
                                        int i19 = ((pu90) obj16).b;
                                        if (i17 < i19) {
                                            i17 = i19;
                                            obj7 = obj16;
                                        }
                                        if (i18 != size9) {
                                            i18++;
                                        }
                                    }
                                }
                            }
                            pu90 pu90Var5 = (pu90) obj7;
                            float f4 = pu90Var5 != null ? pu90Var5.b : 0.0f;
                            if (arrayList3.isEmpty()) {
                                obj8 = null;
                            } else {
                                Object obj17 = arrayList3.get(0);
                                int i20 = ((pu90) obj17).b;
                                int size10 = arrayList3.size() - i13;
                                if (i13 <= size10) {
                                    while (true) {
                                        Object obj18 = arrayList3.get(i13);
                                        int i21 = ((pu90) obj18).b;
                                        if (i20 < i21) {
                                            obj17 = obj18;
                                            i20 = i21;
                                        }
                                        if (i13 != size10) {
                                            i13++;
                                        }
                                    }
                                }
                                obj8 = obj17;
                            }
                            pu90 pu90Var6 = (pu90) obj8;
                            float f5 = pu90Var6 != null ? pu90Var6.b : 0.0f;
                            x2dVar2.c(-f4);
                            fO = l7x.O(f4, fO, x2dVar2.a());
                            kie0Var2.f18333a = si30.b(l7x.O(0.0f, f5 - f4, x2dVar2.a()));
                        }
                        return vj30.x(c5n0Var2, p4e.i(p4eVar2.f26347a), si30.b(fO), new gi0(arrayList4, arrayList3, kie0Var2, (byte) 3));
                    }
                    iE3 = w6x.e((pj30) listK3.get(iE3), p4eVar2.f26347a, arrayList3, iE3, 1);
                }
                break;
            default:
                x2d x2dVar3 = w2dVar.f38442a;
                c5n0 c5n0Var3 = (c5n0) obj;
                p4e p4eVar3 = (p4e) obj2;
                c5n0Var3.getClass();
                List listK5 = c5n0Var3.k("stickyContentId", ugdVar2);
                ArrayList arrayList5 = new ArrayList(listK5.size());
                int size11 = listK5.size();
                int iE5 = 0;
                while (true) {
                    int i22 = 1;
                    if (iE5 >= size11) {
                        List listK6 = c5n0Var3.k("collapsingContentId", ugdVar);
                        ArrayList arrayList6 = new ArrayList(listK6.size());
                        int size12 = listK6.size();
                        int iE6 = 0;
                        while (iE6 < size12) {
                            int i23 = i22;
                            iE6 = w6x.e((pj30) listK6.get(iE6), p4eVar3.f26347a, arrayList6, iE6, i23);
                            i22 = i23;
                        }
                        if (arrayList5.isEmpty()) {
                            obj9 = null;
                        } else {
                            obj9 = arrayList5.get(0);
                            int i24 = ((pu90) obj9).b;
                            int size13 = arrayList5.size() - i22;
                            if (i22 <= size13) {
                                int i25 = i22;
                                while (true) {
                                    Object obj19 = arrayList5.get(i25);
                                    int i26 = ((pu90) obj19).b;
                                    if (i24 < i26) {
                                        obj9 = obj19;
                                        i24 = i26;
                                    }
                                    if (i25 != size13) {
                                        i25++;
                                    }
                                }
                            }
                        }
                        pu90 pu90Var7 = (pu90) obj9;
                        float f6 = pu90Var7 != null ? pu90Var7.b : 0.0f;
                        if (arrayList6.isEmpty()) {
                            obj10 = null;
                        } else {
                            Object obj20 = arrayList6.get(0);
                            int i27 = ((pu90) obj20).b;
                            int size14 = arrayList6.size() - i22;
                            if (i22 <= size14) {
                                while (true) {
                                    Object obj21 = arrayList6.get(i22);
                                    int i28 = ((pu90) obj21).b;
                                    if (i27 < i28) {
                                        obj20 = obj21;
                                        i27 = i28;
                                    }
                                    if (i22 != size14) {
                                        i22++;
                                    }
                                }
                            }
                            obj10 = obj20;
                        }
                        pu90 pu90Var8 = (pu90) obj10;
                        float f7 = pu90Var8 != null ? pu90Var8.b : 0.0f;
                        x2dVar3.c(f7 > 0.0f ? -f7 : 0.0f);
                        int iB2 = si30.b(((1.0f - x2dVar3.a()) * f7) + f6);
                        int i29 = iB2 >= 0 ? iB2 : 0;
                        return vj30.x(c5n0Var3, p4e.i(p4eVar3.f26347a), i29, new g18(arrayList6, arrayList5, si30.b(i29 - f7), (byte) 7));
                    }
                    iE5 = w6x.e((pj30) listK5.get(iE5), p4eVar3.f26347a, arrayList5, iE5, 1);
                }
                break;
        }
    }
}
