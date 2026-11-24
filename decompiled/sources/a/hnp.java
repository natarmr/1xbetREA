package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class hnp extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnp(znj znjVar, boolean z, k0w0 k0w0Var, daf dafVar, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 5;
        this.m = znjVar;
        this.k = z;
        this.l = k0w0Var;
        this.n = dafVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.n;
        Object obj2 = this.l;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                return new hnp((k0w0) obj2, (nnp) obj3, this.k, (npn) obj, yjeVar, (byte) 0);
            case 1:
                return new hnp((nn20) obj2, (m97) obj3, (m97) obj, this.k, yjeVar);
            case 2:
                return new hnp((pwi) obj2, (List) obj3, this.k, (String) obj, yjeVar, (byte) 2);
            case 3:
                return new hnp((tzi) obj2, (List) obj3, this.k, (String) obj, yjeVar, (byte) 3);
            case 4:
                return new hnp((k0w0) obj2, (rua0) obj3, this.k, (npn) obj, yjeVar, (byte) 4);
            default:
                return new hnp((znj) obj3, this.k, (k0w0) obj2, (daf) obj, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((hnp) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        Object objC;
        Object objQ0;
        Object g0g0Var2;
        Object objC2;
        Object g0g0Var3;
        Object objD0;
        byte b = this.i;
        byte b2 = 3;
        Object obj2 = this.l;
        byte b3 = 0;
        boolean z = this.k;
        Object obj3 = this.m;
        Object obj4 = this.n;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        switch (b) {
            case 0:
                nnp nnpVar = (nnp) obj3;
                wne wneVar = wne.f39444a;
                boolean z6 = this.j;
                try {
                    if (!z6) {
                        z1x.P(obj);
                        npn npnVar = (npn) obj4;
                        e0g0 e0g0Var = j0g0.b;
                        this.j = true;
                        int i = nnp.a0;
                        if (z) {
                            objC = nnpVar.t.w(npnVar, this);
                            if (objC != wneVar) {
                                objC = Unit.f46060a;
                            }
                        } else {
                            objC = nnpVar.u.c(npnVar, this);
                            if (objC != wneVar) {
                                objC = Unit.f46060a;
                            }
                        }
                        if (objC == wneVar) {
                            return wneVar;
                        }
                    } else {
                        if (!z6) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    g0g0Var = Unit.f46060a;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Throwable thA = j0g0.a(g0g0Var);
                if (thA != null) {
                    int i2 = nnp.a0;
                    nnpVar.F.f(thA, new zmp(nnpVar, (byte) 0));
                }
                return Unit.f46060a;
            case 1:
                m97 m97Var = (m97) obj4;
                m97 m97Var2 = (m97) obj3;
                nn20 nn20Var = (nn20) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    this.j = true;
                    int i3 = nn20.c1;
                    objQ0 = nn20Var.q0(m97Var2, this);
                    if (objQ0 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objQ0 = obj;
                }
                boolean zBooleanValue = ((Boolean) objQ0).booleanValue();
                boolean z8 = this.k;
                if (zBooleanValue) {
                    int i4 = nn20.c1;
                    String str = m97Var2.m;
                    String str2 = m97Var != null ? m97Var.m : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    j43 j43VarY = nn20.Y(str, str2, nn20Var.a0(m97Var != null ? m97Var.l : 0.0d, m97Var2.l, z8));
                    String str3 = m97Var2.z;
                    String str4 = m97Var != null ? m97Var.z : null;
                    nn20Var.H(new rm20(new g680(j43VarY, nn20.Y(str3, str4 != null ? str4 : "", nn20Var.a0(m97Var != null ? m97Var.y : 0.0d, m97Var2.y, z8))), (byte) 1));
                } else {
                    p2n p2nVar = new p2n((Object) nn20Var, (Object) m97Var2, (Object) m97Var, z8, (byte) 19);
                    int i5 = nn20.c1;
                    nn20Var.H(p2nVar);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z9 = this.j;
                if (z9) {
                    if (z9) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                pwi pwiVar = (pwi) obj2;
                this.j = true;
                Object objK = ntb.K(kpb.k0(new vsg0(new sa60(pwiVar, (List) obj3, this.k, (String) obj4, null)), 3L, new d21(new pu50(pwiVar, (byte) 7), z3 ? 1 : 0, b2)), this);
                return objK == wneVar3 ? wneVar3 : objK;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z10 = this.j;
                if (z10) {
                    if (z10) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                tzi tziVar = (tzi) obj2;
                this.j = true;
                Object objK2 = ntb.K(kpb.k0(new vsg0(new ya60(tziVar, (List) obj3, this.k, (String) obj4, null)), 3L, new d21(new pu50(tziVar, (byte) 8), z4 ? 1 : 0, b2)), this);
                return objK2 == wneVar4 ? wneVar4 : objK2;
            case 4:
                rua0 rua0Var = (rua0) obj3;
                wne wneVar5 = wne.f39444a;
                boolean z11 = this.j;
                try {
                    if (!z11) {
                        z1x.P(obj);
                        npn npnVar2 = (npn) obj4;
                        e0g0 e0g0Var4 = j0g0.b;
                        this.j = true;
                        List list = rua0.G;
                        if (z) {
                            objC2 = rua0Var.p.w(npnVar2, this);
                            if (objC2 != wneVar5) {
                                objC2 = Unit.f46060a;
                            }
                        } else {
                            objC2 = rua0Var.q.c(npnVar2, this);
                            if (objC2 != wneVar5) {
                                objC2 = Unit.f46060a;
                            }
                        }
                        if (objC2 == wneVar5) {
                            return wneVar5;
                        }
                    } else {
                        if (!z11) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    g0g0Var2 = Unit.f46060a;
                    e0g0 e0g0Var5 = j0g0.b;
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var6 = j0g0.b;
                    g0g0Var2 = new g0g0(th2);
                }
                Throwable thA2 = j0g0.a(g0g0Var2);
                if (thA2 != null) {
                    rua0Var.r.f(thA2, new yr80(rua0Var, (byte) 18));
                }
                return Unit.f46060a;
            default:
                daf dafVar = (daf) obj4;
                wne wneVar6 = wne.f39444a;
                boolean z12 = this.j;
                long jLongValue = -1;
                try {
                    if (!z12) {
                        z1x.P(obj);
                        long j = ((znj) obj3).f44677a;
                        if (j > 0) {
                            jLongValue = j;
                        } else if (z) {
                            e0g0 e0g0Var7 = j0g0.b;
                            dvj dvjVar = ((mne) dafVar.j).b;
                            k6s0 k6s0Var = new k6s0(dafVar, null, (byte) 13);
                            this.j = true;
                            objD0 = qjj.d0(dvjVar, k6s0Var, this);
                            if (objD0 == wneVar6) {
                                return wneVar6;
                            }
                        }
                        v88 v88Var = (v88) dafVar.i;
                        v88Var.f = ((ouu) dafVar.l).s();
                        v88Var.h = true;
                        v88Var.i = jLongValue;
                        sac.V(v88Var.g, new t88(v88Var, (byte) 0), null, null, new u88((Object) v88Var, z2, (yje) (z5 ? 1 : 0), b3), 14);
                        return Unit.f46060a;
                    }
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                    Long l = new Long(((Number) objD0).longValue());
                    e0g0 e0g0Var8 = j0g0.b;
                    g0g0Var3 = l;
                    break;
                } catch (Throwable th3) {
                    e0g0 e0g0Var9 = j0g0.b;
                    g0g0Var3 = new g0g0(th3);
                }
                Long l2 = new Long(-1L);
                boolean z13 = g0g0Var3 instanceof g0g0;
                Object obj5 = g0g0Var3;
                if (z13) {
                    obj5 = l2;
                }
                jLongValue = ((Number) obj5).longValue();
                v88 v88Var2 = (v88) dafVar.i;
                v88Var2.f = ((ouu) dafVar.l).s();
                v88Var2.h = true;
                v88Var2.i = jLongValue;
                sac.V(v88Var2.g, new t88(v88Var2, (byte) 0), null, null, new u88((Object) v88Var2, z2, (yje) (z5 ? 1 : 0), b3), 14);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnp(nn20 nn20Var, m97 m97Var, m97 m97Var2, boolean z, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 1;
        this.l = nn20Var;
        this.m = m97Var;
        this.n = m97Var2;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hnp(Object obj, Object obj2, boolean z, Object obj3, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.k = z;
        this.n = obj3;
    }
}
