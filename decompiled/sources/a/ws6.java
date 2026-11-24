package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class ws6 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ diu0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ws6(diu0 diu0Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = diu0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        diu0 diu0Var = this.m;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ws6 ws6Var = new ws6((dt6) diu0Var, (yje) obj3, (byte) 0);
                ws6Var.l = (ql5) obj;
                ws6Var.k = zBooleanValue;
                return ws6Var.invokeSuspend(Unit.f46060a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ws6 ws6Var2 = new ws6((fae) diu0Var, (yje) obj3, (byte) 1);
                ws6Var2.l = (kmq) obj;
                ws6Var2.k = zBooleanValue2;
                return ws6Var2.invokeSuspend(Unit.f46060a);
            default:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                ws6 ws6Var3 = new ws6((ltr0) diu0Var, (yje) obj3, (byte) 2);
                ws6Var3.l = (ql5) obj;
                ws6Var3.k = zBooleanValue3;
                return ws6Var3.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        c820 c820Var;
        jfc0 jfc0VarA;
        Object value3;
        byte b = this.i;
        diu0 diu0Var = this.m;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                dt6 dt6Var = (dt6) diu0Var;
                oyg0 oyg0Var = dt6Var.f;
                ocj ocjVar = dt6Var.i;
                mne mneVar = dt6Var.V;
                ql5 ql5Var = (ql5) this.l;
                boolean z = this.k;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i = dt6.e0;
                    dt6Var.G(db20.f5781a);
                    dt6Var.H(new os6((byte) 0));
                    this.l = ql5Var;
                    this.k = z;
                    this.j = true;
                    if (dt6Var.Y(ql5Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = dt6.e0;
                sac.V(jiu0.a(dt6Var), us6.f36196a, null, mneVar.f22085a, new xw5(dt6Var, ql5Var, yjeVar, (byte) 13), 10);
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value, c820.a((c820) value, null, null, null, null, null, null, false, false, false, true, null, 7167)));
                v3c.N(dt6Var.Z);
                vae0 vae0VarD = dt6Var.w.d();
                os6 os6Var = new os6(b2);
                eoh0 eoh0Var = i120.f;
                zys0.e(2, os6Var);
                dt6Var.Z = sac.T(new fnq(i120.X(vae0VarD, eoh0Var, os6Var), new ex1((Object) dt6Var, (Object) ql5Var, yjeVar, (byte) 11), (byte) 4), d5c.S(jiu0.a(dt6Var), mneVar.b), new vp3(2, dt6Var, dt6.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 26));
                if (z) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        c820Var = (c820) value2;
                        jfc0 jfc0Var = c820Var.e;
                        if (jfc0Var != null) {
                            wyc0 wyc0Var = wyc0.f39969a;
                            jfc0VarA = jfc0.a(jfc0Var, null, null, false, false, 29);
                        } else {
                            jfc0VarA = null;
                        }
                    } while (!p7m0Var2.m(value2, c820.a(c820Var, null, null, null, null, jfc0VarA, null, false, false, false, false, null, 8175)));
                }
                return Unit.f46060a;
            case 1:
                kmq kmqVar = (kmq) this.l;
                boolean z3 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (!z3) {
                        g45 g45Var = ((fae) diu0Var).s.f37798a;
                        w7e w7eVar = new w7e(((vae) g45Var.b).g, g45Var, (byte) 1);
                        this.l = null;
                        this.k = z3;
                        this.j = true;
                        if (slb.Q(kmqVar, w7eVar, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                ltr0 ltr0Var = (ltr0) diu0Var;
                oyg0 oyg0Var2 = ltr0Var.f;
                ocj ocjVar2 = ltr0Var.i;
                ql5 ql5Var2 = (ql5) this.l;
                boolean z5 = this.k;
                wne wneVar3 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    if (z5) {
                        int i3 = ltr0.Q;
                        ltr0Var.H(new efr0((byte) 6));
                    }
                    if (ql5Var2.f28916a != ((ftr0) ltr0Var.D()).e.f30729a) {
                        bby bbyVar = ltr0Var.P;
                        if (bbyVar != null) {
                            bbyVar.cancel(null);
                        }
                        p7m0 p7m0Var3 = ocjVar2.f25029a;
                        do {
                            value3 = p7m0Var3.getValue();
                            value3.getClass();
                        } while (!p7m0Var3.m(value3, ftr0.a((ftr0) value3, null, null, null, true, null, 191)));
                    }
                    if (((ftr0) ltr0Var.D()).g) {
                        a8q0 a8q0Var = new a8q0((String) null, 0L, 7);
                        p7m0 p7m0Var4 = ocjVar2.f25029a;
                        while (true) {
                            Object value4 = p7m0Var4.getValue();
                            value4.getClass();
                            ftr0 ftr0Var = (ftr0) value4;
                            oyg0Var2.getClass();
                            pur0 pur0Var = ftr0Var.f;
                            a8q0 a8q0Var2 = a8q0Var;
                            if (p7m0Var4.m(value4, ftr0.a(ftr0Var, null, null, pur0.a(pur0Var, rjr0.a(pur0Var.f27632a, a8q0Var2, null, null, null, null, null, false, false, 254), null, 2), false, null, 223))) {
                                this.l = ql5Var2;
                                this.k = z5;
                                this.j = true;
                                if (ltr0Var.P(ql5Var2, this) == wneVar3) {
                                    return wneVar3;
                                }
                            } else {
                                a8q0Var = a8q0Var2;
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z6) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                if (z5) {
                    int i4 = ltr0.Q;
                    ltr0Var.P = i3t0.K(ltr0Var, null, new mjr0(1, ltr0Var, ltr0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 15), new am4(ltr0Var, ql5Var2, null), 1);
                }
                return Unit.f46060a;
        }
    }
}
