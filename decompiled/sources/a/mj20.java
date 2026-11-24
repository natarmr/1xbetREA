package a;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class mj20 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ nn20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj20(nn20 nn20Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = nn20Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        nn20 nn20Var = this.k;
        switch (b) {
            case 0:
                return new mj20(nn20Var, yjeVar, (byte) 0);
            case 1:
                return new mj20(nn20Var, yjeVar, (byte) 1);
            case 2:
                return new mj20(nn20Var, yjeVar, (byte) 2);
            case 3:
                return new mj20(nn20Var, yjeVar, (byte) 3);
            default:
                return new mj20(nn20Var, yjeVar, (byte) 4);
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
        }
        return ((mj20) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        b820 b820Var;
        an5 an5Var;
        Object objA;
        Object value2;
        b820 b820Var2;
        gx4 gx4Var;
        Object value3;
        b820 b820Var3;
        an5 an5Var2;
        Object objA2;
        Object value4;
        b820 b820Var4;
        czc0 czc0Var;
        Object value5;
        Object objA3;
        byte b = this.i;
        byte b2 = 0;
        nn20 nn20Var = this.k;
        byte b3 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(1L, bfn.MINUTES);
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                e40 e40Var = e40.f;
                int i = nn20.c1;
                p7m0 p7m0Var = nn20Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    b820Var = (b820) value;
                    nn20Var.f.getClass();
                    an5Var = b820Var.c;
                } while (!p7m0Var.m(value, b820.a(b820Var, null, null, an5.a(an5Var, new g40(an5Var.d.f10638a, e40Var)), null, null, null, null, false, false, false, false, false, 8187)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
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
                BigDecimal scale = new BigDecimal(String.valueOf(((m97) objA).l)).setScale(3, RoundingMode.FLOOR);
                BigDecimal bigDecimal = scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros();
                gx4 gx4Var2 = ((b820) nn20Var.D()).f;
                if (gx4Var2 == null) {
                    return Unit.f46060a;
                }
                xyc xycVar = gx4Var2.b;
                bigDecimal.getClass();
                xyc xycVarA = xyc.a(xycVar, bigDecimal, bigDecimal, false, false, 124);
                nn20Var.G0(bigDecimal);
                p7m0 p7m0Var2 = nn20Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    b820Var2 = (b820) value2;
                    gx4Var = b820Var2.f;
                } while (!p7m0Var2.m(value2, b820.a(b820Var2, null, null, null, null, null, gx4Var != null ? gx4.a(gx4Var, null, xycVarA, null, null, null, 29) : null, null, false, false, false, false, false, 8159)));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                nn20 nn20Var2 = this.k;
                if (!z3) {
                    z1x.P(obj);
                    int i2 = nn20.c1;
                    ((kt2) nn20Var2.H.b).c("bet_avance_responce");
                    nn20Var2.M.f40143a.a(xun.f41520a, 3166L);
                    e40 e40Var2 = e40.c;
                    p7m0 p7m0Var3 = nn20Var2.i.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                        b820Var3 = (b820) value3;
                        nn20Var2.f.getClass();
                        an5Var2 = b820Var3.c;
                    } while (!p7m0Var3.m(value3, b820.a(b820Var3, null, null, an5.a(an5Var2, new g40(an5Var2.d.f10638a, e40Var2)), null, null, null, null, false, false, false, false, false, 8187)));
                    bby bbyVarK = i3t0.K(nn20Var2, null, new yw10(1, nn20Var2, nn20.class, "handleAdvanceRequestError", "handleAdvanceRequestError(Ljava/lang/Throwable;)V", 0, (byte) 25), new pm20(nn20Var2, yjeVar, b2), 1);
                    this.j = true;
                    if (((pby) bbyVarK).join(this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = nn20.c1;
                bby bbyVar = nn20Var2.T0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                nn20Var2.T0 = i3t0.K(nn20Var2, null, null, new mj20(nn20Var2, yjeVar, b2), 3);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    u4a u4aVar = nn20Var.X;
                    this.j = true;
                    objA2 = u4aVar.a(this);
                    if (objA2 == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                boolean zBooleanValue = ((Boolean) objA2).booleanValue();
                int i4 = nn20.c1;
                p7m0 p7m0Var4 = nn20Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    b820Var4 = (b820) value4;
                    czc0Var = b820Var4.e;
                } while (!p7m0Var4.m(value4, b820.a(b820Var4, null, null, null, null, czc0Var != null ? czc0.a(czc0Var, null, null, zBooleanValue, false, 23) : null, null, null, false, false, false, false, false, 8175)));
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    int i5 = nn20.c1;
                    p7m0 p7m0Var5 = nn20Var.i.f25029a;
                    do {
                        value5 = p7m0Var5.getValue();
                        value5.getClass();
                        nn20Var.f.getClass();
                    } while (!p7m0Var5.m(value5, b820.a((b820) value5, null, null, null, null, null, null, null, false, false, false, false, true, 6143)));
                    nn20Var.H(new w1y(new a8q0("", 0L, 6), (byte) 4));
                    nn20Var.E0(new a8q0("", 0L, 6));
                    f3c f3cVar2 = nn20Var.v;
                    this.j = true;
                    objA3 = f3cVar2.a(this);
                    if (objA3 == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                jk20 jk20Var = new jk20(nn20Var, (m97) objA3, b3);
                int i6 = nn20.c1;
                nn20Var.V0 = nn20Var.I0(jk20Var);
                return Unit.f46060a;
        }
    }
}
