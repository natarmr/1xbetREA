package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class tqt {
    public /* synthetic */ tqt(Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static u3u0 a(kzj0 kzj0Var, g5 g5Var, int i, hys0 hys0Var, boolean z, boolean z2) {
        wm40 wm40VarR;
        Boolean bool;
        iys0 iys0VarS;
        Boolean bool2;
        y78 y78Var;
        q4m0 q4m0VarK;
        hys0 hys0Var2 = hys0.c;
        ?? r4 = 0;
        boolean z3 = hys0Var != hys0Var2;
        boolean z4 = (z2 && z) ? false : true;
        Object obj = null;
        if (!z3 && kzj0Var.J().isEmpty()) {
            return new u3u0(null, 1, false);
        }
        foc focVarN = kzj0Var.S().n();
        if (focVarN == null) {
            return new u3u0(null, 1, false);
        }
        iay iayVar = (iay) g5Var.invoke(Integer.valueOf(i));
        i93 i93Var = rys0.f31328a;
        if (hys0Var == hys0Var2 || !(focVarN instanceof wm40)) {
            wm40VarR = null;
        } else if (iayVar.b == wx40.f39914a && hys0Var == hys0.f13875a) {
            wm40 wm40Var = (wm40) focVarN;
            String str = bay.f2281a;
            twq twqVarF = oek.f(wm40Var);
            HashMap map = bay.j;
            if (map.containsKey(twqVarF)) {
                swq swqVar = (swq) map.get(oek.f(wm40Var));
                if (swqVar == null) {
                    ohq.q(wm40Var, " is not a mutable collection", "Given class ");
                    return null;
                }
                wm40VarR = rek.i(wm40Var).c().j(swqVar);
            } else if (iayVar.b == wx40.b) {
                wm40VarR = null;
            } else {
                wm40VarR = null;
            }
        } else if (iayVar.b == wx40.b || hys0Var != hys0.b) {
            wm40VarR = null;
        } else {
            wm40 wm40Var2 = (wm40) focVarN;
            String str2 = bay.f2281a;
            if (bay.k.containsKey(oek.f(wm40Var2))) {
                wm40VarR = rv00.r(wm40Var2);
            } else {
                wm40VarR = null;
            }
        }
        if (hys0Var == hys0Var2) {
            bool = null;
        } else {
            p860 p860Var = iayVar.f14460a;
            int i2 = p860Var == null ? -1 : qys0.f29551a[p860Var.ordinal()];
            if (i2 == 1) {
                bool = Boolean.TRUE;
            } else if (i2 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (wm40VarR == null || (iys0VarS = wm40VarR.h()) == null) {
            iys0VarS = kzj0Var.S();
        }
        int i3 = i + 1;
        List listJ = kzj0Var.J();
        List parameters = iys0VarS.getParameters();
        parameters.getClass();
        Iterator it = listJ.iterator();
        Iterator it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r3d.q(listJ, 10), r3d.q(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            hzs0 hzs0Var = (hzs0) it2.next();
            pzs0 pzs0Var = (pzs0) next;
            byte b = 5;
            if (z4) {
                bool2 = bool;
                if (!pzs0Var.c()) {
                    y78Var = b(pzs0Var.b().j0(), g5Var, i3, z2);
                } else if (((iay) g5Var.invoke(Integer.valueOf(i3))).f14460a == p860.f26540a) {
                    tft0 tft0VarJ0 = pzs0Var.b().j0();
                    y78Var = new y78((Object) ucx.W(thb.P(tft0VarJ0).k0(r4), thb.Z(tft0VarJ0).k0(true)), 1, (byte) 5);
                } else {
                    y78Var = new y78((Object) null, 1, b);
                }
            } else {
                bool2 = bool;
                y78Var = new y78(obj, (int) r4, b);
            }
            i3 += y78Var.b;
            wsy wsyVar = (wsy) y78Var.c;
            if (wsyVar != null) {
                t3u0 t3u0VarA = pzs0Var.a();
                t3u0VarA.getClass();
                q4m0VarK = vsm0.o(wsyVar, t3u0VarA, hzs0Var);
            } else if (wm40VarR == null || pzs0Var.c()) {
                q4m0VarK = wm40VarR != null ? e0t0.k(hzs0Var) : null;
            } else {
                wsy wsyVarB = pzs0Var.b();
                wsyVarB.getClass();
                t3u0 t3u0VarA2 = pzs0Var.a();
                t3u0VarA2.getClass();
                q4m0VarK = vsm0.o(wsyVarB, t3u0VarA2, hzs0Var);
            }
            arrayList.add(q4m0VarK);
            bool = bool2;
            r4 = 0;
            obj = null;
        }
        Boolean bool3 = bool;
        int i4 = i3 - i;
        if (wm40VarR == null && bool3 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((pzs0) it3.next()) == null);
            }
            return new u3u0(null, i4, false);
        }
        g93 annotations = kzj0Var.getAnnotations();
        i93 i93Var2 = rys0.b;
        if (wm40VarR == null) {
            i93Var2 = null;
        }
        i93 i93Var3 = rys0.f31328a;
        if (bool3 == null) {
            i93Var3 = null;
        }
        List listZ = tx3.z(new g93[]{annotations, i93Var2, i93Var3});
        int size = ((ArrayList) listZ).size();
        if (size == 0) {
            jf4.n("At least one Annotations object expected");
            return null;
        }
        ays0 ays0VarU = gnm0.u(size != 1 ? new i93(CollectionsKt.L0(listZ), (byte) 1) : (g93) CollectionsKt.v0(listZ));
        List listJ2 = kzj0Var.J();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listJ2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(r3d.q(arrayList, 10), r3d.q(listJ2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            pzs0 pzs0Var2 = (pzs0) it5.next();
            pzs0 pzs0Var3 = (pzs0) next2;
            if (pzs0Var3 != null) {
                pzs0Var2 = pzs0Var3;
            }
            arrayList2.add(pzs0Var2);
        }
        kzj0 kzj0VarG0 = ucx.g0(ays0VarU, iys0VarS, arrayList2, bool3 != null ? bool3.booleanValue() : kzj0Var.U());
        if (iayVar.c) {
            kzj0VarG0 = new t660(kzj0VarG0);
        }
        return new u3u0(kzj0VarG0, i4, bool3 != null && iayVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    public static y78 b(tft0 tft0Var, g5 g5Var, int i, boolean z) {
        tft0 tft0VarW;
        byte b = 5;
        Object objZ = null;
        if (bdx.k0(tft0Var)) {
            return new y78(objZ, 1, b);
        }
        if (!(tft0Var instanceof kkq)) {
            if (!(tft0Var instanceof kzj0)) {
                t9f.b();
                return null;
            }
            u3u0 u3u0VarA = a((kzj0) tft0Var, g5Var, i, hys0.c, false, z);
            boolean z2 = u3u0VarA.b;
            wsy wsyVarZ = (kzj0) u3u0VarA.c;
            if (z2) {
                wsyVarZ = xsm0.z(tft0Var, wsyVarZ);
            }
            return new y78(wsyVarZ, u3u0VarA.f35015a, b);
        }
        boolean z3 = tft0Var instanceof dae0;
        kkq kkqVar = (kkq) tft0Var;
        kzj0 kzj0Var = kkqVar.c;
        kzj0 kzj0Var2 = kkqVar.b;
        u3u0 u3u0VarA2 = a(kzj0Var2, g5Var, i, hys0.f13875a, z3, z);
        kzj0 kzj0Var3 = kzj0Var2;
        kzj0 kzj0Var4 = (kzj0) u3u0VarA2.c;
        u3u0 u3u0VarA3 = a(kkqVar.c, g5Var, i, hys0.b, z3, z);
        kzj0 kzj0Var5 = (kzj0) u3u0VarA3.c;
        if (kzj0Var4 != null || kzj0Var5 != null) {
            if (u3u0VarA2.b) {
                if (kzj0Var5 != null) {
                    if (kzj0Var4 == null) {
                        kzj0Var4 = kzj0Var5;
                    }
                    tft0VarW = ucx.W(kzj0Var4, kzj0Var5);
                } else {
                    kzj0Var4.getClass();
                    tft0VarW = kzj0Var4;
                }
                objZ = xsm0.z(tft0Var, tft0VarW);
            } else {
                kzj0 kzj0Var6 = kzj0Var3;
                if (u3u0VarA3.b) {
                    if (kzj0Var5 != null) {
                        if (kzj0Var4 == null) {
                            kzj0Var4 = kzj0Var5;
                        }
                        tft0VarW = ucx.W(kzj0Var4, kzj0Var5);
                    } else {
                        kzj0Var4.getClass();
                        tft0VarW = kzj0Var4;
                    }
                    objZ = xsm0.z(tft0Var, tft0VarW);
                } else if (z3) {
                    kzj0 kzj0Var7 = kzj0Var3;
                    if (kzj0Var4 != null) {
                        kzj0Var7 = kzj0Var4;
                    }
                    if (kzj0Var5 != null) {
                        kzj0Var = kzj0Var5;
                    }
                    objZ = new dae0(kzj0Var7, kzj0Var);
                } else {
                    if (kzj0Var4 != null) {
                        kzj0Var6 = kzj0Var4;
                    }
                    if (kzj0Var5 != null) {
                        kzj0Var = kzj0Var5;
                    }
                    objZ = ucx.W(kzj0Var6, kzj0Var);
                }
            }
        }
        return new y78(objZ, u3u0VarA2.f35015a, b);
    }

    public static nrz c(String str) {
        str.getClass();
        nrz nrzVar = nrz.b;
        if (str.equals("ACTIVE")) {
            return nrzVar;
        }
        nrz nrzVar2 = nrz.c;
        if (str.equals("PENDING")) {
            return nrzVar2;
        }
        nrz nrzVar3 = nrz.d;
        str.equals("INACTIVE");
        return nrzVar3;
    }

    public static wrz d(int i) {
        asz aszVar = asz.b;
        if (i != -1) {
            ge7 ge7Var = ge7.BET_LIMIT_1_DAY;
            if (i == 1) {
                return ge7Var;
            }
            ge7 ge7Var2 = ge7.BET_LIMIT_7_DAY;
            if (i == 2) {
                return ge7Var2;
            }
            ge7 ge7Var3 = ge7.BET_LIMIT_30_DAY;
            if (i == 3) {
                return ge7Var3;
            }
            o7k o7kVar = o7k.DEPOSIT_LIMIT_1_DAY;
            if (i == 20) {
                return o7kVar;
            }
            o7k o7kVar2 = o7k.DEPOSIT_LIMIT_7_DAY;
            if (i == 21) {
                return o7kVar2;
            }
            o7k o7kVar3 = o7k.DEPOSIT_LIMIT_30_DAY;
            if (i == 22) {
                return o7kVar3;
            }
            g8i0 g8i0Var = g8i0.f10866a;
            if (i == 30) {
                return g8i0Var;
            }
            oki0 oki0Var = oki0.SESSION_TIME_LIMIT_1_DAY;
            if (i == 31) {
                return oki0Var;
            }
            oki0 oki0Var2 = oki0.SESSION_TIME_LIMIT_7_DAY;
            if (i == 43) {
                return oki0Var2;
            }
            oki0 oki0Var3 = oki0.SESSION_TIME_LIMIT_30_DAY;
            if (i == 36) {
                return oki0Var3;
            }
        }
        return aszVar;
    }

    public static int e(q4f q4fVar) {
        q4fVar.getClass();
        switch (q4fVar.ordinal()) {
            case 1:
                return 1;
            case 2:
            case 4:
            case 7:
            case 8:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 9:
                return 3;
            case 10:
            default:
                return 0;
        }
    }

    public static lc00 f(f3c0 f3c0Var) {
        lc00 lc00VarB = kotlin.collections.a.b();
        if (f3c0Var.i) {
            lc00VarB.add(new t54(1));
        }
        if (f3c0Var.j) {
            lc00VarB.add(new t54(11));
        }
        if (f3c0Var.p) {
            lc00VarB.add(new t54(13));
        }
        if (f3c0Var.q) {
            lc00VarB.add(new t54(31));
        }
        if (f3c0Var.l) {
            lc00VarB.add(new t54(9));
        }
        if (f3c0Var.m) {
            lc00VarB.add(new t54(7));
        }
        if (f3c0Var.k) {
            lc00VarB.add(new t54(5));
        }
        if (f3c0Var.n) {
            lc00VarB.add(new t54(17));
        }
        if (f3c0Var.o) {
            lc00VarB.add(new t54(19));
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static List g() {
        return q3d.j(new teb0(y4t.d), new teb0(y4t.e), new teb0(y4t.f), new teb0(y4t.g), new teb0(y4t.i), veb0.f37277a, new teb0(y4t.j), new teb0(y4t.k), ueb0.f35518a, new teb0(y4t.l), new teb0(y4t.h), new teb0(y4t.m));
    }

    public static void i(androidx.fragment.app.e eVar, ArrayList arrayList, String str, String str2) {
        eVar.getClass();
        str.getClass();
        if (eVar.J("HISTORY_MENU_DIALOG_TAG") != null) {
            return;
        }
        c4w c4wVar = new c4w();
        iiy[] iiyVarArr = c4w.o2;
        c4wVar.m2.I(c4wVar, iiyVarArr[2], arrayList);
        c4wVar.l2.x(c4wVar, iiyVarArr[1], str);
        c4wVar.k2.x(c4wVar, iiyVarArr[0], str2);
        c4wVar.H0(eVar, "HISTORY_MENU_DIALOG_TAG");
    }

    public static uoy j(int i) {
        Object next;
        c0o c0oVar = uoy.i;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((uoy) next).f36034a != i);
        uoy uoyVar = (uoy) next;
        return uoyVar == null ? uoy.UNKNOWN : uoyVar;
    }

    public List h(ch chVar) {
        if (chVar != null) {
            return q3d.j(new wtr0(td80.f33755a, fiu.f9605a[chVar.ordinal()] == 1 ? q3d.j(md80.S_1_0, md80.S_2_0, md80.S_2_1, md80.S_3_0, md80.S_3_1, md80.S_3_2) : q3d.j(md80.S_1_0, md80.S_2_0, md80.S_2_1, md80.S_3_0, md80.S_3_1, md80.S_3_2, md80.S_4_0, md80.S_4_1, md80.S_4_2, md80.S_4_3, md80.S_5_0, md80.S_5_1, md80.S_5_2, md80.S_5_3, md80.S_5_4)), new wtr0(td80.b, eiu.f7877a[chVar.ordinal()] == 1 ? q3d.j(md80.S_0_0, md80.S_1_1, md80.S_2_2, md80.S_3_3, md80.LD) : q3d.j(md80.S_0_0, md80.S_1_1, md80.S_2_2, md80.S_3_3, md80.S_4_4, md80.S_5_5, md80.LD)), new wtr0(td80.c, chVar != ch.b ? q3d.j(md80.S_0_1, md80.S_0_2, md80.S_1_2, md80.S_0_3, md80.S_1_3, md80.S_2_3, md80.S_0_4, md80.S_1_4, md80.S_2_4, md80.S_3_4, md80.S_0_5, md80.S_1_5, md80.S_2_5, md80.S_3_5, md80.S_4_5) : q3d.j(md80.S_0_1, md80.S_0_2, md80.S_1_2, md80.S_0_3, md80.S_1_3, md80.S_2_3)));
        }
        return iun.f15405a;
    }

    public tqt(bst bstVar, tqt tqtVar, art artVar) {
    }
}
