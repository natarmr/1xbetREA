package a;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class p4u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26374a;

    public p4u(ju9 ju9Var) {
        ju9Var.getClass();
        this.f26374a = ju9Var;
    }

    public double a() {
        fnd0 fnd0Var = (fnd0) ((o470) this.f26374a).f24619a;
        double dO = wvb.O(fnd0Var.f9831a.c("sum_string", "-1.0"));
        return dO < 0.0d ? wvb.N(fnd0Var.f9831a.b().getFloat("sum", -1.0f)) : dO;
    }

    public long b() {
        ql5 ql5Var = ((xre) this.f26374a).f41366a.c;
        if (ql5Var != null) {
            return ql5Var.f28916a;
        }
        return 0L;
    }

    public bt9 c(List list) {
        Object next;
        list.getClass();
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        String strC = ((ju9) this.f26374a).b.c();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((bt9) next).c.equalsIgnoreCase(strC));
        bt9 bt9Var = (bt9) next;
        if (bt9Var != null) {
            return bt9Var;
        }
        for (Object obj2 : list) {
            if (((bt9) obj2).c.equalsIgnoreCase("en_GB")) {
                obj = obj2;
                break;
            }
        }
        bt9 bt9Var2 = (bt9) obj;
        return bt9Var2 == null ? (bt9) CollectionsKt.firstOrNull(list) : bt9Var2;
    }

    public File d(String str) {
        str.getClass();
        hk3 hk3Var = (hk3) ((mii0) this.f26374a).e;
        hk3Var.getClass();
        return new File(new File(hk3Var.f13190a.getFilesDir(), ".CWAC-Update"), hk3.b(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r8 == r9) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable e(a.zje r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f26374a
            a.wsf0 r0 = (a.wsf0) r0
            boolean r1 = r9 instanceof a.zdu
            if (r1 == 0) goto L17
            r1 = r9
            a.zdu r1 = (a.zdu) r1
            int r2 = r1.m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.m = r2
            goto L1c
        L17:
            a.zdu r1 = new a.zdu
            r1.<init>(r8, r9)
        L1c:
            java.lang.Object r8 = r1.k
            a.wne r9 = a.wne.f39444a
            int r2 = r1.m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            a.z1x.P(r8)
            goto L6a
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L35:
            a.bm5 r0 = r1.j
            a.bsu r2 = r1.i
            a.z1x.P(r8)
            goto L5b
        L3d:
            a.z1x.P(r8)
            a.bsu r2 = new a.bsu
            r2.<init>()
            a.bm5 r8 = a.bm5.d
            a.urt r0 = r0.g()
            r1.i = r2
            r1.j = r8
            r1.m = r4
            java.lang.Object r0 = a.urt.a(r0, r1)
            if (r0 != r9) goto L58
            goto L69
        L58:
            r7 = r0
            r0 = r8
            r8 = r7
        L5b:
            java.util.List r8 = (java.util.List) r8
            r1.i = r5
            r1.j = r5
            r1.m = r3
            java.util.ArrayList r8 = a.bsu.b(r2, r0, r8, r1)
            if (r8 != r9) goto L6a
        L69:
            return r9
        L6a:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r0 = 10
            int r1 = a.r3d.q(r8, r0)
            r9.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L7b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r8.next()
            a.ql5 r1 = (a.ql5) r1
            a.wxs0 r2 = new a.wxs0
            long r3 = r1.f28916a
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = r1.m
            double r5 = r1.b
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.String r1 = r1.f
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r5, r1}
            r4 = 3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String r4 = "%1$s (%2$.2f %3$s)"
            java.lang.String.format(r3, r4, r1)
            r2.<init>(r0)
            r9.add(r2)
            goto L7b
        Lae:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p4u.e(a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(int i, int i2, zje zjeVar) {
        aru aruVar;
        if (zjeVar instanceof aru) {
            aruVar = (aru) zjeVar;
            int i3 = aruVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aruVar.l = i3 - Integer.MIN_VALUE;
            } else {
                aruVar = new aru(this, zjeVar);
            }
        } else {
            aruVar = new aru(this, zjeVar);
        }
        Object objE = aruVar.j;
        wne wneVar = wne.f39444a;
        int i4 = aruVar.l;
        if (i4 == 0) {
            z1x.P(objE);
            uqe uqeVar = (uqe) this.f26374a;
            aruVar.i = i2;
            aruVar.l = 1;
            objE = uqeVar.e(i, aruVar);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = aruVar.i;
            z1x.P(objE);
        }
        Iterable iterable = (Iterable) objE;
        ArrayList<rue0> arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(x1x.T((glt) it.next(), uue0.b, i2));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (rue0 rue0VarA : arrayList) {
            if (rue0VarA.c) {
                rue0VarA = rue0.a(rue0VarA);
            }
            arrayList2.add(rue0VarA);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (arrayList3.size() > 1) {
            v3d.t(new vvt((byte) 22), arrayList3);
        }
        if (arrayList3.size() > 1) {
            v3d.t(new vvt((byte) 23), arrayList3);
        }
        if (arrayList3.isEmpty()) {
            return arrayList3;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (((rue0) it2.next()).e) {
                Iterator it3 = arrayList3.iterator();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i6 = -1;
                        break;
                    }
                    if (((rue0) it3.next()).e) {
                        break;
                    }
                    i6++;
                }
                if (i6 != -1) {
                    arrayList3.add(i6, new rue0(0L, null, false, null, true, 207));
                }
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    if (!((rue0) it4.next()).e) {
                        break;
                    }
                    i5++;
                }
                if (i5 != -1) {
                    arrayList3.add(i5, new rue0(0L, null, false, null, false, 207));
                }
                return CollectionsKt.L0(arrayList3);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(int i, zje zjeVar, String str) {
        x5u x5uVar;
        if (zjeVar instanceof x5u) {
            x5uVar = (x5u) zjeVar;
            int i2 = x5uVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x5uVar.k = i2 - Integer.MIN_VALUE;
            } else {
                x5uVar = new x5u(this, zjeVar);
            }
        } else {
            x5uVar = new x5u(this, zjeVar);
        }
        Object objK = x5uVar.i;
        wne wneVar = wne.f39444a;
        int i3 = x5uVar.k;
        if (i3 == 0) {
            z1x.P(objK);
            z220 z220Var = (z220) this.f26374a;
            x5uVar.k = 1;
            objK = z220Var.k(i, x5uVar, str, false);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        deb debVar = ((kgb) objK).c;
        List list = debVar != null ? debVar.b : null;
        return list == null ? iun.f15405a : list;
    }

    public /* synthetic */ p4u(Object obj) {
        this.f26374a = obj;
    }

    public p4u(xs70 xs70Var) {
        xs70Var.getClass();
        this.f26374a = xs70Var;
    }

    public p4u(fx7 fx7Var) {
        fx7Var.getClass();
        this.f26374a = fx7Var;
    }

    public p4u(qi10 qi10Var) {
        qi10Var.getClass();
        this.f26374a = qi10Var;
    }
}
