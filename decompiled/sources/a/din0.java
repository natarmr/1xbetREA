package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.secret.impl.KeysImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class din0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public din0(boolean z, fin0 fin0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.k = z;
        this.l = fin0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new din0(this.k, (fin0) obj2, yjeVar);
            case 1:
                din0 din0Var = new din0((diu0) obj2, yjeVar, (byte) 1);
                din0Var.k = ((Boolean) obj).booleanValue();
                return din0Var;
            case 2:
                din0 din0Var2 = new din0((diu0) obj2, yjeVar, (byte) 2);
                din0Var2.k = ((Boolean) obj).booleanValue();
                return din0Var2;
            case 3:
                din0 din0Var3 = new din0((diu0) obj2, yjeVar, (byte) 3);
                din0Var3.k = ((Boolean) obj).booleanValue();
                return din0Var3;
            case 4:
                return new din0((k7q0) obj2, this.k, yjeVar, (byte) 4);
            case 5:
                return new din0((njr0) obj2, this.k, yjeVar, (byte) 5);
            case 6:
                return new din0((psr0) obj2, this.k, yjeVar, (byte) 6);
            default:
                return new din0((KeysImpl) obj2, this.k ? 1 : 0, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((din0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((din0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((din0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((din0) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((din0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((din0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((din0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return new din0((KeysImpl) this.l, this.k ? 1 : 0, (yje) obj2).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object objC;
        byte b = this.i;
        byte b2 = 4;
        Object obj2 = this.l;
        byte b3 = 1;
        j83 j83Var = 0;
        j83Var = 0;
        switch (b) {
            case 0:
                fin0 fin0Var = (fin0) obj2;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (this.k) {
                        hse0 hse0Var = fin0Var.k;
                        this.j = true;
                        if (hse0.a(hse0Var, null, true, this, 5) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                fin0Var.x(new cin0(fin0Var, j83Var, b2));
                return Unit.f46060a;
            case 1:
                zyn0 zyn0Var = (zyn0) obj2;
                boolean z2 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (z2) {
                        int i = zyn0.u0;
                        zyn0Var.G(exn0.f8587a);
                        p7m0 p7m0Var = zyn0Var.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, vxn0.a((vxn0) value, null, null, false, false, true, false, false, false, null, null, null, null, null, false, false, false, null, 130863)));
                        fuj0 fuj0Var = zyn0Var.g0;
                        this.k = z2;
                        this.j = true;
                        if (fuj0Var.k(this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                zyn0Var.m0 = false;
                return Unit.f46060a;
            case 2:
                boolean z4 = this.k;
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    zco0 zco0Var = (zco0) obj2;
                    if (z4) {
                        this.k = z4;
                        this.j = true;
                        int i2 = zco0.r0;
                        if (zco0Var.M(this) == wneVar3) {
                            return wneVar3;
                        }
                    } else {
                        int i3 = zco0.r0;
                        zco0Var.H(new acm0((byte) 26));
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                urp0 urp0Var = (urp0) obj2;
                p7m0 p7m0Var2 = urp0Var.p;
                boolean z6 = this.k;
                wne wneVar4 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    if (z6 && !(p7m0Var2.getValue() instanceof mrp0)) {
                        this.k = z6;
                        this.j = true;
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, orp0.f25746a);
                        if (Unit.f46060a == wneVar4) {
                            return wneVar4;
                        }
                    } else if (!z6 && (p7m0Var2.getValue() instanceof orp0)) {
                        nrp0 nrp0Var = new nrp0(urp0Var.x());
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, nrp0Var);
                    }
                    return Unit.f46060a;
                }
                if (!z7) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                urp0Var.z();
                return Unit.f46060a;
            case 4:
                k7q0 k7q0Var = (k7q0) obj2;
                wne wneVar5 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    boolean z9 = this.k;
                    if (!o9q0.c(k7q0Var.l().b) && !(k7q0Var.f instanceof v190)) {
                        j83 j83VarH = lvm0.h(k7q0Var.l());
                        j83Var = j83VarH;
                        if (z9) {
                            int iE = o9q0.e(k7q0Var.l().b);
                            k7q0Var.c.invoke(k7q0.b(k7q0Var.l().f440a, s7n0.e(iE, iE)));
                            k7q0Var.r(dmv.f6336a);
                            j83Var = j83VarH;
                        }
                    }
                    if (j83Var == 0) {
                        return Unit.f46060a;
                    }
                    iuc iucVar = k7q0Var.h;
                    if (iucVar != null) {
                        huc hucVarV = ahb.V(j83Var);
                        this.j = true;
                        if (((zw2) iucVar).a(hucVarV) == wneVar5) {
                            return wneVar5;
                        }
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                njr0 njr0Var = (njr0) obj2;
                ctu ctuVar = njr0Var.i;
                mne mneVar = njr0Var.b;
                wne wneVar6 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    v3c.N(njr0Var.M);
                    byte b4 = 3;
                    if (this.k) {
                        v3c.N(njr0Var.M);
                        njr0Var.M = sac.f0(jiu0.a(njr0Var), 400L, TimeUnit.MILLISECONDS, mneVar.f22085a, new mjr0(1, njr0Var, njr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 1), new ljr0(njr0Var, j83Var, b4), 32);
                    }
                    if (ctuVar.f4960a.r().c == ulr0.NONE) {
                        njr0Var.K = sac.g0(jiu0.a(njr0Var), "TotoBetSharedViewModel_loadTotoAvailableBetTypes()", mneVar.b, new ddr0(1, njr0Var, njr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 25), new kjr0(njr0Var, j83Var, b4), 82);
                    }
                    bby bbyVar = njr0Var.K;
                    if (bbyVar != null) {
                        this.j = true;
                        if (bbyVar.join(this) == wneVar6) {
                            return wneVar6;
                        }
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (ctuVar.f4960a.r().c != ulr0.NONE) {
                    v3c.N(njr0Var.J);
                    njr0Var.J = sac.g0(jiu0.a(njr0Var), "TotoBetSharedViewModel_loadTotoOutcomes()", mneVar.b, new ddr0(1, njr0Var, njr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 27), new wbl0(njr0Var, j83Var, (byte) 11), 86);
                }
                return Unit.f46060a;
            case 6:
                psr0 psr0Var = (psr0) obj2;
                mne mneVar2 = psr0Var.t;
                wne wneVar7 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    int i4 = psr0.K;
                    p7m0 p7m0Var3 = psr0Var.i.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                    } while (!p7m0Var3.m(value2, tqr0.a((tqr0) value2, null, null, false, null, kfk0.f18200a, 63)));
                    p7m0 p7m0Var4 = ((hqr0) psr0Var.C.f13523a.b).b;
                    lun lunVar = lun.f20680a;
                    lunVar.getClass();
                    p7m0Var4.o(null, lunVar);
                    if (this.k) {
                        v3c.N(psr0Var.J);
                        psr0Var.J = sac.f0(jiu0.a(psr0Var), 400L, TimeUnit.MILLISECONDS, mneVar2.f22085a, new mjr0(1, psr0Var, psr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 9), new wup0(psr0Var, j83Var, b2), 32);
                    }
                    lsn lsnVar = psr0Var.v;
                    int i5 = psr0Var.u.a().Y;
                    this.j = true;
                    objC = ((gxu) lsnVar.f20589a).c(i5, this);
                    if (objC == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                if (((Number) objC).intValue() == 0) {
                    int i6 = psr0.K;
                    psr0Var.Q();
                    return Unit.f46060a;
                }
                v3c.N(psr0Var.I);
                psr0Var.I = sac.g0(jiu0.a(psr0Var), "TotoJackpotUdfViewModel_loadActiveTirage()", mneVar2.b, new mjr0(1, psr0Var, psr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 8), new nsr0(psr0Var, j83Var, b3), 70);
                return Unit.f46060a;
            default:
                KeysImpl keysImpl = (KeysImpl) obj2;
                wne wneVar8 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    odd oddVar = keysImpl.f46921a;
                    this.j = true;
                    if (oddVar.q(this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return keysImpl.getNativeConfigKey(this.k ? 1 : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ din0(Object obj, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ din0(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public din0(KeysImpl keysImpl, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        this.l = keysImpl;
        this.k = i;
    }
}
