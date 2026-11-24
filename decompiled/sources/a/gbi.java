package a;

import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gbi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11016a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;

    public gbi(hbi hbiVar, xex xexVar) {
        this.f11016a = xexVar;
        byte b = 4;
        this.b = mbl.b(new c7i(hbiVar, this, 2, b));
        this.c = mbl.b(new c7i(hbiVar, this, 1, b));
        this.d = mbl.b(new c7i(hbiVar, this, b, b));
        this.q = new w1k();
        this.r = new w1k();
        this.s = new w1k();
        this.e = mbl.b(new c7i(hbiVar, this, 9, b));
        w1k.a((w1k) this.s, mbl.b(new c7i(hbiVar, this, 8, b)));
        w1k.a((w1k) this.r, mbl.b(new c7i(hbiVar, this, 7, b)));
        this.f = mbl.b(new c7i(hbiVar, this, 10, b));
        this.g = mbl.b(new c7i(hbiVar, this, 11, b));
        this.h = mbl.b(new c7i(hbiVar, this, 6, b));
        this.i = mbl.b(new c7i(hbiVar, this, 5, b));
        w1k.a((w1k) this.q, mbl.b(new c7i(hbiVar, this, 3, b)));
        this.j = mbl.b(new c7i(hbiVar, this, 13, b));
        this.k = mbl.b(new c7i(hbiVar, this, 14, b));
        this.l = mbl.b(new c7i(hbiVar, this, 12, b));
        this.m = mbl.b(new c7i(hbiVar, this, 15, b));
        this.n = mbl.b(new c7i(hbiVar, this, 17, b));
        this.o = mbl.b(new c7i(hbiVar, this, 16, b));
        this.p = mbl.b(new c7i(hbiVar, this, 0, b));
    }

    public static boolean b(String str, String str2) {
        if (Intrinsics.d(str, str2)) {
            return true;
        }
        return kotlin.text.c.x(str, str2, false) && str.length() == 5;
    }

    public vqb A() {
        return new vqb(L());
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2 A[PHI: r2 r4
  0x00e2: PHI (r2v8 java.util.List) = (r2v7 java.util.List), (r2v10 java.util.List) binds: [B:40:0x00df, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r4v6 long) = (r4v5 long), (r4v10 long) binds: [B:40:0x00df, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0112, code lost:
    
        if (r0.g(r1, r11) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(java.util.ArrayList r19, a.gwe r20, long r21, a.zje r23) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gbi.B(java.util.ArrayList, a.gwe, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0244  */
    /* JADX WARN: Code duplicated, block: B:41:0x024a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x029d  */
    /* JADX WARN: Code duplicated, block: B:48:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x02d1 A[LOOP:0: B:55:0x02ba->B:60:0x02d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0308  */
    /* JADX WARN: Code duplicated, block: B:70:0x030b  */
    /* JADX WARN: Code duplicated, block: B:72:0x030f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0340  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x02d5 A[EDGE_INSN: B:82:0x02d5->B:62:0x02d5 BREAK  A[LOOP:0: B:55:0x02ba->B:60:0x02d1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public Object C(ArrayList arrayList, List list, boolean z, double d, long j, double d2, int i, boolean z2, String str, List list2, zje zjeVar) {
        ioi0 ioi0Var;
        List list3;
        String str2;
        List list4;
        boolean z3;
        long j2;
        double d3;
        boolean z4;
        List list5;
        double d4;
        int i2;
        wne wneVar;
        Object obj;
        int i3;
        boolean z5;
        double d5;
        List list6;
        boolean z6;
        double d6;
        String str3;
        List list7;
        long j3;
        List list8;
        double d7;
        int i4;
        Object objL;
        wne wneVar2;
        int i5;
        List list9;
        double d8;
        List list10;
        boolean z7;
        double d9;
        wne wneVar3;
        String strValueOf;
        boolean zIsEmpty;
        String strValueOf2;
        q4f q4fVar;
        List list11;
        String strValueOf3;
        int iA;
        Iterator it;
        Object next;
        q4f q4fVar2;
        boolean z8;
        vit0 vit0Var;
        List list12;
        Iterator it2;
        n0o0 n0o0Var = (n0o0) this.s;
        if (zjeVar instanceof ioi0) {
            ioi0Var = (ioi0) zjeVar;
            int i6 = ioi0Var.u;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                ioi0Var.u = i6 - Integer.MIN_VALUE;
            } else {
                ioi0Var = new ioi0(this, zjeVar);
            }
        } else {
            ioi0Var = new ioi0(this, zjeVar);
        }
        Object obj2 = ioi0Var.s;
        wne wneVar4 = wne.f39444a;
        int i7 = ioi0Var.u;
        if (i7 != 0) {
            if (i7 == 1) {
                boolean z9 = ioi0Var.n;
                i2 = ioi0Var.r;
                double d10 = ioi0Var.p;
                long j4 = ioi0Var.q;
                double d11 = ioi0Var.o;
                boolean z10 = ioi0Var.m;
                List list13 = ioi0Var.l;
                String str4 = ioi0Var.k;
                List list14 = ioi0Var.j;
                list5 = ioi0Var.i;
                z1x.P(obj2);
                d4 = d11;
                z4 = z9;
                list3 = list14;
                list4 = list13;
                str2 = str4;
                d3 = d10;
                z3 = z10;
                j2 = j4;
            } else if (i7 == 2) {
                boolean z11 = ioi0Var.n;
                int i8 = ioi0Var.r;
                d6 = ioi0Var.p;
                long j5 = ioi0Var.q;
                double d12 = ioi0Var.o;
                boolean z12 = ioi0Var.m;
                list8 = ioi0Var.l;
                String str5 = ioi0Var.k;
                list6 = ioi0Var.j;
                list7 = ioi0Var.i;
                z1x.P(obj2);
                i3 = i8;
                obj = obj2;
                z5 = z11;
                d5 = d12;
                wneVar = wneVar4;
                z6 = z12;
                j3 = j5;
                str3 = str5;
                wne wneVar5 = wneVar;
                znt zntVar = (znt) this.j;
                ioi0Var.i = list7;
                ioi0Var.j = list6;
                ioi0Var.k = str3;
                ioi0Var.l = list8;
                ioi0Var.m = z6;
                ioi0Var.o = d5;
                ioi0Var.q = j3;
                ioi0Var.p = d6;
                d7 = d5;
                i4 = i3;
                ioi0Var.r = i4;
                ioi0Var.n = z5;
                ioi0Var.u = 3;
                objL = zntVar.f44690a.L((List) obj, ioi0Var);
                wneVar2 = wneVar5;
                if (objL != wneVar2) {
                    objL = Unit.f46060a;
                }
                if (objL == wneVar2) {
                    return wneVar2;
                }
                i5 = i4;
                list9 = list7;
                d8 = d6;
                list10 = list8;
                z7 = z6;
                d9 = d7;
                r9u r9uVar = (r9u) this.r;
                wneVar3 = wneVar2;
                ygp ygpVar = ygp.J1;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                ArrayList arrayListA = ((xzt) this.h).a(j1q0Var.f15748a.d(ygpVar));
                strValueOf = String.valueOf(i5);
                zIsEmpty = list6.isEmpty();
                q4f q4fVar3 = q4f.e;
                strValueOf2 = String.valueOf(q4fVar3.a());
                q4fVar = q4f.g;
                list11 = list6;
                strValueOf3 = String.valueOf(q4fVar.a());
                if (b(strValueOf, strValueOf2)) {
                    if (b(strValueOf, strValueOf2)) {
                    }
                } else if (b(strValueOf, strValueOf2)) {
                }
                it = arrayListA.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    it2 = it;
                    if (((q4f) next).a() == iA) {
                        break;
                        break;
                    }
                    it = it2;
                }
                q4fVar2 = (q4f) next;
                if (q4fVar2 == null) {
                    q4fVar2 = q4f.d;
                }
                mpc mpcVar = (mpc) this.k;
                int iA2 = q4fVar2.a();
                str3.getClass();
                q7d0 q7d0Var = (q7d0) mpcVar.f22172a.f;
                z8 = z5;
                q7d0Var.g("COUPON_KEY_PREFERENCE", str3);
                q7d0Var.e(iA2, "COUPON_TYPE_KEY_PREFERENCE");
                if (list9.size() == 1) {
                    q4fVar2 = q4f.c;
                } else if (q4fVar2 == q4f.c) {
                    q4fVar2 = q4f.m;
                }
                vit0Var = (vit0) this.i;
                ioi0Var.i = null;
                ioi0Var.j = null;
                ioi0Var.k = null;
                ioi0Var.l = list10;
                ioi0Var.m = z7;
                ioi0Var.o = d9;
                ioi0Var.q = j3;
                ioi0Var.p = d8;
                ioi0Var.r = i5;
                ioi0Var.n = z8;
                ioi0Var.u = 4;
                if (vit0Var.h(q4fVar2, list11, z8, ioi0Var) == wneVar3) {
                    return wneVar3;
                }
                list12 = list10;
            } else if (i7 == 3) {
                boolean z13 = ioi0Var.n;
                int i9 = ioi0Var.r;
                d8 = ioi0Var.p;
                j3 = ioi0Var.q;
                d9 = ioi0Var.o;
                boolean z14 = ioi0Var.m;
                list10 = ioi0Var.l;
                str3 = ioi0Var.k;
                List list15 = ioi0Var.j;
                List list16 = ioi0Var.i;
                z1x.P(obj2);
                z5 = z13;
                i5 = i9;
                z7 = z14;
                list6 = list15;
                wneVar2 = wneVar4;
                list9 = list16;
                r9u r9uVar2 = (r9u) this.r;
                wneVar3 = wneVar2;
                ygp ygpVar2 = ygp.J1;
                r9uVar2.getClass();
                j1q0 j1q0Var2 = r9uVar2.f30104a;
                j1q0Var2.getClass();
                ArrayList arrayListA2 = ((xzt) this.h).a(j1q0Var2.f15748a.d(ygpVar2));
                strValueOf = String.valueOf(i5);
                zIsEmpty = list6.isEmpty();
                q4f q4fVar4 = q4f.e;
                strValueOf2 = String.valueOf(q4fVar4.a());
                q4fVar = q4f.g;
                list11 = list6;
                strValueOf3 = String.valueOf(q4fVar.a());
                if (b(strValueOf, strValueOf2) || !zIsEmpty) {
                    iA = ((b(strValueOf, strValueOf2) || zIsEmpty) && !b(strValueOf, strValueOf3)) ? i5 : q4fVar.a();
                } else {
                    iA = q4fVar4.a();
                }
                it = arrayListA2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    it2 = it;
                    if (((q4f) next).a() == iA) {
                        break;
                    }
                    it = it2;
                }
                q4fVar2 = (q4f) next;
                if (q4fVar2 == null && (q4fVar2 = (q4f) CollectionsKt.firstOrNull(arrayListA2)) == null) {
                    q4fVar2 = q4f.d;
                }
                mpc mpcVar2 = (mpc) this.k;
                int iA3 = q4fVar2.a();
                str3.getClass();
                q7d0 q7d0Var2 = (q7d0) mpcVar2.f22172a.f;
                z8 = z5;
                q7d0Var2.g("COUPON_KEY_PREFERENCE", str3);
                q7d0Var2.e(iA3, "COUPON_TYPE_KEY_PREFERENCE");
                if (list9.size() == 1) {
                    q4fVar2 = q4f.c;
                } else if (q4fVar2 == q4f.c && list9.size() > 1) {
                    q4fVar2 = q4f.m;
                }
                vit0Var = (vit0) this.i;
                ioi0Var.i = null;
                ioi0Var.j = null;
                ioi0Var.k = null;
                ioi0Var.l = list10;
                ioi0Var.m = z7;
                ioi0Var.o = d9;
                ioi0Var.q = j3;
                ioi0Var.p = d8;
                ioi0Var.r = i5;
                ioi0Var.n = z8;
                ioi0Var.u = 4;
                if (vit0Var.h(q4fVar2, list11, z8, ioi0Var) == wneVar3) {
                    return wneVar3;
                }
                list12 = list10;
            } else {
                if (i7 != 4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = ioi0Var.r;
                list12 = ioi0Var.l;
                z1x.P(obj2);
            }
            ((lye) ((gs) this.m).f11805a.f10647a).g = Integer.valueOf(i5);
            ((jtt) this.o).a(list12);
            return Unit.f46060a;
        }
        z1x.P(obj2);
        ((lye) ((j9c) this.n).f16131a.f10647a).g = null;
        jtj jtjVar = (jtj) this.l;
        ioi0Var.i = arrayList;
        list3 = list;
        ioi0Var.j = list3;
        str2 = str;
        ioi0Var.k = str2;
        list4 = list2;
        ioi0Var.l = list4;
        z3 = z;
        ioi0Var.m = z3;
        ioi0Var.o = d;
        j2 = j;
        ioi0Var.q = j2;
        d3 = d2;
        ioi0Var.p = d3;
        ioi0Var.r = i;
        ioi0Var.n = z2;
        ioi0Var.u = 1;
        if (jtjVar.k(ioi0Var) == wneVar4) {
            return wneVar4;
        }
        z4 = z2;
        list5 = arrayList;
        d4 = d;
        i2 = i;
        ((mpc) this.d).f22172a.h0(j2);
        ((lye) ((ni9) this.e).f23572a.f10647a).getClass();
        lye lyeVar = (lye) ((ert) this.f).f8297a.f10647a;
        double d13 = d3;
        double d14 = d4;
        lyeVar.f20858a = g0f.a(lyeVar.f20858a, 0L, null, 0.0d, null, d4, 0L, 0.0d, 0.0d, false, 0.0d, false, 0, null, false, 0, null, null, 0.0d, 0.0d, false, 1048559);
        lye lyeVar2 = (lye) ((moi0) this.g).f22136a.b;
        int i10 = i2;
        lyeVar2.f20858a = g0f.a(lyeVar2.f20858a, 0L, null, 0.0d, null, 0.0d, 0L, 0.0d, d13, false, 0.0d, false, 0, null, false, 0, null, null, 0.0d, 0.0d, false, 1048447);
        gr00 gr00Var = (gr00) this.f11016a;
        gwe gweVar = gwe.LOAD_COUPON;
        boolean z15 = ((sff0) n0o0Var.getValue()).J1;
        boolean z16 = ((yiu) this.b).a() || ((sff0) n0o0Var.getValue()).O1;
        ioi0Var.i = list5;
        ioi0Var.j = list3;
        ioi0Var.k = str2;
        ioi0Var.l = list4;
        ioi0Var.m = z3;
        ioi0Var.o = d14;
        ioi0Var.q = j2;
        ioi0Var.p = d13;
        List list17 = list5;
        ioi0Var.r = i10;
        ioi0Var.n = z4;
        ioi0Var.u = 2;
        Serializable serializableY = gr00Var.y(list17, j2, gweVar, z15, z16, ioi0Var);
        wneVar = wneVar4;
        if (serializableY == wneVar) {
            return wneVar;
        }
        obj = serializableY;
        i3 = i10;
        z5 = z4;
        d5 = d14;
        list6 = list3;
        z6 = z3;
        d6 = d13;
        str3 = str2;
        list7 = list17;
        j3 = j2;
        list8 = list4;
        wne wneVar6 = wneVar;
        znt zntVar2 = (znt) this.j;
        ioi0Var.i = list7;
        ioi0Var.j = list6;
        ioi0Var.k = str3;
        ioi0Var.l = list8;
        ioi0Var.m = z6;
        ioi0Var.o = d5;
        ioi0Var.q = j3;
        ioi0Var.p = d6;
        d7 = d5;
        i4 = i3;
        ioi0Var.r = i4;
        ioi0Var.n = z5;
        ioi0Var.u = 3;
        objL = zntVar2.f44690a.L((List) obj, ioi0Var);
        wneVar2 = wneVar6;
        if (objL != wneVar2) {
            objL = Unit.f46060a;
        }
        if (objL == wneVar2) {
            return wneVar2;
        }
        i5 = i4;
        list9 = list7;
        d8 = d6;
        list10 = list8;
        z7 = z6;
        d9 = d7;
        r9u r9uVar3 = (r9u) this.r;
        wneVar3 = wneVar2;
        ygp ygpVar3 = ygp.J1;
        r9uVar3.getClass();
        j1q0 j1q0Var3 = r9uVar3.f30104a;
        j1q0Var3.getClass();
        ArrayList arrayListA3 = ((xzt) this.h).a(j1q0Var3.f15748a.d(ygpVar3));
        strValueOf = String.valueOf(i5);
        zIsEmpty = list6.isEmpty();
        q4f q4fVar5 = q4f.e;
        strValueOf2 = String.valueOf(q4fVar5.a());
        q4fVar = q4f.g;
        list11 = list6;
        strValueOf3 = String.valueOf(q4fVar.a());
        if (b(strValueOf, strValueOf2)) {
            if (b(strValueOf, strValueOf2)) {
            }
        } else if (b(strValueOf, strValueOf2)) {
        }
        it = arrayListA3.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            it2 = it;
            if (((q4f) next).a() == iA) {
                break;
                break;
            }
            it = it2;
        }
        q4fVar2 = (q4f) next;
        if (q4fVar2 == null) {
            q4fVar2 = q4f.d;
        }
        mpc mpcVar3 = (mpc) this.k;
        int iA4 = q4fVar2.a();
        str3.getClass();
        q7d0 q7d0Var3 = (q7d0) mpcVar3.f22172a.f;
        z8 = z5;
        q7d0Var3.g("COUPON_KEY_PREFERENCE", str3);
        q7d0Var3.e(iA4, "COUPON_TYPE_KEY_PREFERENCE");
        if (list9.size() == 1) {
            q4fVar2 = q4f.c;
        } else if (q4fVar2 == q4f.c) {
            q4fVar2 = q4f.m;
        }
        vit0Var = (vit0) this.i;
        ioi0Var.i = null;
        ioi0Var.j = null;
        ioi0Var.k = null;
        ioi0Var.l = list10;
        ioi0Var.m = z7;
        ioi0Var.o = d9;
        ioi0Var.q = j3;
        ioi0Var.p = d8;
        ioi0Var.r = i5;
        ioi0Var.n = z8;
        ioi0Var.u = 4;
        if (vit0Var.h(q4fVar2, list11, z8, ioi0Var) == wneVar3) {
            return wneVar3;
        }
        list12 = list10;
        ((lye) ((gs) this.m).f11805a.f10647a).g = Integer.valueOf(i5);
        ((jtt) this.o).a(list12);
        return Unit.f46060a;
    }

    public void D(fk60 fk60Var) {
        fk60Var.getClass();
        int iOrdinal = fk60Var.ordinal();
        if (iOrdinal == 0) {
            rdj0 rdj0Var = ((ilj) this.k).f14982a;
            q7d0 q7d0Var = rdj0Var.f30295a;
            q7d0Var.getClass();
            rdj0Var.f30295a.e(q7d0Var.a().getInt("SETTINGS_TIPS_SHOWED", 0) - 1, "SETTINGS_TIPS_SHOWED");
            return;
        }
        if (iOrdinal == 1) {
            wt6 wt6Var = ((flj) this.f11016a).f9741a;
            q7d0 q7d0Var2 = wt6Var.f39724a;
            q7d0Var2.getClass();
            wt6Var.f39724a.e(q7d0Var2.a().getInt("BET_CONSTRUCTOR_TIPS_SHOWED", 0) - 1, "BET_CONSTRUCTOR_TIPS_SHOWED");
            return;
        }
        if (iOrdinal == 3) {
            i4f i4fVar = ((j4f) this.b).f15881a;
            q7d0 q7d0Var3 = i4fVar.f14143a;
            q7d0Var3.getClass();
            i4fVar.f14143a.e(q7d0Var3.a().getInt("COUPON_TIPS_SHOWED", 0) - 1, "COUPON_TIPS_SHOWED");
            return;
        }
        if (iOrdinal == 4) {
            q7d0 q7d0Var4 = ((g0h) ((prc) this.c).b).f10459a;
            q7d0Var4.getClass();
            q7d0Var4.e(q7d0Var4.a().getInt("TIPS_CYBER_GAMES_SHOWED", 0) - 1, "TIPS_CYBER_GAMES_SHOWED");
            return;
        }
        if (iOrdinal == 5) {
            q7d0 q7d0Var5 = ((hlj) this.j).f13263a.f20548a;
            q7d0Var5.getClass();
            q7d0Var5.e(q7d0Var5.a().getInt("TIPS_GAMES_SHOWED_v3", 0) - 1, "TIPS_GAMES_SHOWED_v3");
            return;
        }
        if (iOrdinal == 6) {
            q7d0 q7d0Var6 = (q7d0) ((jlj) this.l).f16721a.b;
            q7d0Var6.getClass();
            q7d0Var6.e(q7d0Var6.a().getInt("TIPS_GAMES_SHOWED", 0) - 1, "TIPS_GAMES_SHOWED");
            return;
        }
        if (iOrdinal == 26) {
            q7d0 q7d0Var7 = ((x4p0) ((yqc) this.s).b).f40279a;
            q7d0Var7.getClass();
            q7d0Var7.e(q7d0Var7.a().getInt("TIPS_TEAM_BET_SHOWED", 0) - 1, "TIPS_TEAM_BET_SHOWED");
            return;
        }
        switch (iOrdinal) {
            case 10:
                v650 v650Var = (v650) ((rrc) this.m).b;
                v650Var.f36857a.e(v650Var.a() - 1, "TIPS_MY_AGGREGATOR_SHOWED");
                break;
            case 11:
                mp1 mp1Var = (mp1) ((lrc) this.n).b;
                mp1Var.f22155a.e(mp1Var.a() - 1, "TIPS_AGGREGATOR_SLOTS_SHOWED");
                break;
            case 12:
                rh00 rh00Var = (rh00) ((a1d) this.o).b;
                rh00Var.f30464a.e(rh00Var.a() - 1, "TIPS_LIVE_AGGREGATOR_SHOWED");
                break;
            case 13:
                xf1 xf1Var = (xf1) ((clc) this.p).b;
                xf1Var.f40769a.e(xf1Var.a() - 1, "TIPS_AGGREGATOR_PROMO_SHOWED");
                break;
            case 14:
                iz1 iz1Var = (iz1) ((vqc) this.q).b;
                iz1Var.f15613a.e(iz1Var.a() - 1, "TIPS_AGGREGATOR_TOURNAMENTS_SHOWED");
                break;
            case 15:
                q7d0 q7d0Var8 = ((uur0) ((clc) this.r).b).b;
                q7d0Var8.getClass();
                q7d0Var8.e(q7d0Var8.a().getInt("TOTO_TIPS_SHOWED", 0) - 1, "TOTO_TIPS_SHOWED");
                break;
            default:
                switch (iOrdinal) {
                    case 17:
                        q7d0 q7d0Var9 = ((aog) ((psc) this.d).b).f1199a;
                        q7d0Var9.getClass();
                        q7d0Var9.e(q7d0Var9.a().getInt("TIPS_CYBER_EVENT_SHOWED", 0) - 1, "TIPS_CYBER_EVENT_SHOWED");
                        break;
                    case 18:
                        q7d0 q7d0Var10 = ((glj) this.e).f11493a.f27286a;
                        q7d0Var10.getClass();
                        q7d0Var10.e(q7d0Var10.a().getInt("TIPS_CYBER_TOURNAMENT_SHOWED", 0) - 1, "TIPS_CYBER_TOURNAMENT_SHOWED");
                        break;
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        q7d0 q7d0Var11 = ((qhh) ((lrc) this.f).b).f28738a;
                        q7d0Var11.getClass();
                        q7d0Var11.e(q7d0Var11.a().getInt("TIPS_CYBER_TEAM_SHOWED", 0) - 1, "TIPS_CYBER_TEAM_SHOWED");
                        break;
                    case 20:
                        q7d0 q7d0Var12 = ((vah) this.g).f37087a.f35328a;
                        q7d0Var12.getClass();
                        q7d0Var12.e(q7d0Var12.a().getInt("TIPS_CYBER_PROMO_SHOWED", 0) - 1, "TIPS_CYBER_PROMO_SHOWED");
                        break;
                    case 21:
                        q7d0 q7d0Var13 = ((mag) this.h).f21455a.f23189a;
                        q7d0Var13.getClass();
                        q7d0Var13.e(q7d0Var13.a().getInt("TIPS_CYBER_CALENDAR_SHOWED", 0) - 1, "TIPS_CYBER_CALENDAR_SHOWED");
                        break;
                    case 22:
                        q7d0 q7d0Var14 = ((bah) ((yqc) this.i).b).f2256a;
                        q7d0Var14.getClass();
                        q7d0Var14.e(q7d0Var14.a().getInt("TIPS_CYBER_PARTNERS_SHOWED", 0) - 1, "TIPS_CYBER_PARTNERS_SHOWED");
                        break;
                }
                break;
        }
    }

    public dgu E() {
        mne mneVarH = ((psc) ((cad) this.g).b).h();
        x1x.x(mneVarH);
        return new dgu(mneVarH, new u8u((gii0) this.o, (byte) 27), (izy) ((n5d0) this.b).get(), (knf0) this.p);
    }

    public g090 F() {
        d190 d190Var = (d190) this.i;
        mne mneVar = (mne) this.j;
        d190Var.getClass();
        g090 g090Var = new g090();
        g090Var.f10448a = d190Var;
        g090Var.b = mneVar;
        return g090Var;
    }

    public n660 G() {
        j910 j910Var = new j910((gii0) this.b, (byte) 11);
        knf0 knf0Var = (knf0) this.c;
        at4 at4Var = (at4) this.h;
        btt0 btt0Var = (btt0) this.d;
        knf0Var.getClass();
        at4Var.getClass();
        btt0Var.getClass();
        n660 n660Var = new n660();
        n660Var.f22981a = j910Var;
        n660Var.b = knf0Var;
        n660Var.c = at4Var;
        n660Var.d = btt0Var;
        return n660Var;
    }

    public gyg0 H() {
        return (gyg0) ((n5d0) this.g).get();
    }

    public nyg0 I() {
        return (nyg0) ((n5d0) this.h).get();
    }

    public n660 J() {
        o470 o470Var = new o470((gii0) this.b, (byte) 19);
        knf0 knf0Var = (knf0) this.c;
        btt0 btt0Var = (btt0) this.d;
        hmh0 hmh0Var = (hmh0) this.e;
        knf0Var.getClass();
        btt0Var.getClass();
        hmh0Var.getClass();
        n660 n660Var = new n660();
        n660Var.f22981a = o470Var;
        n660Var.b = knf0Var;
        n660Var.c = btt0Var;
        n660Var.d = hmh0Var;
        return n660Var;
    }

    public z220 K() {
        return new z220((esh0) this.f, new msh0((gii0) this.b, (byte) 0), (knf0) this.c, (btt0) this.d);
    }

    public kd30 L() {
        gii0 gii0Var = (gii0) this.b;
        btt0 btt0Var = (btt0) this.d;
        gii0Var.getClass();
        btt0Var.getClass();
        kd30 kd30Var = new kd30();
        kd30Var.f18086a = btt0Var;
        kd30Var.b = new rta0(gii0Var, (byte) 27);
        return kd30Var;
    }

    public f5c a() {
        return new f5c(L());
    }

    public wpt c() {
        return new wpt(K());
    }

    public mii0 d() {
        bot botVar = (bot) this.l;
        kpt kptVar = (kpt) this.m;
        fsd fsdVar = (fsd) this.o;
        return new mii0((Object) botVar, (Object) kptVar, (Object) new czt(fsdVar, (byte) 1), (Object) new bzt(fsdVar), (byte) 16);
    }

    public n5c e() {
        return new n5c(L());
    }

    public upc f() {
        return (upc) ((n5d0) this.e).get();
    }

    public jrc g() {
        return new jrc(F());
    }

    public ocl h() {
        return new ocl(F());
    }

    public joc i() {
        return new joc(F());
    }

    public x7u j() {
        return (x7u) ((n5d0) this.d).get();
    }

    public v7i k() {
        h9c h9cVarF = ((sue) this.f11016a).f();
        x1x.x(h9cVarF);
        return new v7i(h9cVarF, (qj9) this.i, (m0o0) this.j, (peg0) this.k, (x9s) ((n5d0) this.c).get(), (sjl0) this.l, (nvu) this.m, (edo) this.n, (ulk) this.o, (zfo) this.p, (gst0) this.q, (ehf0) this.r, (j1q0) this.s);
    }

    public joc l() {
        return new joc(F());
    }

    public jrc m() {
        return new jrc(F());
    }

    public joc n() {
        return new joc(F());
    }

    public e0c o() {
        return new e0c(G());
    }

    public kou p() {
        return (kou) ((n5d0) this.f).get();
    }

    public mxg0 q() {
        return new mxg0(F());
    }

    public zx10 r() {
        return new zx10(new dpi0((at4) this.h));
    }

    public nv20 s() {
        return new nv20(new dpi0((at4) this.h));
    }

    public phf0 t() {
        return new phf0(new zlt0(this.p, (byte) 2), (rou) this.q, K());
    }

    public jof0 u() {
        z220 z220VarK = K();
        dpx dpxVarC = ((y58) this.k).c();
        x1x.x(dpxVarC);
        return new jof0(z220VarK, dpxVarC);
    }

    public wpt v() {
        return new wpt(K());
    }

    public tsu w() {
        return new tsu(K());
    }

    public iw20 x() {
        pru pruVarR = ((uii) ((iw20) this.f11016a).f15470a).r();
        iw20 iw20Var = new iw20();
        iw20Var.f15470a = pruVarR;
        return iw20Var;
    }

    public n5c y() {
        return new n5c(L());
    }

    public mxg0 z() {
        return new mxg0(F());
    }

    public gbi(flj fljVar, j4f j4fVar, prc prcVar, psc pscVar, glj gljVar, lrc lrcVar, vah vahVar, mag magVar, yqc yqcVar, hlj hljVar, ilj iljVar, jlj jljVar, rrc rrcVar, lrc lrcVar2, a1d a1dVar, clc clcVar, vqc vqcVar, clc clcVar2, yqc yqcVar2) {
        this.f11016a = fljVar;
        this.b = j4fVar;
        this.c = prcVar;
        this.d = pscVar;
        this.e = gljVar;
        this.f = lrcVar;
        this.g = vahVar;
        this.h = magVar;
        this.i = yqcVar;
        this.j = hljVar;
        this.k = iljVar;
        this.l = jljVar;
        this.m = rrcVar;
        this.n = lrcVar2;
        this.o = a1dVar;
        this.p = clcVar;
        this.q = vqcVar;
        this.r = clcVar2;
        this.s = yqcVar2;
    }

    public gbi(pru pruVar, mne mneVar, sa10 sa10Var, g2v g2vVar, duj dujVar, ctf0 ctf0Var, m1e m1eVar, zlt0 zlt0Var, bzt bztVar, jh70 jh70Var, qgd qgdVar, cyh cyhVar, z4w0 z4w0Var, zg zgVar, vd1 vd1Var, hfk0 hfk0Var, vd1 vd1Var2, btt0 btt0Var, rou rouVar, ii iiVar, esh0 esh0Var, qu quVar, wdk0 wdk0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        btt0Var.getClass();
        iiVar.getClass();
        esh0Var.getClass();
        wdk0Var.getClass();
        this.f11016a = pruVar;
        this.b = mneVar;
        this.c = g2vVar;
        this.d = dujVar;
        this.e = ctf0Var;
        this.f = m1eVar;
        this.g = zlt0Var;
        this.h = bztVar;
        this.i = jh70Var;
        this.j = qgdVar;
        this.k = cyhVar;
        this.l = z4w0Var;
        this.m = zgVar;
        this.n = vd1Var;
        this.o = vd1Var2;
        this.p = rouVar;
        this.q = iiVar;
        this.r = quVar;
        this.s = wdk0Var;
    }

    public gbi(htz htzVar, mne mneVar, gii0 gii0Var, btt0 btt0Var, ctf0 ctf0Var, i1w0 i1w0Var, Integer num, duj dujVar, ii iiVar, kwz kwzVar, njo njoVar, ocl oclVar) {
        this.f11016a = num;
        this.j = htzVar;
        this.k = gii0Var;
        this.l = kwzVar;
        this.m = njoVar;
        this.n = btt0Var;
        this.o = ctf0Var;
        this.p = i1w0Var;
        this.q = dujVar;
        this.r = mneVar;
        this.s = oclVar;
        byte b = 12;
        this.b = mbl.b(new dci(this, 3, b));
        this.c = mbl.b(new dci(this, 2, b));
        this.d = mbl.b(new dci(this, 1, b));
        this.e = mbl.b(new dci(this, 6, b));
        this.f = mbl.b(new dci(this, 5, b));
        this.g = mbl.b(new dci(this, 4, b));
        this.h = mbl.b(new dci(this, 7, b));
        this.i = n0k0.a(new dci(this, 0, b));
    }

    public gbi(wsz wszVar, cad cadVar, i1w0 i1w0Var, ocl oclVar, duj dujVar, btt0 btt0Var, ctf0 ctf0Var, gii0 gii0Var, kuy kuyVar, ii iiVar, e400 e400Var, rou rouVar, drm0 drm0Var, evz evzVar, sek sekVar) {
        this.f11016a = i1w0Var;
        this.g = ctf0Var;
        this.h = dujVar;
        this.i = wszVar;
        this.j = gii0Var;
        this.k = btt0Var;
        this.l = e400Var;
        this.m = cadVar;
        this.n = kuyVar;
        this.o = rouVar;
        this.p = drm0Var;
        this.q = sekVar;
        this.r = oclVar;
        this.s = evzVar;
        byte b = 4;
        this.b = mbl.b(new psi(this, 3, b));
        this.c = mbl.b(new psi(this, 2, b));
        this.d = mbl.b(new psi(this, 1, b));
        this.e = mbl.b(new psi(this, b, b));
        this.f = n0k0.a(new psi(this, 0, b));
    }

    public gbi(sue sueVar, qj9 qj9Var, m0o0 m0o0Var, peg0 peg0Var, sjl0 sjl0Var, edo edoVar, zfo zfoVar, ulk ulkVar, gst0 gst0Var, ehf0 ehf0Var, nvu nvuVar, j1q0 j1q0Var) {
        this.f11016a = sueVar;
        this.i = qj9Var;
        this.j = m0o0Var;
        this.k = peg0Var;
        this.l = sjl0Var;
        this.m = nvuVar;
        this.n = edoVar;
        this.o = ulkVar;
        this.p = zfoVar;
        this.q = gst0Var;
        this.r = ehf0Var;
        this.s = j1q0Var;
        byte b = 24;
        this.b = mbl.b(new dci(this, 1, b));
        this.c = mbl.b(new dci(this, 0, b));
        this.d = mbl.b(new dci(this, 2, b));
        this.e = mbl.b(new dci(this, 3, b));
        this.f = mbl.b(new dci(this, 4, b));
        this.g = mbl.b(new dci(this, 5, b));
        this.h = mbl.b(new dci(this, 6, b));
    }

    public gbi(cad cadVar, wsf0 wsf0Var, lrc lrcVar, poq0 poq0Var, eld0 eld0Var, duj dujVar, m1e m1eVar, b4j b4jVar, peg0 peg0Var, ix0 ix0Var, knf0 knf0Var, btt0 btt0Var, gii0 gii0Var, wdk0 wdk0Var, b4j b4jVar2, je jeVar, kc60 kc60Var, pru pruVar, i1w0 i1w0Var, ctf0 ctf0Var) {
        this.f11016a = lrcVar;
        this.c = eld0Var;
        this.d = gii0Var;
        this.e = knf0Var;
        this.f = btt0Var;
        this.g = wsf0Var;
        this.h = cadVar;
        this.i = i1w0Var;
        this.j = dujVar;
        this.k = m1eVar;
        this.l = b4jVar;
        this.m = ctf0Var;
        this.n = ix0Var;
        this.o = peg0Var;
        this.p = b4jVar2;
        this.q = jeVar;
        this.r = kc60Var;
        this.s = pruVar;
        this.b = n0k0.a(new eni(this, (byte) 29));
    }

    public gbi(ii iiVar, kt2 kt2Var, qgd qgdVar, m1e m1eVar, mne mneVar, cyh cyhVar, duj dujVar, sek sekVar, d1p d1pVar, rpt rptVar, ort ortVar, lbu lbuVar, rou rouVar, pru pruVar, g2v g2vVar, onv onvVar, mi70 mi70Var, ctf0 ctf0Var, wdk0 wdk0Var, z4w0 z4w0Var) {
        this.f11016a = onvVar;
        this.c = pruVar;
        this.d = lbuVar;
        this.e = qgdVar;
        this.f = kt2Var;
        this.g = m1eVar;
        this.h = g2vVar;
        this.i = cyhVar;
        this.j = d1pVar;
        this.k = z4w0Var;
        this.l = ortVar;
        this.m = mneVar;
        this.n = dujVar;
        this.o = ctf0Var;
        this.p = rouVar;
        this.q = sekVar;
        this.r = mi70Var;
        this.s = rptVar;
        this.b = n0k0.a(new rki(this, (byte) 0));
    }

    public gbi(cad cadVar, pmi0 pmi0Var, roi0 roi0Var, r9u r9uVar, pru pruVar, gii0 gii0Var, String str, m1e m1eVar, uyu uyuVar, Long l, i1w0 i1w0Var, ctf0 ctf0Var, knf0 knf0Var, n3q n3qVar, Integer num, ocl oclVar, wyu wyuVar) {
        this.f11016a = str;
        this.c = l;
        this.d = num;
        this.e = n3qVar;
        this.f = ctf0Var;
        this.g = cadVar;
        this.h = i1w0Var;
        this.i = oclVar;
        this.j = m1eVar;
        this.k = pmi0Var;
        this.l = pruVar;
        this.m = uyuVar;
        this.n = wyuVar;
        this.o = gii0Var;
        this.p = knf0Var;
        this.q = roi0Var;
        this.r = r9uVar;
        byte b = 1;
        this.b = mbl.b(new gji(this, b, b));
        this.s = new gji(this, 0, b);
    }

    public gbi(cad cadVar, pmi0 pmi0Var, i1w0 i1w0Var, pru pruVar, r9u r9uVar, duj dujVar, knf0 knf0Var, gii0 gii0Var, String str, m1e m1eVar, wyu wyuVar, Long l, u58 u58Var, nai naiVar, svs0 svs0Var, kl5 kl5Var, ocl oclVar, uyu uyuVar) {
        this.f11016a = i1w0Var;
        this.b = cadVar;
        this.c = gii0Var;
        this.d = knf0Var;
        this.e = str;
        this.f = l;
        this.g = dujVar;
        this.h = u58Var;
        this.i = oclVar;
        this.j = naiVar;
        this.k = svs0Var;
        this.l = kl5Var;
        this.m = pmi0Var;
        this.n = uyuVar;
        this.o = wyuVar;
        this.p = m1eVar;
        this.q = pruVar;
        this.r = r9uVar;
        this.s = new pai(this, (byte) 10);
    }

    public gbi(iw20 iw20Var, cad cadVar, m1e m1eVar, qu quVar, zrt zrtVar, yo4 yo4Var, x20 x20Var, i1w0 i1w0Var, duj dujVar, wv70 wv70Var, sa10 sa10Var, wdk0 wdk0Var, lyt lytVar, pru pruVar, nyt nytVar, dst dstVar, ctf0 ctf0Var, bzt bztVar) {
        this.f11016a = iw20Var;
        this.b = cadVar;
        this.c = quVar;
        this.d = zrtVar;
        this.e = lytVar;
        this.f = yo4Var;
        this.g = x20Var;
        this.h = m1eVar;
        this.i = i1w0Var;
        this.j = dujVar;
        this.k = sa10Var;
        this.l = pruVar;
        this.m = wv70Var;
        this.n = nytVar;
        this.o = dstVar;
        this.p = bztVar;
        this.q = ctf0Var;
        byte b = 10;
        this.r = new gji(this, 0, b);
        this.s = new gji(this, 1, b);
    }

    public gbi(gr00 gr00Var, yiu yiuVar, vit0 vit0Var, mpc mpcVar, ni9 ni9Var, ert ertVar, moi0 moi0Var, xzt xztVar, vit0 vit0Var2, znt zntVar, mpc mpcVar2, jtj jtjVar, gs gsVar, j9c j9cVar, jtt jttVar, jtt jttVar2, pru pruVar, r9u r9uVar) {
        r9uVar.getClass();
        this.f11016a = gr00Var;
        this.b = yiuVar;
        this.c = vit0Var;
        this.d = mpcVar;
        this.e = ni9Var;
        this.f = ertVar;
        this.g = moi0Var;
        this.h = xztVar;
        this.i = vit0Var2;
        this.j = zntVar;
        this.k = mpcVar2;
        this.l = jtjVar;
        this.m = gsVar;
        this.n = j9cVar;
        this.o = jttVar;
        this.p = jttVar2;
        this.q = pruVar;
        this.r = r9uVar;
        this.s = maz.b(new goi0(this, (byte) 0));
    }

    public gbi(y58 y58Var, iw20 iw20Var, esh0 esh0Var, rou rouVar, mne mneVar, knf0 knf0Var, btt0 btt0Var, gii0 gii0Var, vlk vlkVar, ntu ntuVar, fsd fsdVar, gst0 gst0Var, b3c0 b3c0Var, d190 d190Var, wxs0 wxs0Var, at4 at4Var, bot botVar, kpt kptVar, hmh0 hmh0Var) {
        this.f11016a = iw20Var;
        this.b = gii0Var;
        this.c = knf0Var;
        this.d = btt0Var;
        this.e = hmh0Var;
        this.f = esh0Var;
        this.g = wxs0Var;
        this.h = at4Var;
        this.i = d190Var;
        this.j = mneVar;
        this.k = y58Var;
        this.l = botVar;
        this.m = kptVar;
        this.n = ntuVar;
        this.o = fsdVar;
        this.p = vlkVar;
        this.q = rouVar;
        this.r = gst0Var;
        this.s = b3c0Var;
    }
}
