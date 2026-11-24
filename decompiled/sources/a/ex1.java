package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ex1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex1(xcf xcfVar, t33 t33Var, t33 t33Var2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        this.l = xcfVar;
        this.k = t33Var;
        this.m = t33Var2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe A[PHI: r5
  0x00fe: PHI (r5v7 a.q4f) = (r5v6 a.q4f), (r5v11 a.q4f) binds: [B:35:0x00fb, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x010b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r2.D(r25) == r4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object G(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ex1.G(java.lang.Object):java.lang.Object");
    }

    private final Object H(Object obj) {
        List list;
        q4f q4fVar = (q4f) this.m;
        r7f r7fVar = (r7f) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            znt zntVar = r7fVar.e;
            this.j = (byte) 1;
            obj = zntVar.f44690a.p(this);
            if (obj != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.k;
            z1x.P(obj);
        }
        r7fVar.p0(((xre) r7fVar.x.f40284a).f41366a.d, !list.isEmpty());
        return Unit.f46060a;
        List list2 = (List) obj;
        r7fVar.t0(q4fVar, list2, !list2.isEmpty(), ((pwq0) r7fVar.X1.getValue()).d);
        this.k = list2;
        this.j = (byte) 2;
        if (r7fVar.Y(q4fVar, list2, this) != wneVar) {
            list = list2;
            r7fVar.p0(((xre) r7fVar.x.f40284a).f41366a.d, !list.isEmpty());
            return Unit.f46060a;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    private final Object I(Object obj) throws Exception {
        ex1 ex1Var;
        lgf lgfVar;
        String str;
        fq fqVar;
        String str2;
        wff wffVar = (wff) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            d920 d920Var = wffVar.b;
            this.j = (byte) 1;
            j5t j5tVar = d920Var.b.f26724a;
            csr csrVar = j5tVar.p;
            double d = j5tVar.o;
            vgf vgfVar = d920Var.f5679a;
            ql5 ql5Var = j5tVar.q;
            if (ql5Var == null) {
                throw new ss3();
            }
            ex1Var = this;
            obj = vgfVar.a(d, ql5Var.f28916a, ex1Var, csrVar);
            if (obj != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
            ex1Var = this;
        } else {
            if (b == 2) {
                lgf lgfVar2 = (lgf) this.k;
                z1x.P(obj);
                ex1Var = this;
                lgfVar = lgfVar2;
                str = (String) obj;
                fqVar = wffVar.e;
                ex1Var.k = lgfVar;
                ex1Var.m = str;
                ex1Var.j = (byte) 3;
                if (fqVar.f(my5.f22588a, ex1Var) != wneVar) {
                    str2 = str;
                }
                return wneVar;
            }
            if (b != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = (String) this.m;
            lgfVar = (lgf) this.k;
            z1x.P(obj);
        }
        wffVar.x(new tff(lgfVar, str2));
        return Unit.f46060a;
        lgf lgfVar3 = (lgf) obj;
        t0u t0uVar = wffVar.f;
        ex1Var.k = lgfVar3;
        ex1Var.j = (byte) 2;
        Object objA = t0uVar.a(ex1Var);
        if (objA != wneVar) {
            obj = objA;
            lgfVar = lgfVar3;
            str = (String) obj;
            fqVar = wffVar.e;
            ex1Var.k = lgfVar;
            ex1Var.m = str;
            ex1Var.j = (byte) 3;
            if (fqVar.f(my5.f22588a, ex1Var) != wneVar) {
                str2 = str;
                wffVar.x(new tff(lgfVar, str2));
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        if (r0 == r9) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object J(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ex1.J(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r0.a(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object K(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r6.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r7)
            goto L4a
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L1b:
            java.lang.Object r0 = r6.k
            a.kmq r0 = (a.kmq) r0
            a.z1x.P(r7)
            goto L3d
        L23:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.m
            a.rsh r7 = (a.rsh) r7
            a.b8u r7 = r7.j
            r6.l = r5
            r6.k = r0
            r6.j = r4
            java.lang.Object r7 = r7.f2175a
            a.z220 r7 = (a.z220) r7
            java.lang.Object r7 = r7.u(r6)
            if (r7 != r1) goto L3d
            goto L49
        L3d:
            r6.l = r5
            r6.k = r5
            r6.j = r3
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r1) goto L4a
        L49:
            return r1
        L4a:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ex1.K(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r1 == r11) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ex1.l(java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj) {
        List list;
        List list2;
        p7m0 p7m0Var;
        Object value;
        zj7 zj7Var = (zj7) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            z7u z7uVar = zj7Var.o;
            List listK = q3d.k((a5w) this.m);
            this.j = (byte) 1;
            obj = z7uVar.a(listK, this);
            if (obj != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.k;
            z1x.P(obj);
        }
        list2 = (List) obj;
        int i = zj7.q;
        p7m0Var = zj7Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, uj7.a((uj7) value, null, list, list2, 115)));
        return Unit.f46060a;
        List list3 = (List) obj;
        b8u b8uVar = zj7Var.p;
        this.k = list3;
        this.j = (byte) 2;
        Object objB = ((zfo) b8uVar.f2175a).b(this);
        if (objB != wneVar) {
            obj = objB;
            list = list3;
            list2 = (List) obj;
            int i2 = zj7.q;
            p7m0Var = zj7Var.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
            } while (!p7m0Var.m(value, uj7.a((uj7) value, null, list, list2, 115)));
            return Unit.f46060a;
        }
        return wneVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r0 == r4) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ex1.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r12 == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ex1.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x0050->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r6 == r1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.m
            a.gr00 r0 = (a.gr00) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r5.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L2b
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1c
            java.lang.Object r0 = r5.k
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r2 = r5.l
            a.kmq r2 = (a.kmq) r2
            a.z1x.P(r6)
            goto L50
        L1c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L23:
            java.lang.Object r2 = r5.l
            a.kmq r2 = (a.kmq) r2
            a.z1x.P(r6)
            goto L42
        L2b:
            a.z1x.P(r6)
            java.lang.Object r6 = r5.l
            r2 = r6
            a.kmq r2 = (a.kmq) r2
            java.lang.Object r6 = r0.f11760a
            a.zz2 r6 = (a.zz2) r6
            r5.l = r2
            r5.j = r4
            java.io.Serializable r6 = r6.v(r5)
            if (r6 != r1) goto L42
            goto L68
        L42:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r0.d
            a.c4m0 r0 = (a.c4m0) r0
            r0.start()
            java.util.Iterator r6 = r6.iterator()
            r0 = r6
        L50:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L69
            java.lang.Object r6 = r0.next()
            kotlin.collections.IndexedValue r6 = (kotlin.collections.IndexedValue) r6
            r5.l = r2
            r5.k = r0
            r5.j = r3
            java.lang.Object r6 = r2.a(r6, r5)
            if (r6 != r1) goto L50
        L68:
            return r1
        L69:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ex1.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r9 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r8 == r0) goto L28;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x003c, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:20:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ex1.t(java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj) {
        y7b y7bVar;
        y7b y7bVar2;
        xvm0 xvm0Var = (xvm0) this.l;
        y7b y7bVar3 = (y7b) this.m;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        byte b2 = 1;
        yje yjeVar = null;
        if (b == 0) {
            z1x.P(obj);
            if (xvm0Var != null) {
                if (!(xvm0Var instanceof rvm0)) {
                    if (xvm0Var instanceof svm0) {
                        c4m0 c4m0Var = y7bVar3.I;
                        if (c4m0Var != null) {
                            c4m0Var.cancel(null);
                        }
                        xzp xzpVar = y7bVar3.y;
                        boolean z = ((r6b) y7bVar3.D()).l.b;
                        this.k = y7bVar3;
                        this.j = (byte) 1;
                        obj = xzpVar.P(z, this);
                        if (obj != wneVar) {
                            y7bVar2 = y7bVar3;
                            y7bVar2.J = sac.T(new fnq((gmq) obj, new m7b(y7bVar3, yjeVar, b2), (byte) 4), jiu0.a(y7bVar3), new q7b(y7bVar3, yjeVar, b2));
                        }
                    } else if ((xvm0Var instanceof tvm0) || (xvm0Var instanceof wvm0)) {
                        c4m0 c4m0Var2 = y7bVar3.I;
                        if (c4m0Var2 != null) {
                            c4m0Var2.cancel(null);
                        }
                        c4m0 c4m0Var3 = y7bVar3.J;
                        if (c4m0Var3 != null) {
                            c4m0Var3.cancel(null);
                        }
                        wdu wduVar = y7bVar3.s;
                        long id = xvm0Var.getId();
                        this.k = y7bVar3;
                        this.j = (byte) 2;
                        obj = wduVar.v(id, this);
                        if (obj != wneVar) {
                            y7bVar = y7bVar3;
                            y7bVar.I = sac.T(new fnq(ulb.L((gmq) obj, y7bVar3.o.f22085a), new yxa((Object) y7bVar3, (Object) xvm0Var, yjeVar, (byte) 5), (byte) 4), jiu0.a(y7bVar3), new yp6(y7bVar3, xvm0Var, yjeVar, (byte) 29));
                        }
                    }
                    return wneVar;
                }
            }
            t9f.b();
            return null;
        }
        if (b == 1) {
            y7bVar2 = (y7b) this.k;
            z1x.P(obj);
            y7bVar2.J = sac.T(new fnq((gmq) obj, new m7b(y7bVar3, yjeVar, b2), (byte) 4), jiu0.a(y7bVar3), new q7b(y7bVar3, yjeVar, b2));
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y7bVar = (y7b) this.k;
            z1x.P(obj);
            y7bVar.I = sac.T(new fnq(ulb.L((gmq) obj, y7bVar3.o.f22085a), new yxa((Object) y7bVar3, (Object) xvm0Var, yjeVar, (byte) 5), (byte) 4), jiu0.a(y7bVar3), new yp6(y7bVar3, xvm0Var, yjeVar, (byte) 29));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (r12 == r7) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ex1.y(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ex1((byte) 0, yjeVar, (String) this.m, (t33) this.k, (pz40) this.l);
            case 1:
                ex1 ex1Var = new ex1(this.m, yjeVar, (byte) 1);
                ex1Var.l = obj;
                return ex1Var;
            case 2:
                ex1 ex1Var2 = new ex1(this.m, yjeVar, (byte) 2);
                ex1Var2.l = obj;
                return ex1Var2;
            case 3:
                return new ex1((byte) 3, yjeVar, (String) this.m, (yn2) this.k, (s470) this.l);
            case 4:
                return new ex1(this.l, this.m, yjeVar, (byte) 4);
            case 5:
                ex1 ex1Var3 = new ex1(this.m, yjeVar, (byte) 5);
                ex1Var3.l = obj;
                return ex1Var3;
            case 6:
                return new ex1(this.m, yjeVar, (byte) 6);
            case 7:
                ex1 ex1Var4 = new ex1(this.m, yjeVar, (byte) 7);
                ex1Var4.l = obj;
                return ex1Var4;
            case 8:
                return new ex1(this.l, this.m, yjeVar, (byte) 8);
            case 9:
                return new ex1(this.l, this.m, yjeVar, (byte) 9);
            case 10:
                ex1 ex1Var5 = new ex1(this.m, yjeVar, (byte) 10);
                ex1Var5.l = obj;
                return ex1Var5;
            case 11:
                ex1 ex1Var6 = new ex1(this.l, this.m, yjeVar, (byte) 11);
                ex1Var6.k = obj;
                return ex1Var6;
            case 12:
                return new ex1(this.l, this.m, yjeVar, (byte) 12);
            case 13:
                return new ex1(this.l, this.m, yjeVar, (byte) 13);
            case 14:
                return new ex1(this.m, yjeVar, (byte) 14);
            case 15:
                return new ex1(this.m, yjeVar, (byte) 15);
            case 16:
                return new ex1(this.l, this.m, yjeVar, (byte) 16);
            case 17:
                return new ex1(this.l, this.m, yjeVar, (byte) 17);
            case 18:
                ex1 ex1Var7 = new ex1(this.l, this.m, yjeVar, (byte) 18);
                ex1Var7.k = obj;
                return ex1Var7;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ex1 ex1Var8 = new ex1(this.m, yjeVar, (byte) 19);
                ex1Var8.l = obj;
                return ex1Var8;
            case 20:
                return new ex1(this.m, yjeVar, (byte) 20);
            case 21:
                return new ex1(this.l, this.m, yjeVar, (byte) 21);
            case 22:
                return new ex1((byte) 22, yjeVar, (mie0) this.m, (g1e) this.k, (zl60) this.l);
            case 23:
                ex1 ex1Var9 = new ex1(this.m, yjeVar, (byte) 23);
                ex1Var9.l = obj;
                return ex1Var9;
            case 24:
                return new ex1(this.l, this.m, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ex1((xcf) this.l, (t33) this.k, (t33) this.m, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ex1((w46) this.l, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ex1 ex1Var10 = new ex1((w46) this.l, yjeVar, (byte) 27);
                ex1Var10.k = obj;
                return ex1Var10;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ex1 ex1Var11 = new ex1(this.m, yjeVar, (byte) 28);
                ex1Var11.l = obj;
                return ex1Var11;
            default:
                ex1 ex1Var12 = new ex1(this.m, yjeVar, (byte) 29);
                ex1Var12.l = obj;
                return ex1Var12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ex1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ex1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ex1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ex1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ex1) create((jg7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ex1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ex1) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((ex1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((ex1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ex1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:107:0x0205 A[LOOP:0: B:103:0x01dc->B:107:0x0205, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x0385  */
    /* JADX WARN: Code duplicated, block: B:150:0x0399  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:275:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:277:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:281:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:314:0x0789  */
    /* JADX WARN: Code duplicated, block: B:372:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:374:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:376:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:378:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:381:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:405:0x0955  */
    /* JADX WARN: Code duplicated, block: B:406:0x0963  */
    /* JADX WARN: Code duplicated, block: B:417:0x0993  */
    /* JADX WARN: Code duplicated, block: B:418:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:421:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:422:0x09db  */
    /* JADX WARN: Code duplicated, block: B:424:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:425:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:467:0x0afc  */
    /* JADX WARN: Code duplicated, block: B:470:0x0b01  */
    /* JADX WARN: Code duplicated, block: B:516:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v54, types: [a.m7h0, org.xplatform.wallet.impl.navigation.WalletsScreen$WalletsScreen] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v26 java.lang.Object, still in use, count: 2, list:
          (r4v26 java.lang.Object) from 0x0951: PHI (r4 I:??) = (r4v22 java.lang.Object), (r4v26 java.lang.Object) binds: [B:402:0x0950, B:526:0x0951] A[DONT_GENERATE, DONT_INLINE]
          (r4v26 java.lang.Object) from 0x0943: CHECK_CAST (a.pbv) (r4v26 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 3080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ex1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex1(w46 w46Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = w46Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex1(byte b, yje yjeVar, Serializable serializable, Object obj, Object obj2) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex1(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex1(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }
}
