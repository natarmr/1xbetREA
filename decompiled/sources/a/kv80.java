package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kv80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18946a;
    public final /* synthetic */ List b;

    public /* synthetic */ kv80(int i, List list) {
        this.f18946a = (byte) 15;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List list;
        Object next;
        Object next2;
        byte b = this.f18946a;
        byte b2 = 3;
        byte b3 = 1;
        byte b4 = 0;
        List<epn0> list2 = this.b;
        switch (b) {
            case 0:
                yu80 yu80Var = (yu80) obj2;
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((mlr) it.next()).f22006a));
                }
                return yu80.a(yu80Var, false, false, false, false, false, null, CollectionsKt.P0(arrayList), null, null, 122879);
            case 1:
                ((t9v0) list2.get(((Integer) obj).intValue())).e = ((Boolean) obj2).booleanValue();
                return Unit.f46060a;
            case 2:
                c5n0 c5n0Var = (c5n0) obj;
                c5n0Var.getClass();
                long j = ((p4e) obj2).f26347a;
                int iH = p4e.h(j);
                zcl zclVar = qmk.f28987a;
                int iW0 = (int) c5n0Var.w0(12.0f);
                int iW1 = ((int) c5n0Var.w0(286.0f)) + iW0;
                int iW2 = ((int) c5n0Var.w0(168.0f)) + iW0;
                int iW3 = (int) c5n0Var.w0(36.0f);
                int iW4 = (int) c5n0Var.w0(60.0f);
                int i = iH - iW0;
                Iterator it2 = q3d.j(Integer.valueOf(iW1), Integer.valueOf(iW2), Integer.valueOf(iW3)).iterator();
                int i2 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        if (i >= 0) {
                            i2++;
                            i -= iIntValue;
                        }
                    } else {
                        while (i > 0) {
                            i2++;
                            i -= iW4;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(i2);
                int iE = 0;
                while (iE < i2) {
                    iE = w6x.e((pj30) CollectionsKt.U(c5n0Var.k("shimmer_" + iE, iE <= q3d.i(list2) ? (Function2) list2.get(iE) : new ugd(-1968812500, true, new dv90(i2, iE, b4)))), r4e.b(0, p4e.i(j), 0, 0, 13), arrayList2, iE, 1);
                }
                return vj30.x(c5n0Var, p4e.i(j), p4e.h(j), new uy2(arrayList2, (byte) 5));
            case 3:
                c5n0 c5n0Var2 = (c5n0) obj;
                c5n0Var2.getClass();
                long j2 = ((p4e) obj2).f26347a;
                int iH2 = p4e.h(j2);
                zcl zclVar2 = qmk.f28987a;
                int iW5 = (int) c5n0Var2.w0(12.0f);
                int iW6 = ((int) c5n0Var2.w0(286.0f)) + iW5;
                int iW7 = ((int) c5n0Var2.w0(168.0f)) + iW5;
                int iW8 = (int) c5n0Var2.w0(36.0f);
                int iW9 = (int) c5n0Var2.w0(60.0f);
                int i3 = iH2 - iW5;
                Iterator it3 = q3d.j(Integer.valueOf(iW6), Integer.valueOf(iW7), Integer.valueOf(iW8)).iterator();
                int i4 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        int iIntValue2 = ((Number) it3.next()).intValue();
                        if (i3 >= 0) {
                            i4++;
                            i3 -= iIntValue2;
                        }
                    } else {
                        while (i3 > 0) {
                            i4++;
                            i3 -= iW9;
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList(i4);
                int iE2 = 0;
                while (iE2 < i4) {
                    iE2 = w6x.e((pj30) CollectionsKt.U(c5n0Var2.k("shimmer_" + iE2, iE2 <= q3d.i(list2) ? (Function2) list2.get(iE2) : new ugd(1542209624, true, new dv90(i4, iE2, b3)))), r4e.b(0, p4e.i(j2), 0, 0, 13), arrayList3, iE2, 1);
                }
                return vj30.x(c5n0Var2, p4e.i(j2), p4e.h(j2), new uy2(arrayList3, (byte) 6));
            case 4:
                c5n0 c5n0Var3 = (c5n0) obj;
                c5n0Var3.getClass();
                long j3 = ((p4e) obj2).f26347a;
                int iH3 = p4e.h(j3);
                zcl zclVar3 = qmk.f28987a;
                int iW10 = (int) c5n0Var3.w0(12.0f);
                int iW11 = ((int) c5n0Var3.w0(286.0f)) + iW10;
                int iW12 = ((int) c5n0Var3.w0(168.0f)) + iW10;
                int iW13 = (int) c5n0Var3.w0(36.0f);
                int iW14 = (int) c5n0Var3.w0(60.0f);
                int i5 = iH3 - iW10;
                Iterator it4 = q3d.j(Integer.valueOf(iW11), Integer.valueOf(iW12), Integer.valueOf(iW13)).iterator();
                int i6 = 0;
                while (true) {
                    if (it4.hasNext()) {
                        int iIntValue3 = ((Number) it4.next()).intValue();
                        if (i5 >= 0) {
                            i6++;
                            i5 -= iIntValue3;
                        }
                    } else {
                        while (i5 > 0) {
                            i6++;
                            i5 -= iW14;
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList(i6);
                int iE3 = 0;
                while (iE3 < i6) {
                    iE3 = w6x.e((pj30) CollectionsKt.U(c5n0Var3.k("shimmer_" + iE3, iE3 <= q3d.i(list2) ? (Function2) list2.get(iE3) : new ugd(-390728332, true, new dv90(i6, iE3, (byte) 2)))), r4e.b(0, p4e.i(j3), 0, 0, 13), arrayList4, iE3, 1);
                }
                return vj30.x(c5n0Var3, p4e.i(j3), p4e.h(j3), new uy2(arrayList4, (byte) 7));
            case 5:
                c5n0 c5n0Var4 = (c5n0) obj;
                c5n0Var4.getClass();
                long j4 = ((p4e) obj2).f26347a;
                int iH4 = p4e.h(j4);
                zcl zclVar4 = qmk.f28987a;
                int iW15 = (int) c5n0Var4.w0(12.0f);
                int iW16 = ((int) c5n0Var4.w0(286.0f)) + iW15;
                int iW17 = ((int) c5n0Var4.w0(168.0f)) + iW15;
                int iW18 = (int) c5n0Var4.w0(36.0f);
                int iW19 = (int) c5n0Var4.w0(60.0f);
                int i7 = iH4 - iW15;
                Iterator it5 = q3d.j(Integer.valueOf(iW16), Integer.valueOf(iW17), Integer.valueOf(iW18)).iterator();
                int i8 = 0;
                while (true) {
                    if (it5.hasNext()) {
                        int iIntValue4 = ((Number) it5.next()).intValue();
                        if (i7 >= 0) {
                            i8++;
                            i7 -= iIntValue4;
                        }
                    } else {
                        while (i7 > 0) {
                            i8++;
                            i7 -= iW19;
                        }
                    }
                }
                ArrayList arrayList5 = new ArrayList(i8);
                int iE4 = 0;
                while (iE4 < i8) {
                    iE4 = w6x.e((pj30) CollectionsKt.U(c5n0Var4.k("shimmer_" + iE4, iE4 <= q3d.i(list2) ? (Function2) list2.get(iE4) : new ugd(1071636109, true, new dv90(i8, iE4, b2)))), r4e.b(0, p4e.i(j4), 0, 0, 13), arrayList5, iE4, 1);
                }
                return vj30.x(c5n0Var4, p4e.i(j4), p4e.h(j4), new uy2(arrayList5, (byte) 8));
            case 6:
                u2b0 u2b0Var = (u2b0) obj2;
                List<df40> list3 = u2b0Var.l;
                ArrayList arrayList6 = new ArrayList(r3d.q(list3, 10));
                for (df40 ne40Var : list3) {
                    if (ne40Var instanceof ne40) {
                        ne40Var = new ne40(list2.isEmpty() ? zxx.f45180a : new cyx(list2));
                    }
                    arrayList6.add(ne40Var);
                }
                return u2b0.a(u2b0Var, false, false, false, false, null, null, arrayList6, 2047);
            case 7:
                ((t9v0) list2.get(((Integer) obj).intValue())).e = ((Boolean) obj2).booleanValue();
                return Unit.f46060a;
            case 8:
                ((t9v0) list2.get(((Integer) obj).intValue())).e = ((Boolean) obj2).booleanValue();
                return Unit.f46060a;
            case 9:
                ((t9v0) list2.get(((Integer) obj).intValue())).e = ((Boolean) obj2).booleanValue();
                return Unit.f46060a;
            case 10:
                svg0 svg0Var = (svg0) obj2;
                ((oyg0) obj).getClass();
                svg0Var.getClass();
                return svg0.a(svg0Var, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, null, null, null, null, this.b, null, 7340031);
            case 11:
                svg0 svg0Var2 = (svg0) obj2;
                ((oyg0) obj).getClass();
                svg0Var2.getClass();
                return svg0.a(svg0Var2, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, null, null, null, null, null, this.b, 6291455);
            case 12:
                dvk0 dvk0Var = (dvk0) obj2;
                return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, pvk0.a(dvk0Var.k, null, null, list2, 3), null, null, bvk0.a(dvk0Var.n, null, null, list2, 3), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073732607);
            case 13:
                gvn0 gvn0Var = (gvn0) obj2;
                ((oyg0) obj).getClass();
                gvn0Var.getClass();
                List list4 = gvn0Var.e;
                if (list4.isEmpty() || list2.isEmpty()) {
                    list = list2;
                } else {
                    ArrayList arrayList7 = new ArrayList(r3d.q(list2, 10));
                    for (epn0 epn0VarA : list2) {
                        Iterator it6 = list4.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next = it6.next();
                                epn0 epn0Var = (epn0) next;
                                if (epn0Var.f8198a != epn0VarA.f8198a || epn0Var.e != epn0VarA.e) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        epn0 epn0Var2 = (epn0) next;
                        if (epn0Var2 != null) {
                            epn0VarA = epn0.a(epn0VarA, epn0Var2.f);
                        }
                        arrayList7.add(epn0VarA);
                    }
                    list = arrayList7;
                }
                return gvn0.a(gvn0Var, false, false, false, false, list, null, null, 239);
            case 14:
                gvn0 gvn0Var2 = (gvn0) obj2;
                ((oyg0) obj).getClass();
                gvn0Var2.getClass();
                ArrayList arrayList8 = new ArrayList(r3d.q(list2, 10));
                Iterator it7 = list2.iterator();
                while (it7.hasNext()) {
                    hpn0 hpn0VarA = (hpn0) it7.next();
                    Iterator it8 = gvn0Var2.f.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next2 = it8.next();
                            hpn0 hpn0Var = (hpn0) next2;
                            if (hpn0Var.f13452a != hpn0VarA.f13452a || hpn0Var.c != hpn0VarA.c) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    hpn0 hpn0Var2 = (hpn0) next2;
                    if (hpn0Var2 != null) {
                        hpn0VarA = hpn0.a(hpn0VarA, hpn0Var2.f);
                    }
                    arrayList8.add(hpn0VarA);
                }
                return gvn0.a(gvn0Var2, false, false, false, false, null, arrayList8, null, 223);
            case 15:
                ((Integer) obj2).getClass();
                tke.A(list2, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ser0 ser0Var = (ser0) obj2;
                ((oyg0) obj).getClass();
                ser0Var.getClass();
                xdr0 xdr0Var = ser0Var.w;
                list2.getClass();
                lc00 lc00VarB = kotlin.collections.a.b();
                ArrayList arrayList9 = new ArrayList(r3d.q(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    lhb0 lhb0Var = (lhb0) it9.next();
                    if (lhb0Var == lhb0.f20047a && xdr0Var.b) {
                        lc00VarB.add(c2r0.f3639a);
                    } else if (lhb0Var == lhb0.b && !xdr0Var.g && !xdr0Var.i && xdr0Var.l && xdr0Var.c) {
                        lc00VarB.add(p1r0.f26218a);
                    } else if (lhb0Var == lhb0.c && xdr0Var.m && xdr0Var.o && xdr0Var.d && !xdr0Var.i) {
                        lc00VarB.add(y1r0.f41872a);
                    } else if (lhb0Var == lhb0.d) {
                        lc00VarB.add(d2r0.f5371a);
                    } else if (lhb0Var == lhb0.e) {
                        lc00VarB.add(b2r0.f1868a);
                    } else if (lhb0Var == lhb0.f) {
                        lc00VarB.add(a2r0.f138a);
                    } else if (lhb0Var == lhb0.g) {
                        lc00VarB.add(z1r0.f43635a);
                    } else if (lhb0Var == lhb0.h && xdr0Var.q && !xdr0Var.s) {
                        lc00VarB.add(n1r0.f22766a);
                    } else if (lhb0Var == lhb0.j && xdr0Var.m && !xdr0Var.i) {
                        lc00VarB.add(w1r0.f38415a);
                    } else if (lhb0Var == lhb0.k && xdr0Var.m && !xdr0Var.i) {
                        lc00VarB.add(x1r0.f40134a);
                    } else if (lhb0Var == lhb0.l && xdr0Var.q && !xdr0Var.s) {
                        lc00VarB.add(o1r0.f24496a);
                    } else if (lhb0Var == lhb0.m && xdr0Var.q && !xdr0Var.s) {
                        lc00VarB.add(k1r0.f17542a);
                    } else if (lhb0Var == lhb0.i && xdr0Var.q && !xdr0Var.i && !xdr0Var.s) {
                        lc00VarB.add(l1r0.f19271a);
                    } else if (lhb0Var == lhb0.n && xdr0Var.q && !xdr0Var.s) {
                        lc00VarB.add(m1r0.f21023a);
                    } else if (lhb0Var == lhb0.o && xdr0Var.p && !xdr0Var.q && !xdr0Var.s) {
                        lc00VarB.add(e2r0.f7100a);
                    } else if (lhb0Var == lhb0.p && xdr0Var.r) {
                        lc00VarB.add(t1r0.f33181a);
                    } else if (lhb0Var == lhb0.q && xdr0Var.r) {
                        lc00VarB.add(v1r0.f36646a);
                    } else if (lhb0Var == lhb0.r && xdr0Var.r) {
                        lc00VarB.add(u1r0.f34913a);
                    } else if (lhb0Var == lhb0.s && xdr0Var.r) {
                        lc00VarB.add(r1r0.f29696a);
                    } else if (lhb0Var == lhb0.t && xdr0Var.r) {
                        lc00VarB.add(q1r0.f27968a);
                    }
                    arrayList9.add(Unit.f46060a);
                }
                return ser0.a(ser0Var, kotlin.collections.a.a(lc00VarB), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777214);
        }
    }

    public /* synthetic */ kv80(List list, byte b) {
        this.f18946a = b;
        this.b = list;
    }
}
