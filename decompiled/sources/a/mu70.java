package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class mu70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ bv70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu70(bv70 bv70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bv70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bv70 bv70Var = this.k;
        switch (b) {
            case 0:
                return new mu70(bv70Var, yjeVar, (byte) 0);
            case 1:
                mu70 mu70Var = new mu70(bv70Var, yjeVar, (byte) 1);
                mu70Var.j = ((Boolean) obj).booleanValue();
                return mu70Var;
            case 2:
                return new mu70(bv70Var, yjeVar, (byte) 2);
            case 3:
                mu70 mu70Var2 = new mu70(bv70Var, yjeVar, (byte) 3);
                mu70Var2.j = ((Boolean) obj).booleanValue();
                return mu70Var2;
            case 4:
                mu70 mu70Var3 = new mu70(bv70Var, yjeVar, (byte) 4);
                mu70Var3.j = ((Boolean) obj).booleanValue();
                return mu70Var3;
            case 5:
                mu70 mu70Var4 = new mu70(bv70Var, yjeVar, (byte) 5);
                mu70Var4.j = ((Boolean) obj).booleanValue();
                return mu70Var4;
            default:
                return new mu70(bv70Var, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mu70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((mu70) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((mu70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((mu70) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((mu70) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((mu70) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mu70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        Object value2;
        Object value3;
        byte b = this.i;
        byte b2 = 3;
        byte b3 = 2;
        byte b4 = 0;
        yje yjeVar = null;
        bv70 bv70Var = this.k;
        byte b5 = 1;
        switch (b) {
            case 0:
                Object obj2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    int i = bv70.g0;
                    bv70Var.G(tt70.f34497a);
                    Object objD0 = qjj.d0(bv70Var.p.f22085a, new wn2(bv70Var, yjeVar, (byte) 20), this);
                    if (objD0 != obj2) {
                        objD0 = Unit.f46060a;
                    }
                    if (objD0 == obj2) {
                        return obj2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                boolean z3 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                mne mneVar = bv70Var.p;
                boolean z4 = ((hu70) bv70Var.D()).h && !z3;
                p7m0 p7m0Var = bv70Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    z = !z3;
                } while (!p7m0Var.m(value, hu70.a((hu70) value, 0, 0, z3, z3, (z4 || z3) ? false : true, false, false, z3, z3, z3, null, false, z, z, null, z, null, null, false, 2005347)));
                if (z3) {
                    bby bbyVar = bv70Var.d0;
                    if (bbyVar != null) {
                        e3c.n(bbyVar);
                    }
                    bv70Var.d0 = sac.f0(jiu0.a(bv70Var), 2000L, TimeUnit.MILLISECONDS, null, zu70.f44996a, new uu70(bv70Var, yjeVar, b5), 36);
                    c4m0 c4m0Var = bv70Var.b0;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        bv70Var.b0 = sac.T(new fnq(bv70Var.v.f4816a.f25550a.f22093a, new mu70(bv70Var, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(bv70Var), mneVar.f22085a), wu70.h);
                    }
                    c4m0 c4m0Var2 = bv70Var.c0;
                    if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                        bv70Var.c0 = sac.T(new fnq(bv70Var.u.f15279a.f25550a.b, new mu70(bv70Var, yjeVar, (byte) 5), (byte) 4), d5c.S(jiu0.a(bv70Var), mneVar.f22085a), yu70.h);
                    }
                } else if (z4) {
                    bby bbyVar2 = bv70Var.d0;
                    if (bbyVar2 != null) {
                        e3c.n(bbyVar2);
                    }
                    bv70Var.d0 = sac.f0(jiu0.a(bv70Var), 5000L, TimeUnit.MILLISECONDS, null, av70.f1513a, new uu70(bv70Var, yjeVar, b3), 36);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar2 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bv70Var.K.a(suy.a(((hu70) bv70Var.D()).t, ((hu70) bv70Var.D()).t.b ? wuy.c : wuy.b, 0L, 0L, false, 14));
                    this.j = true;
                    if (qcc.O(120000L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = bv70.g0;
                bby bbyVar3 = bv70Var.V;
                if (bbyVar3 != null) {
                    e3c.n(bbyVar3);
                }
                c4m0 c4m0Var3 = bv70Var.W;
                if (c4m0Var3 != null) {
                    e3c.n(c4m0Var3);
                }
                tuy tuyVar = bv70Var.J.f36111a.f36323a;
                tuyVar.f34573a.i("BLOCK_MODEL_KEY");
                p7m0 p7m0Var2 = tuyVar.c;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, new suy(wuy.f39812a, false, 0L, 300000L, false)));
                return Unit.f46060a;
            case 3:
                boolean z6 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = bv70.g0;
                p7m0 p7m0Var3 = bv70Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, hu70.a((hu70) value3, 0, 0, false, false, false, z6, false, false, false, false, null, false, false, false, null, false, null, null, false, 2097119)));
                bv70Var.q.e(z6);
                return Unit.f46060a;
            case 4:
                boolean z7 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                mne mneVar2 = bv70Var.p;
                int i4 = bv70.g0;
                p7m0 p7m0Var4 = bv70Var.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var4.getValue();
                    value4.getClass();
                    boolean z8 = z7;
                    if (p7m0Var4.m(value4, hu70.a((hu70) value4, 0, 0, false, false, false, false, false, false, false, false, null, z8, false, false, null, false, null, null, false, 2093055))) {
                        if (z8) {
                            bby bbyVar4 = bv70Var.X;
                            if (bbyVar4 == null || !bbyVar4.isActive()) {
                                bv70Var.X = sac.V(jiu0.a(bv70Var), new ku70(bv70Var, (byte) 1), null, mneVar2.f22085a, new mu70(bv70Var, yjeVar, (byte) 6), 10);
                            }
                            c4m0 c4m0Var4 = bv70Var.a0;
                            if (c4m0Var4 == null || !c4m0Var4.isActive()) {
                                bv70Var.a0 = sac.T(new dnq(new fnq(bv70Var.t.a(), new mu70(bv70Var, yjeVar, b5), (byte) 4), new ou70(bv70Var, yjeVar, b4), (byte) 0), d5c.S(jiu0.a(bv70Var), mneVar2.f22085a), pu70.h);
                            }
                            if (bv70Var.q.g()) {
                                bv70Var.N();
                                bv70Var.w.a(true);
                                bv70Var.G(new vt70(true));
                            }
                            c4m0 c4m0Var5 = bv70Var.Y;
                            if (c4m0Var5 == null || !c4m0Var5.isActive()) {
                                bv70Var.Y = sac.T(new fnq(bv70Var.z.a(), new qu70(bv70Var, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(bv70Var), mneVar2.f22085a), new uu70(bv70Var, yjeVar, b4));
                            }
                            c4m0 c4m0Var6 = bv70Var.U;
                            if (c4m0Var6 == null || !c4m0Var6.isActive()) {
                                bv70Var.U = sac.T(new fnq(bv70Var.F.f38071a.f36323a.c, new qu70(bv70Var, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(bv70Var), mneVar2.f22085a), vu70.h);
                            }
                        } else {
                            bv70Var.P();
                        }
                        return Unit.f46060a;
                    }
                    z7 = z8;
                }
                break;
            case 5:
                boolean z9 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                int i5 = bv70.g0;
                p7m0 p7m0Var5 = bv70Var.i.f25029a;
                while (true) {
                    Object value5 = p7m0Var5.getValue();
                    value5.getClass();
                    boolean z10 = z9;
                    if (p7m0Var5.m(value5, hu70.a((hu70) value5, 0, 0, false, false, false, false, z10, false, false, false, null, false, false, false, null, false, null, null, false, 2097087))) {
                        bv70Var.q.d(z10);
                        return Unit.f46060a;
                    }
                    z9 = z10;
                }
                break;
            default:
                wne wneVar6 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    mo00 mo00Var = bv70Var.A;
                    this.j = true;
                    if (mo00Var.a(this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
