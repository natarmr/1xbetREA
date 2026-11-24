package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class gk20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ nn20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk20(nn20 nn20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nn20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nn20 nn20Var = this.k;
        switch (b) {
            case 0:
                return new gk20(nn20Var, yjeVar, (byte) 0);
            case 1:
                return new gk20(nn20Var, yjeVar, (byte) 1);
            case 2:
                return new gk20(nn20Var, yjeVar, (byte) 2);
            case 3:
                gk20 gk20Var = new gk20(nn20Var, yjeVar, (byte) 3);
                gk20Var.j = ((Boolean) obj).booleanValue();
                return gk20Var;
            case 4:
                return new gk20(nn20Var, yjeVar, (byte) 4);
            default:
                return new gk20(nn20Var, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gk20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((gk20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((gk20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((gk20) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((gk20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gk20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        Object value;
        b820 b820Var;
        ly6 ly6Var;
        byte b = this.i;
        byte b2 = 0;
        nn20 nn20Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = nn20.c1;
                    nn20 nn20Var2 = this.k;
                    nn20Var2.C0();
                    gx4 gx4Var = ((b820) nn20Var2.D()).f;
                    if (gx4Var != null) {
                        dx6 dx6Var = gx4Var.c;
                        double dDoubleValue = gx4Var.b.f41701a.doubleValue();
                        ngz ngzVar = new ngz(nn20Var2, gx4Var, (byte) 14);
                        this.j = true;
                        if (nn20Var2.V(dx6Var, dDoubleValue, ngzVar, this) == wneVar) {
                            return wneVar;
                        }
                    } else {
                        bby bbyVar = nn20Var2.Y0;
                        if (bbyVar != null) {
                            bbyVar.cancel(null);
                        }
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ((nb7) nn20Var.r0.f20392a.b).b = true;
                    f3c f3cVar = nn20Var.v;
                    this.j = true;
                    objA = f3cVar.a(this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                jk20 jk20Var = new jk20(nn20Var, (m97) objA, b2);
                int i2 = nn20.c1;
                nn20Var.I0(jk20Var);
                return Unit.f46060a;
            case 2:
                pj9 pj9Var = nn20Var.g0;
                m0k0 m0k0Var = nn20Var.o;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    f3c f3cVar2 = nn20Var.v;
                    this.j = true;
                    objA2 = f3cVar2.a(this);
                    if (objA2 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                pbs0 pbs0Var = new pbs0(xcm0.v(m0k0Var), (m97) objA2);
                boolean zB = pj9Var.b(pbs0Var);
                boolean z4 = !zB;
                x20 x20Var = nn20Var.M;
                String strJ = q8x.J(nn20Var.p);
                long j = m0k0Var.B;
                long j2 = m0k0Var.f20959a;
                mii0 mii0Var = nn20Var.H;
                if (j == 0) {
                    mii0Var.R(strJ, j2, z4);
                    x20Var.r(strJ, (int) j2, z4);
                } else {
                    mii0Var.S(z4, strJ, j2, j);
                    x20Var.q((int) j2, (int) m0k0Var.B, strJ, z4);
                }
                if (zB) {
                    pj9Var.getClass();
                    pj9Var.f27077a.a(pbs0Var);
                } else {
                    pj9Var.a(pbs0Var);
                }
                wbs0 wbs0Var = !zB ? wbs0.IS_TRACKED : wbs0.IS_NOT_TRACKED;
                p7m0 p7m0Var = nn20Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    b820Var = (b820) value;
                    ly6Var = b820Var.f2138a;
                } while (!p7m0Var.m(value, b820.a(b820Var, ly6.a(ly6Var, null, jur.a(ly6Var.d, null, wbs0Var, 23), null, null, 119), null, null, null, null, null, null, false, false, false, false, false, 8190)));
                qek0 qek0Var = qek0.f28589a;
                ctf0 ctf0Var = nn20Var.S;
                nn20Var.G(new qc20(new xdk0(qek0Var, !zB ? ctf0Var.b.a(R.string.event_tracked, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.event_not_tracked, Arrays.copyOf(new Object[0], 0)), null, null, gqw0.D1, null, 108)));
                return Unit.f46060a;
            case 3:
                boolean z5 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i3 = nn20.c1;
                p7m0 p7m0Var2 = nn20Var.i.f25029a;
                while (true) {
                    Object value2 = p7m0Var2.getValue();
                    value2.getClass();
                    boolean z6 = z5;
                    if (p7m0Var2.m(value2, b820.a((b820) value2, null, null, null, null, null, null, null, false, false, z6, false, false, 7679))) {
                        if (z6) {
                            nn20Var.M0();
                        }
                        return Unit.f46060a;
                    }
                    z5 = z6;
                }
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    esg0 esg0Var = nn20Var.E0;
                    this.j = true;
                    if (esg0Var.Y(this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i4 = nn20.c1;
                nn20Var.G(fb20.f9236a);
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    fo7 fo7Var = ((b820) nn20Var.D()).b;
                    if (fo7Var.equals(co7.b)) {
                        this.j = true;
                        if (nn20Var.m0(this) == wneVar6) {
                            return wneVar6;
                        }
                    } else {
                        if (!fo7Var.equals(xn7.b)) {
                            if (fo7Var.equals(zn7.b)) {
                                return Unit.f46060a;
                            }
                            t9f.b();
                            return null;
                        }
                        gx4 gx4Var2 = ((b820) nn20Var.D()).f;
                        if (gx4Var2 != null) {
                            vw6 vw6Var = gx4Var2.c.b;
                            nn20Var.H(new k110((Object) gx4Var2, (Object) (nn20Var.o0() ? ydx.G(nn20Var.P(vw6Var.f38133a, gx4Var2.b.f41701a.doubleValue()), vw6Var.f, hxu.h, null) : ""), (byte) 16));
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
        }
    }
}
