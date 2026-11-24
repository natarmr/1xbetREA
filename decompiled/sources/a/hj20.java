package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class hj20 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ on20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj20(on20 on20Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = on20Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        on20 on20Var = this.k;
        switch (b) {
            case 0:
                return new hj20(on20Var, yjeVar, (byte) 0);
            case 1:
                return new hj20(on20Var, yjeVar, (byte) 1);
            case 2:
                return new hj20(on20Var, yjeVar, (byte) 2);
            case 3:
                return new hj20(on20Var, yjeVar, (byte) 3);
            case 4:
                return new hj20(on20Var, yjeVar, (byte) 4);
            case 5:
                return new hj20(on20Var, yjeVar, (byte) 5);
            case 6:
                return new hj20(on20Var, yjeVar, (byte) 6);
            case 7:
                return new hj20(on20Var, yjeVar, (byte) 7);
            default:
                return new hj20(on20Var, yjeVar, (byte) 8);
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
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((hj20) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objD0;
        Object objA;
        Object value;
        a820 a820Var;
        Object objS;
        Object value2;
        a820 a820Var2;
        byte b = this.i;
        byte b2 = 7;
        on20 on20Var = this.k;
        byte b3 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    int i = on20.m1;
                    objD0 = on20Var.d0(this);
                    if (objD0 == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                obg obgVar = new obg((byte) 20, ((Boolean) objD0).booleanValue());
                int i2 = on20.m1;
                on20Var.H(obgVar);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(1L, bfn.MINUTES);
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                f40 f40Var = f40.f;
                int i3 = on20.m1;
                on20Var.H(new b120(f40Var, b2));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    on20Var.G(new pc20(new xdk0(pek0.f26859a, on20Var.D.b.a(R.string.bet_error_coef_block, Arrays.copyOf(new Object[0], 0)), null, null, jdk0.f16332a, new Integer(R.drawable.ic_snack_lock), 76)));
                    tqc tqcVar = on20Var.G0;
                    this.j = true;
                    if (tqcVar.b(true, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                on20 on20Var2 = this.k;
                if (!z4) {
                    z1x.P(obj);
                    int i4 = on20.m1;
                    ((kt2) on20Var2.z.b).c("bet_avance_responce");
                    on20Var2.A.f40143a.a(xun.f41520a, 3166L);
                    on20Var2.H(new b120(f40.c, b2));
                    bby bbyVarK = i3t0.K(on20Var2, null, new yw10(1, on20Var2, on20.class, "handleAdvanceRequestError", "handleAdvanceRequestError(Ljava/lang/Throwable;)V", 0, (byte) 26), new pm20(on20Var2, yjeVar, b3), 1);
                    this.j = true;
                    if (((pby) bbyVarK).join(this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i5 = on20.m1;
                bby bbyVar = on20Var2.g1;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                on20Var2.g1 = i3t0.K(on20Var2, null, null, new hj20(on20Var2, yjeVar, b3), 3);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    q4f q4fVar = ((a820) on20Var.D()).j;
                    this.j = true;
                    if (on20Var.T0(q4fVar, null, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    q4f q4fVar2 = ((a820) on20Var.D()).j;
                    this.j = true;
                    if (on20Var.T0(q4fVar2, null, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    q4f q4fVar3 = ((a820) on20Var.D()).j;
                    this.j = true;
                    if (on20Var.T0(q4fVar3, null, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    u4a u4aVar = on20Var.I;
                    this.j = true;
                    objA = u4aVar.a(this);
                    if (objA == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                boolean zBooleanValue = ((Boolean) objA).booleanValue();
                int i6 = on20.m1;
                p7m0 p7m0Var = on20Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    a820Var = (a820) value;
                } while (!p7m0Var.m(value, a820.a(a820Var, null, null, null, null, dzc0.a(a820Var.f, null, null, zBooleanValue, false, false, 55), null, null, false, null, 0.0f, false, null, 0, false, false, false, 262111)));
                return Unit.f46060a;
            default:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    this.j = true;
                    int i7 = on20.m1;
                    objS = on20Var.S(this);
                    if (objS == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objS = obj;
                }
                boolean zBooleanValue2 = ((Boolean) objS).booleanValue();
                int i8 = on20.m1;
                p7m0 p7m0Var2 = on20Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    a820Var2 = (a820) value2;
                } while (!p7m0Var2.m(value2, a820.a(a820Var2, txe.a(a820Var2.b, 0L, 0, null, null, null, zBooleanValue2, null, 95), null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262141)));
                return Unit.f46060a;
        }
    }
}
