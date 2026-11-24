package a;

import kotlin.Unit;
import org.xplatform.cyber.game.rainbow.api.RainbowGameScreenParams;
import org.xplatform.cyber.game.valorant.api.ValorantGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class kh1 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public /* synthetic */ Object m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kh1(Object obj, Object obj2, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0141  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    private final Object l(Object obj) {
        szj0 szj0Var;
        Object objM;
        boolean z;
        wne wneVar;
        Object obj2;
        wne wneVar2;
        jlr jlrVar;
        d1e0 d1e0Var = (d1e0) this.n;
        ats atsVar = (ats) this.l;
        vvd0 vvd0Var = (vvd0) this.m;
        wne wneVar3 = wne.f39444a;
        byte b = this.j;
        char c = 3;
        char c2 = 2;
        boolean z2 = true;
        Object obj3 = null;
        if (b != 0) {
            if (b == 1) {
                szj0Var = (szj0) this.k;
                z1x.P(obj);
                objM = obj;
            } else if (b == 2) {
                z1x.P(obj);
                this = this;
                wneVar2 = wneVar3;
                obj2 = null;
                this.l = atsVar;
                this.m = obj2;
                this.k = obj2;
                this.j = (byte) 3;
                int i = d1e0.e0;
                if (d1e0Var.N(this) == wneVar2) {
                    return wneVar2;
                }
            } else {
                if (b != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            jlrVar = atsVar.f1447a;
            int i2 = d1e0.e0;
            if (jlrVar instanceof clr) {
                hzg hzgVar = d1e0Var.O;
                long j = ((clr) jlrVar).b;
                RainbowGameScreenParams rainbowGameScreenParams = d1e0Var.r;
                ((uzg) hzgVar).q(rainbowGameScreenParams.i, j, rainbowGameScreenParams.d);
            }
            return Unit.f46060a;
        }
        z1x.P(obj);
        d1e0Var.o.e("game_request_state_key", atsVar.b);
        m9s m9sVarC = d5c.C(atsVar.f1447a);
        szj0Var = m9sVarC != null ? m9sVarC.M : null;
        this.l = atsVar;
        this.m = vvd0Var;
        this.k = szj0Var;
        this.j = (byte) 1;
        objM = d1e0Var.M(atsVar, this);
        if (objM == wneVar3) {
            return wneVar3;
        }
        szj0 szj0Var2 = szj0Var;
        yws ywsVar = (yws) objM;
        d1e0Var.z.g(ywsVar);
        p7m0 p7m0Var = d1e0Var.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            p7m0 p7m0Var2 = p7m0Var;
            z = z2;
            yws ywsVar2 = ywsVar;
            wneVar = wneVar3;
            if (p7m0Var2.m(value, qyd0.a((qyd0) value, atsVar.b, atsVar.f1447a, vvd0Var, null, null, null, false, null, null, null, false, null, false, false, ywsVar2, szj0Var2, 83886065))) {
                break;
            }
            p7m0Var = p7m0Var2;
            ywsVar = ywsVar2;
            wneVar3 = wneVar;
            z2 = z;
            c = 3;
            c2 = 2;
            obj3 = null;
        }
        sbu sbuVar = d1e0Var.y;
        jlr jlrVar2 = atsVar.f1447a;
        boolean z3 = false;
        if (vvd0Var != null && !vvd0Var.b) {
            z3 = z;
        }
        boolean z4 = !z3;
        v5s m5sVar = k5s.f17735a;
        if (jlrVar2 instanceof xkr) {
            xkr xkrVar = (xkr) jlrVar2;
            m9s m9sVar = xkrVar.d;
            m5sVar = new t5s(m9sVar.b(), z4, xkrVar.b, m9sVar.x, m9sVar.A, m9sVar.f, m9sVar.F, m9sVar);
        } else if (jlrVar2 instanceof dlr) {
            m5sVar = new o5s(((dlr) jlrVar2).b);
        } else if (!(jlrVar2 instanceof alr) && (jlrVar2 instanceof clr)) {
            m5sVar = new m5s(((clr) jlrVar2).b, 15L);
        }
        this.l = atsVar;
        obj2 = null;
        this.m = null;
        this.k = null;
        this.j = (byte) 2;
        Unit unitA = sbuVar.a(m5sVar);
        wneVar2 = wneVar;
        if (unitA == wneVar2) {
            return wneVar2;
        }
        this.l = atsVar;
        this.m = obj2;
        this.k = obj2;
        this.j = (byte) 3;
        int i3 = d1e0.e0;
        if (d1e0Var.N(this) == wneVar2) {
            return wneVar2;
        }
        jlrVar = atsVar.f1447a;
        int i4 = d1e0.e0;
        if (jlrVar instanceof clr) {
            hzg hzgVar2 = d1e0Var.O;
            long j2 = ((clr) jlrVar).b;
            RainbowGameScreenParams rainbowGameScreenParams2 = d1e0Var.r;
            ((uzg) hzgVar2).q(rainbowGameScreenParams2.i, j2, rainbowGameScreenParams2.d);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0094  */
    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x013b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0144  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        if (r5.a(r8, r19) == r3) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kh1.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0141  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    private final Object o(Object obj) {
        szj0 szj0Var;
        Object objM;
        boolean z;
        wne wneVar;
        Object obj2;
        wne wneVar2;
        jlr jlrVar;
        f2u0 f2u0Var = (f2u0) this.n;
        ats atsVar = (ats) this.l;
        vxt0 vxt0Var = (vxt0) this.m;
        wne wneVar3 = wne.f39444a;
        byte b = this.j;
        char c = 3;
        char c2 = 2;
        boolean z2 = true;
        Object obj3 = null;
        if (b != 0) {
            if (b == 1) {
                szj0Var = (szj0) this.k;
                z1x.P(obj);
                objM = obj;
            } else if (b == 2) {
                z1x.P(obj);
                this = this;
                wneVar2 = wneVar3;
                obj2 = null;
                this.l = atsVar;
                this.m = obj2;
                this.k = obj2;
                this.j = (byte) 3;
                int i = f2u0.e0;
                if (f2u0Var.N(this) == wneVar2) {
                    return wneVar2;
                }
            } else {
                if (b != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            jlrVar = atsVar.f1447a;
            int i2 = f2u0.e0;
            if (jlrVar instanceof clr) {
                hzg hzgVar = f2u0Var.O;
                long j = ((clr) jlrVar).b;
                ValorantGameScreenParams valorantGameScreenParams = f2u0Var.r;
                ((uzg) hzgVar).q(valorantGameScreenParams.i, j, valorantGameScreenParams.c);
            }
            return Unit.f46060a;
        }
        z1x.P(obj);
        f2u0Var.o.e("game_request_state_key", atsVar.b);
        m9s m9sVarC = d5c.C(atsVar.f1447a);
        szj0Var = m9sVarC != null ? m9sVarC.M : null;
        this.l = atsVar;
        this.m = vxt0Var;
        this.k = szj0Var;
        this.j = (byte) 1;
        objM = f2u0Var.M(atsVar, this);
        if (objM == wneVar3) {
            return wneVar3;
        }
        szj0 szj0Var2 = szj0Var;
        yws ywsVar = (yws) objM;
        f2u0Var.z.g(ywsVar);
        p7m0 p7m0Var = f2u0Var.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            p7m0 p7m0Var2 = p7m0Var;
            z = z2;
            yws ywsVar2 = ywsVar;
            wneVar = wneVar3;
            if (p7m0Var2.m(value, b0u0.a((b0u0) value, atsVar.b, atsVar.f1447a, vxt0Var, null, null, null, false, null, null, null, false, null, false, false, ywsVar2, szj0Var2, 20971505))) {
                break;
            }
            p7m0Var = p7m0Var2;
            ywsVar = ywsVar2;
            wneVar3 = wneVar;
            z2 = z;
            c = 3;
            c2 = 2;
            obj3 = null;
        }
        sbu sbuVar = f2u0Var.y;
        jlr jlrVar2 = atsVar.f1447a;
        boolean z3 = false;
        if (vxt0Var != null && !vxt0Var.b) {
            z3 = z;
        }
        boolean z4 = !z3;
        v5s m5sVar = k5s.f17735a;
        if (jlrVar2 instanceof xkr) {
            xkr xkrVar = (xkr) jlrVar2;
            m9s m9sVar = xkrVar.d;
            m5sVar = new t5s(m9sVar.b(), z4, xkrVar.b, m9sVar.x, m9sVar.A, m9sVar.f, m9sVar.F, m9sVar);
        } else if (jlrVar2 instanceof dlr) {
            m5sVar = new o5s(((dlr) jlrVar2).b);
        } else if (!(jlrVar2 instanceof alr) && (jlrVar2 instanceof clr)) {
            m5sVar = new m5s(((clr) jlrVar2).b, 27L);
        }
        this.l = atsVar;
        obj2 = null;
        this.m = null;
        this.k = null;
        this.j = (byte) 2;
        Unit unitA = sbuVar.a(m5sVar);
        wneVar2 = wneVar;
        if (unitA == wneVar2) {
            return wneVar2;
        }
        this.l = atsVar;
        this.m = obj2;
        this.k = obj2;
        this.j = (byte) 3;
        int i3 = f2u0.e0;
        if (f2u0Var.N(this) == wneVar2) {
            return wneVar2;
        }
        jlrVar = atsVar.f1447a;
        int i4 = f2u0.e0;
        if (jlrVar instanceof clr) {
            hzg hzgVar2 = f2u0Var.O;
            long j2 = ((clr) jlrVar).b;
            ValorantGameScreenParams valorantGameScreenParams2 = f2u0Var.r;
            ((uzg) hzgVar2).q(valorantGameScreenParams2.i, j2, valorantGameScreenParams2.c);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r10 == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (a.zvw.H(r11, r10) == r4) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.n
            a.vkr0 r0 = (a.vkr0) r0
            java.lang.Object r1 = r10.m
            a.mie0 r1 = (a.mie0) r1
            java.lang.Object r2 = r10.k
            a.vne r2 = (a.vne) r2
            java.lang.Object r3 = r10.l
            a.kuv0 r3 = (a.kuv0) r3
            a.wne r4 = a.wne.f39444a
            byte r5 = r10.j
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L34
            if (r5 == r8) goto L30
            if (r5 == r7) goto L2b
            if (r5 != r6) goto L25
            a.z1x.P(r11)
            goto La4
        L25:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r9
        L2b:
            a.z1x.P(r11)
            goto Lb1
        L30:
            a.z1x.P(r11)
            goto L50
        L34:
            a.z1x.P(r11)
            if (r3 == 0) goto Lb4
            boolean r11 = r3 instanceof a.iuv0
            if (r11 == 0) goto L8d
            java.lang.Object r11 = r1.f21842a
            a.bby r11 = (a.bby) r11
            if (r11 == 0) goto L50
            r10.k = r9
            r10.l = r3
            r10.j = r8
            java.lang.Object r11 = a.zvw.H(r11, r10)
            if (r11 != r4) goto L50
            goto La3
        L50:
            r1.f21842a = r9
            a.iuv0 r3 = (a.iuv0) r3
            float r11 = r3.f15416a
            r10.k = r9
            r10.l = r9
            r10.j = r7
            java.lang.Object r1 = r0.f
            a.t33 r1 = (a.t33) r1
            java.lang.Object r0 = r0.d
            a.trm0 r0 = (a.trm0) r0
            java.lang.Object r2 = r1.d()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r2 + r11
            float r11 = r0.e()
            float r11 = -r11
            float r0 = r0.e()
            float r11 = a.l1e0.c(r2, r11, r0)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r11)
            java.lang.Object r10 = r1.f(r10, r0)
            if (r10 != r4) goto L88
            goto L8a
        L88:
            kotlin.Unit r10 = kotlin.Unit.f46060a
        L8a:
            if (r10 != r4) goto Lb1
            goto La3
        L8d:
            boolean r11 = r3 instanceof a.juv0
            if (r11 == 0) goto Lb4
            java.lang.Object r11 = r1.f21842a
            a.bby r11 = (a.bby) r11
            if (r11 == 0) goto La4
            r10.k = r2
            r10.l = r3
            r10.j = r6
            java.lang.Object r10 = a.zvw.H(r11, r10)
            if (r10 != r4) goto La4
        La3:
            return r4
        La4:
            a.n7t0 r10 = new a.n7t0
            r11 = 20
            r10.<init>(r0, r3, r9, r11)
            a.c4m0 r10 = a.qjj.W(r2, r9, r9, r10, r6)
            r1.f21842a = r10
        Lb1:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        Lb4:
            a.t9f.b()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kh1.r(java.lang.Object):java.lang.Object");
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        switch (this.i) {
            case 0:
                kh1 kh1Var = new kh1(this.n, (yje) obj3, (byte) 0);
                kh1Var.l = (l0j) obj;
                kh1Var.m = (sw00) obj2;
                return kh1Var.invokeSuspend(Unit.f46060a);
            case 1:
                kh1 kh1Var2 = new kh1((ccp) this.m, (Throwable) this.n, (yje) obj3, (byte) 1);
                kh1Var2.k = (kmq) obj;
                kh1Var2.l = (ec80) obj2;
                return kh1Var2.invokeSuspend(Unit.f46060a);
            case 2:
                kh1 kh1Var3 = new kh1(this.n, (yje) obj3, (byte) 2);
                kh1Var3.l = (kmq) obj;
                kh1Var3.m = (ec80) obj2;
                return kh1Var3.invokeSuspend(Unit.f46060a);
            case 3:
                kh1 kh1Var4 = new kh1((yje) obj3, this.m, (byte) 3);
                kh1Var4.l = (kmq) obj;
                kh1Var4.k = obj2;
                return kh1Var4.invokeSuspend(Unit.f46060a);
            case 4:
                kh1 kh1Var5 = new kh1((yje) obj3, this.m, (byte) 4);
                kh1Var5.l = (kmq) obj;
                kh1Var5.k = obj2;
                return kh1Var5.invokeSuspend(Unit.f46060a);
            case 5:
                kh1 kh1Var6 = new kh1(this.n, (yje) obj3, (byte) 5);
                kh1Var6.m = (kmq) obj;
                kh1Var6.k = obj2;
                return kh1Var6.invokeSuspend(Unit.f46060a);
            case 6:
                kh1 kh1Var7 = new kh1((yje) obj3, (wdr) this.n, (byte) 6);
                kh1Var7.l = (kmq) obj;
                kh1Var7.m = (Object[]) obj2;
                return kh1Var7.invokeSuspend(Unit.f46060a);
            case 7:
                kh1 kh1Var8 = new kh1((yje) obj3, (wdr) this.n, (byte) 7);
                kh1Var8.l = (kmq) obj;
                kh1Var8.m = (Object[]) obj2;
                return kh1Var8.invokeSuspend(Unit.f46060a);
            case 8:
                kh1 kh1Var9 = new kh1((yje) obj3, (wdr) this.n, (byte) 8);
                kh1Var9.l = (kmq) obj;
                kh1Var9.m = (Object[]) obj2;
                return kh1Var9.invokeSuspend(Unit.f46060a);
            case 9:
                kh1 kh1Var10 = new kh1(this.n, (yje) obj3, (byte) 9);
                kh1Var10.l = (kmq) obj;
                kh1Var10.m = (Object[]) obj2;
                return kh1Var10.invokeSuspend(Unit.f46060a);
            case 10:
                kh1 kh1Var11 = new kh1(this.n, (yje) obj3, (byte) 10);
                kh1Var11.l = (ats) obj;
                kh1Var11.m = (k4h) obj2;
                return kh1Var11.invokeSuspend(Unit.f46060a);
            case 11:
                ((Boolean) obj2).getClass();
                kh1 kh1Var12 = new kh1(this.n, (yje) obj3, (byte) 11);
                kh1Var12.m = (ql5) obj;
                return kh1Var12.invokeSuspend(Unit.f46060a);
            case 12:
                kh1 kh1Var13 = new kh1((v360) this.m, (Throwable) this.n, (yje) obj3, (byte) 12);
                kh1Var13.k = (kmq) obj;
                kh1Var13.l = (rz50) obj2;
                return kh1Var13.invokeSuspend(Unit.f46060a);
            case 13:
                kh1 kh1Var14 = new kh1((yje) obj3, this.m, (byte) 13);
                kh1Var14.l = (kmq) obj;
                kh1Var14.k = obj2;
                return kh1Var14.invokeSuspend(Unit.f46060a);
            case 14:
                kh1 kh1Var15 = new kh1((yje) obj3, this.m, (byte) 14);
                kh1Var15.l = (kmq) obj;
                kh1Var15.k = obj2;
                return kh1Var15.invokeSuspend(Unit.f46060a);
            case 15:
                kh1 kh1Var16 = new kh1(this.n, (yje) obj3, (byte) 15);
                kh1Var16.l = (ats) obj;
                kh1Var16.m = (vvd0) obj2;
                return kh1Var16.invokeSuspend(Unit.f46060a);
            case 16:
                ((Boolean) obj2).getClass();
                kh1 kh1Var17 = new kh1(this.n, (yje) obj3, (byte) 16);
                kh1Var17.m = (ql5) obj;
                return kh1Var17.invokeSuspend(Unit.f46060a);
            case 17:
                kh1 kh1Var18 = new kh1(this.n, (yje) obj3, (byte) 17);
                kh1Var18.l = (ats) obj;
                kh1Var18.m = (vxt0) obj2;
                return kh1Var18.invokeSuspend(Unit.f46060a);
            case 18:
                kh1 kh1Var19 = new kh1((mie0) this.m, (vkr0) this.n, (yje) obj3, (byte) 18);
                kh1Var19.k = (vne) obj;
                kh1Var19.l = (kuv0) obj2;
                return kh1Var19.invokeSuspend(Unit.f46060a);
            default:
                kh1 kh1Var20 = new kh1((mie0) this.m, (oxv0) this.n, (yje) obj3, (byte) 19);
                kh1Var20.k = (vne) obj;
                kh1Var20.l = (rxv0) obj2;
                return kh1Var20.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0247  */
    /* JADX WARN: Code duplicated, block: B:110:0x024c  */
    /* JADX WARN: Code duplicated, block: B:189:0x045b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x024e, code lost:
    
        if (r0 == r10) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b8, code lost:
    
        if (r0 == r11) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02e2, code lost:
    
        if (a.slb.Q(r12, r2, r5) == r11) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0329, code lost:
    
        if (r1.a(r10, r5) == r11) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0350, code lost:
    
        if (a.slb.Q(r1, r0, r5) == r11) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0377, code lost:
    
        if (a.slb.Q(r1, r4, r5) == r11) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03ab, code lost:
    
        if (a.slb.Q(r1, r0, r5) == r11) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03b8, code lost:
    
        if (r1.a(r10, r5) == r11) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0453, code lost:
    
        if (r4.a(r6, r5) == r10) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x05d7, code lost:
    
        if (r0.N(r5) == r6) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0648, code lost:
    
        if (r0.a(r1, r5) == r2) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x06b3, code lost:
    
        if (r7.a(r0, r5) == r10) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0713, code lost:
    
        if (r6.a(r0, r5) == r7) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0769, code lost:
    
        if (r0.a(r1, r5) == r2) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x07b6, code lost:
    
        if (r0.a(r1, r5) == r2) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0807, code lost:
    
        if (a.slb.Q(r1, (a.gmq) r2, r5) == r0) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x084f, code lost:
    
        if (r1 == r0) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0868, code lost:
    
        if (a.slb.Q(r2, r1, r5) == r0) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0938, code lost:
    
        if (a.slb.Q(r1, r0, r5) == r6) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x097a, code lost:
    
        if (a.slb.Q(r1, r3, r5) == r6) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0988, code lost:
    
        if (r1.a(r2, r5) == r6) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0a05, code lost:
    
        if (a.slb.Q(r0, r1, r5) == r2) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0a13, code lost:
    
        if (r0.a(r1, r5) == r2) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0a9c, code lost:
    
        if (a.qcc.O(1000 - r3, r5) == r2) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0abc, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
    
        if (r0 == r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013e, code lost:
    
        if (a.zvw.H(r4, r5) == r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0200, code lost:
    
        if (r1 == r10) goto L112;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kh1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kh1(yje yjeVar, Object obj, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kh1(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kh1(yje yjeVar, wdr wdrVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.n = wdrVar;
    }
}
