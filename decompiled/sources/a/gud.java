package a;

import java.util.Collection;
import org.xplatform.ufc.api.fighter.FighterParams;

/* JADX INFO: loaded from: classes.dex */
public final class gud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11923a;
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
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;

    public gud(cad cadVar, iip iipVar, lsn lsnVar, ugf0 ugf0Var, epi0 epi0Var, itr itrVar, FighterParams fighterParams, i1w0 i1w0Var, g2v g2vVar, ctf0 ctf0Var, gii0 gii0Var, knf0 knf0Var, uzc uzcVar, b3c0 b3c0Var, gst0 gst0Var, pru pruVar, y78 y78Var, lbu lbuVar, wdk0 wdk0Var, m1e m1eVar, kys0 kys0Var, viu viuVar) {
        this.f11923a = fighterParams;
        this.b = g2vVar;
        this.c = ctf0Var;
        this.d = cadVar;
        this.e = gii0Var;
        this.f = knf0Var;
        this.g = uzcVar;
        this.h = lsnVar;
        this.i = viuVar;
        this.j = b3c0Var;
        this.k = gst0Var;
        this.l = i1w0Var;
        this.u = pruVar;
        this.m = y78Var;
        this.n = lbuVar;
        this.o = ugf0Var;
        this.p = epi0Var;
        this.q = itrVar;
        this.r = m1eVar;
        this.s = kys0Var;
        this.t = iipVar;
        byte b = 24;
        this.v = mbl.b(new f7i(this, 1, b));
        this.w = new f7i(this, 0, b);
    }

    public static Object f(gud gudVar, m0k0 m0k0Var, zxj0 zxj0Var, gwe gweVar, zje zjeVar) {
        return gudVar.b(m0k0Var, zxj0Var, gweVar, hrs.f13547a, null, zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r12.l(r13, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a.lvj0 r13, a.zje r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof a.bud
            if (r0 == 0) goto L13
            r0 = r14
            a.bud r0 = (a.bud) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.bud r0 = new a.bud
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            a.z1x.P(r14)
            goto La2
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            return r6
        L35:
            a.qu6 r13 = r0.j
            a.z1x.P(r14)
            goto L87
        L3b:
            a.lvj0 r13 = r0.i
            a.z1x.P(r14)
            goto L55
        L41:
            a.z1x.P(r14)
            java.lang.Object r14 = r12.f11923a
            a.znt r14 = (a.znt) r14
            r0.i = r13
            r0.m = r5
            a.chf0 r14 = r14.f44690a
            java.io.Serializable r14 = r14.p(r0)
            if (r14 != r1) goto L55
            goto La1
        L55:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
        L5b:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r14.next()
            r5 = r2
            a.qu6 r5 = (a.qu6) r5
            long r7 = r5.x
            r9 = 707(0x2c3, double:3.493E-321)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L5b
            goto L72
        L71:
            r2 = r6
        L72:
            r14 = r2
            a.qu6 r14 = (a.qu6) r14
            if (r14 == 0) goto La2
            r0.i = r6
            r0.j = r14
            r0.m = r4
            java.lang.Object r13 = r12.g(r13, r0)
            if (r13 != r1) goto L84
            goto La1
        L84:
            r11 = r14
            r14 = r13
            r13 = r11
        L87:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto La2
            java.lang.Object r12 = r12.v
            a.zri r12 = (a.zri) r12
            long r13 = r13.f29333a
            r0.i = r6
            r0.j = r6
            r0.m = r3
            java.lang.Object r12 = r12.l(r13, r0)
            if (r12 != r1) goto La2
        La1:
            return r1
        La2:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gud.a(a.lvj0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0407  */
    /* JADX WARN: Code duplicated, block: B:104:0x040a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x040c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0410  */
    /* JADX WARN: Code duplicated, block: B:111:0x0443 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x01e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x021e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0277  */
    /* JADX WARN: Code duplicated, block: B:52:0x0294  */
    /* JADX WARN: Code duplicated, block: B:53:0x0296  */
    /* JADX WARN: Code duplicated, block: B:57:0x0309  */
    /* JADX WARN: Code duplicated, block: B:60:0x0346  */
    /* JADX WARN: Code duplicated, block: B:62:0x034a  */
    /* JADX WARN: Code duplicated, block: B:65:0x034f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x038b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:92:0x03c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:95:0x03d9  */
    public Object b(m0k0 m0k0Var, zxj0 zxj0Var, gwe gweVar, hrs hrsVar, ic9 ic9Var, zje zjeVar) {
        cud cudVar;
        int i;
        m0k0 m0k0Var2;
        zxj0 zxj0Var2;
        gwe gweVar2;
        boolean z;
        Object obj;
        ic9 ic9Var2;
        boolean z2;
        long jLongValue;
        Object objK;
        hrs hrsVar2;
        m0k0 m0k0Var3;
        gwe gweVar3;
        boolean z3;
        int i2;
        boolean z4;
        ic9 ic9Var3;
        long j;
        int i3;
        int i4;
        m0k0 m0k0Var4;
        Object objE;
        Object obj2;
        boolean z5;
        Object obj3;
        m0k0 m0k0Var5;
        Object obj4;
        long jLongValue2;
        m0k0 m0k0Var6;
        int i5;
        boolean z6;
        int i6;
        Object objW0;
        int i7;
        ic9 ic9Var4;
        Object obj5;
        long j2;
        zxj0 zxj0Var3;
        hrs hrsVar3;
        gwe gweVar4;
        int i8;
        boolean z7;
        Object obj6;
        boolean z8;
        m0k0 m0k0Var7;
        int i9;
        int i10;
        int i11;
        int i12;
        zxj0 zxj0Var4;
        m0k0 m0k0Var8;
        hrs hrsVar4;
        ic9 ic9Var5;
        gwe gweVar5;
        int i13;
        boolean z9;
        boolean z10;
        Object objR;
        cud cudVar2;
        Object obj7;
        long j3;
        int i14;
        Object obj8;
        boolean z11;
        boolean z12;
        int i15;
        int i16;
        zxj0 zxj0Var5;
        int i17;
        gwe gweVar6;
        long j4;
        hrs hrsVar5;
        m0k0 m0k0Var9;
        boolean zBooleanValue;
        gwe gweVar7;
        q4f q4fVarA;
        ygp ygpVar;
        Object obj9;
        j1q0 j1q0Var;
        boolean z13;
        int i18;
        m0k0 m0k0Var10;
        zxj0 zxj0Var6;
        o4a o4aVar;
        int i19;
        vwb0 vwb0Var;
        boolean z14;
        Object objE2;
        Object objD;
        hrs hrsVar6 = hrsVar;
        o4a o4aVar2 = (o4a) this.k;
        r9u r9uVar = (r9u) this.w;
        if (zjeVar instanceof cud) {
            cudVar = (cud) zjeVar;
            int i20 = cudVar.x;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                cudVar.x = i20 - Integer.MIN_VALUE;
            } else {
                cudVar = new cud(this, zjeVar);
            }
        } else {
            cudVar = new cud(this, zjeVar);
        }
        cud cudVar3 = cudVar;
        Object obj10 = cudVar3.v;
        Object obj11 = wne.f39444a;
        switch (cudVar3.x) {
            case 0:
                z1x.P(obj10);
                ygp ygpVar2 = ygp.J1;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                boolean zD = j1q0Var2.f15748a.d(ygpVar2);
                boolean z15 = ((pru) this.u).a().f32117a.f12063a.s;
                i = (z15 && zD && hrsVar6 == hrs.b) ? 1 : 0;
                h9c h9cVar = (h9c) this.b;
                m0k0Var2 = m0k0Var;
                cudVar3.i = m0k0Var2;
                zxj0Var2 = zxj0Var;
                cudVar3.j = zxj0Var2;
                gweVar2 = gweVar;
                cudVar3.k = gweVar2;
                cudVar3.l = hrsVar6;
                cudVar3.m = ic9Var;
                cudVar3.n = zD;
                cudVar3.o = z15;
                cudVar3.p = i;
                cudVar3.x = 1;
                Object objD2 = h9cVar.f12667a.D(cudVar3);
                if (objD2 != obj11) {
                    z = z15;
                    obj = objD2;
                    ic9Var2 = ic9Var;
                    z2 = zD;
                    jLongValue = ((Number) obj).longValue();
                    eu4 eu4Var = new eu4(((ik9) this.c).f14914a.u(owe.b), (byte) 1);
                    cudVar3.i = m0k0Var2;
                    cudVar3.j = zxj0Var2;
                    cudVar3.k = gweVar2;
                    cudVar3.l = hrsVar6;
                    cudVar3.m = ic9Var2;
                    cudVar3.n = z2;
                    cudVar3.o = z;
                    cudVar3.p = i;
                    cudVar3.t = jLongValue;
                    cudVar3.x = 2;
                    objK = ntb.K(eu4Var, cudVar3);
                    if (objK != obj11) {
                        hrsVar2 = hrsVar6;
                        m0k0Var3 = m0k0Var2;
                        gweVar3 = gweVar2;
                        z3 = z2;
                        i2 = i;
                        obj10 = objK;
                        z4 = z;
                        ic9Var3 = ic9Var2;
                        j = jLongValue;
                        boolean zIsEmpty = ((Collection) obj10).isEmpty();
                        i3 = !zIsEmpty ? 1 : 0;
                        if (j > 0 || !zIsEmpty) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        e8u e8uVar = (e8u) this.d;
                        long j5 = zxj0Var2.f45162a;
                        cudVar3.i = m0k0Var3;
                        cudVar3.j = zxj0Var2;
                        cudVar3.k = gweVar3;
                        cudVar3.l = hrsVar2;
                        cudVar3.m = ic9Var3;
                        cudVar3.n = z3;
                        cudVar3.o = z4;
                        cudVar3.p = i2;
                        cudVar3.t = j;
                        cudVar3.q = i3;
                        cudVar3.r = i4;
                        m0k0Var4 = m0k0Var3;
                        cudVar3.x = 3;
                        objE = e8uVar.f7391a.E(j5, cudVar3);
                        obj2 = obj11;
                        if (objE == obj2) {
                            return obj2;
                        }
                        z5 = z4;
                        obj3 = objE;
                        m0k0Var5 = m0k0Var4;
                        obj4 = obj2;
                        jLongValue2 = ((Number) obj3).longValue();
                        x4u x4uVar = (x4u) this.e;
                        long j6 = m0k0Var5.Y;
                        cudVar3.i = m0k0Var5;
                        cudVar3.j = zxj0Var2;
                        cudVar3.k = gweVar3;
                        cudVar3.l = hrsVar2;
                        cudVar3.m = ic9Var3;
                        cudVar3.n = z3;
                        cudVar3.o = z5;
                        cudVar3.p = i2;
                        cudVar3.t = j;
                        cudVar3.q = i3;
                        cudVar3.r = i4;
                        m0k0Var6 = m0k0Var5;
                        i5 = i4;
                        cudVar3.u = jLongValue2;
                        cudVar3.x = 4;
                        z6 = z5;
                        i6 = i3;
                        objW0 = sj3.w0(cudVar3, ((ou6) ((chf0) x4uVar.f40284a).c).f25862a, new hu6(j6, null, (byte) 1), true, false);
                        if (objW0 == obj4) {
                            return obj4;
                        }
                        ic9 ic9Var6 = ic9Var3;
                        i7 = i2;
                        ic9Var4 = ic9Var6;
                        obj5 = obj4;
                        j2 = j;
                        zxj0Var3 = zxj0Var2;
                        hrsVar3 = hrsVar2;
                        gweVar4 = gweVar3;
                        i8 = i6;
                        z7 = z6;
                        obj6 = objW0;
                        z8 = z3;
                        m0k0Var7 = m0k0Var6;
                        i9 = i5;
                        if (((Number) obj6).longValue() > 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        h9c h9cVar2 = (h9c) this.f;
                        i11 = i10;
                        i12 = i9;
                        long j7 = zxj0Var3.f45162a;
                        byte b = zxj0Var3.i.f36034a;
                        double d = zxj0Var3.g;
                        long j8 = zxj0Var3.b;
                        long j9 = zxj0Var3.j;
                        cudVar3.i = m0k0Var7;
                        cudVar3.j = zxj0Var3;
                        cudVar3.k = gweVar4;
                        cudVar3.l = hrsVar3;
                        cudVar3.m = ic9Var4;
                        cudVar3.n = z8;
                        cudVar3.o = z7;
                        cudVar3.p = i7;
                        cudVar3.t = j2;
                        cudVar3.q = i8;
                        zxj0Var4 = zxj0Var3;
                        cudVar3.r = i12;
                        m0k0Var8 = m0k0Var7;
                        cudVar3.u = jLongValue2;
                        cudVar3.s = i11;
                        cudVar3.x = 5;
                        hrsVar4 = hrsVar3;
                        ic9Var5 = ic9Var4;
                        gweVar5 = gweVar4;
                        i13 = i7;
                        z9 = z8;
                        z10 = z7;
                        objR = h9cVar2.f12667a.r(j7, b, d, j8, j9, cudVar3);
                        cudVar2 = cudVar3;
                        obj7 = obj5;
                        if (objR != obj7) {
                            j3 = jLongValue2;
                            i14 = i8;
                            obj8 = objR;
                            z11 = z9;
                            z12 = z10;
                            i15 = i13;
                            i16 = i11;
                            zxj0Var5 = zxj0Var4;
                            i17 = i12;
                            gweVar6 = gweVar5;
                            j4 = j2;
                            hrsVar5 = hrsVar4;
                            m0k0Var9 = m0k0Var8;
                            zBooleanValue = ((Boolean) obj8).booleanValue();
                            gweVar7 = gweVar6;
                            q4fVarA = ((j9c) this.i).a();
                            ygpVar = ygp.l;
                            r9uVar.getClass();
                            obj9 = obj7;
                            j1q0Var = r9uVar.f30104a;
                            j1q0Var.getClass();
                            if (j1q0Var.f15748a.d(ygpVar) && q4fVarA == q4f.m) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (i15 == 0 && j4 > 0 && (i17 != 0 || i16 == 0)) {
                                return new xtd(true);
                            }
                            i18 = i14;
                            if (i15 != 0 && i18 != 0) {
                                return new xtd(false);
                            }
                            if (j3 < 1 && !zBooleanValue && z13 && !m0k0Var9.f1 && hrsVar5 != hrs.b) {
                                return new utd(zxj0Var5, m0k0Var9);
                            }
                            if (!zBooleanValue) {
                                m0k0Var10 = m0k0Var9;
                                zxj0Var6 = zxj0Var5;
                                o4aVar = o4aVar2;
                                i19 = i16;
                                if (j4 < o4aVar.a(q4fVarA) && q4fVarA != q4f.c && !zBooleanValue) {
                                    return new ytd(o4aVar.a(q4fVarA), q4fVarA);
                                }
                                vwb0Var = (vwb0) ((bhu) this.l).f2626a.e;
                                vwb0Var.getClass();
                                if (j4 == vwb0Var.b().getInt("max_coupon_size_key", 50)) {
                                    return ztd.f44952a;
                                }
                                if (i15 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                cudVar2.i = null;
                                cudVar2.j = null;
                                cudVar2.k = null;
                                cudVar2.l = null;
                                cudVar2.m = null;
                                cudVar2.n = z11;
                                cudVar2.o = z12;
                                cudVar2.p = i15;
                                cudVar2.t = j4;
                                cudVar2.q = i18;
                                cudVar2.r = i17;
                                cudVar2.u = j3;
                                cudVar2.s = i19;
                                cudVar2.x = 7;
                                objE2 = e(m0k0Var10, zxj0Var6, q4fVarA, gweVar7, z14, ic9Var5, cudVar2);
                                if (objE2 == obj9) {
                                    return obj9;
                                }
                                return objE2;
                            }
                            long j10 = m0k0Var9.f20959a;
                            long j11 = m0k0Var9.B;
                            cudVar2.i = null;
                            cudVar2.j = null;
                            cudVar2.k = null;
                            cudVar2.l = null;
                            cudVar2.m = null;
                            cudVar2.n = z11;
                            cudVar2.o = z12;
                            cudVar2.p = i15;
                            cudVar2.t = j4;
                            cudVar2.q = i18;
                            cudVar2.r = i17;
                            cudVar2.u = j3;
                            cudVar2.s = i16;
                            cudVar2.x = 6;
                            obj7 = obj9;
                            objD = d(zxj0Var5, j10, j11, cudVar2);
                            if (objD != obj7) {
                                return objD;
                            }
                        }
                        return obj7;
                    }
                }
                return obj11;
            case 1:
                int i21 = cudVar3.p;
                boolean z16 = cudVar3.o;
                boolean z17 = cudVar3.n;
                ic9Var2 = cudVar3.m;
                hrs hrsVar7 = cudVar3.l;
                gwe gweVar8 = cudVar3.k;
                zxj0 zxj0Var7 = cudVar3.j;
                m0k0 m0k0Var11 = cudVar3.i;
                z1x.P(obj10);
                i = i21;
                hrsVar6 = hrsVar7;
                m0k0Var2 = m0k0Var11;
                z2 = z17;
                z = z16;
                obj = obj10;
                gweVar2 = gweVar8;
                zxj0Var2 = zxj0Var7;
                jLongValue = ((Number) obj).longValue();
                eu4 eu4Var2 = new eu4(((ik9) this.c).f14914a.u(owe.b), (byte) 1);
                cudVar3.i = m0k0Var2;
                cudVar3.j = zxj0Var2;
                cudVar3.k = gweVar2;
                cudVar3.l = hrsVar6;
                cudVar3.m = ic9Var2;
                cudVar3.n = z2;
                cudVar3.o = z;
                cudVar3.p = i;
                cudVar3.t = jLongValue;
                cudVar3.x = 2;
                objK = ntb.K(eu4Var2, cudVar3);
                if (objK != obj11) {
                    hrsVar2 = hrsVar6;
                    m0k0Var3 = m0k0Var2;
                    gweVar3 = gweVar2;
                    z3 = z2;
                    i2 = i;
                    obj10 = objK;
                    z4 = z;
                    ic9Var3 = ic9Var2;
                    j = jLongValue;
                    boolean zIsEmpty2 = ((Collection) obj10).isEmpty();
                    i3 = !zIsEmpty2 ? 1 : 0;
                    if (j > 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                    }
                    e8u e8uVar2 = (e8u) this.d;
                    long j12 = zxj0Var2.f45162a;
                    cudVar3.i = m0k0Var3;
                    cudVar3.j = zxj0Var2;
                    cudVar3.k = gweVar3;
                    cudVar3.l = hrsVar2;
                    cudVar3.m = ic9Var3;
                    cudVar3.n = z3;
                    cudVar3.o = z4;
                    cudVar3.p = i2;
                    cudVar3.t = j;
                    cudVar3.q = i3;
                    cudVar3.r = i4;
                    m0k0Var4 = m0k0Var3;
                    cudVar3.x = 3;
                    objE = e8uVar2.f7391a.E(j12, cudVar3);
                    obj2 = obj11;
                    if (objE == obj2) {
                        return obj2;
                    }
                    z5 = z4;
                    obj3 = objE;
                    m0k0Var5 = m0k0Var4;
                    obj4 = obj2;
                    jLongValue2 = ((Number) obj3).longValue();
                    x4u x4uVar2 = (x4u) this.e;
                    long j13 = m0k0Var5.Y;
                    cudVar3.i = m0k0Var5;
                    cudVar3.j = zxj0Var2;
                    cudVar3.k = gweVar3;
                    cudVar3.l = hrsVar2;
                    cudVar3.m = ic9Var3;
                    cudVar3.n = z3;
                    cudVar3.o = z5;
                    cudVar3.p = i2;
                    cudVar3.t = j;
                    cudVar3.q = i3;
                    cudVar3.r = i4;
                    m0k0Var6 = m0k0Var5;
                    i5 = i4;
                    cudVar3.u = jLongValue2;
                    cudVar3.x = 4;
                    z6 = z5;
                    i6 = i3;
                    objW0 = sj3.w0(cudVar3, ((ou6) ((chf0) x4uVar2.f40284a).c).f25862a, new hu6(j13, null, (byte) 1), true, false);
                    if (objW0 == obj4) {
                        return obj4;
                    }
                    ic9 ic9Var7 = ic9Var3;
                    i7 = i2;
                    ic9Var4 = ic9Var7;
                    obj5 = obj4;
                    j2 = j;
                    zxj0Var3 = zxj0Var2;
                    hrsVar3 = hrsVar2;
                    gweVar4 = gweVar3;
                    i8 = i6;
                    z7 = z6;
                    obj6 = objW0;
                    z8 = z3;
                    m0k0Var7 = m0k0Var6;
                    i9 = i5;
                    if (((Number) obj6).longValue() > 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    h9c h9cVar3 = (h9c) this.f;
                    i11 = i10;
                    i12 = i9;
                    long j14 = zxj0Var3.f45162a;
                    byte b2 = zxj0Var3.i.f36034a;
                    double d2 = zxj0Var3.g;
                    long j15 = zxj0Var3.b;
                    long j16 = zxj0Var3.j;
                    cudVar3.i = m0k0Var7;
                    cudVar3.j = zxj0Var3;
                    cudVar3.k = gweVar4;
                    cudVar3.l = hrsVar3;
                    cudVar3.m = ic9Var4;
                    cudVar3.n = z8;
                    cudVar3.o = z7;
                    cudVar3.p = i7;
                    cudVar3.t = j2;
                    cudVar3.q = i8;
                    zxj0Var4 = zxj0Var3;
                    cudVar3.r = i12;
                    m0k0Var8 = m0k0Var7;
                    cudVar3.u = jLongValue2;
                    cudVar3.s = i11;
                    cudVar3.x = 5;
                    hrsVar4 = hrsVar3;
                    ic9Var5 = ic9Var4;
                    gweVar5 = gweVar4;
                    i13 = i7;
                    z9 = z8;
                    z10 = z7;
                    objR = h9cVar3.f12667a.r(j14, b2, d2, j15, j16, cudVar3);
                    cudVar2 = cudVar3;
                    obj7 = obj5;
                    if (objR != obj7) {
                        j3 = jLongValue2;
                        i14 = i8;
                        obj8 = objR;
                        z11 = z9;
                        z12 = z10;
                        i15 = i13;
                        i16 = i11;
                        zxj0Var5 = zxj0Var4;
                        i17 = i12;
                        gweVar6 = gweVar5;
                        j4 = j2;
                        hrsVar5 = hrsVar4;
                        m0k0Var9 = m0k0Var8;
                        zBooleanValue = ((Boolean) obj8).booleanValue();
                        gweVar7 = gweVar6;
                        q4fVarA = ((j9c) this.i).a();
                        ygpVar = ygp.l;
                        r9uVar.getClass();
                        obj9 = obj7;
                        j1q0Var = r9uVar.f30104a;
                        j1q0Var.getClass();
                        if (j1q0Var.f15748a.d(ygpVar)) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (i15 == 0) {
                        }
                        i18 = i14;
                        if (i15 != 0) {
                        }
                        if (j3 < 1) {
                        }
                        if (!zBooleanValue) {
                            m0k0Var10 = m0k0Var9;
                            zxj0Var6 = zxj0Var5;
                            o4aVar = o4aVar2;
                            i19 = i16;
                            if (j4 < o4aVar.a(q4fVarA)) {
                                break;
                            }
                            vwb0Var = (vwb0) ((bhu) this.l).f2626a.e;
                            vwb0Var.getClass();
                            if (j4 == vwb0Var.b().getInt("max_coupon_size_key", 50)) {
                                return ztd.f44952a;
                            }
                            if (i15 != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            cudVar2.i = null;
                            cudVar2.j = null;
                            cudVar2.k = null;
                            cudVar2.l = null;
                            cudVar2.m = null;
                            cudVar2.n = z11;
                            cudVar2.o = z12;
                            cudVar2.p = i15;
                            cudVar2.t = j4;
                            cudVar2.q = i18;
                            cudVar2.r = i17;
                            cudVar2.u = j3;
                            cudVar2.s = i19;
                            cudVar2.x = 7;
                            objE2 = e(m0k0Var10, zxj0Var6, q4fVarA, gweVar7, z14, ic9Var5, cudVar2);
                            if (objE2 == obj9) {
                                return obj9;
                            }
                            return objE2;
                        }
                        long j17 = m0k0Var9.f20959a;
                        long j18 = m0k0Var9.B;
                        cudVar2.i = null;
                        cudVar2.j = null;
                        cudVar2.k = null;
                        cudVar2.l = null;
                        cudVar2.m = null;
                        cudVar2.n = z11;
                        cudVar2.o = z12;
                        cudVar2.p = i15;
                        cudVar2.t = j4;
                        cudVar2.q = i18;
                        cudVar2.r = i17;
                        cudVar2.u = j3;
                        cudVar2.s = i16;
                        cudVar2.x = 6;
                        obj7 = obj9;
                        objD = d(zxj0Var5, j17, j18, cudVar2);
                        if (objD != obj7) {
                            return objD;
                        }
                        break;
                    }
                    return obj7;
                }
                return obj11;
            case 2:
                long j19 = cudVar3.t;
                int i22 = cudVar3.p;
                boolean z18 = cudVar3.o;
                boolean z19 = cudVar3.n;
                ic9 ic9Var8 = cudVar3.m;
                hrs hrsVar8 = cudVar3.l;
                gwe gweVar9 = cudVar3.k;
                zxj0 zxj0Var8 = cudVar3.j;
                m0k0 m0k0Var12 = cudVar3.i;
                z1x.P(obj10);
                i2 = i22;
                m0k0Var3 = m0k0Var12;
                gweVar3 = gweVar9;
                ic9Var3 = ic9Var8;
                zxj0Var2 = zxj0Var8;
                hrsVar2 = hrsVar8;
                z3 = z19;
                z4 = z18;
                j = j19;
                boolean zIsEmpty3 = ((Collection) obj10).isEmpty();
                i3 = !zIsEmpty3 ? 1 : 0;
                if (j > 0) {
                    i4 = 0;
                } else {
                    i4 = 0;
                }
                e8u e8uVar3 = (e8u) this.d;
                long j110 = zxj0Var2.f45162a;
                cudVar3.i = m0k0Var3;
                cudVar3.j = zxj0Var2;
                cudVar3.k = gweVar3;
                cudVar3.l = hrsVar2;
                cudVar3.m = ic9Var3;
                cudVar3.n = z3;
                cudVar3.o = z4;
                cudVar3.p = i2;
                cudVar3.t = j;
                cudVar3.q = i3;
                cudVar3.r = i4;
                m0k0Var4 = m0k0Var3;
                cudVar3.x = 3;
                objE = e8uVar3.f7391a.E(j110, cudVar3);
                obj2 = obj11;
                if (objE == obj2) {
                    return obj2;
                }
                z5 = z4;
                obj3 = objE;
                m0k0Var5 = m0k0Var4;
                obj4 = obj2;
                jLongValue2 = ((Number) obj3).longValue();
                x4u x4uVar3 = (x4u) this.e;
                long j111 = m0k0Var5.Y;
                cudVar3.i = m0k0Var5;
                cudVar3.j = zxj0Var2;
                cudVar3.k = gweVar3;
                cudVar3.l = hrsVar2;
                cudVar3.m = ic9Var3;
                cudVar3.n = z3;
                cudVar3.o = z5;
                cudVar3.p = i2;
                cudVar3.t = j;
                cudVar3.q = i3;
                cudVar3.r = i4;
                m0k0Var6 = m0k0Var5;
                i5 = i4;
                cudVar3.u = jLongValue2;
                cudVar3.x = 4;
                z6 = z5;
                i6 = i3;
                objW0 = sj3.w0(cudVar3, ((ou6) ((chf0) x4uVar3.f40284a).c).f25862a, new hu6(j111, null, (byte) 1), true, false);
                if (objW0 == obj4) {
                    return obj4;
                }
                ic9 ic9Var9 = ic9Var3;
                i7 = i2;
                ic9Var4 = ic9Var9;
                obj5 = obj4;
                j2 = j;
                zxj0Var3 = zxj0Var2;
                hrsVar3 = hrsVar2;
                gweVar4 = gweVar3;
                i8 = i6;
                z7 = z6;
                obj6 = objW0;
                z8 = z3;
                m0k0Var7 = m0k0Var6;
                i9 = i5;
                if (((Number) obj6).longValue() > 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                h9c h9cVar4 = (h9c) this.f;
                i11 = i10;
                i12 = i9;
                long j112 = zxj0Var3.f45162a;
                byte b3 = zxj0Var3.i.f36034a;
                double d3 = zxj0Var3.g;
                long j113 = zxj0Var3.b;
                long j114 = zxj0Var3.j;
                cudVar3.i = m0k0Var7;
                cudVar3.j = zxj0Var3;
                cudVar3.k = gweVar4;
                cudVar3.l = hrsVar3;
                cudVar3.m = ic9Var4;
                cudVar3.n = z8;
                cudVar3.o = z7;
                cudVar3.p = i7;
                cudVar3.t = j2;
                cudVar3.q = i8;
                zxj0Var4 = zxj0Var3;
                cudVar3.r = i12;
                m0k0Var8 = m0k0Var7;
                cudVar3.u = jLongValue2;
                cudVar3.s = i11;
                cudVar3.x = 5;
                hrsVar4 = hrsVar3;
                ic9Var5 = ic9Var4;
                gweVar5 = gweVar4;
                i13 = i7;
                z9 = z8;
                z10 = z7;
                objR = h9cVar4.f12667a.r(j112, b3, d3, j113, j114, cudVar3);
                cudVar2 = cudVar3;
                obj7 = obj5;
                if (objR != obj7) {
                    j3 = jLongValue2;
                    i14 = i8;
                    obj8 = objR;
                    z11 = z9;
                    z12 = z10;
                    i15 = i13;
                    i16 = i11;
                    zxj0Var5 = zxj0Var4;
                    i17 = i12;
                    gweVar6 = gweVar5;
                    j4 = j2;
                    hrsVar5 = hrsVar4;
                    m0k0Var9 = m0k0Var8;
                    zBooleanValue = ((Boolean) obj8).booleanValue();
                    gweVar7 = gweVar6;
                    q4fVarA = ((j9c) this.i).a();
                    ygpVar = ygp.l;
                    r9uVar.getClass();
                    obj9 = obj7;
                    j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    if (j1q0Var.f15748a.d(ygpVar)) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (i15 == 0) {
                    }
                    i18 = i14;
                    if (i15 != 0) {
                    }
                    if (j3 < 1) {
                    }
                    if (!zBooleanValue) {
                        m0k0Var10 = m0k0Var9;
                        zxj0Var6 = zxj0Var5;
                        o4aVar = o4aVar2;
                        i19 = i16;
                        if (j4 < o4aVar.a(q4fVarA)) {
                            break;
                        }
                        vwb0Var = (vwb0) ((bhu) this.l).f2626a.e;
                        vwb0Var.getClass();
                        if (j4 == vwb0Var.b().getInt("max_coupon_size_key", 50)) {
                            return ztd.f44952a;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cudVar2.i = null;
                        cudVar2.j = null;
                        cudVar2.k = null;
                        cudVar2.l = null;
                        cudVar2.m = null;
                        cudVar2.n = z11;
                        cudVar2.o = z12;
                        cudVar2.p = i15;
                        cudVar2.t = j4;
                        cudVar2.q = i18;
                        cudVar2.r = i17;
                        cudVar2.u = j3;
                        cudVar2.s = i19;
                        cudVar2.x = 7;
                        objE2 = e(m0k0Var10, zxj0Var6, q4fVarA, gweVar7, z14, ic9Var5, cudVar2);
                        if (objE2 == obj9) {
                            return obj9;
                        }
                        return objE2;
                    }
                    long j115 = m0k0Var9.f20959a;
                    long j116 = m0k0Var9.B;
                    cudVar2.i = null;
                    cudVar2.j = null;
                    cudVar2.k = null;
                    cudVar2.l = null;
                    cudVar2.m = null;
                    cudVar2.n = z11;
                    cudVar2.o = z12;
                    cudVar2.p = i15;
                    cudVar2.t = j4;
                    cudVar2.q = i18;
                    cudVar2.r = i17;
                    cudVar2.u = j3;
                    cudVar2.s = i16;
                    cudVar2.x = 6;
                    obj7 = obj9;
                    objD = d(zxj0Var5, j115, j116, cudVar2);
                    if (objD != obj7) {
                        return objD;
                    }
                    break;
                }
                return obj7;
            case 3:
                int i23 = cudVar3.r;
                i3 = cudVar3.q;
                j = cudVar3.t;
                i2 = cudVar3.p;
                boolean z20 = cudVar3.o;
                z3 = cudVar3.n;
                ic9Var3 = cudVar3.m;
                hrsVar2 = cudVar3.l;
                gweVar3 = cudVar3.k;
                zxj0 zxj0Var9 = cudVar3.j;
                m0k0Var5 = cudVar3.i;
                z1x.P(obj10);
                o4aVar2 = o4aVar2;
                r9uVar = r9uVar;
                obj2 = obj11;
                z5 = z20;
                zxj0Var2 = zxj0Var9;
                obj3 = obj10;
                i4 = i23;
                obj4 = obj2;
                jLongValue2 = ((Number) obj3).longValue();
                x4u x4uVar4 = (x4u) this.e;
                long j117 = m0k0Var5.Y;
                cudVar3.i = m0k0Var5;
                cudVar3.j = zxj0Var2;
                cudVar3.k = gweVar3;
                cudVar3.l = hrsVar2;
                cudVar3.m = ic9Var3;
                cudVar3.n = z3;
                cudVar3.o = z5;
                cudVar3.p = i2;
                cudVar3.t = j;
                cudVar3.q = i3;
                cudVar3.r = i4;
                m0k0Var6 = m0k0Var5;
                i5 = i4;
                cudVar3.u = jLongValue2;
                cudVar3.x = 4;
                z6 = z5;
                i6 = i3;
                objW0 = sj3.w0(cudVar3, ((ou6) ((chf0) x4uVar4.f40284a).c).f25862a, new hu6(j117, null, (byte) 1), true, false);
                if (objW0 == obj4) {
                    return obj4;
                }
                ic9 ic9Var10 = ic9Var3;
                i7 = i2;
                ic9Var4 = ic9Var10;
                obj5 = obj4;
                j2 = j;
                zxj0Var3 = zxj0Var2;
                hrsVar3 = hrsVar2;
                gweVar4 = gweVar3;
                i8 = i6;
                z7 = z6;
                obj6 = objW0;
                z8 = z3;
                m0k0Var7 = m0k0Var6;
                i9 = i5;
                if (((Number) obj6).longValue() > 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                h9c h9cVar5 = (h9c) this.f;
                i11 = i10;
                i12 = i9;
                long j118 = zxj0Var3.f45162a;
                byte b4 = zxj0Var3.i.f36034a;
                double d4 = zxj0Var3.g;
                long j119 = zxj0Var3.b;
                long j1110 = zxj0Var3.j;
                cudVar3.i = m0k0Var7;
                cudVar3.j = zxj0Var3;
                cudVar3.k = gweVar4;
                cudVar3.l = hrsVar3;
                cudVar3.m = ic9Var4;
                cudVar3.n = z8;
                cudVar3.o = z7;
                cudVar3.p = i7;
                cudVar3.t = j2;
                cudVar3.q = i8;
                zxj0Var4 = zxj0Var3;
                cudVar3.r = i12;
                m0k0Var8 = m0k0Var7;
                cudVar3.u = jLongValue2;
                cudVar3.s = i11;
                cudVar3.x = 5;
                hrsVar4 = hrsVar3;
                ic9Var5 = ic9Var4;
                gweVar5 = gweVar4;
                i13 = i7;
                z9 = z8;
                z10 = z7;
                objR = h9cVar5.f12667a.r(j118, b4, d4, j119, j1110, cudVar3);
                cudVar2 = cudVar3;
                obj7 = obj5;
                if (objR != obj7) {
                    j3 = jLongValue2;
                    i14 = i8;
                    obj8 = objR;
                    z11 = z9;
                    z12 = z10;
                    i15 = i13;
                    i16 = i11;
                    zxj0Var5 = zxj0Var4;
                    i17 = i12;
                    gweVar6 = gweVar5;
                    j4 = j2;
                    hrsVar5 = hrsVar4;
                    m0k0Var9 = m0k0Var8;
                    zBooleanValue = ((Boolean) obj8).booleanValue();
                    gweVar7 = gweVar6;
                    q4fVarA = ((j9c) this.i).a();
                    ygpVar = ygp.l;
                    r9uVar.getClass();
                    obj9 = obj7;
                    j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    if (j1q0Var.f15748a.d(ygpVar)) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (i15 == 0) {
                    }
                    i18 = i14;
                    if (i15 != 0) {
                    }
                    if (j3 < 1) {
                    }
                    if (!zBooleanValue) {
                        m0k0Var10 = m0k0Var9;
                        zxj0Var6 = zxj0Var5;
                        o4aVar = o4aVar2;
                        i19 = i16;
                        if (j4 < o4aVar.a(q4fVarA)) {
                            break;
                        }
                        vwb0Var = (vwb0) ((bhu) this.l).f2626a.e;
                        vwb0Var.getClass();
                        if (j4 == vwb0Var.b().getInt("max_coupon_size_key", 50)) {
                            return ztd.f44952a;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cudVar2.i = null;
                        cudVar2.j = null;
                        cudVar2.k = null;
                        cudVar2.l = null;
                        cudVar2.m = null;
                        cudVar2.n = z11;
                        cudVar2.o = z12;
                        cudVar2.p = i15;
                        cudVar2.t = j4;
                        cudVar2.q = i18;
                        cudVar2.r = i17;
                        cudVar2.u = j3;
                        cudVar2.s = i19;
                        cudVar2.x = 7;
                        objE2 = e(m0k0Var10, zxj0Var6, q4fVarA, gweVar7, z14, ic9Var5, cudVar2);
                        if (objE2 == obj9) {
                            return obj9;
                        }
                        return objE2;
                    }
                    long j1111 = m0k0Var9.f20959a;
                    long j1112 = m0k0Var9.B;
                    cudVar2.i = null;
                    cudVar2.j = null;
                    cudVar2.k = null;
                    cudVar2.l = null;
                    cudVar2.m = null;
                    cudVar2.n = z11;
                    cudVar2.o = z12;
                    cudVar2.p = i15;
                    cudVar2.t = j4;
                    cudVar2.q = i18;
                    cudVar2.r = i17;
                    cudVar2.u = j3;
                    cudVar2.s = i16;
                    cudVar2.x = 6;
                    obj7 = obj9;
                    objD = d(zxj0Var5, j1111, j1112, cudVar2);
                    if (objD != obj7) {
                        return objD;
                    }
                    break;
                }
                return obj7;
            case 4:
                long j20 = cudVar3.u;
                int i24 = cudVar3.r;
                int i25 = cudVar3.q;
                long j21 = cudVar3.t;
                int i26 = cudVar3.p;
                boolean z21 = cudVar3.o;
                z8 = cudVar3.n;
                ic9 ic9Var11 = cudVar3.m;
                hrs hrsVar9 = cudVar3.l;
                gwe gweVar10 = cudVar3.k;
                zxj0 zxj0Var10 = cudVar3.j;
                m0k0 m0k0Var13 = cudVar3.i;
                z1x.P(obj10);
                o4aVar2 = o4aVar2;
                r9uVar = r9uVar;
                obj5 = obj11;
                i8 = i25;
                j2 = j21;
                ic9Var4 = ic9Var11;
                hrsVar3 = hrsVar9;
                obj6 = obj10;
                z7 = z21;
                m0k0Var7 = m0k0Var13;
                i7 = i26;
                i9 = i24;
                zxj0Var3 = zxj0Var10;
                jLongValue2 = j20;
                gweVar4 = gweVar10;
                if (((Number) obj6).longValue() > 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                h9c h9cVar6 = (h9c) this.f;
                i11 = i10;
                i12 = i9;
                long j1113 = zxj0Var3.f45162a;
                byte b5 = zxj0Var3.i.f36034a;
                double d5 = zxj0Var3.g;
                long j1114 = zxj0Var3.b;
                long j1115 = zxj0Var3.j;
                cudVar3.i = m0k0Var7;
                cudVar3.j = zxj0Var3;
                cudVar3.k = gweVar4;
                cudVar3.l = hrsVar3;
                cudVar3.m = ic9Var4;
                cudVar3.n = z8;
                cudVar3.o = z7;
                cudVar3.p = i7;
                cudVar3.t = j2;
                cudVar3.q = i8;
                zxj0Var4 = zxj0Var3;
                cudVar3.r = i12;
                m0k0Var8 = m0k0Var7;
                cudVar3.u = jLongValue2;
                cudVar3.s = i11;
                cudVar3.x = 5;
                hrsVar4 = hrsVar3;
                ic9Var5 = ic9Var4;
                gweVar5 = gweVar4;
                i13 = i7;
                z9 = z8;
                z10 = z7;
                objR = h9cVar6.f12667a.r(j1113, b5, d5, j1114, j1115, cudVar3);
                cudVar2 = cudVar3;
                obj7 = obj5;
                if (objR != obj7) {
                    j3 = jLongValue2;
                    i14 = i8;
                    obj8 = objR;
                    z11 = z9;
                    z12 = z10;
                    i15 = i13;
                    i16 = i11;
                    zxj0Var5 = zxj0Var4;
                    i17 = i12;
                    gweVar6 = gweVar5;
                    j4 = j2;
                    hrsVar5 = hrsVar4;
                    m0k0Var9 = m0k0Var8;
                    zBooleanValue = ((Boolean) obj8).booleanValue();
                    gweVar7 = gweVar6;
                    q4fVarA = ((j9c) this.i).a();
                    ygpVar = ygp.l;
                    r9uVar.getClass();
                    obj9 = obj7;
                    j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    if (j1q0Var.f15748a.d(ygpVar)) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (i15 == 0) {
                    }
                    i18 = i14;
                    if (i15 != 0) {
                    }
                    if (j3 < 1) {
                    }
                    if (!zBooleanValue) {
                        m0k0Var10 = m0k0Var9;
                        zxj0Var6 = zxj0Var5;
                        o4aVar = o4aVar2;
                        i19 = i16;
                        if (j4 < o4aVar.a(q4fVarA)) {
                            break;
                        }
                        vwb0Var = (vwb0) ((bhu) this.l).f2626a.e;
                        vwb0Var.getClass();
                        if (j4 == vwb0Var.b().getInt("max_coupon_size_key", 50)) {
                            return ztd.f44952a;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cudVar2.i = null;
                        cudVar2.j = null;
                        cudVar2.k = null;
                        cudVar2.l = null;
                        cudVar2.m = null;
                        cudVar2.n = z11;
                        cudVar2.o = z12;
                        cudVar2.p = i15;
                        cudVar2.t = j4;
                        cudVar2.q = i18;
                        cudVar2.r = i17;
                        cudVar2.u = j3;
                        cudVar2.s = i19;
                        cudVar2.x = 7;
                        objE2 = e(m0k0Var10, zxj0Var6, q4fVarA, gweVar7, z14, ic9Var5, cudVar2);
                        if (objE2 == obj9) {
                            return obj9;
                        }
                        return objE2;
                    }
                    long j1116 = m0k0Var9.f20959a;
                    long j1117 = m0k0Var9.B;
                    cudVar2.i = null;
                    cudVar2.j = null;
                    cudVar2.k = null;
                    cudVar2.l = null;
                    cudVar2.m = null;
                    cudVar2.n = z11;
                    cudVar2.o = z12;
                    cudVar2.p = i15;
                    cudVar2.t = j4;
                    cudVar2.q = i18;
                    cudVar2.r = i17;
                    cudVar2.u = j3;
                    cudVar2.s = i16;
                    cudVar2.x = 6;
                    obj7 = obj9;
                    objD = d(zxj0Var5, j1116, j1117, cudVar2);
                    if (objD != obj7) {
                        return objD;
                    }
                    break;
                }
                return obj7;
            case 5:
                int i27 = cudVar3.s;
                long j22 = cudVar3.u;
                int i28 = cudVar3.r;
                int i29 = cudVar3.q;
                long j23 = cudVar3.t;
                int i30 = cudVar3.p;
                boolean z22 = cudVar3.o;
                boolean z23 = cudVar3.n;
                i16 = i27;
                ic9 ic9Var12 = cudVar3.m;
                hrs hrsVar10 = cudVar3.l;
                gwe gweVar11 = cudVar3.k;
                zxj0 zxj0Var11 = cudVar3.j;
                m0k0 m0k0Var14 = cudVar3.i;
                z1x.P(obj10);
                ic9Var5 = ic9Var12;
                o4aVar2 = o4aVar2;
                r9uVar = r9uVar;
                i14 = i29;
                hrsVar5 = hrsVar10;
                m0k0Var9 = m0k0Var14;
                z12 = z22;
                i17 = i28;
                cudVar2 = cudVar3;
                gweVar6 = gweVar11;
                zxj0Var5 = zxj0Var11;
                obj8 = obj10;
                j4 = j23;
                j3 = j22;
                i15 = i30;
                z11 = z23;
                obj7 = obj11;
                zBooleanValue = ((Boolean) obj8).booleanValue();
                gweVar7 = gweVar6;
                q4fVarA = ((j9c) this.i).a();
                ygpVar = ygp.l;
                r9uVar.getClass();
                obj9 = obj7;
                j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                if (j1q0Var.f15748a.d(ygpVar)) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (i15 == 0) {
                    break;
                }
                i18 = i14;
                if (i15 != 0) {
                }
                if (j3 < 1) {
                }
                if (!zBooleanValue) {
                    long j1118 = m0k0Var9.f20959a;
                    long j1119 = m0k0Var9.B;
                    cudVar2.i = null;
                    cudVar2.j = null;
                    cudVar2.k = null;
                    cudVar2.l = null;
                    cudVar2.m = null;
                    cudVar2.n = z11;
                    cudVar2.o = z12;
                    cudVar2.p = i15;
                    cudVar2.t = j4;
                    cudVar2.q = i18;
                    cudVar2.r = i17;
                    cudVar2.u = j3;
                    cudVar2.s = i16;
                    cudVar2.x = 6;
                    obj7 = obj9;
                    objD = d(zxj0Var5, j1118, j1119, cudVar2);
                    if (objD != obj7) {
                        return objD;
                    }
                    return obj7;
                }
                m0k0Var10 = m0k0Var9;
                zxj0Var6 = zxj0Var5;
                o4aVar = o4aVar2;
                i19 = i16;
                if (j4 < o4aVar.a(q4fVarA)) {
                    break;
                }
                vwb0Var = (vwb0) ((bhu) this.l).f2626a.e;
                vwb0Var.getClass();
                if (j4 == vwb0Var.b().getInt("max_coupon_size_key", 50)) {
                    return ztd.f44952a;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                cudVar2.i = null;
                cudVar2.j = null;
                cudVar2.k = null;
                cudVar2.l = null;
                cudVar2.m = null;
                cudVar2.n = z11;
                cudVar2.o = z12;
                cudVar2.p = i15;
                cudVar2.t = j4;
                cudVar2.q = i18;
                cudVar2.r = i17;
                cudVar2.u = j3;
                cudVar2.s = i19;
                cudVar2.x = 7;
                objE2 = e(m0k0Var10, zxj0Var6, q4fVarA, gweVar7, z14, ic9Var5, cudVar2);
                if (objE2 == obj9) {
                    return obj9;
                }
                return objE2;
            case 6:
                z1x.P(obj10);
                return obj10;
            case 7:
                z1x.P(obj10);
                return obj10;
            default:
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public g45 c() {
        lye lyeVar = (lye) this.h;
        m0f m0fVar = (m0f) this.i;
        ave aveVar = (ave) this.j;
        ehf0 ehf0Var = new ehf0((gii0) this.e, (byte) 23);
        vwb0 vwb0Var = (vwb0) this.k;
        q7d0 q7d0Var = (q7d0) this.l;
        us3 us3Var = (us3) this.m;
        knf0 knf0Var = (knf0) this.d;
        mne mneVarH = ((psc) ((cad) this.f).b).h();
        x1x.x(mneVarH);
        return new g45(lyeVar, m0fVar, aveVar, ehf0Var, vwb0Var, q7d0Var, us3Var, knf0Var, mneVarH);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object d(zxj0 zxj0Var, long j, long j2, zje zjeVar) {
        dud dudVar;
        long j3;
        long j4;
        zxj0 zxj0Var2;
        zxj0 zxj0Var3;
        long j5;
        long j6;
        if (zjeVar instanceof dud) {
            dudVar = (dud) zjeVar;
            int i = dudVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                dudVar.n = i - Integer.MIN_VALUE;
            } else {
                dudVar = new dud(this, zjeVar);
            }
        } else {
            dudVar = new dud(this, zjeVar);
        }
        dud dudVar2 = dudVar;
        Object objJ = dudVar2.l;
        wne wneVar = wne.f39444a;
        int i2 = dudVar2.n;
        if (i2 != 0) {
            if (i2 == 1) {
                j4 = dudVar2.k;
                j3 = dudVar2.j;
                zxj0Var2 = dudVar2.i;
                z1x.P(objJ);
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j5 = dudVar2.k;
                j6 = dudVar2.j;
                zxj0Var3 = dudVar2.i;
                z1x.P(objJ);
            }
            return new wtd(zxj0Var3.f45162a, j6, j5);
        }
        z1x.P(objJ);
        g3v g3vVar = (g3v) this.g;
        long j7 = zxj0Var.f45162a;
        byte b = zxj0Var.i.f36034a;
        double d = zxj0Var.g;
        long j8 = zxj0Var.b;
        long j9 = zxj0Var.j;
        dudVar2.i = zxj0Var;
        dudVar2.j = j;
        dudVar2.k = j2;
        dudVar2.n = 1;
        objJ = g3vVar.f10630a.J(j7, b, d, j8, j9, dudVar2);
        if (objJ != wneVar) {
            j3 = j;
            j4 = j2;
            zxj0Var2 = zxj0Var;
        }
        return wneVar;
        qv2 qv2Var = (qv2) this.m;
        long j10 = ((qu6) objJ).f29333a;
        dudVar2.i = zxj0Var2;
        dudVar2.j = j3;
        dudVar2.k = j4;
        dudVar2.n = 2;
        if (qv2Var.s(j10, dudVar2) != wneVar) {
            zxj0Var3 = zxj0Var2;
            j5 = j4;
            j6 = j3;
            return new wtd(zxj0Var3.f45162a, j6, j5);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x010e  */
    /* JADX WARN: Code duplicated, block: B:31:0x014a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0158  */
    /* JADX WARN: Code duplicated, block: B:36:0x015b  */
    /* JADX WARN: Code duplicated, block: B:42:0x017b A[PHI: r1 r4 r6 r7 r8
  0x017b: PHI (r1v9 boolean) = (r1v7 boolean), (r1v7 boolean), (r1v7 boolean), (r1v10 boolean) binds: [B:33:0x0156, B:46:0x019b, B:40:0x0177, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x017b: PHI (r4v13 long) = (r4v10 long), (r4v10 long), (r4v10 long), (r4v16 long) binds: [B:33:0x0156, B:46:0x019b, B:40:0x0177, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x017b: PHI (r6v9 boolean) = (r6v7 boolean), (r6v7 boolean), (r6v7 boolean), (r6v11 boolean) binds: [B:33:0x0156, B:46:0x019b, B:40:0x0177, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x017b: PHI (r7v12 a.zxj0) = (r7v10 a.zxj0), (r7v10 a.zxj0), (r7v10 a.zxj0), (r7v14 a.zxj0) binds: [B:33:0x0156, B:46:0x019b, B:40:0x0177, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x017b: PHI (r8v8 a.m0k0) = (r8v6 a.m0k0), (r8v6 a.m0k0), (r8v6 a.m0k0), (r8v10 a.m0k0) binds: [B:33:0x0156, B:46:0x019b, B:40:0x0177, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0184  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x0210  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object e(m0k0 m0k0Var, zxj0 zxj0Var, q4f q4fVar, gwe gweVar, boolean z, ic9 ic9Var, zje zjeVar) {
        eud eudVar;
        boolean zA;
        lvj0 lvj0VarF;
        m0k0 m0k0Var2;
        Object obj;
        boolean z2;
        long jLongValue;
        boolean z3;
        long j;
        m0k0 m0k0Var3;
        lvj0 lvj0Var;
        zxj0 zxj0Var2;
        boolean z4;
        zxj0 zxj0Var3;
        m0k0 m0k0Var4;
        q4f q4fVar2;
        int iOrdinal;
        vit0 vit0Var;
        boolean z5;
        zxj0 zxj0Var4;
        m0k0 m0k0Var5;
        long j2;
        long j3;
        long j4;
        boolean z6;
        long j5;
        long j6;
        long j7;
        long jLongValue2;
        String strB;
        String str;
        String str2;
        String strA;
        Object objA;
        String str3;
        String str4;
        long j8;
        String str5;
        String str6;
        zxj0 zxj0Var5 = zxj0Var;
        if (zjeVar instanceof eud) {
            eudVar = (eud) zjeVar;
            int i = eudVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                eudVar.x = i - Integer.MIN_VALUE;
            } else {
                eudVar = new eud(this, zjeVar);
            }
        } else {
            eudVar = new eud(this, zjeVar);
        }
        eud eudVar2 = eudVar;
        Object objS = eudVar2.v;
        Object obj2 = wne.f39444a;
        switch (eudVar2.x) {
            case 0:
                z1x.P(objS);
                zA = ((vn7) this.n).f37705a.a();
                lvj0VarF = x8x.F(zxj0Var5, zA);
                chf0 chf0Var = (chf0) this.j;
                int iA = ((o4a) this.k).a(q4fVar);
                eudVar2.i = m0k0Var;
                eudVar2.j = zxj0Var5;
                eudVar2.k = lvj0VarF;
                eudVar2.p = z;
                eudVar2.q = zA;
                eudVar2.x = 1;
                Object objO = chf0Var.O(m0k0Var, lvj0VarF, iA, gweVar, z, ic9Var, eudVar2);
                if (objO != obj2) {
                    m0k0Var2 = m0k0Var;
                    obj = objO;
                    z2 = z;
                    jLongValue = ((Number) obj).longValue();
                    eudVar2.i = m0k0Var2;
                    eudVar2.j = zxj0Var5;
                    eudVar2.k = lvj0VarF;
                    eudVar2.p = z2;
                    eudVar2.q = zA;
                    eudVar2.r = jLongValue;
                    eudVar2.x = 2;
                    if (a(lvj0VarF, eudVar2) != obj2) {
                        lvj0 lvj0Var2 = lvj0VarF;
                        z3 = z2;
                        j = jLongValue;
                        m0k0Var3 = m0k0Var2;
                        lvj0Var = lvj0Var2;
                        zxj0Var2 = zxj0Var5;
                        z4 = zA;
                        ((lye) ((jtt) this.s).f17117a.f10647a).h = true;
                        phf0 phf0Var = (phf0) this.r;
                        long j9 = lvj0Var.f20718a;
                        boolean z7 = m0k0Var3.f1;
                        eudVar2.i = m0k0Var3;
                        eudVar2.j = zxj0Var2;
                        eudVar2.k = null;
                        eudVar2.p = z3;
                        eudVar2.q = z4;
                        eudVar2.r = j;
                        eudVar2.x = 3;
                        objS = phf0Var.s(j9, z7, z3, eudVar2);
                        if (objS != obj2) {
                            zxj0Var3 = zxj0Var2;
                            m0k0Var4 = m0k0Var3;
                            fye fyeVar = (fye) objS;
                            llx llxVar = fyeVar.b;
                            q4fVar2 = fyeVar.f10354a;
                            iOrdinal = llxVar.ordinal();
                            if (iOrdinal == 0) {
                                z5 = z3;
                                zxj0Var4 = zxj0Var3;
                                m0k0Var5 = m0k0Var4;
                                j2 = j;
                                j3 = m0k0Var5.f20959a;
                                j4 = m0k0Var5.B;
                                h9c h9cVar = (h9c) this.b;
                                eudVar2.i = m0k0Var5;
                                eudVar2.j = zxj0Var4;
                                eudVar2.k = null;
                                eudVar2.p = z5;
                                eudVar2.q = z4;
                                eudVar2.r = j2;
                                eudVar2.s = j3;
                                eudVar2.t = j4;
                                eudVar2.x = 6;
                                objS = h9cVar.f12667a.D(eudVar2);
                                if (objS != obj2) {
                                    z6 = z5;
                                    j5 = j4;
                                    j6 = j2;
                                    j7 = j3;
                                    m0k0 m0k0Var6 = m0k0Var5;
                                    jLongValue2 = ((Number) objS).longValue();
                                    strB = m0k0Var6.b();
                                    str = zxj0Var4.e;
                                    str2 = zxj0Var4.c;
                                    strA = zxj0Var4.a(z4);
                                    ik9 ik9Var = (ik9) this.h;
                                    eudVar2.i = null;
                                    eudVar2.j = null;
                                    eudVar2.k = null;
                                    eudVar2.l = strB;
                                    eudVar2.m = str;
                                    eudVar2.n = str2;
                                    eudVar2.o = strA;
                                    eudVar2.p = z6;
                                    eudVar2.q = z4;
                                    eudVar2.r = j6;
                                    eudVar2.s = j7;
                                    eudVar2.t = j5;
                                    eudVar2.u = jLongValue2;
                                    eudVar2.x = 7;
                                    objA = ik9Var.a(eudVar2);
                                    if (objA == obj2) {
                                        return obj2;
                                    }
                                    str3 = strB;
                                    str4 = str2;
                                    j8 = jLongValue2;
                                    str5 = strA;
                                    str6 = str;
                                    objS = objA;
                                    return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                                }
                            } else if (iOrdinal != 1 || iOrdinal == 2) {
                                vit0Var = (vit0) this.p;
                                eudVar2.i = m0k0Var4;
                                eudVar2.j = zxj0Var3;
                                eudVar2.k = null;
                                eudVar2.p = z3;
                                eudVar2.q = z4;
                                eudVar2.r = j;
                                eudVar2.x = 4;
                                if (vit0Var.g(q4fVar2, eudVar2) != obj2) {
                                    z5 = z3;
                                    zxj0Var4 = zxj0Var3;
                                    m0k0Var5 = m0k0Var4;
                                    j2 = j;
                                    j3 = m0k0Var5.f20959a;
                                    j4 = m0k0Var5.B;
                                    h9c h9cVar2 = (h9c) this.b;
                                    eudVar2.i = m0k0Var5;
                                    eudVar2.j = zxj0Var4;
                                    eudVar2.k = null;
                                    eudVar2.p = z5;
                                    eudVar2.q = z4;
                                    eudVar2.r = j2;
                                    eudVar2.s = j3;
                                    eudVar2.t = j4;
                                    eudVar2.x = 6;
                                    objS = h9cVar2.f12667a.D(eudVar2);
                                    if (objS != obj2) {
                                        z6 = z5;
                                        j5 = j4;
                                        j6 = j2;
                                        j7 = j3;
                                        m0k0 m0k0Var7 = m0k0Var5;
                                        jLongValue2 = ((Number) objS).longValue();
                                        strB = m0k0Var7.b();
                                        str = zxj0Var4.e;
                                        str2 = zxj0Var4.c;
                                        strA = zxj0Var4.a(z4);
                                        ik9 ik9Var2 = (ik9) this.h;
                                        eudVar2.i = null;
                                        eudVar2.j = null;
                                        eudVar2.k = null;
                                        eudVar2.l = strB;
                                        eudVar2.m = str;
                                        eudVar2.n = str2;
                                        eudVar2.o = strA;
                                        eudVar2.p = z6;
                                        eudVar2.q = z4;
                                        eudVar2.r = j6;
                                        eudVar2.s = j7;
                                        eudVar2.t = j5;
                                        eudVar2.u = jLongValue2;
                                        eudVar2.x = 7;
                                        objA = ik9Var2.a(eudVar2);
                                        if (objA == obj2) {
                                            return obj2;
                                        }
                                        str3 = strB;
                                        str4 = str2;
                                        j8 = jLongValue2;
                                        str5 = strA;
                                        str6 = str;
                                        objS = objA;
                                        return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                                    }
                                }
                            } else {
                                if (iOrdinal != 3) {
                                    t9f.b();
                                    return null;
                                }
                                fht0 fht0Var = (fht0) this.q;
                                eudVar2.i = m0k0Var4;
                                eudVar2.j = zxj0Var3;
                                eudVar2.k = null;
                                eudVar2.p = z3;
                                eudVar2.q = z4;
                                eudVar2.r = j;
                                eudVar2.x = 5;
                                if (fht0Var.k(j, q4fVar2, eudVar2) != obj2) {
                                    z5 = z3;
                                    zxj0Var4 = zxj0Var3;
                                    m0k0Var5 = m0k0Var4;
                                    j2 = j;
                                    j3 = m0k0Var5.f20959a;
                                    j4 = m0k0Var5.B;
                                    h9c h9cVar3 = (h9c) this.b;
                                    eudVar2.i = m0k0Var5;
                                    eudVar2.j = zxj0Var4;
                                    eudVar2.k = null;
                                    eudVar2.p = z5;
                                    eudVar2.q = z4;
                                    eudVar2.r = j2;
                                    eudVar2.s = j3;
                                    eudVar2.t = j4;
                                    eudVar2.x = 6;
                                    objS = h9cVar3.f12667a.D(eudVar2);
                                    if (objS != obj2) {
                                        z6 = z5;
                                        j5 = j4;
                                        j6 = j2;
                                        j7 = j3;
                                        m0k0 m0k0Var8 = m0k0Var5;
                                        jLongValue2 = ((Number) objS).longValue();
                                        strB = m0k0Var8.b();
                                        str = zxj0Var4.e;
                                        str2 = zxj0Var4.c;
                                        strA = zxj0Var4.a(z4);
                                        ik9 ik9Var3 = (ik9) this.h;
                                        eudVar2.i = null;
                                        eudVar2.j = null;
                                        eudVar2.k = null;
                                        eudVar2.l = strB;
                                        eudVar2.m = str;
                                        eudVar2.n = str2;
                                        eudVar2.o = strA;
                                        eudVar2.p = z6;
                                        eudVar2.q = z4;
                                        eudVar2.r = j6;
                                        eudVar2.s = j7;
                                        eudVar2.t = j5;
                                        eudVar2.u = jLongValue2;
                                        eudVar2.x = 7;
                                        objA = ik9Var3.a(eudVar2);
                                        if (objA == obj2) {
                                            return obj2;
                                        }
                                        str3 = strB;
                                        str4 = str2;
                                        j8 = jLongValue2;
                                        str5 = strA;
                                        str6 = str;
                                        objS = objA;
                                        return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                boolean z8 = eudVar2.q;
                z2 = eudVar2.p;
                lvj0 lvj0Var3 = eudVar2.k;
                zxj0 zxj0Var6 = eudVar2.j;
                m0k0Var2 = eudVar2.i;
                z1x.P(objS);
                zA = z8;
                zxj0Var5 = zxj0Var6;
                lvj0VarF = lvj0Var3;
                obj = objS;
                jLongValue = ((Number) obj).longValue();
                eudVar2.i = m0k0Var2;
                eudVar2.j = zxj0Var5;
                eudVar2.k = lvj0VarF;
                eudVar2.p = z2;
                eudVar2.q = zA;
                eudVar2.r = jLongValue;
                eudVar2.x = 2;
                if (a(lvj0VarF, eudVar2) != obj2) {
                    lvj0 lvj0Var4 = lvj0VarF;
                    z3 = z2;
                    j = jLongValue;
                    m0k0Var3 = m0k0Var2;
                    lvj0Var = lvj0Var4;
                    zxj0Var2 = zxj0Var5;
                    z4 = zA;
                    ((lye) ((jtt) this.s).f17117a.f10647a).h = true;
                    phf0 phf0Var2 = (phf0) this.r;
                    long j10 = lvj0Var.f20718a;
                    boolean z9 = m0k0Var3.f1;
                    eudVar2.i = m0k0Var3;
                    eudVar2.j = zxj0Var2;
                    eudVar2.k = null;
                    eudVar2.p = z3;
                    eudVar2.q = z4;
                    eudVar2.r = j;
                    eudVar2.x = 3;
                    objS = phf0Var2.s(j10, z9, z3, eudVar2);
                    if (objS != obj2) {
                        zxj0Var3 = zxj0Var2;
                        m0k0Var4 = m0k0Var3;
                        fye fyeVar2 = (fye) objS;
                        llx llxVar2 = fyeVar2.b;
                        q4fVar2 = fyeVar2.f10354a;
                        iOrdinal = llxVar2.ordinal();
                        if (iOrdinal == 0) {
                            z5 = z3;
                            zxj0Var4 = zxj0Var3;
                            m0k0Var5 = m0k0Var4;
                            j2 = j;
                            j3 = m0k0Var5.f20959a;
                            j4 = m0k0Var5.B;
                            h9c h9cVar4 = (h9c) this.b;
                            eudVar2.i = m0k0Var5;
                            eudVar2.j = zxj0Var4;
                            eudVar2.k = null;
                            eudVar2.p = z5;
                            eudVar2.q = z4;
                            eudVar2.r = j2;
                            eudVar2.s = j3;
                            eudVar2.t = j4;
                            eudVar2.x = 6;
                            objS = h9cVar4.f12667a.D(eudVar2);
                            if (objS != obj2) {
                                z6 = z5;
                                j5 = j4;
                                j6 = j2;
                                j7 = j3;
                                m0k0 m0k0Var9 = m0k0Var5;
                                jLongValue2 = ((Number) objS).longValue();
                                strB = m0k0Var9.b();
                                str = zxj0Var4.e;
                                str2 = zxj0Var4.c;
                                strA = zxj0Var4.a(z4);
                                ik9 ik9Var4 = (ik9) this.h;
                                eudVar2.i = null;
                                eudVar2.j = null;
                                eudVar2.k = null;
                                eudVar2.l = strB;
                                eudVar2.m = str;
                                eudVar2.n = str2;
                                eudVar2.o = strA;
                                eudVar2.p = z6;
                                eudVar2.q = z4;
                                eudVar2.r = j6;
                                eudVar2.s = j7;
                                eudVar2.t = j5;
                                eudVar2.u = jLongValue2;
                                eudVar2.x = 7;
                                objA = ik9Var4.a(eudVar2);
                                if (objA == obj2) {
                                    return obj2;
                                }
                                str3 = strB;
                                str4 = str2;
                                j8 = jLongValue2;
                                str5 = strA;
                                str6 = str;
                                objS = objA;
                                return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                            }
                        } else if (iOrdinal != 1) {
                            vit0Var = (vit0) this.p;
                            eudVar2.i = m0k0Var4;
                            eudVar2.j = zxj0Var3;
                            eudVar2.k = null;
                            eudVar2.p = z3;
                            eudVar2.q = z4;
                            eudVar2.r = j;
                            eudVar2.x = 4;
                            if (vit0Var.g(q4fVar2, eudVar2) != obj2) {
                                z5 = z3;
                                zxj0Var4 = zxj0Var3;
                                m0k0Var5 = m0k0Var4;
                                j2 = j;
                                j3 = m0k0Var5.f20959a;
                                j4 = m0k0Var5.B;
                                h9c h9cVar5 = (h9c) this.b;
                                eudVar2.i = m0k0Var5;
                                eudVar2.j = zxj0Var4;
                                eudVar2.k = null;
                                eudVar2.p = z5;
                                eudVar2.q = z4;
                                eudVar2.r = j2;
                                eudVar2.s = j3;
                                eudVar2.t = j4;
                                eudVar2.x = 6;
                                objS = h9cVar5.f12667a.D(eudVar2);
                                if (objS != obj2) {
                                    z6 = z5;
                                    j5 = j4;
                                    j6 = j2;
                                    j7 = j3;
                                    m0k0 m0k0Var10 = m0k0Var5;
                                    jLongValue2 = ((Number) objS).longValue();
                                    strB = m0k0Var10.b();
                                    str = zxj0Var4.e;
                                    str2 = zxj0Var4.c;
                                    strA = zxj0Var4.a(z4);
                                    ik9 ik9Var5 = (ik9) this.h;
                                    eudVar2.i = null;
                                    eudVar2.j = null;
                                    eudVar2.k = null;
                                    eudVar2.l = strB;
                                    eudVar2.m = str;
                                    eudVar2.n = str2;
                                    eudVar2.o = strA;
                                    eudVar2.p = z6;
                                    eudVar2.q = z4;
                                    eudVar2.r = j6;
                                    eudVar2.s = j7;
                                    eudVar2.t = j5;
                                    eudVar2.u = jLongValue2;
                                    eudVar2.x = 7;
                                    objA = ik9Var5.a(eudVar2);
                                    if (objA == obj2) {
                                        return obj2;
                                    }
                                    str3 = strB;
                                    str4 = str2;
                                    j8 = jLongValue2;
                                    str5 = strA;
                                    str6 = str;
                                    objS = objA;
                                    return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                                }
                            }
                        } else {
                            vit0Var = (vit0) this.p;
                            eudVar2.i = m0k0Var4;
                            eudVar2.j = zxj0Var3;
                            eudVar2.k = null;
                            eudVar2.p = z3;
                            eudVar2.q = z4;
                            eudVar2.r = j;
                            eudVar2.x = 4;
                            if (vit0Var.g(q4fVar2, eudVar2) != obj2) {
                                z5 = z3;
                                zxj0Var4 = zxj0Var3;
                                m0k0Var5 = m0k0Var4;
                                j2 = j;
                                j3 = m0k0Var5.f20959a;
                                j4 = m0k0Var5.B;
                                h9c h9cVar6 = (h9c) this.b;
                                eudVar2.i = m0k0Var5;
                                eudVar2.j = zxj0Var4;
                                eudVar2.k = null;
                                eudVar2.p = z5;
                                eudVar2.q = z4;
                                eudVar2.r = j2;
                                eudVar2.s = j3;
                                eudVar2.t = j4;
                                eudVar2.x = 6;
                                objS = h9cVar6.f12667a.D(eudVar2);
                                if (objS != obj2) {
                                    z6 = z5;
                                    j5 = j4;
                                    j6 = j2;
                                    j7 = j3;
                                    m0k0 m0k0Var11 = m0k0Var5;
                                    jLongValue2 = ((Number) objS).longValue();
                                    strB = m0k0Var11.b();
                                    str = zxj0Var4.e;
                                    str2 = zxj0Var4.c;
                                    strA = zxj0Var4.a(z4);
                                    ik9 ik9Var6 = (ik9) this.h;
                                    eudVar2.i = null;
                                    eudVar2.j = null;
                                    eudVar2.k = null;
                                    eudVar2.l = strB;
                                    eudVar2.m = str;
                                    eudVar2.n = str2;
                                    eudVar2.o = strA;
                                    eudVar2.p = z6;
                                    eudVar2.q = z4;
                                    eudVar2.r = j6;
                                    eudVar2.s = j7;
                                    eudVar2.t = j5;
                                    eudVar2.u = jLongValue2;
                                    eudVar2.x = 7;
                                    objA = ik9Var6.a(eudVar2);
                                    if (objA == obj2) {
                                        return obj2;
                                    }
                                    str3 = strB;
                                    str4 = str2;
                                    j8 = jLongValue2;
                                    str5 = strA;
                                    str6 = str;
                                    objS = objA;
                                    return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 2:
                j = eudVar2.r;
                z4 = eudVar2.q;
                z3 = eudVar2.p;
                lvj0Var = eudVar2.k;
                zxj0Var2 = eudVar2.j;
                m0k0Var3 = eudVar2.i;
                z1x.P(objS);
                ((lye) ((jtt) this.s).f17117a.f10647a).h = true;
                phf0 phf0Var3 = (phf0) this.r;
                long j11 = lvj0Var.f20718a;
                boolean z10 = m0k0Var3.f1;
                eudVar2.i = m0k0Var3;
                eudVar2.j = zxj0Var2;
                eudVar2.k = null;
                eudVar2.p = z3;
                eudVar2.q = z4;
                eudVar2.r = j;
                eudVar2.x = 3;
                objS = phf0Var3.s(j11, z10, z3, eudVar2);
                if (objS != obj2) {
                    zxj0Var3 = zxj0Var2;
                    m0k0Var4 = m0k0Var3;
                    fye fyeVar3 = (fye) objS;
                    llx llxVar3 = fyeVar3.b;
                    q4fVar2 = fyeVar3.f10354a;
                    iOrdinal = llxVar3.ordinal();
                    if (iOrdinal == 0) {
                        z5 = z3;
                        zxj0Var4 = zxj0Var3;
                        m0k0Var5 = m0k0Var4;
                        j2 = j;
                        j3 = m0k0Var5.f20959a;
                        j4 = m0k0Var5.B;
                        h9c h9cVar7 = (h9c) this.b;
                        eudVar2.i = m0k0Var5;
                        eudVar2.j = zxj0Var4;
                        eudVar2.k = null;
                        eudVar2.p = z5;
                        eudVar2.q = z4;
                        eudVar2.r = j2;
                        eudVar2.s = j3;
                        eudVar2.t = j4;
                        eudVar2.x = 6;
                        objS = h9cVar7.f12667a.D(eudVar2);
                        if (objS != obj2) {
                            z6 = z5;
                            j5 = j4;
                            j6 = j2;
                            j7 = j3;
                            m0k0 m0k0Var12 = m0k0Var5;
                            jLongValue2 = ((Number) objS).longValue();
                            strB = m0k0Var12.b();
                            str = zxj0Var4.e;
                            str2 = zxj0Var4.c;
                            strA = zxj0Var4.a(z4);
                            ik9 ik9Var7 = (ik9) this.h;
                            eudVar2.i = null;
                            eudVar2.j = null;
                            eudVar2.k = null;
                            eudVar2.l = strB;
                            eudVar2.m = str;
                            eudVar2.n = str2;
                            eudVar2.o = strA;
                            eudVar2.p = z6;
                            eudVar2.q = z4;
                            eudVar2.r = j6;
                            eudVar2.s = j7;
                            eudVar2.t = j5;
                            eudVar2.u = jLongValue2;
                            eudVar2.x = 7;
                            objA = ik9Var7.a(eudVar2);
                            if (objA == obj2) {
                                return obj2;
                            }
                            str3 = strB;
                            str4 = str2;
                            j8 = jLongValue2;
                            str5 = strA;
                            str6 = str;
                            objS = objA;
                            return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                        }
                    } else if (iOrdinal != 1) {
                        vit0Var = (vit0) this.p;
                        eudVar2.i = m0k0Var4;
                        eudVar2.j = zxj0Var3;
                        eudVar2.k = null;
                        eudVar2.p = z3;
                        eudVar2.q = z4;
                        eudVar2.r = j;
                        eudVar2.x = 4;
                        if (vit0Var.g(q4fVar2, eudVar2) != obj2) {
                            z5 = z3;
                            zxj0Var4 = zxj0Var3;
                            m0k0Var5 = m0k0Var4;
                            j2 = j;
                            j3 = m0k0Var5.f20959a;
                            j4 = m0k0Var5.B;
                            h9c h9cVar8 = (h9c) this.b;
                            eudVar2.i = m0k0Var5;
                            eudVar2.j = zxj0Var4;
                            eudVar2.k = null;
                            eudVar2.p = z5;
                            eudVar2.q = z4;
                            eudVar2.r = j2;
                            eudVar2.s = j3;
                            eudVar2.t = j4;
                            eudVar2.x = 6;
                            objS = h9cVar8.f12667a.D(eudVar2);
                            if (objS != obj2) {
                                z6 = z5;
                                j5 = j4;
                                j6 = j2;
                                j7 = j3;
                                m0k0 m0k0Var13 = m0k0Var5;
                                jLongValue2 = ((Number) objS).longValue();
                                strB = m0k0Var13.b();
                                str = zxj0Var4.e;
                                str2 = zxj0Var4.c;
                                strA = zxj0Var4.a(z4);
                                ik9 ik9Var8 = (ik9) this.h;
                                eudVar2.i = null;
                                eudVar2.j = null;
                                eudVar2.k = null;
                                eudVar2.l = strB;
                                eudVar2.m = str;
                                eudVar2.n = str2;
                                eudVar2.o = strA;
                                eudVar2.p = z6;
                                eudVar2.q = z4;
                                eudVar2.r = j6;
                                eudVar2.s = j7;
                                eudVar2.t = j5;
                                eudVar2.u = jLongValue2;
                                eudVar2.x = 7;
                                objA = ik9Var8.a(eudVar2);
                                if (objA == obj2) {
                                    return obj2;
                                }
                                str3 = strB;
                                str4 = str2;
                                j8 = jLongValue2;
                                str5 = strA;
                                str6 = str;
                                objS = objA;
                                return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                            }
                        }
                    } else {
                        vit0Var = (vit0) this.p;
                        eudVar2.i = m0k0Var4;
                        eudVar2.j = zxj0Var3;
                        eudVar2.k = null;
                        eudVar2.p = z3;
                        eudVar2.q = z4;
                        eudVar2.r = j;
                        eudVar2.x = 4;
                        if (vit0Var.g(q4fVar2, eudVar2) != obj2) {
                            z5 = z3;
                            zxj0Var4 = zxj0Var3;
                            m0k0Var5 = m0k0Var4;
                            j2 = j;
                            j3 = m0k0Var5.f20959a;
                            j4 = m0k0Var5.B;
                            h9c h9cVar9 = (h9c) this.b;
                            eudVar2.i = m0k0Var5;
                            eudVar2.j = zxj0Var4;
                            eudVar2.k = null;
                            eudVar2.p = z5;
                            eudVar2.q = z4;
                            eudVar2.r = j2;
                            eudVar2.s = j3;
                            eudVar2.t = j4;
                            eudVar2.x = 6;
                            objS = h9cVar9.f12667a.D(eudVar2);
                            if (objS != obj2) {
                                z6 = z5;
                                j5 = j4;
                                j6 = j2;
                                j7 = j3;
                                m0k0 m0k0Var14 = m0k0Var5;
                                jLongValue2 = ((Number) objS).longValue();
                                strB = m0k0Var14.b();
                                str = zxj0Var4.e;
                                str2 = zxj0Var4.c;
                                strA = zxj0Var4.a(z4);
                                ik9 ik9Var9 = (ik9) this.h;
                                eudVar2.i = null;
                                eudVar2.j = null;
                                eudVar2.k = null;
                                eudVar2.l = strB;
                                eudVar2.m = str;
                                eudVar2.n = str2;
                                eudVar2.o = strA;
                                eudVar2.p = z6;
                                eudVar2.q = z4;
                                eudVar2.r = j6;
                                eudVar2.s = j7;
                                eudVar2.t = j5;
                                eudVar2.u = jLongValue2;
                                eudVar2.x = 7;
                                objA = ik9Var9.a(eudVar2);
                                if (objA == obj2) {
                                    return obj2;
                                }
                                str3 = strB;
                                str4 = str2;
                                j8 = jLongValue2;
                                str5 = strA;
                                str6 = str;
                                objS = objA;
                                return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                            }
                        }
                    }
                }
                return obj2;
            case 3:
                j = eudVar2.r;
                z4 = eudVar2.q;
                z3 = eudVar2.p;
                zxj0Var3 = eudVar2.j;
                m0k0Var4 = eudVar2.i;
                z1x.P(objS);
                fye fyeVar4 = (fye) objS;
                llx llxVar4 = fyeVar4.b;
                q4fVar2 = fyeVar4.f10354a;
                iOrdinal = llxVar4.ordinal();
                if (iOrdinal == 0) {
                    z5 = z3;
                    zxj0Var4 = zxj0Var3;
                    m0k0Var5 = m0k0Var4;
                    j2 = j;
                    j3 = m0k0Var5.f20959a;
                    j4 = m0k0Var5.B;
                    h9c h9cVar10 = (h9c) this.b;
                    eudVar2.i = m0k0Var5;
                    eudVar2.j = zxj0Var4;
                    eudVar2.k = null;
                    eudVar2.p = z5;
                    eudVar2.q = z4;
                    eudVar2.r = j2;
                    eudVar2.s = j3;
                    eudVar2.t = j4;
                    eudVar2.x = 6;
                    objS = h9cVar10.f12667a.D(eudVar2);
                    if (objS != obj2) {
                        z6 = z5;
                        j5 = j4;
                        j6 = j2;
                        j7 = j3;
                        m0k0 m0k0Var15 = m0k0Var5;
                        jLongValue2 = ((Number) objS).longValue();
                        strB = m0k0Var15.b();
                        str = zxj0Var4.e;
                        str2 = zxj0Var4.c;
                        strA = zxj0Var4.a(z4);
                        ik9 ik9Var10 = (ik9) this.h;
                        eudVar2.i = null;
                        eudVar2.j = null;
                        eudVar2.k = null;
                        eudVar2.l = strB;
                        eudVar2.m = str;
                        eudVar2.n = str2;
                        eudVar2.o = strA;
                        eudVar2.p = z6;
                        eudVar2.q = z4;
                        eudVar2.r = j6;
                        eudVar2.s = j7;
                        eudVar2.t = j5;
                        eudVar2.u = jLongValue2;
                        eudVar2.x = 7;
                        objA = ik9Var10.a(eudVar2);
                        if (objA == obj2) {
                            return obj2;
                        }
                        str3 = strB;
                        str4 = str2;
                        j8 = jLongValue2;
                        str5 = strA;
                        str6 = str;
                        objS = objA;
                        return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                    }
                } else if (iOrdinal != 1) {
                    vit0Var = (vit0) this.p;
                    eudVar2.i = m0k0Var4;
                    eudVar2.j = zxj0Var3;
                    eudVar2.k = null;
                    eudVar2.p = z3;
                    eudVar2.q = z4;
                    eudVar2.r = j;
                    eudVar2.x = 4;
                    if (vit0Var.g(q4fVar2, eudVar2) != obj2) {
                        z5 = z3;
                        zxj0Var4 = zxj0Var3;
                        m0k0Var5 = m0k0Var4;
                        j2 = j;
                        j3 = m0k0Var5.f20959a;
                        j4 = m0k0Var5.B;
                        h9c h9cVar11 = (h9c) this.b;
                        eudVar2.i = m0k0Var5;
                        eudVar2.j = zxj0Var4;
                        eudVar2.k = null;
                        eudVar2.p = z5;
                        eudVar2.q = z4;
                        eudVar2.r = j2;
                        eudVar2.s = j3;
                        eudVar2.t = j4;
                        eudVar2.x = 6;
                        objS = h9cVar11.f12667a.D(eudVar2);
                        if (objS != obj2) {
                            z6 = z5;
                            j5 = j4;
                            j6 = j2;
                            j7 = j3;
                            m0k0 m0k0Var16 = m0k0Var5;
                            jLongValue2 = ((Number) objS).longValue();
                            strB = m0k0Var16.b();
                            str = zxj0Var4.e;
                            str2 = zxj0Var4.c;
                            strA = zxj0Var4.a(z4);
                            ik9 ik9Var11 = (ik9) this.h;
                            eudVar2.i = null;
                            eudVar2.j = null;
                            eudVar2.k = null;
                            eudVar2.l = strB;
                            eudVar2.m = str;
                            eudVar2.n = str2;
                            eudVar2.o = strA;
                            eudVar2.p = z6;
                            eudVar2.q = z4;
                            eudVar2.r = j6;
                            eudVar2.s = j7;
                            eudVar2.t = j5;
                            eudVar2.u = jLongValue2;
                            eudVar2.x = 7;
                            objA = ik9Var11.a(eudVar2);
                            if (objA == obj2) {
                                return obj2;
                            }
                            str3 = strB;
                            str4 = str2;
                            j8 = jLongValue2;
                            str5 = strA;
                            str6 = str;
                            objS = objA;
                            return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                        }
                    }
                } else {
                    vit0Var = (vit0) this.p;
                    eudVar2.i = m0k0Var4;
                    eudVar2.j = zxj0Var3;
                    eudVar2.k = null;
                    eudVar2.p = z3;
                    eudVar2.q = z4;
                    eudVar2.r = j;
                    eudVar2.x = 4;
                    if (vit0Var.g(q4fVar2, eudVar2) != obj2) {
                        z5 = z3;
                        zxj0Var4 = zxj0Var3;
                        m0k0Var5 = m0k0Var4;
                        j2 = j;
                        j3 = m0k0Var5.f20959a;
                        j4 = m0k0Var5.B;
                        h9c h9cVar12 = (h9c) this.b;
                        eudVar2.i = m0k0Var5;
                        eudVar2.j = zxj0Var4;
                        eudVar2.k = null;
                        eudVar2.p = z5;
                        eudVar2.q = z4;
                        eudVar2.r = j2;
                        eudVar2.s = j3;
                        eudVar2.t = j4;
                        eudVar2.x = 6;
                        objS = h9cVar12.f12667a.D(eudVar2);
                        if (objS != obj2) {
                            z6 = z5;
                            j5 = j4;
                            j6 = j2;
                            j7 = j3;
                            m0k0 m0k0Var17 = m0k0Var5;
                            jLongValue2 = ((Number) objS).longValue();
                            strB = m0k0Var17.b();
                            str = zxj0Var4.e;
                            str2 = zxj0Var4.c;
                            strA = zxj0Var4.a(z4);
                            ik9 ik9Var12 = (ik9) this.h;
                            eudVar2.i = null;
                            eudVar2.j = null;
                            eudVar2.k = null;
                            eudVar2.l = strB;
                            eudVar2.m = str;
                            eudVar2.n = str2;
                            eudVar2.o = strA;
                            eudVar2.p = z6;
                            eudVar2.q = z4;
                            eudVar2.r = j6;
                            eudVar2.s = j7;
                            eudVar2.t = j5;
                            eudVar2.u = jLongValue2;
                            eudVar2.x = 7;
                            objA = ik9Var12.a(eudVar2);
                            if (objA == obj2) {
                                return obj2;
                            }
                            str3 = strB;
                            str4 = str2;
                            j8 = jLongValue2;
                            str5 = strA;
                            str6 = str;
                            objS = objA;
                            return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                        }
                    }
                }
                return obj2;
            case 4:
            case 5:
                j = eudVar2.r;
                z4 = eudVar2.q;
                z3 = eudVar2.p;
                zxj0Var3 = eudVar2.j;
                m0k0Var4 = eudVar2.i;
                z1x.P(objS);
                z5 = z3;
                zxj0Var4 = zxj0Var3;
                m0k0Var5 = m0k0Var4;
                j2 = j;
                j3 = m0k0Var5.f20959a;
                j4 = m0k0Var5.B;
                h9c h9cVar13 = (h9c) this.b;
                eudVar2.i = m0k0Var5;
                eudVar2.j = zxj0Var4;
                eudVar2.k = null;
                eudVar2.p = z5;
                eudVar2.q = z4;
                eudVar2.r = j2;
                eudVar2.s = j3;
                eudVar2.t = j4;
                eudVar2.x = 6;
                objS = h9cVar13.f12667a.D(eudVar2);
                if (objS != obj2) {
                    z6 = z5;
                    j5 = j4;
                    j6 = j2;
                    j7 = j3;
                    m0k0 m0k0Var18 = m0k0Var5;
                    jLongValue2 = ((Number) objS).longValue();
                    strB = m0k0Var18.b();
                    str = zxj0Var4.e;
                    str2 = zxj0Var4.c;
                    strA = zxj0Var4.a(z4);
                    ik9 ik9Var13 = (ik9) this.h;
                    eudVar2.i = null;
                    eudVar2.j = null;
                    eudVar2.k = null;
                    eudVar2.l = strB;
                    eudVar2.m = str;
                    eudVar2.n = str2;
                    eudVar2.o = strA;
                    eudVar2.p = z6;
                    eudVar2.q = z4;
                    eudVar2.r = j6;
                    eudVar2.s = j7;
                    eudVar2.t = j5;
                    eudVar2.u = jLongValue2;
                    eudVar2.x = 7;
                    objA = ik9Var13.a(eudVar2);
                    if (objA == obj2) {
                        return obj2;
                    }
                    str3 = strB;
                    str4 = str2;
                    j8 = jLongValue2;
                    str5 = strA;
                    str6 = str;
                    objS = objA;
                    return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
                }
                return obj2;
            case 6:
                long j12 = eudVar2.t;
                long j13 = eudVar2.s;
                long j14 = eudVar2.r;
                z4 = eudVar2.q;
                boolean z11 = eudVar2.p;
                zxj0Var4 = eudVar2.j;
                m0k0Var5 = eudVar2.i;
                z1x.P(objS);
                z6 = z11;
                j6 = j14;
                j7 = j13;
                j5 = j12;
                m0k0 m0k0Var19 = m0k0Var5;
                jLongValue2 = ((Number) objS).longValue();
                strB = m0k0Var19.b();
                str = zxj0Var4.e;
                str2 = zxj0Var4.c;
                strA = zxj0Var4.a(z4);
                ik9 ik9Var14 = (ik9) this.h;
                eudVar2.i = null;
                eudVar2.j = null;
                eudVar2.k = null;
                eudVar2.l = strB;
                eudVar2.m = str;
                eudVar2.n = str2;
                eudVar2.o = strA;
                eudVar2.p = z6;
                eudVar2.q = z4;
                eudVar2.r = j6;
                eudVar2.s = j7;
                eudVar2.t = j5;
                eudVar2.u = jLongValue2;
                eudVar2.x = 7;
                objA = ik9Var14.a(eudVar2);
                if (objA == obj2) {
                    return obj2;
                }
                str3 = strB;
                str4 = str2;
                j8 = jLongValue2;
                str5 = strA;
                str6 = str;
                objS = objA;
                return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
            case 7:
                long j15 = eudVar2.u;
                j5 = eudVar2.t;
                j7 = eudVar2.s;
                String str7 = eudVar2.o;
                String str8 = eudVar2.n;
                String str9 = eudVar2.m;
                String str10 = eudVar2.l;
                z1x.P(objS);
                str5 = str7;
                j8 = j15;
                str4 = str8;
                str6 = str9;
                str3 = str10;
                return new ttd(j7, j5, j8, str3, str6, str4, str5, ((Number) objS).doubleValue(), ((ppt) this.o).f27385a.t().f38290a);
            default:
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(lvj0 lvj0Var, zje zjeVar) {
        fud fudVar;
        if (zjeVar instanceof fud) {
            fudVar = (fud) zjeVar;
            int i = fudVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                fudVar.l = i - Integer.MIN_VALUE;
            } else {
                fudVar = new fud(this, zjeVar);
            }
        } else {
            fudVar = new fud(this, zjeVar);
        }
        Object objB = fudVar.j;
        wne wneVar = wne.f39444a;
        int i2 = fudVar.l;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objB);
            rpt rptVar = (rpt) this.t;
            fudVar.i = lvj0Var;
            fudVar.l = 1;
            objB = ((zfo) rptVar.f30901a).b(fudVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lvj0Var = fudVar.i;
            z1x.P(objB);
        }
        for (Object obj2 : (Iterable) objB) {
            if (((ueo) obj2).f35538a == lvj0Var.j) {
                obj = obj2;
                break;
            }
        }
        ueo ueoVar = (ueo) obj;
        return Boolean.valueOf(ueoVar != null && ueoVar.d == 2 && ((pru) this.u).a().I1 == oxk0.DEFAULT_OPTIONBET);
    }

    public gud(znt zntVar, h9c h9cVar, ik9 ik9Var, e8u e8uVar, x4u x4uVar, h9c h9cVar2, g3v g3vVar, ik9 ik9Var2, j9c j9cVar, chf0 chf0Var, o4a o4aVar, bhu bhuVar, qv2 qv2Var, vn7 vn7Var, ppt pptVar, vit0 vit0Var, fht0 fht0Var, phf0 phf0Var, jtt jttVar, rpt rptVar, pru pruVar, zri zriVar, r9u r9uVar) {
        r9uVar.getClass();
        this.f11923a = zntVar;
        this.b = h9cVar;
        this.c = ik9Var;
        this.d = e8uVar;
        this.e = x4uVar;
        this.f = h9cVar2;
        this.g = g3vVar;
        this.h = ik9Var2;
        this.i = j9cVar;
        this.j = chf0Var;
        this.k = o4aVar;
        this.l = bhuVar;
        this.m = qv2Var;
        this.n = vn7Var;
        this.o = pptVar;
        this.p = vit0Var;
        this.q = fht0Var;
        this.r = phf0Var;
        this.s = jttVar;
        this.t = rptVar;
        this.u = pruVar;
        this.v = zriVar;
        this.w = r9uVar;
    }

    public gud(cad cadVar, peg0 peg0Var, wsf0 wsf0Var, fvt0 fvt0Var, d1p d1pVar, wsf0 wsf0Var2, Boolean bool, ii iiVar, oeg0 oeg0Var, duj dujVar, db1 db1Var, u58 u58Var, a6u a6uVar, gst0 gst0Var, ntu ntuVar, lrc lrcVar, pl1 pl1Var, bzu bzuVar, ubu ubuVar, tqx tqxVar, s31 s31Var, yzn0 yzn0Var, do20 do20Var, wdk0 wdk0Var, ctf0 ctf0Var) {
        this.f11923a = cadVar;
        this.b = oeg0Var;
        this.c = gst0Var;
        this.d = wsf0Var;
        this.e = pl1Var;
        this.f = wsf0Var2;
        this.g = ntuVar;
        this.h = a6uVar;
        this.i = u58Var;
        this.j = d1pVar;
        this.k = bzuVar;
        this.l = dujVar;
        this.m = fvt0Var;
        this.n = do20Var;
        this.o = lrcVar;
        this.p = yzn0Var;
        this.q = ubuVar;
        this.r = tqxVar;
        this.s = s31Var;
        this.t = ctf0Var;
        this.u = db1Var;
        this.v = bool;
        this.w = new t5i(this, (byte) 21);
    }

    public gud(cad cadVar, vqc vqcVar, ii iiVar, gii0 gii0Var, ctf0 ctf0Var, duj dujVar, gst0 gst0Var, knf0 knf0Var, zfo zfoVar, pru pruVar, r9u r9uVar, ulk ulkVar, edo edoVar, lye lyeVar, m0f m0fVar, ave aveVar, us3 us3Var, vwb0 vwb0Var, q7d0 q7d0Var, rrc rrcVar, vby vbyVar, etj etjVar, j1q0 j1q0Var) {
        this.f11923a = dujVar;
        this.b = ctf0Var;
        this.c = gst0Var;
        this.d = knf0Var;
        this.e = gii0Var;
        this.f = cadVar;
        this.g = vqcVar;
        this.h = lyeVar;
        this.i = m0fVar;
        this.j = aveVar;
        this.k = vwb0Var;
        this.l = q7d0Var;
        this.m = us3Var;
        this.n = zfoVar;
        this.o = edoVar;
        this.p = ulkVar;
        this.q = j1q0Var;
        this.r = rrcVar;
        this.s = vbyVar;
        this.t = etjVar;
        this.u = pruVar;
        this.w = r9uVar;
        this.v = new tii(this, (byte) 25);
    }
}
