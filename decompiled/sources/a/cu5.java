package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class cu5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final peg0 f4971a;
    public final jr5 b;
    public final knf0 c;
    public final us3 d;
    public final r2t e;
    public final q7d0 f;
    public final pru g;
    public final btt0 h;
    public final kuy i;

    public cu5(peg0 peg0Var, jr5 jr5Var, knf0 knf0Var, us3 us3Var, r2t r2tVar, q7d0 q7d0Var, pru pruVar, btt0 btt0Var, kuy kuyVar) {
        knf0Var.getClass();
        us3Var.getClass();
        r2tVar.getClass();
        q7d0Var.getClass();
        btt0Var.getClass();
        kuyVar.getClass();
        this.f4971a = peg0Var;
        this.b = jr5Var;
        this.c = knf0Var;
        this.d = us3Var;
        this.e = r2tVar;
        this.f = q7d0Var;
        this.g = pruVar;
        this.h = btt0Var;
        this.i = kuyVar;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((kr5) obj).n != oo5.ACTION_DYNAMIC) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList c(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((kr5) obj).b != 1237 ? true : z) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        jt5 jt5Var;
        if (zjeVar instanceof jt5) {
            jt5Var = (jt5) zjeVar;
            int i = jt5Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jt5Var.k = i - Integer.MIN_VALUE;
            } else {
                jt5Var = new jt5(this, zjeVar);
            }
        } else {
            jt5Var = new jt5(this, zjeVar);
        }
        Object obj = jt5Var.i;
        Object obj2 = wne.f39444a;
        int i2 = jt5Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            jt5Var.k = 1;
            jr5 jr5Var = this.b;
            jr5Var.n.clear();
            Object objW0 = sj3.w0(jt5Var, ((vn50) jr5Var.m.getValue()).f37702a, new st20(2, yjeVar, (byte) 3), false, true);
            if (objW0 != obj2) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != obj2) {
                objW0 = Unit.f46060a;
            }
            if (objW0 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        q7d0 q7d0Var = this.f;
        q7d0Var.h("FIRST_SAVE_SEEN_CMS_BANNER_TIMESTAMP");
        q7d0Var.h("PROMOTIONS_WERE_LAUNCHED");
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r12 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r12 == r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r11, a.zje r12, java.lang.String r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof a.kt5
            if (r0 == 0) goto L14
            r0 = r12
            a.kt5 r0 = (a.kt5) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.k = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            a.kt5 r0 = new a.kt5
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r9.i
            a.wne r0 = a.wne.f39444a
            int r1 = r9.k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            a.z1x.P(r12)
            goto L97
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            r10 = 0
            return r10
        L33:
            a.z1x.P(r12)
            goto L6a
        L37:
            a.z1x.P(r12)
            a.peg0 r12 = r10.f4971a
            java.lang.Object r12 = r12.b
            a.zm r12 = (a.zm) r12
            a.us3 r1 = r10.d
            a.knf0 r10 = r10.c
            if (r14 == 0) goto L73
            r10.getClass()
            java.lang.String r5 = r10.c()
            a.go3 r10 = r1.c()
            int r7 = r10.f11610a
            r9.k = r3
            java.lang.Object r10 = r12.invoke()
            r1 = r10
            a.et5 r1 = (a.et5) r1
            java.lang.String r8 = "application/vnd.xenvelop+json"
            r2 = 1
            r6 = 22
            r3 = r11
            r4 = r13
            java.lang.Object r12 = r1.d(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L6a
            goto L96
        L6a:
            a.dx5 r12 = (a.dx5) r12
            java.lang.Object r10 = r12.a()
            java.util.List r10 = (java.util.List) r10
            return r10
        L73:
            r3 = r11
            r4 = r13
            r10.getClass()
            java.lang.String r5 = r10.c()
            a.go3 r10 = r1.c()
            int r7 = r10.f11610a
            r9.k = r2
            java.lang.Object r10 = r12.invoke()
            r1 = r10
            a.et5 r1 = (a.et5) r1
            java.lang.String r8 = "application/vnd.xenvelop+json"
            r2 = 1
            r6 = 22
            java.lang.Object r12 = r1.i(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L97
        L96:
            return r0
        L97:
            a.dx5 r12 = (a.dx5) r12
            java.lang.Object r10 = r12.a()
            java.util.List r10 = (java.util.List) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cu5.d(int, a.zje, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x012b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final Object e(int i, boolean z, boolean z2, ec0 ec0Var, String str, boolean z3, boolean z4, zje zjeVar) {
        lt5 lt5Var;
        List listA0;
        String str2;
        boolean z5;
        boolean z6;
        cu5 cu5Var;
        int i2;
        boolean z7;
        boolean z8;
        ec0 ec0Var2;
        Object objS;
        jr5 jr5Var = this.b;
        LinkedHashMap linkedHashMap = jr5Var.f;
        if (zjeVar instanceof lt5) {
            lt5Var = (lt5) zjeVar;
            int i3 = lt5Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lt5Var.s = i3 - Integer.MIN_VALUE;
            } else {
                lt5Var = new lt5(this, zjeVar);
            }
        } else {
            lt5Var = new lt5(this, zjeVar);
        }
        lt5 lt5Var2 = lt5Var;
        Object obj = lt5Var2.q;
        wne wneVar = wne.f39444a;
        int i4 = lt5Var2.s;
        if (i4 == 0) {
            z1x.P(obj);
            ec0Var.getClass();
            listA0 = (List) linkedHashMap.get(ec0Var);
            if (listA0 == null) {
                listA0 = iun.f15405a;
            }
            if (jr5Var.b != z2 || ec0Var == ec0.UNDEFINED) {
                listA0 = null;
            }
            if (listA0 == null) {
                listA0 = iun.f15405a;
            }
            if (listA0.isEmpty()) {
                String strValueOf = String.valueOf(ec0Var.f7543a);
                int i5 = ec0Var.f7543a;
                lt5Var2.n = ec0Var;
                str2 = str;
                lt5Var2.o = str2;
                lt5Var2.p = this;
                lt5Var2.i = i;
                lt5Var2.j = z;
                lt5Var2.k = z2;
                z5 = z3;
                lt5Var2.l = z5;
                z6 = z4;
                lt5Var2.m = z6;
                lt5Var2.s = 1;
                Serializable serializableK = k(z, strValueOf, i5, i, z2, lt5Var2);
                if (serializableK != wneVar) {
                    i2 = i;
                    z7 = z;
                    z8 = z2;
                    obj = serializableK;
                    ec0Var2 = ec0Var;
                    cu5Var = this;
                }
            } else {
                str2 = str;
                z5 = z3;
                z6 = z4;
                cu5Var = this;
                i2 = i;
                z7 = z;
                z8 = z2;
                lt5Var2.n = null;
                lt5Var2.o = null;
                lt5Var2.p = null;
                lt5Var2.i = i2;
                lt5Var2.j = z7;
                lt5Var2.k = z8;
                lt5Var2.l = z5;
                lt5Var2.m = z6;
                lt5Var2.s = 2;
                objS = cu5Var.s(listA0, i2, str2, z5, z6, lt5Var2);
                if (objS != wneVar) {
                    return objS;
                }
            }
            return wneVar;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z9 = lt5Var2.m;
        boolean z10 = lt5Var2.l;
        z8 = lt5Var2.k;
        z7 = lt5Var2.j;
        i2 = lt5Var2.i;
        cu5Var = lt5Var2.p;
        str2 = lt5Var2.o;
        ec0Var2 = lt5Var2.n;
        z1x.P(obj);
        z6 = z9;
        z5 = z10;
        List list = (List) obj;
        ec0Var2.getClass();
        list.getClass();
        if (ec0Var2 != ec0.UNDEFINED) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) linkedHashMap.get(ec0Var2);
            if (copyOnWriteArrayList != null) {
                jr5Var.b = z8;
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(list);
            } else {
                linkedHashMap.put(ec0Var2, new CopyOnWriteArrayList(list));
            }
        }
        p7m0 p7m0Var = jr5Var.d;
        Boolean boolValueOf = Boolean.valueOf(linkedHashMap.isEmpty());
        p7m0Var.getClass();
        p7m0Var.o(null, boolValueOf);
        listA0 = CollectionsKt.A0((Iterable) obj, new s7f((byte) 27));
        lt5Var2.n = null;
        lt5Var2.o = null;
        lt5Var2.p = null;
        lt5Var2.i = i2;
        lt5Var2.j = z7;
        lt5Var2.k = z8;
        lt5Var2.l = z5;
        lt5Var2.m = z6;
        lt5Var2.s = 2;
        objS = cu5Var.s(listA0, i2, str2, z5, z6, lt5Var2);
        if (objS != wneVar) {
            return wneVar;
        }
        return objS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0145, code lost:
    
        if (r1 == r5) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r22, a.zje r23, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cu5.f(int, a.zje, java.lang.String, boolean, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable g(int i, int i2, zje zjeVar) {
        nt5 nt5Var;
        int iIntValue;
        Integer num;
        if (zjeVar instanceof nt5) {
            nt5Var = (nt5) zjeVar;
            int i3 = nt5Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nt5Var.k = i3 - Integer.MIN_VALUE;
            } else {
                nt5Var = new nt5(this, zjeVar);
            }
        } else {
            nt5Var = new nt5(this, zjeVar);
        }
        nt5 nt5Var2 = nt5Var;
        Object objC = nt5Var2.i;
        wne wneVar = wne.f39444a;
        int i4 = nt5Var2.k;
        if (i4 == 0) {
            z1x.P(objC);
            String strC = this.c.c();
            nt5Var2.k = 1;
            objC = ((et5) ((zm) this.f4971a.b).invoke()).c(i, strC, i2, "application/vnd.xenvelop+json", nt5Var2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        bs5 bs5Var = (bs5) ((dx5) objC).a();
        List list = bs5Var.A;
        if (list == null || (num = (Integer) CollectionsKt.firstOrNull(list)) == null) {
            us5[] us5VarArr = us5.f36194a;
            iIntValue = 9;
        } else {
            iIntValue = num.intValue();
        }
        return vbw0.a0(bs5Var, iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r22v0, types: [a.cu5] */
    public final Serializable h(zje zjeVar) {
        ot5 ot5Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.b.j;
        if (zjeVar instanceof ot5) {
            ot5Var = (ot5) zjeVar;
            int i = ot5Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ot5Var.k = i - Integer.MIN_VALUE;
            } else {
                ot5Var = new ot5(this, zjeVar);
            }
        } else {
            ot5Var = new ot5(this, zjeVar);
        }
        Object objI = ot5Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ot5Var.k;
        if (i2 == 0) {
            z1x.P(objI);
            ?? r1 = copyOnWriteArrayList.isEmpty() ? iun.f15405a : copyOnWriteArrayList;
            if (!r1.isEmpty()) {
                return r1;
            }
            ot5Var.k = 1;
            objI = i(ot5Var);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objI);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objI) {
            xs5 xs5Var = (xs5) obj;
            rek0 rek0Var = ec0.b;
            if (!rz4.C(xs5Var.f41399a, q3d.j(32, 33, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102))) {
                int i3 = xs5Var.f41399a;
                us5[] us5VarArr = us5.f36194a;
                if (i3 != 46 && i3 != 45) {
                    arrayList.add(obj);
                }
            }
        }
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable i(zje zjeVar) {
        pt5 pt5Var;
        if (zjeVar instanceof pt5) {
            pt5Var = (pt5) zjeVar;
            int i = pt5Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pt5Var.k = i - Integer.MIN_VALUE;
            } else {
                pt5Var = new pt5(this, zjeVar);
            }
        } else {
            pt5Var = new pt5(this, zjeVar);
        }
        Object objB = pt5Var.i;
        wne wneVar = wne.f39444a;
        int i2 = pt5Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            String strC = this.c.c();
            pt5Var.k = 1;
            objB = ((et5) ((zm) this.f4971a.b).invoke()).b(strC, "application/vnd.xenvelop+json", pt5Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        Iterable<at5> iterable = (Iterable) ((dx5) objB).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (at5 at5Var : iterable) {
            at5Var.getClass();
            Integer num = at5Var.f1419a;
            boolean zBooleanValue = false;
            int iIntValue = num != null ? num.intValue() : 0;
            String str = at5Var.b;
            if (str == null) {
                str = "";
            }
            String str2 = at5Var.c;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = at5Var.d;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = at5Var.e;
            String str5 = str4 != null ? str4 : "";
            Boolean bool = at5Var.f;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            arrayList.add(new xs5(iIntValue, str, str2, str3, str5, zBooleanValue));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable j(int i, zje zjeVar, String str, boolean z, boolean z2) {
        rt5 rt5Var;
        int iIntValue;
        Integer num;
        if (zjeVar instanceof rt5) {
            rt5Var = (rt5) zjeVar;
            int i2 = rt5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rt5Var.l = i2 - Integer.MIN_VALUE;
            } else {
                rt5Var = new rt5(this, zjeVar);
            }
        } else {
            rt5Var = new rt5(this, zjeVar);
        }
        Object objD = rt5Var.j;
        wne wneVar = wne.f39444a;
        int i3 = rt5Var.l;
        if (i3 == 0) {
            z1x.P(objD);
            rt5Var.i = z;
            rt5Var.l = 1;
            objD = d(i, rt5Var, str, z2);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = rt5Var.i;
            z1x.P(objD);
        }
        Iterable<bs5> iterable = (Iterable) objD;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (bs5 bs5Var : iterable) {
            List list = bs5Var.A;
            if (list == null || (num = (Integer) CollectionsKt.firstOrNull(list)) == null) {
                us5[] us5VarArr = us5.f36194a;
                iIntValue = 9;
            } else {
                iIntValue = num.intValue();
            }
            arrayList.add(vbw0.a0(bs5Var, iIntValue));
        }
        return c(arrayList, z);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Serializable k(boolean z, String str, int i, int i2, boolean z2, zje zjeVar) {
        qt5 qt5Var;
        Object objI;
        int i3;
        if (zjeVar instanceof qt5) {
            qt5Var = (qt5) zjeVar;
            int i4 = qt5Var.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                qt5Var.n = i4 - Integer.MIN_VALUE;
            } else {
                qt5Var = new qt5(this, zjeVar);
            }
        } else {
            qt5Var = new qt5(this, zjeVar);
        }
        qt5 qt5Var2 = qt5Var;
        Object obj = qt5Var2.l;
        wne wneVar = wne.f39444a;
        int i5 = qt5Var2.n;
        if (i5 == 0) {
            z1x.P(obj);
            qt5Var2.j = this;
            qt5Var2.i = z;
            qt5Var2.k = i;
            qt5Var2.n = 1;
            zm zmVar = (zm) this.f4971a.b;
            us3 us3Var = this.d;
            knf0 knf0Var = this.c;
            if (z2) {
                knf0Var.getClass();
                objI = ((et5) zmVar.invoke()).d(1, i2, str, knf0Var.c(), 22, us3Var.c().f11610a, "application/vnd.xenvelop+json", qt5Var2);
            } else {
                knf0Var.getClass();
                objI = ((et5) zmVar.invoke()).i(1, i2, str, knf0Var.c(), 22, us3Var.c().f11610a, "application/vnd.xenvelop+json", qt5Var2);
            }
            if (objI == wneVar) {
                return wneVar;
            }
            i3 = i;
        } else {
            if (i5 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = qt5Var2.k;
            z = qt5Var2.i;
            cu5 cu5Var = qt5Var2.j;
            z1x.P(obj);
            i3 = i6;
            this = cu5Var;
            objI = obj;
        }
        Iterable iterable = (Iterable) ((dx5) objI).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(vbw0.a0((bs5) it.next(), i3));
        }
        this.getClass();
        return c(arrayList, z);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:117|230|118|119|217|120|121|234|122|123|(2:125|206)(5:126|250|127|128|129)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:215|37|38|246|39|40|242|41|42|238|43|44|226|45|46|244|47|48|(1:264)(19:51|240|52|53|224|54|(6:222|57|(1:65)(1:61)|66|67|55)|257|68|(6:236|71|72|(1:260)(3:252|76|259)|77|69)|258|82|220|83|84|219|85|(1:87)(1:88)|89)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:51|240|52|53|224|54|(6:222|57|(1:65)(1:61)|66|67|55)|257|68|(6:236|71|72|(1:260)(3:252|76|259)|77|69)|258|82|220|83|84|219|85|(1:87)(1:88)|89) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:252|76|259) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:126|250|127|128|129) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:222|57|(1:65)(1:61)|66|67|55) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:236|71|72|(1:260)(3:252|76|259)|77|69) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:232|28|(1:34)|35|(19:215|37|38|246|39|40|242|41|42|238|43|44|226|45|46|244|47|48|(1:264)(19:51|240|52|53|224|54|(6:222|57|(1:65)(1:61)|66|67|55)|257|68|(6:236|71|72|(1:260)(3:252|76|259)|77|69)|258|82|220|83|84|219|85|(1:87)(1:88)|89))(1:114)|115|(11:117|230|118|119|217|120|121|234|122|123|(2:125|206)(5:126|250|127|128|129))(1:(2:173|174)(1:176))) */
    /* JADX WARN: Code duplicated, block: B:114:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:117:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:125:0x0423  */
    /* JADX WARN: Code duplicated, block: B:126:0x0426  */
    /* JADX WARN: Code duplicated, block: B:142:0x0478 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x047a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0488  */
    /* JADX WARN: Code duplicated, block: B:147:0x048f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0491  */
    /* JADX WARN: Code duplicated, block: B:151:0x0496  */
    /* JADX WARN: Code duplicated, block: B:153:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:154:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x04da  */
    /* JADX WARN: Code duplicated, block: B:157:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:159:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:161:0x0503  */
    /* JADX WARN: Code duplicated, block: B:162:0x0505  */
    /* JADX WARN: Code duplicated, block: B:165:0x050a  */
    /* JADX WARN: Code duplicated, block: B:168:0x053b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0550  */
    /* JADX WARN: Code duplicated, block: B:171:0x056c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0587 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x0589  */
    /* JADX WARN: Code duplicated, block: B:176:0x058f  */
    /* JADX WARN: Code duplicated, block: B:181:0x059f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:183:0x05be  */
    /* JADX WARN: Code duplicated, block: B:185:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:186:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:189:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:191:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:192:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:195:0x061d  */
    /* JADX WARN: Code duplicated, block: B:196:0x063a  */
    /* JADX WARN: Code duplicated, block: B:198:0x0645  */
    /* JADX WARN: Code duplicated, block: B:200:0x064e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0650  */
    /* JADX WARN: Code duplicated, block: B:204:0x0655  */
    /* JADX WARN: Code duplicated, block: B:207:0x0684  */
    /* JADX WARN: Code duplicated, block: B:210:0x069e  */
    /* JADX WARN: Code duplicated, block: B:211:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:212:0x06df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:214:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:215:0x023a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x02b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0219 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0303 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0317 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0220 A[Catch: all -> 0x0590, TryCatch #9 {all -> 0x0590, blocks: (B:28:0x0219, B:30:0x0220, B:32:0x022c, B:35:0x0234, B:34:0x0232), top: B:232:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0232 A[Catch: all -> 0x0590, TryCatch #9 {all -> 0x0590, blocks: (B:28:0x0219, B:30:0x0220, B:32:0x022c, B:35:0x0234, B:34:0x0232), top: B:232:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x028c  */
    /* JADX WARN: Code duplicated, block: B:59:0x02c0 A[Catch: all -> 0x02cd, TryCatch #4 {all -> 0x02cd, blocks: (B:57:0x02b4, B:59:0x02c0, B:61:0x02c8, B:66:0x02ea, B:65:0x02e6), top: B:222:0x02b4 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x02e6 A[Catch: all -> 0x02cd, TryCatch #4 {all -> 0x02cd, blocks: (B:57:0x02b4, B:59:0x02c0, B:61:0x02c8, B:66:0x02ea, B:65:0x02e6), top: B:222:0x02b4 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:87:0x034a A[Catch: all -> 0x0367, TryCatch #2 {all -> 0x0367, blocks: (B:85:0x0342, B:87:0x034a, B:88:0x0351), top: B:219:0x0342 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0351 A[Catch: all -> 0x0367, TRY_LEAVE, TryCatch #2 {all -> 0x0367, blocks: (B:85:0x0342, B:87:0x034a, B:88:0x0351), top: B:219:0x0342 }] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0397, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0398, code lost:
    
        r24 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x039e, code lost:
    
        r2 = r14;
        r1 = r20;
        r15 = r9;
        r14 = r11;
        r9 = r0;
        r0 = r7;
        r11 = r10;
        r7 = r6;
        r10 = r8;
        r8 = r23;
        r6 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03af, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03b2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03b3, code lost:
    
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03b6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03b7, code lost:
    
        r23 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03ba, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03bb, code lost:
    
        r23 = r37;
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03c0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03c1, code lost:
    
        r24 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03c5, code lost:
    
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x043e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x043f, code lost:
    
        r26 = r10;
        r10 = r8;
        r8 = r26;
        r17 = r7;
        r7 = r15;
        r15 = r14;
        r14 = r13;
        r13 = r6;
        r6 = r5;
        r5 = r2;
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x044d, code lost:
    
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0450, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0451, code lost:
    
        r18 = r32;
        r5 = r33;
        r1 = r34;
        r12 = r35;
        r6 = r36;
        r13 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x045d, code lost:
    
        r7 = r15;
        r15 = r14;
        r14 = r13;
        r13 = r6;
        r6 = r5;
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0466, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0467, code lost:
    
        r18 = r1;
        r1 = r5;
        r5 = r6;
        r6 = r12;
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x046e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x046f, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0590, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0591, code lost:
    
        r24 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02cd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02ce, code lost:
    
        r1 = r9;
        r9 = r0;
        r15 = r1;
        r26 = r13;
        r13 = r4;
        r12 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02e0, code lost:
    
        r11 = r10;
        r10 = r8;
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x031f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0320, code lost:
    
        r1 = r9;
        r9 = r0;
        r15 = r1;
        r12 = r13;
        r13 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0331, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0332, code lost:
    
        r32 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0367, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0369, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x036a, code lost:
    
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x036c, code lost:
    
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x036e, code lost:
    
        r1 = r20;
        r4 = r13;
        r13 = r32;
        r26 = r9;
        r9 = r0;
        r0 = r17;
        r17 = r2;
        r2 = r14;
        r14 = r7;
        r15 = r26;
        r7 = r5;
        r26 = r10;
        r10 = r8;
        r8 = r23;
        r27 = r11;
        r11 = r26;
        r12 = r4;
        r4 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x038d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x038e, code lost:
    
        r32 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0393, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0394, code lost:
    
        r24 = r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x04da -> B:116:0x03db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x053b -> B:169:0x054a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x0550 -> B:116:0x03db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:182:0x05a1 -> B:27:0x0217). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:207:0x0684 -> B:208:0x068a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:210:0x069e -> B:27:0x0217). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:211:0x06c3 -> B:209:0x069a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.util.List r31, int r32, boolean r33, boolean r34, java.lang.String r35, boolean r36, boolean r37, a.zje r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cu5.l(java.util.List, int, boolean, boolean, java.lang.String, boolean, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Serializable m(List list, int i, boolean z, boolean z2, String str, boolean z3, boolean z4, zje zjeVar) throws Throwable {
        tt5 tt5Var;
        cu5 cu5Var;
        if (zjeVar instanceof tt5) {
            tt5Var = (tt5) zjeVar;
            int i2 = tt5Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tt5Var.k = i2 - Integer.MIN_VALUE;
                cu5Var = this;
            } else {
                cu5Var = this;
                tt5Var = new tt5(cu5Var, zjeVar);
            }
        } else {
            cu5Var = this;
            tt5Var = new tt5(cu5Var, zjeVar);
        }
        tt5 tt5Var2 = tt5Var;
        Object objL = tt5Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = tt5Var2.k;
        if (i3 == 0) {
            z1x.P(objL);
            tt5Var2.k = 1;
            objL = cu5Var.l(list, i, z, z2, str, z3, z4, tt5Var2);
            if (objL == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objL);
        }
        List list2 = (List) objL;
        list2.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
            kr5 kr5Var = (kr5) it.next();
            kr5Var.getClass();
            arrayList.add(new uog(kr5Var.b, kr5Var.o, kr5Var.p, kr5Var.q, kr5Var.f, kr5Var.l, kr5Var.v, kr5Var.w, kr5Var.n.f25576a, kr5Var.d, kr5Var.m, kr5Var.g, kr5Var.h, kr5Var.j, kr5Var.k, kr5Var.s, kr5Var.A));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:37:0x0103  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:41:0x010b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    /* JADX WARN: Code duplicated, block: B:57:0x017d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0180  */
    /* JADX WARN: Code duplicated, block: B:61:0x0186  */
    /* JADX WARN: Code duplicated, block: B:62:0x0189  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0192  */
    /* JADX WARN: Code duplicated, block: B:69:0x019e  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object n(int i, zje zjeVar, String str, String str2) {
        ut5 ut5Var;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Object obj;
        String str9;
        Integer num;
        String str10;
        int iIntValue;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        if (zjeVar instanceof ut5) {
            ut5Var = (ut5) zjeVar;
            int i2 = ut5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ut5Var.l = i2 - Integer.MIN_VALUE;
            } else {
                ut5Var = new ut5(this, zjeVar);
            }
        } else {
            ut5Var = new ut5(this, zjeVar);
        }
        ut5 ut5Var2 = ut5Var;
        Object objH = ut5Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = ut5Var2.l;
        if (i3 != 0) {
            if (i3 == 1) {
                str9 = ut5Var2.i;
                z1x.P(objH);
                obj = objH;
                str8 = "/app/";
                str7 = "/GamesMedia/";
                sfn sfnVar = (sfn) ((dx5) obj).a();
                num = sfnVar.f32125a;
                str9.getClass();
                str10 = sfnVar.g;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                lz60.Companion.getClass();
                String str26 = str9 + str7 + iIntValue + str8;
                String strConcat = iz60.a(str10).a().concat(".webp");
                int iIntValue2 = num != null ? num.intValue() : 0;
                str11 = sfnVar.b;
                if (str11 == null) {
                    str12 = "";
                } else {
                    str12 = str11;
                }
                str13 = sfnVar.d;
                if (str13 == null) {
                    str14 = "";
                } else {
                    str14 = str13;
                }
                str15 = sfnVar.c;
                if (str15 == null) {
                    str16 = "";
                } else {
                    str16 = str15;
                }
                String strL = kng0.l(str26, "180x180", strConcat);
                String strL2 = kng0.l(str26, "1080x390", strConcat);
                if (str10 == null) {
                    str17 = "";
                } else {
                    str17 = str10;
                }
                return new pfn(iIntValue2, str12, str14, str16, strL, strL2, str17);
            }
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str6 = ut5Var2.i;
            z1x.P(objH);
            str5 = ".webp";
            str4 = "/app/";
            str3 = "/GamesMedia/";
            vfn vfnVar = (vfn) objH;
            vfnVar.getClass();
            str18 = vfnVar.b;
            str6.getClass();
            lz60.Companion.getClass();
            String strA = iz60.a(str18).a();
            Integer num2 = vfnVar.f37341a;
            String str27 = str6 + str3 + num2 + str4;
            String strConcat2 = strA.concat(str5);
            int iIntValue3 = num2 != null ? num2.intValue() : 0;
            str19 = vfnVar.c;
            if (str19 == null) {
                str20 = "";
            } else {
                str20 = str19;
            }
            str21 = vfnVar.d;
            if (str21 == null) {
                str22 = "";
            } else {
                str22 = str21;
            }
            str23 = vfnVar.e;
            if (str23 == null) {
                str24 = "";
            } else {
                str24 = str23;
            }
            String strL3 = kng0.l(str27, "180x180", strConcat2);
            String strL4 = kng0.l(str27, "1080x390", strConcat2);
            if (str18 == null) {
                str25 = "";
            } else {
                str25 = str18;
            }
            return new pfn(iIntValue3, str20, str22, str24, strL3, strL4, str25);
        }
        z1x.P(objH);
        this.c.getClass();
        String strA2 = this.i.a();
        boolean z = this.g.a().V1;
        zm zmVar = (zm) this.f4971a.b;
        str3 = "/GamesMedia/";
        str4 = "/app/";
        if (!z) {
            ut5Var2.i = str2;
            ut5Var2.l = 2;
            str5 = ".webp";
            objH = ((et5) zmVar.invoke()).h(i, strA2, 22, 1, 1357, str, ut5Var2);
            if (objH == wneVar) {
                return wneVar;
            }
            str6 = str2;
            vfn vfnVar2 = (vfn) objH;
            vfnVar2.getClass();
            str18 = vfnVar2.b;
            str6.getClass();
            lz60.Companion.getClass();
            String strA3 = iz60.a(str18).a();
            Integer num3 = vfnVar2.f37341a;
            String str28 = str6 + str3 + num3 + str4;
            String strConcat3 = strA3.concat(str5);
            int iIntValue4 = num3 != null ? num3.intValue() : 0;
            str19 = vfnVar2.c;
            if (str19 == null) {
                str20 = "";
            } else {
                str20 = str19;
            }
            str21 = vfnVar2.d;
            if (str21 == null) {
                str22 = "";
            } else {
                str22 = str21;
            }
            str23 = vfnVar2.e;
            if (str23 == null) {
                str24 = "";
            } else {
                str24 = str23;
            }
            String strL5 = kng0.l(str28, "180x180", strConcat3);
            String strL6 = kng0.l(str28, "1080x390", strConcat3);
            if (str18 == null) {
                str25 = "";
            } else {
                str25 = str18;
            }
            return new pfn(iIntValue4, str20, str22, str24, strL5, strL6, str25);
        }
        ut5Var2.i = str2;
        ut5Var2.l = 1;
        str7 = str3;
        str8 = str4;
        Object objA = ((et5) zmVar.invoke()).a(22, 1, new Integer(1357), strA2, new Integer(i), new Integer(i), str, ut5Var2);
        if (objA == wneVar) {
            return wneVar;
        }
        obj = objA;
        str9 = str2;
        sfn sfnVar2 = (sfn) ((dx5) obj).a();
        num = sfnVar2.f32125a;
        str9.getClass();
        str10 = sfnVar2.g;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        lz60.Companion.getClass();
        String str29 = str9 + str7 + iIntValue + str8;
        String strConcat4 = iz60.a(str10).a().concat(".webp");
        int iIntValue5 = num != null ? num.intValue() : 0;
        str11 = sfnVar2.b;
        if (str11 == null) {
            str12 = "";
        } else {
            str12 = str11;
        }
        str13 = sfnVar2.d;
        if (str13 == null) {
            str14 = "";
        } else {
            str14 = str13;
        }
        str15 = sfnVar2.c;
        if (str15 == null) {
            str16 = "";
        } else {
            str16 = str15;
        }
        String strL7 = kng0.l(str29, "180x180", strConcat4);
        String strL8 = kng0.l(str29, "1080x390", strConcat4);
        if (str10 == null) {
            str17 = "";
        } else {
            str17 = str10;
        }
        return new pfn(iIntValue5, str12, str14, str16, strL7, strL8, str17);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r0 == r9) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(int r16, a.zje r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cu5.o(int, a.zje, java.lang.String, boolean, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        if (r1 == r9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(int r17, a.zje r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cu5.p(int, a.zje, java.lang.String, boolean, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(int i, int i2, boolean z, boolean z2, String str, boolean z3, boolean z4, zje zjeVar) {
        yt5 yt5Var;
        ArrayList arrayList;
        if (zjeVar instanceof yt5) {
            yt5Var = (yt5) zjeVar;
            int i3 = yt5Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yt5Var.s = i3 - Integer.MIN_VALUE;
            } else {
                yt5Var = new yt5(this, zjeVar);
            }
        } else {
            yt5Var = new yt5(this, zjeVar);
        }
        Object objD = yt5Var.q;
        Object obj = wne.f39444a;
        int i4 = yt5Var.s;
        byte b = 2;
        if (i4 == 0) {
            z1x.P(objD);
            String strValueOf = String.valueOf(i);
            yt5Var.o = str;
            yt5Var.i = i;
            yt5Var.j = i2;
            yt5Var.k = z;
            yt5Var.l = z2;
            yt5Var.m = z3;
            yt5Var.n = z4;
            yt5Var.s = 1;
            objD = d(i2, yt5Var, strValueOf, z2);
            if (objD != obj) {
            }
            return obj;
        }
        if (i4 == 1) {
            z4 = yt5Var.n;
            z3 = yt5Var.m;
            z2 = yt5Var.l;
            z = yt5Var.k;
            i2 = yt5Var.j;
            i = yt5Var.i;
            str = yt5Var.o;
            z1x.P(objD);
        } else {
            if (i4 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = yt5Var.p;
            z1x.P(objD);
        }
        return CollectionsKt.A0(arrayList, new vt5(b));
        Iterable iterable = (Iterable) objD;
        int i5 = i;
        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(vbw0.a0((bs5) it.next(), i5));
        }
        c(arrayList2, z2);
        yt5Var.o = null;
        yt5Var.p = arrayList2;
        yt5Var.i = i5;
        yt5Var.j = i2;
        yt5Var.k = z;
        yt5Var.l = z2;
        yt5Var.m = z3;
        yt5Var.n = z4;
        yt5Var.s = 2;
        if (s(arrayList2, i2, str, z3, z4, yt5Var) != obj) {
            arrayList = arrayList2;
            return CollectionsKt.A0(arrayList, new vt5(b));
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object r(int i, zje zjeVar, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        zt5 zt5Var;
        if (zjeVar instanceof zt5) {
            zt5Var = (zt5) zjeVar;
            int i2 = zt5Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zt5Var.k = i2 - Integer.MIN_VALUE;
            } else {
                zt5Var = new zt5(this, zjeVar);
            }
        } else {
            zt5Var = new zt5(this, zjeVar);
        }
        zt5 zt5Var2 = zt5Var;
        Object objP = zt5Var2.i;
        Object obj = wne.f39444a;
        int i3 = zt5Var2.k;
        if (i3 == 0) {
            z1x.P(objP);
            zt5Var2.k = 1;
            objP = p(i, zt5Var2, str, z, z2, z3, z4);
            if (objP == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objP);
        }
        return CollectionsKt.A0((Iterable) objP, new vt5((byte) 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(List list, int i, String str, boolean z, boolean z2, zje zjeVar) {
        au5 au5Var;
        if (zjeVar instanceof au5) {
            au5Var = (au5) zjeVar;
            int i2 = au5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                au5Var.l = i2 - Integer.MIN_VALUE;
            } else {
                au5Var = new au5(this, zjeVar);
            }
        } else {
            au5Var = new au5(this, zjeVar);
        }
        Object objT = au5Var.j;
        Object obj = wne.f39444a;
        int i3 = au5Var.l;
        Object obj2 = null;
        if (i3 == 0) {
            z1x.P(objT);
            boolean z3 = this.g.a().d.b;
            if (!z || !z3) {
                return a(list);
            }
            for (Object obj3 : list) {
                if (((kr5) obj3).n == oo5.ACTION_DYNAMIC) {
                    obj2 = obj3;
                    break;
                }
            }
            if (((kr5) obj2) != null) {
                au5Var.i = list;
                au5Var.l = 1;
                objT = t(list, i, str, z2, au5Var);
                if (objT == obj) {
                    return obj;
                }
            }
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = au5Var.i;
        z1x.P(objT);
        List list2 = (List) objT;
        return list2 != null ? list2 : list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (r13 == r2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.util.List r9, int r10, java.lang.String r11, boolean r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cu5.t(java.util.List, int, java.lang.String, boolean, a.zje):java.lang.Object");
    }
}
