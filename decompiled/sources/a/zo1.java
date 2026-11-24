package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class zo1 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo1(ic1 ic1Var, hv2 hv2Var, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 3;
        this.l = ic1Var;
        this.m = hv2Var;
    }

    private final Object G(Object obj) {
        kmq kmqVar = (kmq) this.k;
        Object[] objArr = (Object[]) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            ydr ydrVar = (ydr) this.m;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.k = null;
            this.l = null;
            this.j = true;
            if (ydrVar.j(kmqVar, obj2, obj3, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object H(Object obj) {
        kmq kmqVar = (kmq) this.k;
        Object[] objArr = (Object[]) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            aer aerVar = (aer) this.m;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            this.k = null;
            this.l = null;
            this.j = true;
            if (aerVar.n(kmqVar, obj2, obj3, obj4, obj5, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj) {
        gmq eu4Var;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = (kmq) this.k;
            jlr jlrVar = (jlr) this.l;
            yje yjeVar = null;
            if (jlrVar instanceof xkr) {
                uii uiiVar = (uii) this.m;
                m9s m9sVar = ((xkr) jlrVar).d;
                uiiVar.getClass();
                String strValueOf = m9sVar.G;
                if (strValueOf.length() == 0) {
                    strValueOf = String.valueOf(m9sVar.f21426a);
                }
                eu4Var = new vsg0(new xb2((Object) m9sVar, (Object) uiiVar, strValueOf, yjeVar, (byte) 18));
            } else {
                eu4Var = new eu4(yjeVar, (byte) 12);
            }
            this.k = null;
            this.l = null;
            this.j = true;
            if (slb.Q(kmqVar, eu4Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        gmq eu4Var;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = (kmq) this.k;
            jlr jlrVar = (jlr) this.l;
            yje yjeVar = null;
            if (jlrVar instanceof xkr) {
                ali aliVar = (ali) this.m;
                m9s m9sVar = ((xkr) jlrVar).d;
                aliVar.getClass();
                String strValueOf = m9sVar.G;
                if (strValueOf.length() == 0) {
                    strValueOf = String.valueOf(m9sVar.f21426a);
                }
                eu4Var = new vsg0(new xb2((Object) aliVar, (Object) m9sVar, strValueOf, yjeVar, (byte) 19));
            } else {
                eu4Var = new eu4(yjeVar, (byte) 12);
            }
            this.k = null;
            this.l = null;
            this.j = true;
            if (slb.Q(kmqVar, eu4Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        Object clrVar;
        kmq kmqVar = (kmq) this.k;
        Throwable th = (Throwable) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            th.printStackTrace();
            if (th instanceof e600) {
                long j = ((e600) th).f7258a;
                int i = hps.b;
                uen uenVar = wen.b;
                clrVar = new blr(j, wen.k(ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS), hps.f13457a));
            } else {
                boolean z2 = th instanceof yj00;
                zos zosVar = (zos) this.m;
                clrVar = z2 ? new clr(zosVar.f44730a) : new alr(zosVar.f44730a, zosVar.b);
            }
            this.k = null;
            this.l = null;
            this.j = true;
            if (kmqVar.a(clrVar, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        gmq eu4Var;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        byte b = 1;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = (kmq) this.k;
            jlr jlrVar = (jlr) this.l;
            byte b2 = 12;
            if (jlrVar instanceof xkr) {
                ali aliVar = (ali) this.m;
                m9s m9sVar = ((xkr) jlrVar).d;
                aliVar.getClass();
                String strValueOf = m9sVar.G;
                if (strValueOf.length() == 0) {
                    strValueOf = String.valueOf(m9sVar.f21426a);
                }
                nmo nmoVar = (nmo) aliVar.b;
                String str = m9sVar.k;
                String str2 = m9sVar.l;
                str.getClass();
                str2.getClass();
                qah qahVar = (qah) nmoVar.f23782a;
                jo20 jo20VarF = lvm0.f(str, str2);
                y3h y3hVar = (y3h) qahVar.b.c;
                eu4Var = new fnq(new p6d(y3hVar != null ? new eu4(y3hVar, b2) : new dnq(new vsg0(new lah(qahVar, jo20VarF, yjeVar, (byte) 0)), new oz0(3, yjeVar, (byte) 4), (byte) 1), new vsg0(new xb2((Object) aliVar, (Object) strValueOf, yjeVar, (byte) 20)), new wx4((Object) m9sVar, yjeVar, (byte) 7), b), new g6g((Object) aliVar, (Object) m9sVar, yjeVar, (byte) 14), (byte) 4);
            } else {
                eu4Var = new eu4(yjeVar, b2);
            }
            this.k = null;
            this.l = null;
            this.j = true;
            if (slb.Q(kmqVar, eu4Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj) {
        gmq eu4Var;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        byte b = 1;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = (kmq) this.k;
            bqp bqpVar = (bqp) this.l;
            byte b2 = 12;
            if (bqpVar != null) {
                pmi pmiVar = (pmi) this.m;
                pmiVar.getClass();
                vsg0 vsg0Var = new vsg0(new xb2((Object) pmiVar, (Object) bqpVar, yjeVar, (byte) 21));
                k6u k6uVar = (k6u) pmiVar.d;
                String str = bqpVar.b;
                String str2 = bqpVar.c;
                str.getClass();
                str2.getClass();
                qah qahVar = k6uVar.f17789a;
                jo20 jo20VarF = lvm0.f(str, str2);
                hj40 hj40Var = (hj40) qahVar.b.f;
                int i = 3;
                eu4Var = new p6d(vsg0Var, hj40Var != null ? new eu4(hj40Var, b2) : new dnq(new vsg0(new lah(qahVar, jo20VarF, yjeVar, b)), new oz0(i, yjeVar, (byte) 5), (byte) 1), new rj(i, yjeVar, (byte) 28), b);
            } else {
                eu4Var = new eu4(yjeVar, b2);
            }
            this.k = null;
            this.l = null;
            this.j = true;
            if (slb.Q(kmqVar, eu4Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj) {
        gmq eu4Var;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = (kmq) this.k;
            jlr jlrVar = (jlr) this.l;
            byte b = 12;
            if (jlrVar instanceof xkr) {
                kki kkiVar = (kki) this.m;
                m9s m9sVar = ((xkr) jlrVar).d;
                kkiVar.getClass();
                String strValueOf = m9sVar.G;
                if (strValueOf.length() == 0) {
                    strValueOf = String.valueOf(m9sVar.f21426a);
                }
                vsg0 vsg0Var = new vsg0(new xb2((Object) kkiVar, (Object) strValueOf, yjeVar, (byte) 22));
                uyn uynVar = (uyn) kkiVar.f;
                String str = m9sVar.k;
                String str2 = m9sVar.l;
                str.getClass();
                str2.getClass();
                qah qahVar = (qah) uynVar.f36498a;
                jo20 jo20VarF = lvm0.f(str, str2);
                oxd0 oxd0Var = (oxd0) qahVar.b.e;
                byte b2 = 3;
                eu4Var = new fnq(dub.f0(vsg0Var, oxd0Var != null ? new eu4(oxd0Var, b) : new dnq(new vsg0(new lah(qahVar, jo20VarF, yjeVar, (byte) 2)), new oz0(b2, yjeVar, (byte) 6), (byte) 1), new vsg0(new ze1(kkiVar, m9sVar.k, m9sVar.l, m9sVar.v, (yje) null)), new fl9(m9sVar, yjeVar, b2)), new g6g((Object) kkiVar, (Object) m9sVar, yjeVar, (byte) 15), (byte) 4);
            } else {
                eu4Var = new eu4(yjeVar, b);
            }
            this.k = null;
            this.l = null;
            this.j = true;
            if (slb.Q(kmqVar, eu4Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj) {
        gmq eu4Var;
        gmq dnqVar;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        byte b = 1;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = (kmq) this.k;
            jlr jlrVar = (jlr) this.l;
            byte b2 = 12;
            if (jlrVar instanceof xkr) {
                ali aliVar = (ali) this.m;
                m9s m9sVar = ((xkr) jlrVar).d;
                aliVar.getClass();
                String strValueOf = m9sVar.G;
                if (strValueOf.length() == 0) {
                    strValueOf = String.valueOf(m9sVar.f21426a);
                }
                vsg0 vsg0Var = new vsg0(new xb2((Object) aliVar, (Object) strValueOf, yjeVar, (byte) 23));
                ocl oclVar = (ocl) aliVar.d;
                String str = m9sVar.k;
                String str2 = m9sVar.l;
                str.getClass();
                str2.getClass();
                qah qahVar = (qah) oclVar.f25032a;
                jo20 jo20VarF = lvm0.f(str, str2);
                qrh qrhVar = (qrh) qahVar.b.d;
                if (qrhVar != null) {
                    dnqVar = new eu4(qrhVar, b2);
                } else {
                    byte b3 = 3;
                    dnqVar = new dnq(new vsg0(new lah(qahVar, jo20VarF, yjeVar, b3)), new oz0(b3, yjeVar, (byte) 7), (byte) 1);
                }
                eu4Var = new fnq(new p6d(vsg0Var, dnqVar, new wx4((Object) m9sVar, yjeVar, (byte) 8), b), new g6g((Object) aliVar, (Object) m9sVar, yjeVar, (byte) 16), (byte) 4);
            } else {
                eu4Var = new eu4(yjeVar, b2);
            }
            this.k = null;
            this.l = null;
            this.j = true;
            if (slb.Q(kmqVar, eu4Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object y(Object obj) {
        kmq kmqVar = (kmq) this.k;
        Throwable th = (Throwable) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            Object elrVar = th instanceof zj00 ? new elr(((zj00) th).f44464a) : new alr(((cps) this.m).f4763a, sip.c);
            this.k = null;
            this.l = null;
            this.j = true;
            if (kmqVar.a(elrVar, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.m;
        switch (b) {
            case 0:
                zo1 zo1Var = new zo1((yje) obj3, obj4, (byte) 0);
                zo1Var.k = (kmq) obj;
                zo1Var.l = obj2;
                return zo1Var.invokeSuspend(Unit.f46060a);
            case 1:
                zo1 zo1Var2 = new zo1((yje) obj3, obj4, (byte) 1);
                zo1Var2.k = (kmq) obj;
                zo1Var2.l = obj2;
                return zo1Var2.invokeSuspend(Unit.f46060a);
            case 2:
                zo1 zo1Var3 = new zo1(obj4, (yje) obj3, (byte) 2);
                zo1Var3.k = (kmq) obj;
                zo1Var3.l = (Throwable) obj2;
                return zo1Var3.invokeSuspend(Unit.f46060a);
            case 3:
                zo1 zo1Var4 = new zo1((ic1) this.l, (hv2) obj4, (yje) obj3);
                zo1Var4.k = (nv2) obj;
                return zo1Var4.invokeSuspend(Unit.f46060a);
            case 4:
                zo1 zo1Var5 = new zo1((yje) obj3, obj4, (byte) 4);
                zo1Var5.k = (kmq) obj;
                zo1Var5.l = (Object[]) obj2;
                return zo1Var5.invokeSuspend(Unit.f46060a);
            case 5:
                zo1 zo1Var6 = new zo1((yje) obj3, obj4, (byte) 5);
                zo1Var6.k = (kmq) obj;
                zo1Var6.l = obj2;
                return zo1Var6.invokeSuspend(Unit.f46060a);
            case 6:
                zo1 zo1Var7 = new zo1((yje) obj3, obj4, (byte) 6);
                zo1Var7.k = (kmq) obj;
                zo1Var7.l = (Object[]) obj2;
                return zo1Var7.invokeSuspend(Unit.f46060a);
            case 7:
                zo1 zo1Var8 = new zo1((yje) obj3, obj4, (byte) 7);
                zo1Var8.k = (kmq) obj;
                zo1Var8.l = obj2;
                return zo1Var8.invokeSuspend(Unit.f46060a);
            case 8:
                zo1 zo1Var9 = new zo1((yje) obj3, obj4, (byte) 8);
                zo1Var9.k = (kmq) obj;
                zo1Var9.l = obj2;
                return zo1Var9.invokeSuspend(Unit.f46060a);
            case 9:
                zo1 zo1Var10 = new zo1((yje) obj3, obj4, (byte) 9);
                zo1Var10.k = (kmq) obj;
                zo1Var10.l = (Object[]) obj2;
                return zo1Var10.invokeSuspend(Unit.f46060a);
            case 10:
                zo1 zo1Var11 = new zo1((yje) obj3, obj4, (byte) 10);
                zo1Var11.k = (kmq) obj;
                zo1Var11.l = obj2;
                return zo1Var11.invokeSuspend(Unit.f46060a);
            case 11:
                zo1 zo1Var12 = new zo1((yje) obj3, obj4, (byte) 11);
                zo1Var12.k = (kmq) obj;
                zo1Var12.l = obj2;
                return zo1Var12.invokeSuspend(Unit.f46060a);
            case 12:
                zo1 zo1Var13 = new zo1((yje) obj3, obj4, (byte) 12);
                zo1Var13.k = (kmq) obj;
                zo1Var13.l = (Object[]) obj2;
                return zo1Var13.invokeSuspend(Unit.f46060a);
            case 13:
                zo1 zo1Var14 = new zo1((yje) obj3, obj4, (byte) 13);
                zo1Var14.k = (kmq) obj;
                zo1Var14.l = obj2;
                return zo1Var14.invokeSuspend(Unit.f46060a);
            case 14:
                zo1 zo1Var15 = new zo1(obj4, (yje) obj3, (byte) 14);
                zo1Var15.k = (ats) obj;
                zo1Var15.l = (tdt0) obj2;
                return zo1Var15.invokeSuspend(Unit.f46060a);
            case 15:
                zo1 zo1Var16 = new zo1((yje) obj3, obj4, (byte) 15);
                zo1Var16.k = (kmq) obj;
                zo1Var16.l = obj2;
                return zo1Var16.invokeSuspend(Unit.f46060a);
            case 16:
                zo1 zo1Var17 = new zo1((yje) obj3, obj4, (byte) 16);
                zo1Var17.k = (kmq) obj;
                zo1Var17.l = obj2;
                return zo1Var17.invokeSuspend(Unit.f46060a);
            case 17:
                zo1 zo1Var18 = new zo1((yje) obj3, obj4, (byte) 17);
                zo1Var18.k = (kmq) obj;
                zo1Var18.l = obj2;
                return zo1Var18.invokeSuspend(Unit.f46060a);
            case 18:
                zo1 zo1Var19 = new zo1((yje) obj3, obj4, (byte) 18);
                zo1Var19.k = (kmq) obj;
                zo1Var19.l = obj2;
                return zo1Var19.invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                zo1 zo1Var20 = new zo1((yje) obj3, obj4, (byte) 19);
                zo1Var20.k = (kmq) obj;
                zo1Var20.l = obj2;
                return zo1Var20.invokeSuspend(Unit.f46060a);
            case 20:
                zo1 zo1Var21 = new zo1((yje) obj3, obj4, (byte) 20);
                zo1Var21.k = (kmq) obj;
                zo1Var21.l = obj2;
                return zo1Var21.invokeSuspend(Unit.f46060a);
            case 21:
                zo1 zo1Var22 = new zo1(obj4, (yje) obj3, (byte) 21);
                zo1Var22.k = (kmq) obj;
                zo1Var22.l = (Throwable) obj2;
                return zo1Var22.invokeSuspend(Unit.f46060a);
            case 22:
                zo1 zo1Var23 = new zo1((yje) obj3, obj4, (byte) 22);
                zo1Var23.k = (kmq) obj;
                zo1Var23.l = obj2;
                return zo1Var23.invokeSuspend(Unit.f46060a);
            case 23:
                zo1 zo1Var24 = new zo1((yje) obj3, obj4, (byte) 23);
                zo1Var24.k = (kmq) obj;
                zo1Var24.l = obj2;
                return zo1Var24.invokeSuspend(Unit.f46060a);
            case 24:
                zo1 zo1Var25 = new zo1((yje) obj3, obj4, (byte) 24);
                zo1Var25.k = (kmq) obj;
                zo1Var25.l = obj2;
                return zo1Var25.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                zo1 zo1Var26 = new zo1((yje) obj3, obj4, (byte) 25);
                zo1Var26.k = (kmq) obj;
                zo1Var26.l = obj2;
                return zo1Var26.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                zo1 zo1Var27 = new zo1(obj4, (yje) obj3, (byte) 26);
                zo1Var27.k = (kmq) obj;
                zo1Var27.l = (Throwable) obj2;
                return zo1Var27.invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                zo1 zo1Var28 = new zo1((yje) obj3, obj4, (byte) 27);
                zo1Var28.k = (kmq) obj;
                zo1Var28.l = (Object[]) obj2;
                return zo1Var28.invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                zo1 zo1Var29 = new zo1((yje) obj3, obj4, (byte) 28);
                zo1Var29.k = (kmq) obj;
                zo1Var29.l = (Object[]) obj2;
                return zo1Var29.invokeSuspend(Unit.f46060a);
            default:
                zo1 zo1Var30 = new zo1((yje) obj3, obj4, (byte) 29);
                zo1Var30.k = (kmq) obj;
                zo1Var30.l = obj2;
                return zo1Var30.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0254  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v32 java.lang.Object, still in use, count: 2, list:
          (r7v32 java.lang.Object) from 0x02c4: PHI (r7 I:??) = (r7v29 java.lang.Object), (r7v32 java.lang.Object) binds: [B:157:0x02c3, B:614:0x02c4] A[DONT_GENERATE, DONT_INLINE]
          (r7v32 java.lang.Object) from 0x02b6: CHECK_CAST (a.cmp0) (r7v32 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 3108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zo1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zo1(yje yjeVar, Object obj, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zo1(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = obj;
    }
}
