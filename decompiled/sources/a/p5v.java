package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class p5v extends bnn0 implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ boolean B;
    public mie0 i;
    public mie0 j;
    public List k;
    public List l;
    public kzj m;
    public List n;
    public List o;
    public int p;
    public int q;
    public byte r;
    public /* synthetic */ Object s;
    public final /* synthetic */ dgu t;
    public final /* synthetic */ ArrayList u;
    public final /* synthetic */ ArrayList v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5v(dgu dguVar, ArrayList arrayList, ArrayList arrayList2, boolean z, int i, long j, long j2, String str, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.t = dguVar;
        this.u = arrayList;
        this.v = arrayList2;
        this.w = z;
        this.x = i;
        this.y = j;
        this.z = j2;
        this.A = str;
        this.B = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        p5v p5vVar = new p5v(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, yjeVar);
        p5vVar.s = obj;
        return p5vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p5v) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0155  */
    /* JADX WARN: Code duplicated, block: B:53:0x016c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0173  */
    /* JADX WARN: Code duplicated, block: B:59:0x0178  */
    /* JADX WARN: Code duplicated, block: B:62:0x018d A[LOOP:1: B:60:0x0187->B:62:0x018d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bf A[PHI: r1 r4 r5 r6 r7 r8 r9
  0x01bf: PHI (r1v19 java.util.List) = (r1v17 java.util.List), (r1v22 java.util.List) binds: [B:58:0x0176, B:67:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x01bf: PHI (r4v8 a.wne) = (r4v6 a.wne), (r4v9 a.wne) binds: [B:58:0x0176, B:67:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x01bf: PHI (r5v9 java.util.List) = (r5v8 java.util.List), (r5v10 java.util.List) binds: [B:58:0x0176, B:67:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x01bf: PHI (r6v9 int) = (r6v6 int), (r6v12 int) binds: [B:58:0x0176, B:67:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x01bf: PHI (r7v8 int) = (r7v5 int), (r7v10 int) binds: [B:58:0x0176, B:67:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x01bf: PHI (r8v10 java.util.List) = (r8v9 java.util.List), (r8v11 java.util.List) binds: [B:58:0x0176, B:67:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x01bf: PHI (r9v5 a.mie0) = (r9v4 a.mie0), (r9v8 a.mie0) binds: [B:58:0x0176, B:67:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d8 A[LOOP:0: B:71:0x01d2->B:73:0x01d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0203  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v4, types: [a.kzj, a.mie0, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v6 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        byte b;
        kzj kzjVar;
        mie0 mie0Var;
        kzj kzjVarM;
        List list;
        Object objA;
        wne wneVar;
        mie0 mie0Var2;
        List list2;
        List list3;
        Object objA2;
        kzj kzjVar2;
        List list4;
        int i;
        ArrayList arrayList;
        Iterator it;
        ?? r13;
        List list5;
        int i2;
        int i3;
        Exception exc;
        ArrayList arrayList2;
        Iterator it2;
        List list6;
        List list7;
        dgu dguVar = this.t;
        ocl oclVar = (ocl) dguVar.d;
        vne vneVar = (vne) this.s;
        wne wneVar2 = wne.f39444a;
        byte b2 = this.r;
        int i4 = 1;
        if (b2 == 0) {
            mie0 mie0VarJ = ohs0.j(obj);
            mie0 mie0Var3 = new mie0();
            txy txyVar = txy.SPORT_LINE;
            rmu0 rmu0Var = (rmu0) oclVar.f25032a;
            rmu0Var.getClass();
            List list8 = rmu0Var.f30761a.contains(txyVar) ? iun.f15405a : this.u;
            txy txyVar2 = txy.SPORT_LIVE;
            rmu0 rmu0Var2 = (rmu0) oclVar.f25032a;
            rmu0Var2.getClass();
            List list9 = rmu0Var2.f30761a.contains(txyVar2) ? iun.f15405a : this.v;
            if (list9.isEmpty() && list8.isEmpty()) {
                return iun.f15405a;
            }
            List list10 = list8;
            b = 3;
            kzjVar = null;
            mie0Var = mie0VarJ;
            kzjVarM = qjj.M(vneVar, null, new u7n(list10, dguVar, this.w, this.x, this.y, this.z, this.A, null), 3);
            list = list9;
            kzj kzjVarM2 = qjj.M(vneVar, null, new n5v(list, dguVar, this.B, this.x, this.y, this.A, null), 3);
            cx2 cx2Var = new cx2(mie0Var, (byte) 4);
            this.s = null;
            this.i = mie0Var;
            this.j = mie0Var3;
            this.k = list10;
            this.l = list;
            this.m = kzjVarM;
            i4 = 1;
            this.r = (byte) 1;
            objA = dguVar.a(kzjVarM2, txyVar2, cx2Var, this);
            wneVar = wneVar2;
            if (objA != wneVar) {
                mie0Var2 = mie0Var3;
                list2 = list10;
            }
            return wneVar;
        }
        if (b2 == 1) {
            kzj kzjVar3 = this.m;
            list = this.l;
            list2 = this.k;
            mie0Var2 = this.j;
            mie0 mie0Var4 = this.i;
            z1x.P(obj);
            kzjVarM = kzjVar3;
            b = 3;
            mie0Var = mie0Var4;
            wneVar = wneVar2;
            objA = obj;
            kzjVar = null;
        } else {
            if (b2 == 2) {
                list3 = this.n;
                list = this.l;
                List list11 = this.k;
                mie0 mie0Var5 = this.j;
                mie0 mie0Var6 = this.i;
                z1x.P(obj);
                b = 3;
                mie0Var = mie0Var6;
                wneVar = wneVar2;
                kzjVar2 = null;
                mie0Var2 = mie0Var5;
                list2 = list11;
                objA2 = obj;
                list4 = (List) objA2;
                if (mie0Var2.f21842a == null || list2.isEmpty()) {
                    i = i4;
                } else {
                    i = 0;
                }
                if (mie0Var.f21842a == null && !list.isEmpty()) {
                    i4 = 0;
                }
                if (i != 0 && i4 != 0) {
                    exc = (Exception) mie0Var.f21842a;
                    if (exc == null) {
                        exc = (Exception) mie0Var2.f21842a;
                    }
                    if (exc != null) {
                        throw exc;
                    }
                }
                if (mie0Var.f21842a == null) {
                    if (mie0Var2.f21842a == null) {
                        arrayList2 = new ArrayList(r3d.q(list4, 10));
                        it2 = list4.iterator();
                        while (it2.hasNext()) {
                            axq.t(((nas) it2.next()).f23205a, arrayList2);
                        }
                        this.s = null;
                        this.i = null;
                        this.j = null;
                        this.k = null;
                        this.l = null;
                        this.m = null;
                        this.n = list3;
                        this.o = list4;
                        this.p = i;
                        this.q = i4;
                        this.r = (byte) 4;
                        if (dguVar.c(arrayList2, list2, this) != wneVar) {
                            list6 = list3;
                            list7 = list4;
                        }
                    }
                    return CollectionsKt.q0(list3, list4);
                }
                arrayList = new ArrayList(r3d.q(list3, 10));
                it = list3.iterator();
                r13 = kzjVar2;
                while (it.hasNext()) {
                    axq.t(((nas) it.next()).f23205a, arrayList);
                    r13 = 0;
                }
                this.s = r13;
                this.i = r13;
                this.j = mie0Var2;
                this.k = list2;
                this.l = r13;
                this.m = r13;
                this.n = list3;
                this.o = list4;
                this.p = i;
                this.q = i4;
                this.r = b;
                if (dguVar.c(arrayList, list, this) != wneVar) {
                    int i5 = i4;
                    list5 = list3;
                    i2 = i5;
                    i3 = i;
                    List list12 = list5;
                    i4 = i2;
                    list3 = list12;
                    i = i3;
                    if (mie0Var2.f21842a == null) {
                        arrayList2 = new ArrayList(r3d.q(list4, 10));
                        it2 = list4.iterator();
                        while (it2.hasNext()) {
                            axq.t(((nas) it2.next()).f23205a, arrayList2);
                        }
                        this.s = null;
                        this.i = null;
                        this.j = null;
                        this.k = null;
                        this.l = null;
                        this.m = null;
                        this.n = list3;
                        this.o = list4;
                        this.p = i;
                        this.q = i4;
                        this.r = (byte) 4;
                        if (dguVar.c(arrayList2, list2, this) != wneVar) {
                            list6 = list3;
                            list7 = list4;
                        }
                    }
                    return CollectionsKt.q0(list3, list4);
                }
                return wneVar;
            }
            if (b2 == 3) {
                i2 = this.q;
                i3 = this.p;
                List list13 = this.o;
                List list14 = this.n;
                List list15 = this.k;
                mie0 mie0Var7 = this.j;
                z1x.P(obj);
                mie0Var2 = mie0Var7;
                list2 = list15;
                list5 = list14;
                list4 = list13;
                wneVar = wneVar2;
                List list16 = list5;
                i4 = i2;
                list3 = list16;
                i = i3;
                if (mie0Var2.f21842a == null) {
                    arrayList2 = new ArrayList(r3d.q(list4, 10));
                    it2 = list4.iterator();
                    while (it2.hasNext()) {
                        axq.t(((nas) it2.next()).f23205a, arrayList2);
                    }
                    this.s = null;
                    this.i = null;
                    this.j = null;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = list3;
                    this.o = list4;
                    this.p = i;
                    this.q = i4;
                    this.r = (byte) 4;
                    if (dguVar.c(arrayList2, list2, this) != wneVar) {
                        list6 = list3;
                        list7 = list4;
                    }
                    return wneVar;
                }
                return CollectionsKt.q0(list3, list4);
            }
            if (b2 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list7 = this.o;
            list6 = this.n;
            z1x.P(obj);
        }
        list4 = list7;
        list3 = list6;
        return CollectionsKt.q0(list3, list4);
        list3 = (List) objA;
        txy txyVar3 = txy.SPORT_LINE;
        cx2 cx2Var2 = new cx2(mie0Var2, (byte) 5);
        this.s = kzjVar;
        this.i = mie0Var;
        this.j = mie0Var2;
        this.k = list2;
        this.l = list;
        this.m = kzjVar;
        this.n = list3;
        this.r = (byte) 2;
        objA2 = dguVar.a(kzjVarM, txyVar3, cx2Var2, this);
        kzjVar2 = kzjVar;
        if (objA2 != wneVar) {
            list4 = (List) objA2;
            if (mie0Var2.f21842a == null) {
                i = i4;
            } else {
                i = i4;
            }
            if (mie0Var.f21842a == null) {
                i4 = 0;
            }
            if (i != 0) {
                exc = (Exception) mie0Var.f21842a;
                if (exc == null) {
                    exc = (Exception) mie0Var2.f21842a;
                }
                if (exc != null) {
                    throw exc;
                }
            }
            if (mie0Var.f21842a == null) {
                if (mie0Var2.f21842a == null) {
                    arrayList2 = new ArrayList(r3d.q(list4, 10));
                    it2 = list4.iterator();
                    while (it2.hasNext()) {
                        axq.t(((nas) it2.next()).f23205a, arrayList2);
                    }
                    this.s = null;
                    this.i = null;
                    this.j = null;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = list3;
                    this.o = list4;
                    this.p = i;
                    this.q = i4;
                    this.r = (byte) 4;
                    if (dguVar.c(arrayList2, list2, this) != wneVar) {
                        list6 = list3;
                        list7 = list4;
                        list4 = list7;
                        list3 = list6;
                    }
                }
                return CollectionsKt.q0(list3, list4);
            }
            arrayList = new ArrayList(r3d.q(list3, 10));
            it = list3.iterator();
            r13 = kzjVar2;
            while (it.hasNext()) {
                axq.t(((nas) it.next()).f23205a, arrayList);
                r13 = 0;
            }
            this.s = r13;
            this.i = r13;
            this.j = mie0Var2;
            this.k = list2;
            this.l = r13;
            this.m = r13;
            this.n = list3;
            this.o = list4;
            this.p = i;
            this.q = i4;
            this.r = b;
            if (dguVar.c(arrayList, list, this) != wneVar) {
                int i6 = i4;
                list5 = list3;
                i2 = i6;
                i3 = i;
                List list17 = list5;
                i4 = i2;
                list3 = list17;
                i = i3;
                if (mie0Var2.f21842a == null) {
                    arrayList2 = new ArrayList(r3d.q(list4, 10));
                    it2 = list4.iterator();
                    while (it2.hasNext()) {
                        axq.t(((nas) it2.next()).f23205a, arrayList2);
                    }
                    this.s = null;
                    this.i = null;
                    this.j = null;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = list3;
                    this.o = list4;
                    this.p = i;
                    this.q = i4;
                    this.r = (byte) 4;
                    if (dguVar.c(arrayList2, list2, this) != wneVar) {
                        list6 = list3;
                        list7 = list4;
                        list4 = list7;
                        list3 = list6;
                    }
                }
                return CollectionsKt.q0(list3, list4);
            }
        }
        return wneVar;
    }
}
