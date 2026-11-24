package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class atj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ atj(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }

    private final Object l(Object obj) {
        Object g0g0Var;
        f7u f7uVar;
        ieu ieuVar;
        Object objX;
        f7u f7uVar2;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        try {
            if (b == 0) {
                z1x.P(obj);
                f7uVar = (f7u) this.m;
                e0g0 e0g0Var = j0g0.b;
                ieuVar = (ieu) f7uVar.b;
                pmi pmiVar = (pmi) f7uVar.e;
                this.k = f7uVar;
                this.l = ieuVar;
                this.j = (byte) 1;
                objX = pmiVar.x(this);
                if (objX == wneVar) {
                }
                return wneVar;
            }
            if (b == 1) {
                ieuVar = (ieu) this.l;
                f7u f7uVar3 = (f7u) this.k;
                z1x.P(obj);
                objX = obj;
                f7uVar = f7uVar3;
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f7uVar2 = (f7u) this.k;
                z1x.P(obj);
            }
            f7uVar2.getClass();
            g0g0Var = f7u.c((List) obj);
            e0g0 e0g0Var2 = j0g0.b;
            return new j0g0(g0g0Var);
            int iIntValue = ((Number) objX).intValue();
            this.k = f7uVar;
            this.l = null;
            this.j = (byte) 2;
            bzu bzuVar = (bzu) ieuVar.b;
            Serializable serializableB = ((w5z) bzuVar.b).B(((k7u) ieuVar.c).f17841a.b(), iIntValue, this);
            if (serializableB != wneVar) {
                f7u f7uVar4 = f7uVar;
                obj = serializableB;
                f7uVar2 = f7uVar4;
                f7uVar2.getClass();
                g0g0Var = f7u.c((List) obj);
                e0g0 e0g0Var3 = j0g0.b;
                return new j0g0(g0g0Var);
            }
            return wneVar;
        } catch (Throwable th) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:12:0x0025, B:15:0x002d, B:36:0x00a5, B:38:0x00ad, B:41:0x00bc, B:33:0x008e), top: B:52:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:12:0x0025, B:15:0x002d, B:36:0x00a5, B:38:0x00ad, B:41:0x00bc, B:33:0x008e), top: B:52:0x0012 }] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r1.a(r14, r13) == r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
    
        if (r1.a(r14, r13) == r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        if (r1.a(r14, r13) == r2) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.atj.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (r8.c(r0, r7) == r2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.k
            a.xk80 r0 = (a.xk80) r0
            java.lang.Object r1 = r7.l
            a.pz40 r1 = (a.pz40) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r7.j
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L23
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L19
            a.z1x.P(r8)
            goto L67
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L1f:
            a.z1x.P(r8)
            goto L4a
        L23:
            a.z1x.P(r8)
            int r8 = r0.k()
            java.lang.Object r3 = r1.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r8 == r3) goto L4a
            java.lang.Object r8 = r1.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r7.j = r6
            r3 = 6
            java.lang.Object r8 = a.xk80.g(r0, r8, r4, r7, r3)
            if (r8 != r2) goto L4a
            goto L66
        L4a:
            a.s39 r8 = new a.s39
            r3 = 7
            r8.<init>(r0, r3)
            a.vsg0 r8 = a.ydx.V(r4, r8)
            a.clu r0 = new a.clu
            java.lang.Object r3 = r7.m
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r4 = 3
            r0.<init>(r3, r1, r4)
            r7.j = r5
            java.lang.Object r7 = r8.c(r0, r7)
            if (r7 != r2) goto L67
        L66:
            return r2
        L67:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.atj.o(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        n3w n3wVar;
        n3w n3wVar2 = (n3w) this.m;
        naw nawVar = (naw) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b != 0) {
            if (b == 1) {
                z1x.P(obj);
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n3wVar = (n3w) this.k;
                z1x.P(obj);
            }
            td9 td9Var = nawVar.J;
            td9Var.getClass();
            n3wVar.getClass();
            td9Var.h(new y5w(n3wVar, (byte) 1));
            td9Var.f33756a = false;
            td9Var.e = new bp00(false);
            td9Var.h(new umu((byte) 27));
            q37 q37Var = nawVar.l0;
            String str = n3wVar.f22868a;
            boolean z = n3wVar.j1;
            q37Var.getClass();
            str.getClass();
            q37Var.g.a(str, null, z);
            q37Var.h.a(null, Long.parseLong(str), z);
            return Unit.f46060a;
        }
        z1x.P(obj);
        rrc rrcVar = nawVar.F;
        long j = Long.parseLong(n3wVar2.f22868a);
        this.j = (byte) 1;
        if (rrcVar.D(j, this) == wneVar) {
            return wneVar;
        }
        nawVar.Z0.f(new l9w(false));
        n3w n3wVarD = n3w.d(n3wVar2, null, 0.0d, null, null, 0L, null, 0.0d, 0.0d, null, null, null, !n3wVar2.j1, null, null, null, -1, -17);
        this.k = n3wVarD;
        this.j = (byte) 2;
        nawVar = nawVar;
        Object objA = nawVar.n.a(new ctx(true, n3wVarD, nawVar.y0, n3wVarD.g), this);
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        if (objA == wneVar) {
            return wneVar;
        }
        n3wVar = n3wVarD;
        td9 td9Var2 = nawVar.J;
        td9Var2.getClass();
        n3wVar.getClass();
        td9Var2.h(new y5w(n3wVar, (byte) 1));
        td9Var2.f33756a = false;
        td9Var2.e = new bp00(false);
        td9Var2.h(new umu((byte) 27));
        q37 q37Var2 = nawVar.l0;
        String str2 = n3wVar.f22868a;
        boolean z2 = n3wVar.j1;
        q37Var2.getClass();
        str2.getClass();
        q37Var2.g.a(str2, null, z2);
        q37Var2.h.a(null, Long.parseLong(str2), z2);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0068 A[PHI: r5 r14 r15
  0x0068: PHI (r5v1 a.atj) = (r5v2 a.atj), (r5v0 a.atj) binds: [B:14:0x0065, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r14v1 a.vne) = (r14v2 a.vne), (r14v4 a.vne) binds: [B:14:0x0065, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r15v1 a.zsf) = (r15v2 a.zsf), (r15v4 a.zsf) binds: [B:14:0x0065, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        if (a.t33.a((a.t33) r8, r1, r2, null, null, r5, 12) == r7) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:19:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r17) {
        /*
            r16 = this;
            r5 = r16
            java.lang.Object r0 = r5.l
            a.vne r0 = (a.vne) r0
            a.wne r7 = a.wne.f39444a
            byte r1 = r5.j
            java.lang.Object r8 = r5.m
            r9 = 0
            r10 = 800(0x320, float:1.121E-42)
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 1
            r13 = 2
            if (r1 == 0) goto L34
            if (r1 == r12) goto L2a
            if (r1 != r13) goto L23
            java.lang.Object r1 = r5.k
            a.zsf r1 = (a.zsf) r1
            a.z1x.P(r17)
            r14 = r0
            r15 = r1
            goto L85
        L23:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            r0 = 0
            return r0
        L2a:
            java.lang.Object r1 = r5.k
            a.zsf r1 = (a.zsf) r1
            a.z1x.P(r17)
            r14 = r0
            r15 = r1
            goto L68
        L34:
            a.z1x.P(r17)
            a.zsf r1 = new a.zsf
            r2 = 1058306785(0x3f147ae1, float:0.58)
            r3 = 0
            r1.<init>(r3, r3, r2, r11)
            r14 = r0
            r15 = r1
        L42:
            boolean r0 = a.d5c.R(r14)
            if (r0 == 0) goto L88
            r0 = r8
            a.t33 r0 = (a.t33) r0
            java.lang.Float r1 = new java.lang.Float
            r2 = 1066751317(0x3f955555, float:1.1666666)
            r1.<init>(r2)
            a.uts0 r2 = a.ro4.m0(r10, r9, r15, r13)
            r5.l = r14
            r5.k = r15
            r5.j = r12
            r3 = 0
            r4 = 0
            r6 = 12
            java.lang.Object r0 = a.t33.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L68
            goto L84
        L68:
            r0 = r8
            a.t33 r0 = (a.t33) r0
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r11)
            a.uts0 r2 = a.ro4.m0(r10, r9, r15, r13)
            r5.l = r14
            r5.k = r15
            r5.j = r13
            r3 = 0
            r4 = 0
            r6 = 12
            java.lang.Object r0 = a.t33.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L85
        L84:
            return r7
        L85:
            r5 = r16
            goto L42
        L88:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.atj.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8 A[LOOP:0: B:26:0x00a2->B:28:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0105  */
    /* JADX WARN: Code duplicated, block: B:35:0x0120 A[LOOP:2: B:33:0x011a->B:35:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0156  */
    /* JADX WARN: Code duplicated, block: B:45:0x018b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x018c  */
    private final Object t(Object obj) {
        lbu lbuVar;
        Object objA;
        Object objF;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayListR;
        Object obj2;
        Object objA2;
        ArrayList arrayList3;
        o0o0 o0o0Var;
        mxt mxtVar;
        rrd rrdVar = (rrd) this.m;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            if (System.currentTimeMillis() - ((yvn0) ((kvu) rrdVar.g).f18971a.d).e < 60000) {
                return o0o0.c;
            }
            lbuVar = (lbu) rrdVar.b;
            rou rouVar = (rou) rrdVar.i;
            this.k = lbuVar;
            this.j = (byte) 1;
            objA = rouVar.a(false, this);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            lbuVar = (lbu) this.k;
            z1x.P(obj);
            objA = obj;
        } else {
            if (b == 2) {
                z1x.P(obj);
                objF = obj;
                List<hrn0> list = (List) objF;
                list.getClass();
                arrayList = new ArrayList(r3d.q(list, 10));
                for (hrn0 hrn0Var : list) {
                    long j = hrn0Var.f13540a;
                    String str = hrn0Var.b;
                    arrayList.add(new hpn0(hrn0Var.e, j, hrn0Var.c, str, hrn0Var.d, hrn0Var.g, hrn0Var.f, hrn0Var.h));
                }
                List listA0 = CollectionsKt.A0(arrayList, new wpv((byte) 25));
                ok50 ok50Var = (ok50) rrdVar.c;
                listA0.getClass();
                ((z220) ok50Var.f25390a).b(listA0);
                arrayList2 = new ArrayList(r3d.q(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    List<epn0> list2 = ((hrn0) it.next()).i;
                    arrayList3 = new ArrayList(r3d.q(list2, 10));
                    for (epn0 epn0Var : list2) {
                        arrayList3.add(new epn0(epn0Var.f8198a, epn0Var.d, epn0Var.e, epn0Var.b, epn0Var.c, epn0Var.f));
                    }
                    arrayList2.add(arrayList3);
                }
                arrayListR = r3d.r(arrayList2);
                ((mi9) rrdVar.d).f21833a.a(arrayListR);
                if (!arrayListR.isEmpty()) {
                    return o0o0.d;
                }
                ((yvn0) ((mxt) rrdVar.h).f22575a.d).e = System.currentTimeMillis();
                kvu kvuVar = (kvu) rrdVar.f;
                obj2 = null;
                this.k = null;
                this.j = (byte) 3;
                objA2 = kvuVar.a(this);
                if (objA2 != wneVar) {
                }
                return wneVar;
            }
            if (b != 3) {
                if (b != 4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o0o0 o0o0Var2 = (o0o0) this.l;
                z1x.P(obj);
                return o0o0Var2;
            }
            z1x.P(obj);
            objA2 = obj;
            obj2 = null;
        }
        o0o0Var = (o0o0) objA2;
        mxtVar = (mxt) rrdVar.e;
        this.k = obj2;
        this.l = o0o0Var;
        this.j = (byte) 4;
        if (mxtVar.a(this) != wneVar) {
            return wneVar;
        }
        return o0o0Var;
        String str2 = ((m2c0) objA).c;
        this.k = null;
        this.j = (byte) 2;
        objF = lbuVar.f(str2, this);
        if (objF != wneVar) {
            List<hrn0> list3 = (List) objF;
            list3.getClass();
            arrayList = new ArrayList(r3d.q(list3, 10));
            while (r9.hasNext()) {
                long j2 = hrn0Var.f13540a;
                String str3 = hrn0Var.b;
                arrayList.add(new hpn0(hrn0Var.e, j2, hrn0Var.c, str3, hrn0Var.d, hrn0Var.g, hrn0Var.f, hrn0Var.h));
            }
            List listA1 = CollectionsKt.A0(arrayList, new wpv((byte) 25));
            ok50 ok50Var2 = (ok50) rrdVar.c;
            listA1.getClass();
            ((z220) ok50Var2.f25390a).b(listA1);
            arrayList2 = new ArrayList(r3d.q(list3, 10));
            it = list3.iterator();
            while (it.hasNext()) {
                List<epn0> list4 = ((hrn0) it.next()).i;
                arrayList3 = new ArrayList(r3d.q(list4, 10));
                while (r6.hasNext()) {
                    arrayList3.add(new epn0(epn0Var.f8198a, epn0Var.d, epn0Var.e, epn0Var.b, epn0Var.c, epn0Var.f));
                }
                arrayList2.add(arrayList3);
            }
            arrayListR = r3d.r(arrayList2);
            ((mi9) rrdVar.d).f21833a.a(arrayListR);
            if (!arrayListR.isEmpty()) {
                return o0o0.d;
            }
            ((yvn0) ((mxt) rrdVar.h).f22575a.d).e = System.currentTimeMillis();
            kvu kvuVar2 = (kvu) rrdVar.f;
            obj2 = null;
            this.k = null;
            this.j = (byte) 3;
            objA2 = kvuVar2.a(this);
            if (objA2 != wneVar) {
                o0o0Var = (o0o0) objA2;
                mxtVar = (mxt) rrdVar.e;
                this.k = obj2;
                this.l = o0o0Var;
                this.j = (byte) 4;
                if (mxtVar.a(this) != wneVar) {
                    return o0o0Var;
                }
            }
        }
        return wneVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new atj((btj) obj2, yjeVar, (byte) 0);
            case 1:
                return new atj((l0l) this.k, (qb8) this.l, (nbe) obj2, yjeVar, (byte) 1);
            case 2:
                atj atjVar = new atj((xk80) this.l, (pz40) obj2, yjeVar, (byte) 2);
                atjVar.k = obj;
                return atjVar;
            case 3:
                return new atj((ccp) obj2, yjeVar, (byte) 3);
            case 4:
                return new atj((org.xplatform.favorites.impl.presentation.category.f) obj2, yjeVar, (byte) 4);
            case 5:
                return new atj((CoroutineContext) this.k, (gmq) this.l, (gzb0) obj2, yjeVar, (byte) 5);
            case 6:
                return new atj((t33) this.k, (l7m0) this.l, (pz40) obj2, yjeVar, (byte) 6);
            case 7:
                return new atj((l0s) this.k, (m0k0) this.l, (zxj0) obj2, yjeVar, (byte) 7);
            case 8:
                return new atj((o2s) this.k, (l7m0) this.l, (pz40) obj2, yjeVar, (byte) 8);
            case 9:
                return new atj((k4s) this.k, (u3z) this.l, (Long) obj2, yjeVar, (byte) 9);
            case 10:
                return new atj((g9s) this.k, (u3z) this.l, (Long) obj2, yjeVar, (byte) 10);
            case 11:
                return new atj((yks) this.k, (u3z) this.l, (Long) obj2, yjeVar, (byte) 11);
            case 12:
                atj atjVar2 = new atj((zns) obj2, yjeVar, (byte) 12);
                atjVar2.l = obj;
                return atjVar2;
            case 13:
                return new atj((a9t) obj2, yjeVar, (byte) 13);
            case 14:
                atj atjVar3 = new atj((q5u) obj2, yjeVar, (byte) 14);
                atjVar3.l = obj;
                return atjVar3;
            case 15:
                atj atjVar4 = new atj((nlu) obj2, yjeVar, (byte) 15);
                atjVar4.l = obj;
                return atjVar4;
            case 16:
                atj atjVar5 = new atj((dgu) obj2, yjeVar, (byte) 16);
                atjVar5.l = obj;
                return atjVar5;
            case 17:
                return new atj((dgu) this.l, (jvn) obj2, yjeVar, (byte) 17);
            case 18:
                atj atjVar6 = new atj((ouu) obj2, yjeVar, (byte) 18);
                atjVar6.l = obj;
                return atjVar6;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                atj atjVar7 = new atj((f7u) obj2, yjeVar, (byte) 19);
                atjVar7.l = obj;
                return atjVar7;
            case 20:
                return new atj((qgd) this.l, (jvn) obj2, yjeVar, (byte) 20);
            case 21:
                return new atj((f7u) obj2, yjeVar, (byte) 21);
            case 22:
                return new atj((a6u) this.l, (jvn) obj2, yjeVar, (byte) 22);
            case 23:
                atj atjVar8 = new atj((List) this.l, (a6u) obj2, yjeVar, (byte) 23);
                atjVar8.k = obj;
                return atjVar8;
            case 24:
                atj atjVar9 = new atj((wdu) obj2, yjeVar, (byte) 24);
                atjVar9.l = obj;
                return atjVar9;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new atj((xk80) this.k, (pz40) this.l, (Function1) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new atj((naw) this.l, (n3w) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                atj atjVar10 = new atj((t33) obj2, yjeVar, (byte) 27);
                atjVar10.l = obj;
                return atjVar10;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new atj((rrd) obj2, yjeVar, (byte) 28);
            default:
                atj atjVar11 = new atj((bq00) obj2, yjeVar, (byte) 29);
                atjVar11.l = obj;
                return atjVar11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((atj) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((atj) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((atj) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((atj) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((atj) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((atj) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((atj) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((atj) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((atj) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((atj) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((atj) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((atj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((atj) create((arq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:461:0x09af  */
    /* JADX WARN: Code duplicated, block: B:463:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:466:0x09ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:429:0x0932 -> B:430:0x0933). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:467:0x09dc -> B:461:0x09af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.atj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ atj(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ atj(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
    }
}
