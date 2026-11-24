package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class x55 implements tgi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40297a = 0;
    public final Object b;

    public x55(List list) {
        list.getClass();
        this.b = list;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x025b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0333  */
    /* JADX WARN: Code duplicated, block: B:175:0x036d A[LOOP:6: B:147:0x02c6->B:175:0x036d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:228:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:64:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0107  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0123 A[LOOP:8: B:73:0x0121->B:74:0x0123, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.tgi0
    public final j910 a(dgu dguVar, List list) {
        ar20 ar20VarG;
        ar20 ar20Var;
        int i;
        int i2;
        int iIntValue;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char cB;
        boolean z;
        char cB2;
        int i10;
        byte b = this.f40297a;
        int i11 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                list.getClass();
                j910 j910Var = new j910((byte) 26);
                ArrayList arrayList = new ArrayList();
                xvq0 xvq0Var = new xvq0(dguVar, list);
                int i12 = -239;
                int i13 = -239;
                while (true) {
                    int i14 = xvq0Var.f39851a;
                    if (xvq0Var.e() == null) {
                        if (i13 != -239) {
                            arrayList.add(new IntRange(i13, i12, 1));
                        }
                        j910Var.D(arrayList);
                        return j910Var;
                    }
                    if (Intrinsics.d(xvq0Var.e(), cy2.H) && (ar20VarG = xvq0Var.g()) != null && ((List) obj).contains(ar20VarG)) {
                        while (true) {
                            ar20 ar20VarE = xvq0Var.e();
                            ar20Var = cy2.I;
                            if (!Intrinsics.d(ar20VarE, ar20Var) && xvq0Var.e() != null) {
                                xvq0Var = xvq0Var.a();
                            }
                        }
                        if (Intrinsics.d(xvq0Var.e(), ar20Var)) {
                            ((ArrayList) j910Var.b).add(new sgi0(new IntRange(i14, xvq0Var.f39851a + 1, 1), wb.H));
                        }
                    } else {
                        if (i12 + 1 != i14) {
                            if (i13 != -239) {
                                arrayList.add(new IntRange(i13, i12, 1));
                            }
                            i13 = i14;
                        }
                        i12 = i14;
                    }
                    xvq0Var = xvq0Var.a();
                }
                break;
            default:
                ar20 ar20Var2 = cy2.T;
                nek[] nekVarArr = (nek[]) obj;
                list.getClass();
                j910 j910Var2 = new j910((byte) 26);
                wvq0 xvq0Var2 = new xvq0(dguVar, list);
                ArrayList<p6k> arrayList2 = new ArrayList();
                while (true) {
                    int i15 = 0;
                    if (xvq0Var2.e() != null) {
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            if (i16 < i11) {
                                nekVarArr[i16].getClass();
                                ar20 ar20VarE2 = xvq0Var2.e();
                                dgu dguVar2 = xvq0Var2.b;
                                if (Intrinsics.d(ar20VarE2, ar20Var2)) {
                                    char cI = dguVar2.i(xvq0Var2.f(i15).b);
                                    i3 = i11;
                                    wvq0 wvq0VarA = xvq0Var2;
                                    for (int i18 = i15; i18 < 50 && Intrinsics.d(wvq0VarA.g(), ar20Var2); i18++) {
                                        wvq0 wvq0VarA2 = wvq0VarA.a();
                                        if (wvq0VarA2.b.i(wvq0VarA2.f(i15).b) != cI) {
                                            if (cI == '*') {
                                                i4 = i11;
                                            } else {
                                                i4 = i15;
                                            }
                                            if (nek.k(wvq0VarA, i11)) {
                                                i5 = -1;
                                            } else {
                                                if (nek.h(wvq0VarA, i11)) {
                                                    i5 = -1;
                                                    if (!nek.k(xvq0Var2, -1) || nek.h(xvq0Var2, -1)) {
                                                    }
                                                    if (xvq0Var2.b(i5) == dguVar2.i(xvq0Var2.f(i15).b) && !nek.k(xvq0Var2, -1) && (!nek.h(xvq0Var2, -1) || nek.k(wvq0VarA, 1) || nek.h(wvq0VarA, 1))) {
                                                        i7 = 1;
                                                    } else {
                                                        i7 = i15;
                                                    }
                                                    if (i4 != 0) {
                                                        i9 = i6;
                                                        i = i15;
                                                        i8 = 1676673024;
                                                    } else {
                                                        i = i15;
                                                        i8 = 1676673024;
                                                        if (i6 == 0) {
                                                            i9 = i;
                                                        } else {
                                                            if (i7 != 0) {
                                                                cB = xvq0Var2.b(-1);
                                                                if (StringsKt.P("$^`", cB) && ((1676673024 >> Character.getType(cB)) & 1) == 0) {
                                                                    i9 = i;
                                                                }
                                                            }
                                                            i9 = 1;
                                                        }
                                                    }
                                                    if (i4 != 0) {
                                                        z = i7;
                                                    } else if (i7 == 0) {
                                                        z = i;
                                                    } else {
                                                        if (i6 != 0) {
                                                            cB2 = wvq0VarA.b(1);
                                                            if (StringsKt.P("$^`", cB2) && ((i8 >> Character.getType(cB2)) & 1) == 0) {
                                                                z = i;
                                                            }
                                                        }
                                                        z = 1;
                                                    }
                                                    i10 = i;
                                                    while (i10 < i3) {
                                                        int i19 = i3;
                                                        boolean z2 = i9;
                                                        arrayList2.add(new p6k(ar20Var2, xvq0Var2.f39851a + i10, i19, z2, z, cI));
                                                        i10++;
                                                        i9 = z2 ? 1 : 0;
                                                        i3 = i19;
                                                    }
                                                } else {
                                                    i5 = -1;
                                                }
                                                i6 = i11;
                                                if (xvq0Var2.b(i5) == dguVar2.i(xvq0Var2.f(i15).b)) {
                                                    i7 = i15;
                                                } else {
                                                    i7 = i15;
                                                }
                                                if (i4 != 0) {
                                                    i9 = i6;
                                                    i = i15;
                                                    i8 = 1676673024;
                                                } else {
                                                    i = i15;
                                                    i8 = 1676673024;
                                                    if (i6 == 0) {
                                                        i9 = i;
                                                    } else {
                                                        if (i7 != 0) {
                                                            cB = xvq0Var2.b(-1);
                                                            if (StringsKt.P("$^`", cB)) {
                                                            }
                                                        }
                                                        i9 = 1;
                                                    }
                                                }
                                                if (i4 != 0) {
                                                    z = i7;
                                                } else if (i7 == 0) {
                                                    z = i;
                                                } else {
                                                    if (i6 != 0) {
                                                        cB2 = wvq0VarA.b(1);
                                                        if (StringsKt.P("$^`", cB2)) {
                                                        }
                                                    }
                                                    z = 1;
                                                }
                                                i10 = i;
                                                while (i10 < i3) {
                                                    int i110 = i3;
                                                    boolean z3 = i9;
                                                    arrayList2.add(new p6k(ar20Var2, xvq0Var2.f39851a + i10, i110, z3, z, cI));
                                                    i10++;
                                                    i9 = z3 ? 1 : 0;
                                                    i3 = i110;
                                                }
                                            }
                                            i6 = i15;
                                            if (xvq0Var2.b(i5) == dguVar2.i(xvq0Var2.f(i15).b)) {
                                                i7 = i15;
                                            } else {
                                                i7 = i15;
                                            }
                                            if (i4 != 0) {
                                                i9 = i6;
                                                i = i15;
                                                i8 = 1676673024;
                                            } else {
                                                i = i15;
                                                i8 = 1676673024;
                                                if (i6 == 0) {
                                                    i9 = i;
                                                } else {
                                                    if (i7 != 0) {
                                                        cB = xvq0Var2.b(-1);
                                                        if (StringsKt.P("$^`", cB)) {
                                                        }
                                                    }
                                                    i9 = 1;
                                                }
                                            }
                                            if (i4 != 0) {
                                                z = i7;
                                            } else if (i7 == 0) {
                                                z = i;
                                            } else {
                                                if (i6 != 0) {
                                                    cB2 = wvq0VarA.b(1);
                                                    if (StringsKt.P("$^`", cB2)) {
                                                    }
                                                }
                                                z = 1;
                                            }
                                            i10 = i;
                                            while (i10 < i3) {
                                                int i111 = i3;
                                                boolean z4 = i9;
                                                arrayList2.add(new p6k(ar20Var2, xvq0Var2.f39851a + i10, i111, z4, z, cI));
                                                i10++;
                                                i9 = z4 ? 1 : 0;
                                                i3 = i111;
                                            }
                                        } else {
                                            wvq0VarA = wvq0VarA.a();
                                            i3++;
                                        }
                                    }
                                    if (cI == '*') {
                                        i4 = i11;
                                    } else {
                                        i4 = i15;
                                    }
                                    if (nek.k(wvq0VarA, i11)) {
                                        if (nek.h(wvq0VarA, i11)) {
                                            i5 = -1;
                                            if (!nek.k(xvq0Var2, -1)) {
                                            }
                                        } else {
                                            i5 = -1;
                                        }
                                        i6 = i11;
                                        if (xvq0Var2.b(i5) == dguVar2.i(xvq0Var2.f(i15).b)) {
                                            i7 = i15;
                                        } else {
                                            i7 = i15;
                                        }
                                        if (i4 != 0) {
                                            i9 = i6;
                                            i = i15;
                                            i8 = 1676673024;
                                        } else {
                                            i = i15;
                                            i8 = 1676673024;
                                            if (i6 == 0) {
                                                i9 = i;
                                            } else {
                                                if (i7 != 0) {
                                                    cB = xvq0Var2.b(-1);
                                                    if (StringsKt.P("$^`", cB)) {
                                                    }
                                                }
                                                i9 = 1;
                                            }
                                        }
                                        if (i4 != 0) {
                                            z = i7;
                                        } else if (i7 == 0) {
                                            z = i;
                                        } else {
                                            if (i6 != 0) {
                                                cB2 = wvq0VarA.b(1);
                                                if (StringsKt.P("$^`", cB2)) {
                                                }
                                            }
                                            z = 1;
                                        }
                                        i10 = i;
                                        while (i10 < i3) {
                                            int i112 = i3;
                                            boolean z5 = i9;
                                            arrayList2.add(new p6k(ar20Var2, xvq0Var2.f39851a + i10, i112, z5, z, cI));
                                            i10++;
                                            i9 = z5 ? 1 : 0;
                                            i3 = i112;
                                        }
                                    } else {
                                        i5 = -1;
                                    }
                                    i6 = i15;
                                    if (xvq0Var2.b(i5) == dguVar2.i(xvq0Var2.f(i15).b)) {
                                        i7 = i15;
                                    } else {
                                        i7 = i15;
                                    }
                                    if (i4 != 0) {
                                        i9 = i6;
                                        i = i15;
                                        i8 = 1676673024;
                                    } else {
                                        i = i15;
                                        i8 = 1676673024;
                                        if (i6 == 0) {
                                            i9 = i;
                                        } else {
                                            if (i7 != 0) {
                                                cB = xvq0Var2.b(-1);
                                                if (StringsKt.P("$^`", cB)) {
                                                }
                                            }
                                            i9 = 1;
                                        }
                                    }
                                    if (i4 != 0) {
                                        z = i7;
                                    } else if (i7 == 0) {
                                        z = i;
                                    } else {
                                        if (i6 != 0) {
                                            cB2 = wvq0VarA.b(1);
                                            if (StringsKt.P("$^`", cB2)) {
                                            }
                                        }
                                        z = 1;
                                    }
                                    i10 = i;
                                    while (i10 < i3) {
                                        int i113 = i3;
                                        boolean z6 = i9;
                                        arrayList2.add(new p6k(ar20Var2, xvq0Var2.f39851a + i10, i113, z6, z, cI));
                                        i10++;
                                        i9 = z6 ? 1 : 0;
                                        i3 = i113;
                                    }
                                } else {
                                    i = i15;
                                    i3 = i;
                                }
                                i17 += i3;
                                int i20 = i;
                                while (true) {
                                    if (i20 >= i3) {
                                        i16++;
                                        i15 = i;
                                        i11 = 1;
                                    } else if (xvq0Var2.e() != null) {
                                        xvq0Var2 = xvq0Var2.a();
                                        i20++;
                                    }
                                }
                            } else {
                                if (i17 == 0) {
                                    xvq0Var2 = xvq0Var2.a();
                                }
                                i11 = 1;
                            }
                        }
                    } else {
                        i = 0;
                    }
                }
                int size = arrayList2.size();
                Integer[] numArr = new Integer[size];
                for (int i21 = i; i21 < size; i21++) {
                    numArr[i21] = Integer.valueOf(i);
                }
                HashMap map = new HashMap();
                int i22 = i;
                int i23 = i22;
                int i24 = -2;
                for (p6k p6kVar : arrayList2) {
                    i23++;
                    char c = ((p6k) arrayList2.get(i22)).f;
                    char c2 = p6kVar.f;
                    int i25 = p6kVar.b;
                    int i26 = p6kVar.c;
                    if (c != c2 || i24 != i25 - 1) {
                        i22 = i23;
                    }
                    if (p6kVar.e) {
                        if (!map.containsKey(Character.valueOf(c2))) {
                            map.put(Character.valueOf(c2), new Integer[]{-1, -1, -1, -1, -1, -1});
                        }
                        Object obj2 = map.get(Character.valueOf(c2));
                        obj2.getClass();
                        int i27 = i26 % 3;
                        int iIntValue2 = ((Integer[]) obj2)[i27 + (p6kVar.d ? 3 : i)].intValue();
                        int iIntValue3 = (i22 - numArr[i22].intValue()) - 1;
                        nek[] nekVarArr2 = nekVarArr;
                        int iIntValue4 = iIntValue3;
                        while (true) {
                            if (iIntValue4 > iIntValue2) {
                                Object obj3 = arrayList2.get(iIntValue4);
                                obj3.getClass();
                                int i28 = iIntValue4;
                                p6k p6kVar2 = (p6k) obj3;
                                numArr = numArr;
                                if (p6kVar2.f != c2) {
                                    iIntValue4 = i28 - (numArr[i28].intValue() + 1);
                                } else {
                                    if (p6kVar2.d && p6kVar2.g < 0) {
                                        if (p6kVar2.e || p6kVar.d) {
                                            int i29 = p6kVar2.c;
                                            if ((i29 + i26) % 3 != 0 || (i29 % 3 == 0 && i27 == 0)) {
                                            }
                                        }
                                        if (i28 > 0) {
                                            int i30 = i28 - 1;
                                            if (((p6k) arrayList2.get(i30)).d) {
                                                iIntValue = i;
                                            } else {
                                                iIntValue = numArr[i30].intValue() + 1;
                                            }
                                        } else {
                                            iIntValue = i;
                                        }
                                        numArr[i28] = Integer.valueOf(iIntValue);
                                        numArr[i23] = Integer.valueOf((i23 - i28) + iIntValue);
                                        boolean z7 = i;
                                        p6kVar.d = z7;
                                        p6kVar2.g = i23;
                                        p6kVar2.e = z7;
                                        i24 = -2;
                                        iIntValue3 = -1;
                                    }
                                    iIntValue4 = i28 - (numArr[i28].intValue() + 1);
                                    i = 0;
                                }
                            } else {
                                numArr = numArr;
                                i24 = i25;
                            }
                            if (iIntValue3 != -1) {
                                Object obj4 = map.get(Character.valueOf(c2));
                                obj4.getClass();
                                ((Integer[]) obj4)[i27 + (p6kVar.d ? 3 : 0)] = Integer.valueOf(iIntValue3);
                            }
                            nekVarArr = nekVarArr2;
                            numArr = numArr;
                            i = 0;
                        }
                    } else {
                        i24 = i25;
                    }
                }
                int i31 = i;
                nekVarArr[i31].getClass();
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    int i32 = i31;
                    while (true) {
                        int i33 = size2 - 1;
                        if (i32 != 0) {
                            i32 = i31;
                        } else {
                            p6k p6kVar3 = (p6k) arrayList2.get(size2);
                            ar20 ar20Var3 = p6kVar3.f26459a;
                            int i34 = p6kVar3.b;
                            if (ar20Var3.equals(ar20Var2)) {
                                int i35 = p6kVar3.g;
                                if (i35 != -1) {
                                    p6k p6kVar4 = (p6k) arrayList2.get(size2);
                                    p6k p6kVar5 = (p6k) arrayList2.get(i35);
                                    if (size2 > 0) {
                                        int i36 = size2 - 1;
                                        if (((p6k) arrayList2.get(i36)).g == p6kVar4.g + 1 && ((p6k) arrayList2.get(i36)).f == p6kVar4.f && ((p6k) arrayList2.get(i36)).b == p6kVar4.b - 1 && ((p6k) arrayList2.get(p6kVar4.g + 1)).b == p6kVar5.b + 1) {
                                            i2 = 1;
                                        } else {
                                            i2 = i31;
                                        }
                                    } else {
                                        i2 = i31;
                                    }
                                    p6k p6kVar6 = (p6k) arrayList2.get(p6kVar3.g);
                                    ((ArrayList) j910Var2.b).add(i2 != 0 ? new sgi0(new IntRange(i34 - 1, p6kVar6.b + 2, 1), wb.x) : new sgi0(new IntRange(i34, p6kVar6.b + 1, 1), wb.w));
                                    i32 = i2;
                                }
                            }
                            if (i33 < 0) {
                                size2 = i33;
                            }
                        }
                        if (i33 < 0) {
                            size2 = i33;
                        }
                    }
                }
                return j910Var2;
        }
    }

    public x55(nek[] nekVarArr) {
        this.b = nekVarArr;
    }
}
